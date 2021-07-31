package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of resetting the password.
  */
trait SchemaResetPasswordResponse extends StObject {
  
  /**
    * The user&#39;s email. If the out-of-band code is for email recovery, the
    * user&#39;s original email.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The fixed string &quot;identitytoolkit#ResetPasswordResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * If the out-of-band code is for email recovery, the user&#39;s new email.
    */
  var newEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
}
object SchemaResetPasswordResponse {
  
  @scala.inline
  def apply(): SchemaResetPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResetPasswordResponse]
  }
  
  @scala.inline
  implicit class SchemaResetPasswordResponseMutableBuilder[Self <: SchemaResetPasswordResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNewEmail(value: String): Self = StObject.set(x, "newEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewEmailUndefined: Self = StObject.set(x, "newEmail", js.undefined)
    
    @scala.inline
    def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
  }
}
