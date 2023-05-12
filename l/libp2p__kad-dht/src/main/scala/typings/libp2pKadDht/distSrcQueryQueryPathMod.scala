package typings.libp2pKadDht

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.libp2pKadDht.distSrcQueryManagerMod.CleanUpEvents
import typings.libp2pKadDht.distSrcQueryTypesMod.QueryContext
import typings.libp2pKadDht.distSrcQueryTypesMod.QueryFunc
import typings.libp2pKadDht.mod.QueryEvent
import typings.libp2pKadDht.mod.QueryOptions
import typings.libp2pLogger.mod.Logger_
import typings.libp2pPeerCollections.mod.PeerSet
import typings.std.AbortSignal
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueryQueryPathMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/query/query-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def queryPath(options: QueryPathOptions): AsyncGenerator[QueryEvent, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryPath")(options.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[QueryEvent, Unit, Unit]]
  
  trait QueryPathOptions
    extends StObject
       with QueryOptions {
    
    /**
      * How many concurrent node/value lookups to run
      */
    var alpha: Double
    
    /**
      * will emit a 'cleanup' event if the caller exits the for..await of early
      */
    var cleanUp: EventEmitter[CleanUpEvents]
    
    /**
      * What are we trying to find
      */
    var key: js.typedarray.Uint8Array
    
    /**
      * Query log
      */
    def log(formatter: Any, args: Any*): Unit
    /**
      * Query log
      */
    @JSName("log")
    var log_Original: Logger_
    
    /**
      * How many concurrent node/value lookups to run
      */
    var numPaths: Double
    
    /**
      * Who we are
      */
    var ourPeerId: PeerId
    
    /**
      * How many concurrent node/value lookups to run
      */
    var pathIndex: Double
    
    /**
      * Set of peers seen by this and other paths
      */
    var peersSeen: PeerSet
    
    /**
      * The query function to run with each peer
      */
    def query(context: QueryContext): AsyncIterable[QueryEvent]
    /**
      * The query function to run with each peer
      */
    @JSName("query")
    var query_Original: QueryFunc
    
    /**
      * When to stop querying
      */
    @JSName("signal")
    var signal_QueryPathOptions: AbortSignal
    
    /**
      * Where we start our query
      */
    var startingPeer: PeerId
  }
  object QueryPathOptions {
    
    inline def apply(
      alpha: Double,
      cleanUp: EventEmitter[CleanUpEvents],
      key: js.typedarray.Uint8Array,
      log: Logger_,
      numPaths: Double,
      ourPeerId: PeerId,
      pathIndex: Double,
      peersSeen: PeerSet,
      query: /* context */ QueryContext => AsyncIterable[QueryEvent],
      signal: AbortSignal,
      startingPeer: PeerId
    ): QueryPathOptions = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], cleanUp = cleanUp.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], numPaths = numPaths.asInstanceOf[js.Any], ourPeerId = ourPeerId.asInstanceOf[js.Any], pathIndex = pathIndex.asInstanceOf[js.Any], peersSeen = peersSeen.asInstanceOf[js.Any], query = js.Any.fromFunction1(query), signal = signal.asInstanceOf[js.Any], startingPeer = startingPeer.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryPathOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryPathOptions] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setCleanUp(value: EventEmitter[CleanUpEvents]): Self = StObject.set(x, "cleanUp", value.asInstanceOf[js.Any])
      
      inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLog(value: Logger_): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setNumPaths(value: Double): Self = StObject.set(x, "numPaths", value.asInstanceOf[js.Any])
      
      inline def setOurPeerId(value: PeerId): Self = StObject.set(x, "ourPeerId", value.asInstanceOf[js.Any])
      
      inline def setPathIndex(value: Double): Self = StObject.set(x, "pathIndex", value.asInstanceOf[js.Any])
      
      inline def setPeersSeen(value: PeerSet): Self = StObject.set(x, "peersSeen", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: /* context */ QueryContext => AsyncIterable[QueryEvent]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setStartingPeer(value: PeerId): Self = StObject.set(x, "startingPeer", value.asInstanceOf[js.Any])
    }
  }
}
