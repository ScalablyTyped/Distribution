package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of resetting the password.
  */
@js.native
trait SchemaResetPasswordResponse extends js.Object {
  
  /**
    * The user&#39;s email. If the out-of-band code is for email recovery, the
    * user&#39;s original email.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The fixed string &quot;identitytoolkit#ResetPasswordResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * If the out-of-band code is for email recovery, the user&#39;s new email.
    */
  var newEmail: js.UndefOr[String] = js.native
  
  /**
    * The request type.
    */
  var requestType: js.UndefOr[String] = js.native
}
object SchemaResetPasswordResponse {
  
  @scala.inline
  def apply(): SchemaResetPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResetPasswordResponse]
  }
  
  @scala.inline
  implicit class SchemaResetPasswordResponseOps[Self <: SchemaResetPasswordResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNewEmail(value: String): Self = this.set("newEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewEmail: Self = this.set("newEmail", js.undefined)
    
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
  }
}
