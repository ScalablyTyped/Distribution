package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to sign in with email.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest extends js.Object {
  /**
    * The email address of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Token for linking flow.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The confirmation code.
    */
  var oobCode: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequestOps[Self <: SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest] (val x: Self) extends AnyVal {
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
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    @scala.inline
    def setOobCode(value: String): Self = this.set("oobCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOobCode: Self = this.set("oobCode", js.undefined)
  }
  
}

