package typings.guacamoleCommonJs

import typings.guacamoleCommonJs.libTunnelMod.Tunnel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChainedTunnelMod {
  
  @JSImport("guacamole-common-js/lib/ChainedTunnel", "ChainedTunnel")
  @js.native
  open class ChainedTunnel protected () extends Tunnel {
    /**
      * @param tunnelChain The tunnels to use, in order of priority.
      */
    def this(tunnels: Tunnel*) = this()
  }
}
