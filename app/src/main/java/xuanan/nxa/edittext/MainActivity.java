package xuanan.nxa.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber;// toan cuc
    EditText edtNumber, edtNumber2;
    Button btnRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        // noi dung
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = edtNumber.getText().toString();
                String chuoi2 = edtNumber2.getText().toString();

                // kiem tra rong
                //chuoi1.length() == 0
                if(chuoi1.isEmpty() || chuoi2.length() == 0){
                    Toast.makeText(MainActivity.this, "Vui long nhap du so", Toast.LENGTH_SHORT).show();
                }else {
                    // ep kieu du lieu so
                    int min = Integer.parseInt(chuoi1); //"12"-> 12
                    int max = Integer.parseInt(chuoi2);

                    if(min >= max){
                        Toast.makeText(MainActivity.this, "Vui long nhap so nho hon so thu hai", Toast.LENGTH_SHORT).show();
                    }else{
                        Random random = new Random();
                        int number = random.nextInt(max - min + 1) + min;
                        txtNumber.setText(number + "");
                    }

                }
            }
        });
    }
    private void AnhXa(){
        edtNumber = (EditText) findViewById(R.id.editTextNumber);
        edtNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        txtNumber = (TextView) findViewById(R.id.textView2);
        btnRandom = (Button) findViewById(R.id.buttonClick);
    }
}