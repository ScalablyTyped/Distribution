package typings.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsforce.jsforce/connection.PartialOAuth2Options> */
trait PartialPartialOAuth2Optio extends js.Object {
  var authzServiceUrl: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var loginUrl: js.UndefOr[String] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
  var tokenServiceUrl: js.UndefOr[String] = js.undefined
}

object PartialPartialOAuth2Optio {
  @scala.inline
  def apply(
    authzServiceUrl: String = null,
    clientId: String = null,
    clientSecret: String = null,
    loginUrl: String = null,
    redirectUri: String = null,
    tokenServiceUrl: String = null
  ): PartialPartialOAuth2Optio = {
    val __obj = js.Dynamic.literal()
    if (authzServiceUrl != null) __obj.updateDynamic("authzServiceUrl")(authzServiceUrl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (loginUrl != null) __obj.updateDynamic("loginUrl")(loginUrl.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (tokenServiceUrl != null) __obj.updateDynamic("tokenServiceUrl")(tokenServiceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPartialOAuth2Optio]
  }
}

