package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(email: String = null, kind: String = null, newEmail: String = null, requestType: String = null): SchemaResetPasswordResponse = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (newEmail != null) __obj.updateDynamic("newEmail")(newEmail.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResetPasswordResponse]
  }
}

