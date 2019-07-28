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
    if (authCode != null) __obj.updateDynamic("authCode")(authCode)
    if (authzServiceUrl != null) __obj.updateDynamic("authzServiceUrl")(authzServiceUrl)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (httpProxy != null) __obj.updateDynamic("httpProxy")(httpProxy)
    if (loginUrl != null) __obj.updateDynamic("loginUrl")(loginUrl)
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey)
    if (privateKeyFile != null) __obj.updateDynamic("privateKeyFile")(privateKeyFile)
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (revokeServiceUrl != null) __obj.updateDynamic("revokeServiceUrl")(revokeServiceUrl)
    if (tokenServiceUrl != null) __obj.updateDynamic("tokenServiceUrl")(tokenServiceUrl)
    __obj.asInstanceOf[OAuth2Options]
  }
}

