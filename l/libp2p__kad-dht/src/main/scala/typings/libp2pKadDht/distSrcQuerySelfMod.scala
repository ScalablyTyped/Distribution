package typings.libp2pKadDht

import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pKadDht.distSrcPeerRoutingMod.PeerRouting
import typings.libp2pKadDht.mod.KadDHTComponents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQuerySelfMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/query-self", "QuerySelf")
  @js.native
  open class QuerySelf protected ()
    extends StObject
       with Startable {
    def this(components: KadDHTComponents, init: QuerySelfInit) = this()
    
    def _querySelf(): Unit = js.native
    
    /* private */ val components: Any = js.native
    
    /* private */ var controller: Any = js.native
    
    /* private */ val count: Any = js.native
    
    /* private */ val interval: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ val peerRouting: Any = js.native
    
    /* private */ val queryTimeout: Any = js.native
    
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
    
    /* private */ var timeoutId: Any = js.native
  }
  
  trait QuerySelfInit extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var lan: Boolean
    
    var peerRouting: PeerRouting
    
    var queryTimeout: js.UndefOr[Double] = js.undefined
  }
  object QuerySelfInit {
    
    inline def apply(lan: Boolean, peerRouting: PeerRouting): QuerySelfInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], peerRouting = peerRouting.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuerySelfInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuerySelfInit] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setPeerRouting(value: PeerRouting): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
      inline def setQueryTimeout(value: Double): Self = StObject.set(x, "queryTimeout", value.asInstanceOf[js.Any])
      
      inline def setQueryTimeoutUndefined: Self = StObject.set(x, "queryTimeout", js.undefined)
    }
  }
}
