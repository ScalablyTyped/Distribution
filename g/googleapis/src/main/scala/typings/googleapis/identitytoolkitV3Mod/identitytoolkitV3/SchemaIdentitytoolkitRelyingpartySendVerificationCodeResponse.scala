package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse extends StObject {
  
  /**
    * Encrypted session information
    */
  var sessionInfo: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse](x: Self) {
    
    inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfoNull: Self = StObject.set(x, "sessionInfo", null)
    
    inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
  }
}
