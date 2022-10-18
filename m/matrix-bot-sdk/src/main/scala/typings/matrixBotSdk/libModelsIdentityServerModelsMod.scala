package typings.matrixBotSdk

import typings.matrixBotSdk.anon.Keyvalidityurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsIdentityServerModelsMod {
  
  trait IdentityServerAccount extends StObject {
    
    var user_id: String
  }
  object IdentityServerAccount {
    
    inline def apply(user_id: String): IdentityServerAccount = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityServerAccount]
    }
    
    extension [Self <: IdentityServerAccount](x: Self) {
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdentityServerInvite extends StObject {
    
    var display_name: String
    
    var public_key: String
    
    var public_keys: js.Array[Keyvalidityurl]
    
    var token: String
  }
  object IdentityServerInvite {
    
    inline def apply(display_name: String, public_key: String, public_keys: js.Array[Keyvalidityurl], token: String): IdentityServerInvite = {
      val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], public_keys = public_keys.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityServerInvite]
    }
    
    extension [Self <: IdentityServerInvite](x: Self) {
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
      
      inline def setPublic_keys(value: js.Array[Keyvalidityurl]): Self = StObject.set(x, "public_keys", value.asInstanceOf[js.Any])
      
      inline def setPublic_keysVarargs(value: Keyvalidityurl*): Self = StObject.set(x, "public_keys", js.Array(value*))
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
