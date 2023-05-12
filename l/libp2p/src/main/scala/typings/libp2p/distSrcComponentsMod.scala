package typings.libp2p

import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceConnection.mod.ConnectionProtector
import typings.libp2pInterfaceConnectionGater.mod.ConnectionGater
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceContentRouting.mod.ContentRouting_
import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerRouting.mod.PeerRouting_
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaceTransport.mod.TransportManager
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcComponentsMod {
  
  @JSImport("libp2p/dist/src/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultComponents(): Components = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultComponents")().asInstanceOf[Components]
  inline def defaultComponents(init: ComponentsInit): Components = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultComponents")(init.asInstanceOf[js.Any]).asInstanceOf[Components]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait Components
    extends StObject
       with Startable {
    
    var addressManager: AddressManager
    
    var connectionGater: ConnectionGater
    
    var connectionManager: ConnectionManager
    
    var connectionProtector: js.UndefOr[ConnectionProtector] = js.undefined
    
    var contentRouting: ContentRouting_
    
    var datastore: Datastore[
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object
      ]
    
    var events: EventEmitter[Libp2pEvents]
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: PeerId
    
    var peerRouting: PeerRouting_
    
    var peerStore: PeerStore
    
    var registrar: Registrar
    
    var transportManager: TransportManager
    
    var upgrader: Upgrader
  }
  object Components {
    
    inline def apply(
      addressManager: AddressManager,
      connectionGater: ConnectionGater,
      connectionManager: ConnectionManager,
      contentRouting: ContentRouting_,
      datastore: Datastore[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object
        ],
      events: EventEmitter[Libp2pEvents],
      isStarted: () => Boolean,
      peerId: PeerId,
      peerRouting: PeerRouting_,
      peerStore: PeerStore,
      registrar: Registrar,
      start: () => Unit | js.Promise[Unit],
      stop: () => Unit | js.Promise[Unit],
      transportManager: TransportManager,
      upgrader: Upgrader
    ): Components = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], connectionGater = connectionGater.asInstanceOf[js.Any], connectionManager = connectionManager.asInstanceOf[js.Any], contentRouting = contentRouting.asInstanceOf[js.Any], datastore = datastore.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], isStarted = js.Any.fromFunction0(isStarted), peerId = peerId.asInstanceOf[js.Any], peerRouting = peerRouting.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), transportManager = transportManager.asInstanceOf[js.Any], upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[Components]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Components] (val x: Self) extends AnyVal {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setConnectionGater(value: ConnectionGater): Self = StObject.set(x, "connectionGater", value.asInstanceOf[js.Any])
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setConnectionProtector(value: ConnectionProtector): Self = StObject.set(x, "connectionProtector", value.asInstanceOf[js.Any])
      
      inline def setConnectionProtectorUndefined: Self = StObject.set(x, "connectionProtector", js.undefined)
      
      inline def setContentRouting(value: ContentRouting_): Self = StObject.set(x, "contentRouting", value.asInstanceOf[js.Any])
      
      inline def setDatastore(
        value: Datastore[
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object
            ]
      ): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerRouting(value: PeerRouting_): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
      
      inline def setTransportManager(value: TransportManager): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
      
      inline def setUpgrader(value: Upgrader): Self = StObject.set(x, "upgrader", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentsInit extends StObject {
    
    var addressManager: js.UndefOr[AddressManager] = js.undefined
    
    var connectionGater: js.UndefOr[ConnectionGater] = js.undefined
    
    var connectionManager: js.UndefOr[ConnectionManager] = js.undefined
    
    var connectionProtector: js.UndefOr[ConnectionProtector] = js.undefined
    
    var contentRouting: js.UndefOr[ContentRouting_] = js.undefined
    
    var datastore: js.UndefOr[
        Datastore[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object
        ]
      ] = js.undefined
    
    var events: js.UndefOr[EventEmitter[Libp2pEvents]] = js.undefined
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: js.UndefOr[PeerId] = js.undefined
    
    var peerRouting: js.UndefOr[PeerRouting_] = js.undefined
    
    var peerStore: js.UndefOr[PeerStore] = js.undefined
    
    var registrar: js.UndefOr[Registrar] = js.undefined
    
    var transportManager: js.UndefOr[TransportManager] = js.undefined
    
    var upgrader: js.UndefOr[Upgrader] = js.undefined
  }
  object ComponentsInit {
    
    inline def apply(): ComponentsInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentsInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentsInit] (val x: Self) extends AnyVal {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setAddressManagerUndefined: Self = StObject.set(x, "addressManager", js.undefined)
      
      inline def setConnectionGater(value: ConnectionGater): Self = StObject.set(x, "connectionGater", value.asInstanceOf[js.Any])
      
      inline def setConnectionGaterUndefined: Self = StObject.set(x, "connectionGater", js.undefined)
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setConnectionManagerUndefined: Self = StObject.set(x, "connectionManager", js.undefined)
      
      inline def setConnectionProtector(value: ConnectionProtector): Self = StObject.set(x, "connectionProtector", value.asInstanceOf[js.Any])
      
      inline def setConnectionProtectorUndefined: Self = StObject.set(x, "connectionProtector", js.undefined)
      
      inline def setContentRouting(value: ContentRouting_): Self = StObject.set(x, "contentRouting", value.asInstanceOf[js.Any])
      
      inline def setContentRoutingUndefined: Self = StObject.set(x, "contentRouting", js.undefined)
      
      inline def setDatastore(
        value: Datastore[
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object
            ]
      ): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      inline def setDatastoreUndefined: Self = StObject.set(x, "datastore", js.undefined)
      
      inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
      
      inline def setPeerRouting(value: PeerRouting_): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
      inline def setPeerRoutingUndefined: Self = StObject.set(x, "peerRouting", js.undefined)
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setPeerStoreUndefined: Self = StObject.set(x, "peerStore", js.undefined)
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
      
      inline def setRegistrarUndefined: Self = StObject.set(x, "registrar", js.undefined)
      
      inline def setTransportManager(value: TransportManager): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
      
      inline def setTransportManagerUndefined: Self = StObject.set(x, "transportManager", js.undefined)
      
      inline def setUpgrader(value: Upgrader): Self = StObject.set(x, "upgrader", value.asInstanceOf[js.Any])
      
      inline def setUpgraderUndefined: Self = StObject.set(x, "upgrader", js.undefined)
    }
  }
}
