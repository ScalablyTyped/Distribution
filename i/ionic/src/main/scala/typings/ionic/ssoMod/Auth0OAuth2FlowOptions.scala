package typings.ionic.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<ionic.ionic/lib/sso.OAuth2FlowOptions> */
trait Auth0OAuth2FlowOptions extends js.Object {
  val audience: js.UndefOr[String] = js.undefined
  var authorizationUrl: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  val connection: String
  val email: String
  var redirectHost: js.UndefOr[String] = js.undefined
  var redirectPort: js.UndefOr[Double] = js.undefined
  var tokenUrl: js.UndefOr[String] = js.undefined
}

object Auth0OAuth2FlowOptions {
  @scala.inline
  def apply(
    connection: String,
    email: String,
    audience: String = null,
    authorizationUrl: String = null,
    clientId: String = null,
    redirectHost: String = null,
    redirectPort: Int | Double = null,
    tokenUrl: String = null
  ): Auth0OAuth2FlowOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (authorizationUrl != null) __obj.updateDynamic("authorizationUrl")(authorizationUrl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (redirectHost != null) __obj.updateDynamic("redirectHost")(redirectHost.asInstanceOf[js.Any])
    if (redirectPort != null) __obj.updateDynamic("redirectPort")(redirectPort.asInstanceOf[js.Any])
    if (tokenUrl != null) __obj.updateDynamic("tokenUrl")(tokenUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0OAuth2FlowOptions]
  }
}

