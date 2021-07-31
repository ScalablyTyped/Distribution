package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of getting a code for user confirmation (reset password, change
  * email etc.).
  */
trait SchemaGetOobConfirmationCodeResponse extends StObject {
  
  /**
    * The email address that the email is sent to.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The fixed string
    * &quot;identitytoolkit#GetOobConfirmationCodeResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The code to be send to the user.
    */
  var oobCode: js.UndefOr[String] = js.undefined
}
object SchemaGetOobConfirmationCodeResponse {
  
  @scala.inline
  def apply(): SchemaGetOobConfirmationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOobConfirmationCodeResponse]
  }
  
  @scala.inline
  implicit class SchemaGetOobConfirmationCodeResponseMutableBuilder[Self <: SchemaGetOobConfirmationCodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
  }
}
