package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SecurityUtils {
  
  @js.native
  trait DecryptOptions extends StObject {
    
    var ct: String = js.native
    
    var key: String = js.native
    
    var lv: String = js.native
    
    var src: String = js.native
    
    var v: String = js.native
  }
  object DecryptOptions {
    
    @scala.inline
    def apply(ct: String, key: String, lv: String, src: String, v: String): DecryptOptions = {
      val __obj = js.Dynamic.literal(ct = ct.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lv = lv.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptOptions]
    }
    
    @scala.inline
    implicit class DecryptOptionsMutableBuilder[Self <: DecryptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCt(value: String): Self = StObject.set(x, "ct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLv(value: String): Self = StObject.set(x, "lv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EncryptOptions extends StObject {
    
    var key: String = js.native
    
    var text: String = js.native
  }
  object EncryptOptions {
    
    @scala.inline
    def apply(key: String, text: String): EncryptOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptOptions]
    }
    
    @scala.inline
    implicit class EncryptOptionsMutableBuilder[Self <: EncryptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeygenOptions extends StObject {
    
    var iterations: Double = js.native
    
    var password: String = js.native
    
    var salt: String = js.native
  }
  object KeygenOptions {
    
    @scala.inline
    def apply(iterations: Double, password: String, salt: String): KeygenOptions = {
      val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeygenOptions]
    }
    
    @scala.inline
    implicit class KeygenOptionsMutableBuilder[Self <: KeygenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
}
