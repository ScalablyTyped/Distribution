package typings.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsforce.jsforce/connection.PartialOAuth2Options> */
trait PartialPartialOAuth2Optio extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var loginUrl: js.UndefOr[String] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
}

object PartialPartialOAuth2Optio {
  @scala.inline
  def apply(
    clientId: String = null,
    clientSecret: String = null,
    loginUrl: String = null,
    redirectUri: String = null
  ): PartialPartialOAuth2Optio = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (loginUrl != null) __obj.updateDynamic("loginUrl")(loginUrl.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPartialOAuth2Optio]
  }
}

