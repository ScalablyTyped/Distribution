package typings.libp2pKadDht

import typings.libp2pInterfaces.mod.AbortOptions
import typings.libp2pKadDht.distSrcNetworkMod.Network
import typings.libp2pKadDht.distSrcPeerRoutingMod.PeerRouting
import typings.libp2pKadDht.distSrcQueryManagerMod.QueryManager
import typings.libp2pKadDht.mod.KadDHTComponents
import typings.libp2pKadDht.mod.QueryEvent
import typings.libp2pKadDht.mod.QueryOptions
import typings.libp2pKadDht.mod.Selectors
import typings.libp2pKadDht.mod.Validators
import typings.libp2pKadDht.mod.ValueEvent
import typings.libp2pRecord.mod.Libp2pRecord
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcContentFetchingMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/content-fetching", "ContentFetching")
  @js.native
  open class ContentFetching protected () extends StObject {
    def this(components: KadDHTComponents, init: ContentFetchingInit) = this()
    
    /* private */ val components: Any = js.native
    
    /**
      * Get the value to the given key
      */
    def get(key: js.typedarray.Uint8Array): AsyncGenerator[QueryEvent | ValueEvent, Any, Any] = js.native
    def get(key: js.typedarray.Uint8Array, options: QueryOptions): AsyncGenerator[QueryEvent | ValueEvent, Any, Any] = js.native
    
    /**
      * Attempt to retrieve the value for the given key from
      * the local datastore
      */
    def getLocal(key: js.typedarray.Uint8Array): js.Promise[Libp2pRecord] = js.native
    
    /**
      * Get the `n` values to the given key without sorting
      */
    def getMany(key: js.typedarray.Uint8Array): AsyncGenerator[QueryEvent, Any, Any] = js.native
    def getMany(key: js.typedarray.Uint8Array, options: QueryOptions): AsyncGenerator[QueryEvent, Any, Any] = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ val network: Any = js.native
    
    /* private */ val peerRouting: Any = js.native
    
    /**
      * Store the given key/value pair in the DHT
      */
    def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): AsyncGenerator[Any, Unit, Unit] = js.native
    def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, options: AbortOptions): AsyncGenerator[Any, Unit, Unit] = js.native
    
    def putLocal(key: js.typedarray.Uint8Array, rec: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    
    /* private */ val queryManager: Any = js.native
    
    /* private */ val selectors: Any = js.native
    
    /**
      * Send the best record found to any peers that have an out of date record
      */
    def sendCorrectionRecord(key: js.typedarray.Uint8Array, vals: js.Array[ValueEvent], best: js.typedarray.Uint8Array): AsyncGenerator[QueryEvent, Any, Any] = js.native
    def sendCorrectionRecord(
      key: js.typedarray.Uint8Array,
      vals: js.Array[ValueEvent],
      best: js.typedarray.Uint8Array,
      options: AbortOptions
    ): AsyncGenerator[QueryEvent, Any, Any] = js.native
    
    /* private */ val validators: Any = js.native
  }
  
  trait ContentFetchingInit extends StObject {
    
    var lan: Boolean
    
    var network: Network
    
    var peerRouting: PeerRouting
    
    var queryManager: QueryManager
    
    var selectors: Selectors
    
    var validators: Validators
  }
  object ContentFetchingInit {
    
    inline def apply(
      lan: Boolean,
      network: Network,
      peerRouting: PeerRouting,
      queryManager: QueryManager,
      selectors: Selectors,
      validators: Validators
    ): ContentFetchingInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], peerRouting = peerRouting.asInstanceOf[js.Any], queryManager = queryManager.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentFetchingInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentFetchingInit] (val x: Self) extends AnyVal {
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setPeerRouting(value: PeerRouting): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
      inline def setQueryManager(value: QueryManager): Self = StObject.set(x, "queryManager", value.asInstanceOf[js.Any])
      
      inline def setSelectors(value: Selectors): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setValidators(value: Validators): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    }
  }
}
