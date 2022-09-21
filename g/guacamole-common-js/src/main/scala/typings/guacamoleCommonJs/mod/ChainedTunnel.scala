package typings.guacamoleCommonJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-common-js", "ChainedTunnel")
@js.native
open class ChainedTunnel protected ()
  extends typings.guacamoleCommonJs.chainedTunnelMod.ChainedTunnel {
  /**
    * @param tunnelChain The tunnels to use, in order of priority.
    */
  def this(tunnels: typings.guacamoleCommonJs.tunnelMod.Tunnel*) = this()
}
