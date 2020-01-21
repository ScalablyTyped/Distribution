package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes authentication configuration that uses a Google account.
  */
@js.native
trait SchemaGoogleAccount extends js.Object {
  /**
    * Input only. Required. The password of the Google account. The credential
    * is stored encrypted and not returned in any response nor included in
    * audit logs.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Required. The user name of the Google account.
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaGoogleAccount {
  @scala.inline
  def apply(password: String = null, username: String = null): SchemaGoogleAccount = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleAccount]
  }
}

