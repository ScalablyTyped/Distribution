package typings.atHapiNes.atHapiNesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSubscriptionOptionsFilterOptions extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var socket: Socket
}

object ServerSubscriptionOptionsFilterOptions {
  @scala.inline
  def apply(socket: Socket, credentials: js.Any = null, params: js.Any = null): ServerSubscriptionOptionsFilterOptions = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSubscriptionOptionsFilterOptions]
  }
}

