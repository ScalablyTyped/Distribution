package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes authentication configuration that uses a custom account.
  */
@js.native
trait SchemaCustomAccount extends js.Object {
  /**
    * Required. The login form URL of the website.
    */
  var loginUrl: js.UndefOr[String] = js.native
  /**
    * Input only. Required. The password of the custom account. The credential
    * is stored encrypted and not returned in any response nor included in
    * audit logs.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Required. The user name of the custom account.
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaCustomAccount {
  @scala.inline
  def apply(loginUrl: String = null, password: String = null, username: String = null): SchemaCustomAccount = {
    val __obj = js.Dynamic.literal()
    if (loginUrl != null) __obj.updateDynamic("loginUrl")(loginUrl.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomAccount]
  }
}

