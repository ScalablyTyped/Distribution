package typings.jwtThen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key extends StObject {
    
    var key: String
    
    var passphrase: String
  }
  object Key {
    
    @scala.inline
    def apply(key: String, passphrase: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    }
  }
}
