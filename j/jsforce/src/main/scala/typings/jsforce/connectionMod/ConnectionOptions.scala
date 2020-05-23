package typings.jsforce.connectionMod

import typings.jsforce.anon.PartialPartialOAuth2Optio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends PartialOAuth2Options {
  var accessToken: js.UndefOr[String] = js.undefined
  var callOptions: js.UndefOr[js.Object] = js.undefined
  var instanceUrl: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[String] = js.undefined
  var maxRequest: js.UndefOr[Double] = js.undefined
  var oauth2: js.UndefOr[PartialPartialOAuth2Optio] = js.undefined
  var proxyUrl: js.UndefOr[String] = js.undefined
  var refreshFn: js.UndefOr[
    js.Function2[/* conn */ Connection, /* callback */ Callback[UserInfo], js.Promise[UserInfo]]
  ] = js.undefined
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
    authzServiceUrl: String = null,
    callOptions: js.Object = null,
    clientId: String = null,
    clientSecret: String = null,
    instanceUrl: String = null,
    logLevel: String = null,
    loginUrl: String = null,
    maxRequest: js.UndefOr[Double] = js.undefined,
    oauth2: PartialPartialOAuth2Optio = null,
    proxyUrl: String = null,
    redirectUri: String = null,
    refreshFn: (/* conn */ Connection, /* callback */ Callback[UserInfo]) => js.Promise[UserInfo] = null,
    refreshToken: String = null,
    serverUrl: String = null,
    sessionId: String = null,
    signedRequest: String | js.Object = null,
    tokenServiceUrl: String = null,
    version: String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (authzServiceUrl != null) __obj.updateDynamic("authzServiceUrl")(authzServiceUrl.asInstanceOf[js.Any])
    if (callOptions != null) __obj.updateDynamic("callOptions")(callOptions.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (instanceUrl != null) __obj.updateDynamic("instanceUrl")(instanceUrl.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (loginUrl != null) __obj.updateDynamic("loginUrl")(loginUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRequest)) __obj.updateDynamic("maxRequest")(maxRequest.get.asInstanceOf[js.Any])
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (refreshFn != null) __obj.updateDynamic("refreshFn")(js.Any.fromFunction2(refreshFn))
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (serverUrl != null) __obj.updateDynamic("serverUrl")(serverUrl.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (signedRequest != null) __obj.updateDynamic("signedRequest")(signedRequest.asInstanceOf[js.Any])
    if (tokenServiceUrl != null) __obj.updateDynamic("tokenServiceUrl")(tokenServiceUrl.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

