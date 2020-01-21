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
  def apply(email: String = null, idToken: String = null, oobCode: String = null): SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (oobCode != null) __obj.updateDynamic("oobCode")(oobCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest]
  }
}

