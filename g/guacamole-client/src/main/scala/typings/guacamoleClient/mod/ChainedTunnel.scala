package typings.guacamoleClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "ChainedTunnel")
@js.native
open class ChainedTunnel protected ()
  extends typings.guacamoleClient.libChainedTunnelMod.ChainedTunnel {
  /**
    * @param tunnelChain The tunnels to use, in order of priority.
    */
  def this(tunnels: typings.guacamoleClient.libTunnelMod.Tunnel*) = this()
}
