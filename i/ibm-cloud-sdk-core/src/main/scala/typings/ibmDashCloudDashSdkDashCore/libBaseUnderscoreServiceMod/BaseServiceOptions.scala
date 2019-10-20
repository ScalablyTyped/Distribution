package typings.ibmDashCloudDashSdkDashCore.libBaseUnderscoreServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseServiceOptions extends UserOptions {
  @JSName("headers")
  var headers_BaseServiceOptions: HeaderOptions
  var qs: js.Any
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  @JSName("url")
  var url_BaseServiceOptions: String
}

object BaseServiceOptions {
  @scala.inline
  def apply(
    headers: HeaderOptions,
    qs: js.Any,
    url: String,
    apikey: String = null,
    disable_ssl_verification: js.UndefOr[Boolean] = js.undefined,
    iam_access_token: String = null,
    iam_apikey: String = null,
    iam_url: String = null,
    password: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    token: String = null,
    use_unauthenticated: js.UndefOr[Boolean] = js.undefined,
    username: String = null,
    version: String = null
  ): BaseServiceOptions = {
    val __obj = js.Dynamic.literal(headers = headers, qs = qs, url = url)
    if (apikey != null) __obj.updateDynamic("apikey")(apikey)
    if (!js.isUndefined(disable_ssl_verification)) __obj.updateDynamic("disable_ssl_verification")(disable_ssl_verification)
    if (iam_access_token != null) __obj.updateDynamic("iam_access_token")(iam_access_token)
    if (iam_apikey != null) __obj.updateDynamic("iam_apikey")(iam_apikey)
    if (iam_url != null) __obj.updateDynamic("iam_url")(iam_url)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (token != null) __obj.updateDynamic("token")(token)
    if (!js.isUndefined(use_unauthenticated)) __obj.updateDynamic("use_unauthenticated")(use_unauthenticated)
    if (username != null) __obj.updateDynamic("username")(username)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[BaseServiceOptions]
  }
}

