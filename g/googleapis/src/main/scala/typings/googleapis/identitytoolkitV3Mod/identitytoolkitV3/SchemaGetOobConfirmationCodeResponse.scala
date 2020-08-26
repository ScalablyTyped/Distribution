package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of getting a code for user confirmation (reset password, change
  * email etc.).
  */
@js.native
trait SchemaGetOobConfirmationCodeResponse extends js.Object {
  /**
    * The email address that the email is sent to.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The fixed string
    * &quot;identitytoolkit#GetOobConfirmationCodeResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The code to be send to the user.
    */
  var oobCode: js.UndefOr[String] = js.native
}

object SchemaGetOobConfirmationCodeResponse {
  @scala.inline
  def apply(): SchemaGetOobConfirmationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOobConfirmationCodeResponse]
  }
  @scala.inline
  implicit class SchemaGetOobConfirmationCodeResponseOps[Self <: SchemaGetOobConfirmationCodeResponse] (val x: Self) extends AnyVal {
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
    def setOobCode(value: String): Self = this.set("oobCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOobCode: Self = this.set("oobCode", js.undefined)
  }
  
}

