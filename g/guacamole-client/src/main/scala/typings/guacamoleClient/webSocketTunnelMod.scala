package typings.guacamoleClient

import typings.guacamoleClient.tunnelMod.Tunnel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client/lib/WebSocketTunnel", JSImport.Namespace)
@js.native
object webSocketTunnelMod extends js.Object {
  @js.native
  class WebSocketTunnel protected () extends Tunnel {
    /**
      * @param tunnelURL The URL of the WebSocket tunneling service.
      */
    def this(tunnelURL: String) = this()
  }
  
}

