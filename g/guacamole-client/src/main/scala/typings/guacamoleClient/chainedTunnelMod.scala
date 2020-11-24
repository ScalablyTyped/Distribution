package typings.guacamoleClient

import typings.guacamoleClient.tunnelMod.Tunnel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client/lib/ChainedTunnel", JSImport.Namespace)
@js.native
object chainedTunnelMod extends js.Object {
  
  @js.native
  class ChainedTunnel protected () extends Tunnel {
    /**
      * @param tunnelChain The tunnels to use, in order of priority.
      */
    def this(tunnels: Tunnel*) = this()
  }
}
