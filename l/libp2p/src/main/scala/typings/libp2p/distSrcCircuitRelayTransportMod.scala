package typings.libp2p

import typings.libp2p.distSrcCircuitRelayTransportDiscoveryMod.RelayDiscoveryComponents
import typings.libp2p.distSrcCircuitRelayTransportReservationStoreMod.RelayStoreInit
import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceConnectionGater.mod.ConnectionGater
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceContentRouting.mod.ContentRouting_
import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaceTransport.mod.Transport
import typings.libp2pInterfaceTransport.mod.TransportManager
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.libp2pInterfaces.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitRelayTransportMod {
  
  @JSImport("libp2p/dist/src/circuit-relay/transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circuitRelayTransport(): js.Function1[/* components */ CircuitRelayTransportComponents, Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("circuitRelayTransport")().asInstanceOf[js.Function1[/* components */ CircuitRelayTransportComponents, Transport]]
  inline def circuitRelayTransport(init: CircuitRelayTransportInit): js.Function1[/* components */ CircuitRelayTransportComponents, Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("circuitRelayTransport")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ CircuitRelayTransportComponents, Transport]]
  
  trait CircuitRelayTransportComponents
    extends StObject
       with RelayDiscoveryComponents {
    
    var addressManager: AddressManager
    
    var connectionGater: ConnectionGater
    
    var events: EventEmitter[Libp2pEvents]
    
    var upgrader: Upgrader
  }
  object CircuitRelayTransportComponents {
    
    inline def apply(
      addressManager: AddressManager,
      connectionGater: ConnectionGater,
      connectionManager: ConnectionManager,
      contentRouting: ContentRouting_,
      events: EventEmitter[Libp2pEvents],
      peerId: PeerId,
      peerStore: PeerStore,
      registrar: Registrar,
      transportManager: TransportManager,
      upgrader: Upgrader
    ): CircuitRelayTransportComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], connectionGater = connectionGater.asInstanceOf[js.Any], connectionManager = connectionManager.asInstanceOf[js.Any], contentRouting = contentRouting.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any], transportManager = transportManager.asInstanceOf[js.Any], upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircuitRelayTransportComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircuitRelayTransportComponents] (val x: Self) extends AnyVal {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setConnectionGater(value: ConnectionGater): Self = StObject.set(x, "connectionGater", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setUpgrader(value: Upgrader): Self = StObject.set(x, "upgrader", value.asInstanceOf[js.Any])
    }
  }
  
  trait CircuitRelayTransportInit
    extends StObject
       with RelayStoreInit
  object CircuitRelayTransportInit {
    
    inline def apply(): CircuitRelayTransportInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircuitRelayTransportInit]
    }
  }
}
