package typings.libp2p

import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceConnection.mod.ConnectionGater
import typings.libp2pInterfaceConnection.mod.ConnectionProtector
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceConnectionManager.mod.Dialer
import typings.libp2pInterfaceContentRouting.mod.ContentRouting
import typings.libp2pInterfaceDht.mod.DualDHT
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerRouting.mod.PeerRouting
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfacePubsub.mod.PubSub
import typings.libp2pInterfacePubsub.mod.PubSubEvents
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaceTransport.mod.TransportManager
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcComponentsMod {
  
  @JSImport("libp2p/dist/src/components", "DefaultComponents")
  @js.native
  open class DefaultComponents ()
    extends StObject
       with Components
       with Startable {
    def this(init: ComponentsInit) = this()
    
    /* private */ var _addressManager: Any = js.native
    
    /* private */ var _connectionGater: Any = js.native
    
    /* private */ var _connectionManager: Any = js.native
    
    /* private */ var _connectionProtector: Any = js.native
    
    /* private */ var _contentRouting: Any = js.native
    
    /* private */ var _datastore: Any = js.native
    
    /* private */ var _dht: Any = js.native
    
    /* private */ var _dialer: Any = js.native
    
    /* private */ var _metrics: Any = js.native
    
    /* private */ var _peerId: Any = js.native
    
    /* private */ var _peerRouting: Any = js.native
    
    /* private */ var _peerStore: Any = js.native
    
    /* private */ var _pubsub: Any = js.native
    
    /* private */ var _registrar: Any = js.native
    
    /* private */ var _started: Any = js.native
    
    /* private */ var _transportManager: Any = js.native
    
    /* private */ var _upgrader: Any = js.native
    
    /* CompleteClass */
    var addressManager: AddressManager = js.native
    @JSName("addressManager")
    def addressManager_MDefaultComponents: AddressManager = js.native
    
    @JSName("afterStart")
    def afterStart_MDefaultComponents(): js.Promise[Unit] = js.native
    
    @JSName("afterStop")
    def afterStop_MDefaultComponents(): js.Promise[Unit] = js.native
    
    @JSName("beforeStart")
    def beforeStart_MDefaultComponents(): js.Promise[Unit] = js.native
    
    @JSName("beforeStop")
    def beforeStop_MDefaultComponents(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    var connectionGater: ConnectionGater = js.native
    @JSName("connectionGater")
    def connectionGater_MDefaultComponents: ConnectionGater = js.native
    
    /* CompleteClass */
    var connectionManager: ConnectionManager = js.native
    @JSName("connectionManager")
    def connectionManager_MDefaultComponents: ConnectionManager = js.native
    
    @JSName("connectionProtector")
    def connectionProtector_MDefaultComponents: js.UndefOr[ConnectionProtector] = js.native
    
    /* CompleteClass */
    var contentRouting: ContentRouting = js.native
    @JSName("contentRouting")
    def contentRouting_MDefaultComponents: ContentRouting = js.native
    
    /* CompleteClass */
    var datastore: Datastore = js.native
    @JSName("datastore")
    def datastore_MDefaultComponents: Datastore = js.native
    
    @JSName("dht")
    def dht_MDefaultComponents: js.UndefOr[DualDHT] = js.native
    
    /* CompleteClass */
    var dialer: Dialer = js.native
    @JSName("dialer")
    def dialer_MDefaultComponents: Dialer = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    @JSName("metrics")
    def metrics_MDefaultComponents: js.UndefOr[Metrics] = js.native
    
    /* CompleteClass */
    var peerId: PeerId = js.native
    @JSName("peerId")
    def peerId_MDefaultComponents: PeerId = js.native
    
    /* CompleteClass */
    var peerRouting: PeerRouting = js.native
    @JSName("peerRouting")
    def peerRouting_MDefaultComponents: PeerRouting = js.native
    
    /* CompleteClass */
    var peerStore: PeerStore = js.native
    @JSName("peerStore")
    def peerStore_MDefaultComponents: PeerStore = js.native
    
    @JSName("pubsub")
    def pubsub_MDefaultComponents: js.UndefOr[PubSub[PubSubEvents]] = js.native
    
    /* CompleteClass */
    var registrar: Registrar = js.native
    @JSName("registrar")
    def registrar_MDefaultComponents: Registrar = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
    /* CompleteClass */
    var transportManager: TransportManager = js.native
    @JSName("transportManager")
    def transportManager_MDefaultComponents: TransportManager = js.native
    
    /* CompleteClass */
    var upgrader: Upgrader = js.native
    @JSName("upgrader")
    def upgrader_MDefaultComponents: Upgrader = js.native
  }
  
  trait Components extends StObject {
    
    var addressManager: AddressManager
    
    var connectionGater: ConnectionGater
    
    var connectionManager: ConnectionManager
    
    var connectionProtector: js.UndefOr[ConnectionProtector] = js.undefined
    
    var contentRouting: ContentRouting
    
    var datastore: Datastore
    
    var dht: js.UndefOr[DualDHT] = js.undefined
    
    var dialer: Dialer
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: PeerId
    
    var peerRouting: PeerRouting
    
    var peerStore: PeerStore
    
    var pubsub: js.UndefOr[PubSub[PubSubEvents]] = js.undefined
    
    var registrar: Registrar
    
    var transportManager: TransportManager
    
    var upgrader: Upgrader
  }
  object Components {
    
    inline def apply(
      addressManager: AddressManager,
      connectionGater: ConnectionGater,
      connectionManager: ConnectionManager,
      contentRouting: ContentRouting,
      datastore: Datastore,
      dialer: Dialer,
      peerId: PeerId,
      peerRouting: PeerRouting,
      peerStore: PeerStore,
      registrar: Registrar,
      transportManager: TransportManager,
      upgrader: Upgrader
    ): Components = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], connectionGater = connectionGater.asInstanceOf[js.Any], connectionManager = connectionManager.asInstanceOf[js.Any], contentRouting = contentRouting.asInstanceOf[js.Any], datastore = datastore.asInstanceOf[js.Any], dialer = dialer.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerRouting = peerRouting.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any], transportManager = transportManager.asInstanceOf[js.Any], upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[Components]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Components] (val x: Self) extends AnyVal {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setConnectionGater(value: ConnectionGater): Self = StObject.set(x, "connectionGater", value.asInstanceOf[js.Any])
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setConnectionProtector(value: ConnectionProtector): Self = StObject.set(x, "connectionProtector", value.asInstanceOf[js.Any])
      
      inline def setConnectionProtectorUndefined: Self = StObject.set(x, "connectionProtector", js.undefined)
      
      inline def setContentRouting(value: ContentRouting): Self = StObject.set(x, "contentRouting", value.asInstanceOf[js.Any])
      
      inline def setDatastore(value: Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      inline def setDht(value: DualDHT): Self = StObject.set(x, "dht", value.asInstanceOf[js.Any])
      
      inline def setDhtUndefined: Self = StObject.set(x, "dht", js.undefined)
      
      inline def setDialer(value: Dialer): Self = StObject.set(x, "dialer", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerRouting(value: PeerRouting): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setPubsub(value: PubSub[PubSubEvents]): Self = StObject.set(x, "pubsub", value.asInstanceOf[js.Any])
      
      inline def setPubsubUndefined: Self = StObject.set(x, "pubsub", js.undefined)
      
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
    
    var contentRouting: js.UndefOr[ContentRouting] = js.undefined
    
    var datastore: js.UndefOr[Datastore] = js.undefined
    
    var dht: js.UndefOr[DualDHT] = js.undefined
    
    var dialer: js.UndefOr[Dialer] = js.undefined
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: js.UndefOr[PeerId] = js.undefined
    
    var peerRouting: js.UndefOr[PeerRouting] = js.undefined
    
    var peerStore: js.UndefOr[PeerStore] = js.undefined
    
    var pubsub: js.UndefOr[PubSub[PubSubEvents]] = js.undefined
    
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
      
      inline def setContentRouting(value: ContentRouting): Self = StObject.set(x, "contentRouting", value.asInstanceOf[js.Any])
      
      inline def setContentRoutingUndefined: Self = StObject.set(x, "contentRouting", js.undefined)
      
      inline def setDatastore(value: Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      inline def setDatastoreUndefined: Self = StObject.set(x, "datastore", js.undefined)
      
      inline def setDht(value: DualDHT): Self = StObject.set(x, "dht", value.asInstanceOf[js.Any])
      
      inline def setDhtUndefined: Self = StObject.set(x, "dht", js.undefined)
      
      inline def setDialer(value: Dialer): Self = StObject.set(x, "dialer", value.asInstanceOf[js.Any])
      
      inline def setDialerUndefined: Self = StObject.set(x, "dialer", js.undefined)
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
      
      inline def setPeerRouting(value: PeerRouting): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
      inline def setPeerRoutingUndefined: Self = StObject.set(x, "peerRouting", js.undefined)
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setPeerStoreUndefined: Self = StObject.set(x, "peerStore", js.undefined)
      
      inline def setPubsub(value: PubSub[PubSubEvents]): Self = StObject.set(x, "pubsub", value.asInstanceOf[js.Any])
      
      inline def setPubsubUndefined: Self = StObject.set(x, "pubsub", js.undefined)
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
      
      inline def setRegistrarUndefined: Self = StObject.set(x, "registrar", js.undefined)
      
      inline def setTransportManager(value: TransportManager): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
      
      inline def setTransportManagerUndefined: Self = StObject.set(x, "transportManager", js.undefined)
      
      inline def setUpgrader(value: Upgrader): Self = StObject.set(x, "upgrader", value.asInstanceOf[js.Any])
      
      inline def setUpgraderUndefined: Self = StObject.set(x, "upgrader", js.undefined)
    }
  }
}
