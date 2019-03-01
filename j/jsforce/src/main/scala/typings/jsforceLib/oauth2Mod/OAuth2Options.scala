package typings
package jsforceLib.oauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2Options extends js.Object {
  var authCode: js.UndefOr[java.lang.String] = js.undefined
  var authzServiceUrl: js.UndefOr[java.lang.String] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var httpProxy: js.UndefOr[java.lang.String] = js.undefined
  var loginUrl: js.UndefOr[java.lang.String] = js.undefined
  var privateKey: js.UndefOr[java.lang.String] = js.undefined
  var privateKeyFile: js.UndefOr[java.lang.String] = js.undefined
  var proxyUrl: js.UndefOr[java.lang.String] = js.undefined
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  var revokeServiceUrl: js.UndefOr[java.lang.String] = js.undefined
  var tokenServiceUrl: js.UndefOr[java.lang.String] = js.undefined
}

object OAuth2Options {
  @scala.inline
  def apply(
    authCode: java.lang.String = null,
    authzServiceUrl: java.lang.String = null,
    clientId: java.lang.String = null,
    clientSecret: java.lang.String = null,
    httpProxy: java.lang.String = null,
    loginUrl: java.lang.String = null,
    privateKey: java.lang.String = null,
    privateKeyFile: java.lang.String = null,
    proxyUrl: java.lang.String = null,
    redirectUri: java.lang.String = null,
    refreshToken: java.lang.String = null,
    revokeServiceUrl: java.lang.String = null,
    tokenServiceUrl: java.lang.String = null
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

