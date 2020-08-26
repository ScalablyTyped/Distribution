package typings.guacamoleClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client", "ChainedTunnel")
@js.native
class ChainedTunnel protected ()
  extends typings.guacamoleClient.chainedTunnelMod.ChainedTunnel {
  /**
    * @param tunnelChain The tunnels to use, in order of priority.
    */
  def this(tunnels: typings.guacamoleClient.tunnelMod.Tunnel*) = this()
}

