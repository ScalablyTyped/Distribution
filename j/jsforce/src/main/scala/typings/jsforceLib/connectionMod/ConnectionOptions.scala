package typings
package jsforceLib.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends PartialOAuth2Options {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var callOptions: js.UndefOr[js.Object] = js.undefined
  var instanceUrl: js.UndefOr[java.lang.String] = js.undefined
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  var maxRequest: js.UndefOr[scala.Double] = js.undefined
  var oauth2: js.UndefOr[stdLib.Partial[PartialOAuth2Options]] = js.undefined
  var proxyUrl: js.UndefOr[java.lang.String] = js.undefined
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  var serverUrl: js.UndefOr[java.lang.String] = js.undefined
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
  var signedRequest: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    accessToken: java.lang.String = null,
    callOptions: js.Object = null,
    clientId: java.lang.String = null,
    clientSecret: java.lang.String = null,
    instanceUrl: java.lang.String = null,
    logLevel: java.lang.String = null,
    loginUrl: java.lang.String = null,
    maxRequest: scala.Int | scala.Double = null,
    oauth2: stdLib.Partial[PartialOAuth2Options] = null,
    proxyUrl: java.lang.String = null,
    redirectUri: java.lang.String = null,
    refreshToken: java.lang.String = null,
    serverUrl: java.lang.String = null,
    sessionId: java.lang.String = null,
    signedRequest: java.lang.String | js.Object = null,
    version: java.lang.String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (callOptions != null) __obj.updateDynamic("callOptions")(callOptions)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (instanceUrl != null) __obj.updateDynamic("instanceUrl")(instanceUrl)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (loginUrl != null) __obj.updateDynamic("loginUrl")(loginUrl)
    if (maxRequest != null) __obj.updateDynamic("maxRequest")(maxRequest.asInstanceOf[js.Any])
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2)
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (serverUrl != null) __obj.updateDynamic("serverUrl")(serverUrl)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    if (signedRequest != null) __obj.updateDynamic("signedRequest")(signedRequest.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ConnectionOptions]
  }
}

