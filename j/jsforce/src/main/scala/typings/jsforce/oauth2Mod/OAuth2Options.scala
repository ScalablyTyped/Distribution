package typings.jsforce.oauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2Options extends js.Object {
  var authCode: js.UndefOr[String] = js.undefined
  var authzServiceUrl: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var httpProxy: js.UndefOr[String] = js.undefined
  var loginUrl: js.UndefOr[String] = js.undefined
  var privateKey: js.UndefOr[String] = js.undefined
  var privateKeyFile: js.UndefOr[String] = js.undefined
  var proxyUrl: js.UndefOr[String] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
  var refreshToken: js.UndefOr[String] = js.undefined
  var revokeServiceUrl: js.UndefOr[String] = js.undefined
  var tokenServiceUrl: js.UndefOr[String] = js.undefined
}

object OAuth2Options {
  @scala.inline
  def apply(
    authCode: String = null,
    authzServiceUrl: String = null,
    clientId: String = null,
    clientSecret: String = null,
    httpProxy: String = null,
    loginUrl: String = null,
    privateKey: String = null,
    privateKeyFile: String = null,
    proxyUrl: String = null,
    redirectUri: String = null,
    refreshToken: String = null,
    revokeServiceUrl: String = null,
    tokenServiceUrl: String = null
  ): OAuth2Options = {
    val __obj = js.Dynamic.literal()
    if (authCode != null) __obj.updateDynamic("authCode")(authCode.asInstanceOf[js.Any])
    if (authzServiceUrl != null) __obj.updateDynamic("authzServiceUrl")(authzServiceUrl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (httpProxy != null) __obj.updateDynamic("httpProxy")(httpProxy.asInstanceOf[js.Any])
    if (loginUrl != null) __obj.updateDynamic("loginUrl")(loginUrl.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (privateKeyFile != null) __obj.updateDynamic("privateKeyFile")(privateKeyFile.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (revokeServiceUrl != null) __obj.updateDynamic("revokeServiceUrl")(revokeServiceUrl.asInstanceOf[js.Any])
    if (tokenServiceUrl != null) __obj.updateDynamic("tokenServiceUrl")(tokenServiceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Options]
  }
}

