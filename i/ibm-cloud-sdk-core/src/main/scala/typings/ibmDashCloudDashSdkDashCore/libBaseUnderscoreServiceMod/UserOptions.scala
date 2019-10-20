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
    if (apikey != null) __obj.updateDynamic("apikey")(apikey)
    if (!js.isUndefined(disable_ssl_verification)) __obj.updateDynamic("disable_ssl_verification")(disable_ssl_verification)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (iam_access_token != null) __obj.updateDynamic("iam_access_token")(iam_access_token)
    if (iam_apikey != null) __obj.updateDynamic("iam_apikey")(iam_apikey)
    if (iam_url != null) __obj.updateDynamic("iam_url")(iam_url)
    if (password != null) __obj.updateDynamic("password")(password)
    if (token != null) __obj.updateDynamic("token")(token)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(use_unauthenticated)) __obj.updateDynamic("use_unauthenticated")(use_unauthenticated)
    if (username != null) __obj.updateDynamic("username")(username)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[UserOptions]
  }
}

