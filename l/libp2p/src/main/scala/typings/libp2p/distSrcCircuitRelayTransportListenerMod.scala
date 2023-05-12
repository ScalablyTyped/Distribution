package typings.libp2p

import typings.libp2p.distSrcCircuitRelayTransportReservationStoreMod.ReservationStore
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceTransport.mod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitRelayTransportListenerMod {
  
  @JSImport("libp2p/dist/src/circuit-relay/transport/listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createListener(options: CircuitRelayTransportListenerComponents): Listener = ^.asInstanceOf[js.Dynamic].applyDynamic("createListener")(options.asInstanceOf[js.Any]).asInstanceOf[Listener]
  
  trait CircuitRelayTransportListenerComponents extends StObject {
    
    var connectionManager: ConnectionManager
    
    var relayStore: ReservationStore
  }
  object CircuitRelayTransportListenerComponents {
    
    inline def apply(connectionManager: ConnectionManager, relayStore: ReservationStore): CircuitRelayTransportListenerComponents = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], relayStore = relayStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircuitRelayTransportListenerComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircuitRelayTransportListenerComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setRelayStore(value: ReservationStore): Self = StObject.set(x, "relayStore", value.asInstanceOf[js.Any])
    }
  }
}
