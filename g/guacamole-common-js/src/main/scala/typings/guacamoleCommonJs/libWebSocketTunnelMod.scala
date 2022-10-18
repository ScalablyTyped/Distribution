package typings.guacamoleCommonJs

import typings.guacamoleCommonJs.libTunnelMod.Tunnel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWebSocketTunnelMod {
  
  @JSImport("guacamole-common-js/lib/WebSocketTunnel", "WebSocketTunnel")
  @js.native
  open class WebSocketTunnel protected () extends Tunnel {
    /**
      * @param tunnelURL The URL of the WebSocket tunneling service.
      */
    def this(tunnelURL: String) = this()
  }
}
