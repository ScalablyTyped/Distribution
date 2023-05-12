package typings.libp2pComponents

import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceConnection.mod.ConnectionProtector
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceContentRouting.mod.ContentRouting_
import typings.libp2pInterfaceDht.mod.DualDHT
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerRouting.mod.PeerRouting_
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

object mod {
  
  @JSImport("@libp2p/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@libp2p/components", "Components")
  @js.native
  open class Components ()
    extends StObject
       with Startable {
    def this(init: ComponentsInit) = this()
    
    /* private */ var addressManager: Any = js.native
    
    @JSName("afterStart")
    def afterStart_MComponents(): js.Promise[Unit] = js.native
    
    @JSName("afterStop")
    def afterStop_MComponents(): js.Promise[Unit] = js.native
    
    @JSName("beforeStart")
    def beforeStart_MComponents(): js.Promise[Unit] = js.native
    
    @JSName("beforeStop")
    def beforeStop_MComponents(): js.Promise[Unit] = js.native
    
    /* private */ var connectionGater: Any = js.native
    
    /* private */ var connectionManager: Any = js.native
    
    /* private */ var connectionProtector: Any = js.native
    
    /* private */ var contentRouting: Any = js.native
    
    /* private */ var datastore: Any = js.native
    
    /* private */ var dht: Any = js.native
    
    /* private */ var dialer: Any = js.native
    
    def getAddressManager(): AddressManager = js.native
    
    def getConnectionGater(): Any = js.native
    
    def getConnectionManager(): ConnectionManager = js.native
    
    def getConnectionProtector(): js.UndefOr[ConnectionProtector] = js.native
    
    def getContentRouting(): ContentRouting_ = js.native
    
    def getDHT(): DualDHT = js.native
    
    def getDatastore(): Datastore[
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
      ] = js.native
    
    def getDialer(): Any = js.native
    
    def getMetrics(): js.UndefOr[Metrics] = js.native
    
    def getPeerId(): PeerId = js.native
    
    def getPeerRouting(): PeerRouting_ = js.native
    
    def getPeerStore(): PeerStore = js.native
    
    def getPubSub(): PubSub[PubSubEvents] = js.native
    
    def getRegistrar(): Registrar = js.native
    
    def getTransportManager(): TransportManager = js.native
    
    def getUpgrader(): Upgrader = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ var metrics: Any = js.native
    
    /* private */ var peerId: Any = js.native
    
    /* private */ var peerRouting: Any = js.native
    
    /* private */ var peerStore: Any = js.native
    
    /* private */ var pubsub: Any = js.native
    
    /* private */ var registrar: Any = js.native
    
    def setAddressManager(addressManager: AddressManager): AddressManager = js.native
    
    def setConnectionGater(
      connectionGater: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConnectionGater */ Any
    ): Any = js.native
    
    def setConnectionManager(connectionManager: ConnectionManager): ConnectionManager = js.native
    
    def setConnectionProtector(connectionProtector: ConnectionProtector): ConnectionProtector = js.native
    
    def setContentRouting(contentRouting: ContentRouting_): ContentRouting_ = js.native
    
    def setDHT(dht: DualDHT): DualDHT = js.native
    
    def setDatastore(
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
        ]
    ): Datastore[
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
      ] = js.native
    
    def setDialer(
      dialer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dialer */ Any
    ): Any = js.native
    
    def setMetrics(metrics: Metrics): Metrics = js.native
    
    def setPeerId(peerId: PeerId): PeerId = js.native
    
    def setPeerRouting(peerRouting: PeerRouting_): PeerRouting_ = js.native
    
    def setPeerStore(peerStore: PeerStore): PeerStore = js.native
    
    def setPubSub(pubsub: PubSub[PubSubEvents]): PubSub[PubSubEvents] = js.native
    
    def setRegistrar(registrar: Registrar): Registrar = js.native
    
    def setTransportManager(transportManager: TransportManager): TransportManager = js.native
    
    def setUpgrader(upgrader: Upgrader): Upgrader = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var transportManager: Any = js.native
    
    /* private */ var upgrader: Any = js.native
  }
  
  inline def isInitializable(obj: Any): /* is @libp2p/components.@libp2p/components.Initializable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInitializable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @libp2p/components.@libp2p/components.Initializable */ Boolean]
  
  trait ComponentsInit extends StObject {
    
    var addressManager: js.UndefOr[AddressManager] = js.undefined
    
    var connectionGater: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConnectionGater */ Any
      ] = js.undefined
    
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
    
    var dht: js.UndefOr[DualDHT] = js.undefined
    
    var dialer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dialer */ Any
      ] = js.undefined
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: js.UndefOr[PeerId] = js.undefined
    
    var peerRouting: js.UndefOr[PeerRouting_] = js.undefined
    
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
      
      inline def setConnectionGater(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConnectionGater */ Any
      ): Self = StObject.set(x, "connectionGater", value.asInstanceOf[js.Any])
      
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
      
      inline def setDht(value: DualDHT): Self = StObject.set(x, "dht", value.asInstanceOf[js.Any])
      
      inline def setDhtUndefined: Self = StObject.set(x, "dht", js.undefined)
      
      inline def setDialer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dialer */ Any
      ): Self = StObject.set(x, "dialer", value.asInstanceOf[js.Any])
      
      inline def setDialerUndefined: Self = StObject.set(x, "dialer", js.undefined)
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
      
      inline def setPeerRouting(value: PeerRouting_): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
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
  
  trait Initializable extends StObject {
    
    def init(components: Components): Unit
  }
  object Initializable {
    
    inline def apply(init: Components => Unit): Initializable = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[Initializable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Initializable] (val x: Self) extends AnyVal {
      
      inline def setInit(value: Components => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
}
