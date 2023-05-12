package typings.libp2pKadDht

import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pKadDht.distSrcQueryTypesMod.QueryFunc
import typings.libp2pKadDht.distSrcRoutingTableMod.RoutingTable
import typings.libp2pKadDht.mod.QueryEvent
import typings.pDefer.mod.DeferredPromise
import typings.std.AsyncGenerator
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueryManagerMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/query/manager", "QueryManager")
  @js.native
  open class QueryManager protected ()
    extends StObject
       with Startable {
    def this(components: QueryManagerComponents, init: QueryManagerInit) = this()
    
    /* private */ val alpha: Any = js.native
    
    /* private */ val components: Any = js.native
    
    var disjointPaths: Double = js.native
    
    /* private */ var initialQuerySelfHasRun: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val lan: Any = js.native
    
    /* private */ var metrics: Any = js.native
    
    /* private */ var queries: Any = js.native
    
    /* private */ val routingTable: Any = js.native
    
    def run(key: js.typedarray.Uint8Array, queryFunc: QueryFunc): AsyncGenerator[QueryEvent, Any, Any] = js.native
    def run(key: js.typedarray.Uint8Array, queryFunc: QueryFunc, options: QueryOptions): AsyncGenerator[QueryEvent, Any, Any] = js.native
    
    /* private */ var running: Any = js.native
    
    /* private */ val shutDownController: Any = js.native
    
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
  }
  
  trait CleanUpEvents extends StObject {
    
    var cleanup: CustomEvent[Any]
  }
  object CleanUpEvents {
    
    inline def apply(cleanup: CustomEvent[Any]): CleanUpEvents = {
      val __obj = js.Dynamic.literal(cleanup = cleanup.asInstanceOf[js.Any])
      __obj.asInstanceOf[CleanUpEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CleanUpEvents] (val x: Self) extends AnyVal {
      
      inline def setCleanup(value: CustomEvent[Any]): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryManagerComponents extends StObject {
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: PeerId
  }
  object QueryManagerComponents {
    
    inline def apply(peerId: PeerId): QueryManagerComponents = {
      val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryManagerComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryManagerComponents] (val x: Self) extends AnyVal {
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryManagerInit extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var disjointPaths: js.UndefOr[Double] = js.undefined
    
    var initialQuerySelfHasRun: DeferredPromise[Unit]
    
    var lan: js.UndefOr[Boolean] = js.undefined
    
    var routingTable: RoutingTable
  }
  object QueryManagerInit {
    
    inline def apply(initialQuerySelfHasRun: DeferredPromise[Unit], routingTable: RoutingTable): QueryManagerInit = {
      val __obj = js.Dynamic.literal(initialQuerySelfHasRun = initialQuerySelfHasRun.asInstanceOf[js.Any], routingTable = routingTable.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryManagerInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryManagerInit] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setDisjointPaths(value: Double): Self = StObject.set(x, "disjointPaths", value.asInstanceOf[js.Any])
      
      inline def setDisjointPathsUndefined: Self = StObject.set(x, "disjointPaths", js.undefined)
      
      inline def setInitialQuerySelfHasRun(value: DeferredPromise[Unit]): Self = StObject.set(x, "initialQuerySelfHasRun", value.asInstanceOf[js.Any])
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setLanUndefined: Self = StObject.set(x, "lan", js.undefined)
      
      inline def setRoutingTable(value: RoutingTable): Self = StObject.set(x, "routingTable", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryOptions
    extends StObject
       with typings.libp2pKadDht.mod.QueryOptions {
    
    var isSelfQuery: js.UndefOr[Boolean] = js.undefined
  }
  object QueryOptions {
    
    inline def apply(): QueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
      
      inline def setIsSelfQuery(value: Boolean): Self = StObject.set(x, "isSelfQuery", value.asInstanceOf[js.Any])
      
      inline def setIsSelfQueryUndefined: Self = StObject.set(x, "isSelfQuery", js.undefined)
    }
  }
}
