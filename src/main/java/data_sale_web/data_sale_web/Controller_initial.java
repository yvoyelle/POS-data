
package data_sale_web.data_sale_web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 
    
@Controller
@Slf4j
public class Controller_initial {
    
@GetMapping("/")
public String Initial() {
  
    return"index";
}


}
