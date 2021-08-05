package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to sign in with email.
  */
trait SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest extends StObject {
  
  /**
    * The email address of the user.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Token for linking flow.
    */
  var idToken: js.UndefOr[String] = js.undefined
  
  /**
    * The confirmation code.
    */
  var oobCode: js.UndefOr[String] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    inline def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
  }
}
