package typings.libp2p

import typings.libp2p.distSrcCircuitRelayMod.CircuitRelayService
import typings.libp2p.distSrcCircuitRelayServerMod.CircuitRelayServerComponents
import typings.libp2p.distSrcCircuitRelayServerMod.CircuitRelayServerInit
import typings.libp2p.distSrcCircuitRelayTransportMod.CircuitRelayTransportComponents
import typings.libp2p.distSrcCircuitRelayTransportMod.CircuitRelayTransportInit
import typings.libp2pInterfaceTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object circuitRelayMod {
  
  @JSImport("libp2p/circuit-relay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circuitRelayServer(): js.Function1[/* components */ CircuitRelayServerComponents, CircuitRelayService] = ^.asInstanceOf[js.Dynamic].applyDynamic("circuitRelayServer")().asInstanceOf[js.Function1[/* components */ CircuitRelayServerComponents, CircuitRelayService]]
  inline def circuitRelayServer(init: CircuitRelayServerInit): js.Function1[/* components */ CircuitRelayServerComponents, CircuitRelayService] = ^.asInstanceOf[js.Dynamic].applyDynamic("circuitRelayServer")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ CircuitRelayServerComponents, CircuitRelayService]]
  
  inline def circuitRelayTransport(): js.Function1[/* components */ CircuitRelayTransportComponents, Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("circuitRelayTransport")().asInstanceOf[js.Function1[/* components */ CircuitRelayTransportComponents, Transport]]
  inline def circuitRelayTransport(init: CircuitRelayTransportInit): js.Function1[/* components */ CircuitRelayTransportComponents, Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("circuitRelayTransport")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ CircuitRelayTransportComponents, Transport]]
}
