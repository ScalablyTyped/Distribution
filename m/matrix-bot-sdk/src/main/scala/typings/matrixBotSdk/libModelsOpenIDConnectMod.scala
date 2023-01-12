package typings.matrixBotSdk

import typings.matrixBotSdk.matrixBotSdkStrings.Bearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsOpenIDConnectMod {
  
  trait OpenIDConnectToken extends StObject {
    
    var access_token: String
    
    var expires_in: Double
    
    var matrix_server_name: String
    
    var token_type: Bearer
  }
  object OpenIDConnectToken {
    
    inline def apply(access_token: String, expires_in: Double, matrix_server_name: String): OpenIDConnectToken = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], matrix_server_name = matrix_server_name.asInstanceOf[js.Any], token_type = "Bearer")
      __obj.asInstanceOf[OpenIDConnectToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenIDConnectToken] (val x: Self) extends AnyVal {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setMatrix_server_name(value: String): Self = StObject.set(x, "matrix_server_name", value.asInstanceOf[js.Any])
      
      inline def setToken_type(value: Bearer): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
}
