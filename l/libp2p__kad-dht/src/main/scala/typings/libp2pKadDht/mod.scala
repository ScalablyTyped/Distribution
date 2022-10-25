package typings.libp2pKadDht

import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceDht.mod.Selectors
import typings.libp2pInterfaceDht.mod.Validators
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pKadDht.distSrcDualKadDhtMod.DualKadDHT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/kad-dht", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def kadDHT(): js.Function1[/* components */ KadDHTComponents, DualKadDHT] = ^.asInstanceOf[js.Dynamic].applyDynamic("kadDHT")().asInstanceOf[js.Function1[/* components */ KadDHTComponents, DualKadDHT]]
  inline def kadDHT(init: KadDHTInit): js.Function1[/* components */ KadDHTComponents, DualKadDHT] = ^.asInstanceOf[js.Dynamic].applyDynamic("kadDHT")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ KadDHTComponents, DualKadDHT]]
  
  trait KadDHTComponents extends StObject {
    
    var addressManager: AddressManager
    
    var connectionManager: ConnectionManager
    
    var datastore: Datastore
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var registrar: Registrar
  }
  object KadDHTComponents {
    
    inline def apply(
      addressManager: AddressManager,
      connectionManager: ConnectionManager,
      datastore: Datastore,
      peerId: PeerId,
      peerStore: PeerStore,
      registrar: Registrar
    ): KadDHTComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], connectionManager = connectionManager.asInstanceOf[js.Any], datastore = datastore.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any])
      __obj.asInstanceOf[KadDHTComponents]
    }
    
    extension [Self <: KadDHTComponents](x: Self) {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setDatastore(value: Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
    }
  }
  
  trait KadDHTInit extends StObject {
    
    /**
      * Whether to start up as a DHT client or server
      */
    var clientMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How many peers to store in each kBucket (default 20)
      */
    var kBucketSize: js.UndefOr[Double] = js.undefined
    
    /**
      * How many parallel incoming streams to allow on the DHT protocol per-connection
      */
    var maxInboundStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * How many parallel outgoing streams to allow on the DHT protocol per-connection
      */
    var maxOutboundStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * How many peers to ping in parallel when deciding if they should
      * be evicted from the routing table or not (default 10)
      */
    var pingConcurrency: js.UndefOr[Double] = js.undefined
    
    /**
      * How long to wait in ms when pinging DHT peers to decide if they
      * should be evicted from the routing table or not (default 10000)
      */
    var pingTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * A custom protocol prefix to use (default: '/ipfs')
      */
    var protocolPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * How often to query our own PeerId in order to ensure we have a
      * good view on the KAD address space local to our PeerId
      */
    var querySelfInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Record selectors
      */
    var selectors: js.UndefOr[Selectors] = js.undefined
    
    /**
      * Record validators
      */
    var validators: js.UndefOr[Validators] = js.undefined
  }
  object KadDHTInit {
    
    inline def apply(): KadDHTInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KadDHTInit]
    }
    
    extension [Self <: KadDHTInit](x: Self) {
      
      inline def setClientMode(value: Boolean): Self = StObject.set(x, "clientMode", value.asInstanceOf[js.Any])
      
      inline def setClientModeUndefined: Self = StObject.set(x, "clientMode", js.undefined)
      
      inline def setKBucketSize(value: Double): Self = StObject.set(x, "kBucketSize", value.asInstanceOf[js.Any])
      
      inline def setKBucketSizeUndefined: Self = StObject.set(x, "kBucketSize", js.undefined)
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
      
      inline def setPingConcurrency(value: Double): Self = StObject.set(x, "pingConcurrency", value.asInstanceOf[js.Any])
      
      inline def setPingConcurrencyUndefined: Self = StObject.set(x, "pingConcurrency", js.undefined)
      
      inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
      
      inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
      
      inline def setProtocolPrefix(value: String): Self = StObject.set(x, "protocolPrefix", value.asInstanceOf[js.Any])
      
      inline def setProtocolPrefixUndefined: Self = StObject.set(x, "protocolPrefix", js.undefined)
      
      inline def setQuerySelfInterval(value: Double): Self = StObject.set(x, "querySelfInterval", value.asInstanceOf[js.Any])
      
      inline def setQuerySelfIntervalUndefined: Self = StObject.set(x, "querySelfInterval", js.undefined)
      
      inline def setSelectors(value: Selectors): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setValidators(value: Validators): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    }
  }
}
