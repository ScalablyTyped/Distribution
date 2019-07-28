package typings.jsforce.connectionMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends PartialOAuth2Options {
  var accessToken: js.UndefOr[String] = js.undefined
  var callOptions: js.UndefOr[js.Object] = js.undefined
  var instanceUrl: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[String] = js.undefined
  var maxRequest: js.UndefOr[Double] = js.undefined
  var oauth2: js.UndefOr[Partial[PartialOAuth2Options]] = js.undefined
  var proxyUrl: js.UndefOr[String] = js.undefined
  var refreshToken: js.UndefOr[String] = js.undefined
  var serverUrl: js.UndefOr[String] = js.undefined
  var sessionId: js.UndefOr[String] = js.undefined
  var signedRequest: js.UndefOr[String | js.Object] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    accessToken: String = null,
    callOptions: js.Object = null,
    clientId: String = null,
    clientSecret: String = null,
    instanceUrl: String = null,
    logLevel: String = null,
    loginUrl: String = null,
    maxRequest: Int | Double = null,
    oauth2: Partial[PartialOAuth2Options] = null,
    proxyUrl: String = null,
    redirectUri: String = null,
    refreshToken: String = null,
    serverUrl: String = null,
    sessionId: String = null,
    signedRequest: String | js.Object = null,
    version: String = null
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

