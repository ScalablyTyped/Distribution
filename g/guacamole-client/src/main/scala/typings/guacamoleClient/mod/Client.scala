package typings.guacamoleClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client", "Client")
@js.native
class Client protected ()
  extends typings.guacamoleClient.clientMod.Client {
  /**
    * @param tunnel The tunnel to use to send and receive Guacamole instructions.
    */
  def this(tunnel: typings.guacamoleClient.webSocketTunnelMod.WebSocketTunnel) = this()
}

