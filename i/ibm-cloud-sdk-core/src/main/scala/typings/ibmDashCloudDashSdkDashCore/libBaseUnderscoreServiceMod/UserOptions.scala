package typings.ibmDashCloudDashSdkDashCore.libBaseUnderscoreServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOptions extends js.Object {
  var apikey: js.UndefOr[String] = js.undefined
  var disable_ssl_verification: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[HeaderOptions] = js.undefined
  var iam_access_token: js.UndefOr[String] = js.undefined
  var iam_apikey: js.UndefOr[String] = js.undefined
  var iam_url: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var use_unauthenticated: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object UserOptions {
  @scala.inline
  def apply(
    apikey: String = null,
    disable_ssl_verification: js.UndefOr[Boolean] = js.undefined,
    headers: HeaderOptions = null,
    iam_access_token: String = null,
    iam_apikey: String = null,
    iam_url: String = null,
    password: String = null,
    token: String = null,
    url: String = null,
    use_unauthenticated: js.UndefOr[Boolean] = js.undefined,
    username: String = null,
    version: String = null
  ): UserOptions = {
    val __obj = js.Dynamic.literal()
    if (apikey != null) __obj.updateDynamic("apikey")(apikey.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_ssl_verification)) __obj.updateDynamic("disable_ssl_verification")(disable_ssl_verification.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (iam_access_token != null) __obj.updateDynamic("iam_access_token")(iam_access_token.asInstanceOf[js.Any])
    if (iam_apikey != null) __obj.updateDynamic("iam_apikey")(iam_apikey.asInstanceOf[js.Any])
    if (iam_url != null) __obj.updateDynamic("iam_url")(iam_url.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(use_unauthenticated)) __obj.updateDynamic("use_unauthenticated")(use_unauthenticated.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOptions]
  }
}

