package typings.ionic.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2FlowOptions extends js.Object {
  val authorizationUrl: String
  val clientId: String
  val redirectHost: js.UndefOr[String] = js.undefined
  val redirectPort: js.UndefOr[Double] = js.undefined
  val tokenUrl: String
}

object OAuth2FlowOptions {
  @scala.inline
  def apply(
    authorizationUrl: String,
    clientId: String,
    tokenUrl: String,
    redirectHost: String = null,
    redirectPort: Int | Double = null
  ): OAuth2FlowOptions = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    if (redirectHost != null) __obj.updateDynamic("redirectHost")(redirectHost.asInstanceOf[js.Any])
    if (redirectPort != null) __obj.updateDynamic("redirectPort")(redirectPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2FlowOptions]
  }
}

