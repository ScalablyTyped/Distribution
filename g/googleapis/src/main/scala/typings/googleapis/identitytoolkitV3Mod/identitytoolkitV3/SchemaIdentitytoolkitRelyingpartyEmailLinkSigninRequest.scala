package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest extends StObject {
  
  /**
    * The email address of the user.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Token for linking flow.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The confirmation code.
    */
  var oobCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    inline def setOobCodeNull: Self = StObject.set(x, "oobCode", null)
    
    inline def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
  }
}
