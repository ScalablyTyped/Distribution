package typings.libp2pKadDht

import typings.libp2pComponents.mod.Components
import typings.libp2pComponents.mod.Initializable
import typings.libp2pInterfaceDht.mod.QueryEvent
import typings.libp2pInterfaceDht.mod.QueryOptions
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pKadDht.distSrcQueryTypesMod.QueryFunc
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
       with Startable
       with Initializable {
    def this(init: QueryManagerInit) = this()
    
    /* private */ val alpha: Any = js.native
    
    /* private */ var components: Any = js.native
    
    /* private */ val controllers: Any = js.native
    
    var disjointPaths: Double = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val lan: Any = js.native
    
    /* private */ var queries: Any = js.native
    
    def run(key: js.typedarray.Uint8Array, peers: js.Array[PeerId], queryFunc: QueryFunc): AsyncGenerator[QueryEvent, Unit, Any] = js.native
    def run(
      key: js.typedarray.Uint8Array,
      peers: js.Array[PeerId],
      queryFunc: QueryFunc,
      options: QueryOptions
    ): AsyncGenerator[QueryEvent, Unit, Any] = js.native
    
    /* private */ var running: Any = js.native
    
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
    
    extension [Self <: CleanUpEvents](x: Self) {
      
      inline def setCleanup(value: CustomEvent[Any]): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryManagerInit extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var disjointPaths: js.UndefOr[Double] = js.undefined
    
    var lan: js.UndefOr[Boolean] = js.undefined
  }
  object QueryManagerInit {
    
    inline def apply(): QueryManagerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryManagerInit]
    }
    
    extension [Self <: QueryManagerInit](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setDisjointPaths(value: Double): Self = StObject.set(x, "disjointPaths", value.asInstanceOf[js.Any])
      
      inline def setDisjointPathsUndefined: Self = StObject.set(x, "disjointPaths", js.undefined)
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setLanUndefined: Self = StObject.set(x, "lan", js.undefined)
    }
  }
}
