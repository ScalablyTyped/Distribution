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
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequestMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
  }
}
