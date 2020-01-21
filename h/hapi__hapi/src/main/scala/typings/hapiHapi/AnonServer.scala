package typings.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonServer extends js.Object {
  /**
    * Response timeout in milliseconds. Sets the maximum time allowed for the server to respond to an incoming request before giving up and responding with a Service Unavailable (503) error
    * response.
    */
  var server: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * @default none (use node default of 2 minutes).
    * By default, node sockets automatically timeout after 2 minutes. Use this option to override this behavior. Set to false to disable socket timeouts.
    */
  var socket: js.UndefOr[Boolean | Double] = js.undefined
}

object AnonServer {
  @scala.inline
  def apply(server: Boolean | Double = null, socket: Boolean | Double = null): AnonServer = {
    val __obj = js.Dynamic.literal()
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonServer]
  }
}

