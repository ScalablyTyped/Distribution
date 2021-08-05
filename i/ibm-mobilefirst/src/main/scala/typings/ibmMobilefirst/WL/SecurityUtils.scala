package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SecurityUtils {
  
  trait DecryptOptions extends StObject {
    
    var ct: String
    
    var key: String
    
    var lv: String
    
    var src: String
    
    var v: String
  }
  object DecryptOptions {
    
    inline def apply(ct: String, key: String, lv: String, src: String, v: String): DecryptOptions = {
      val __obj = js.Dynamic.literal(ct = ct.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lv = lv.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptOptions]
    }
    
    extension [Self <: DecryptOptions](x: Self) {
      
      inline def setCt(value: String): Self = StObject.set(x, "ct", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLv(value: String): Self = StObject.set(x, "lv", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait EncryptOptions extends StObject {
    
    var key: String
    
    var text: String
  }
  object EncryptOptions {
    
    inline def apply(key: String, text: String): EncryptOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptOptions]
    }
    
    extension [Self <: EncryptOptions](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeygenOptions extends StObject {
    
    var iterations: Double
    
    var password: String
    
    var salt: String
  }
  object KeygenOptions {
    
    inline def apply(iterations: Double, password: String, salt: String): KeygenOptions = {
      val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeygenOptions]
    }
    
    extension [Self <: KeygenOptions](x: Self) {
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
}
