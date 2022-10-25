package typings.libp2p

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerRouting.mod.PeerRouting
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPeerRoutingMod {
  
  @JSImport("libp2p/dist/src/peer-routing", "DefaultPeerRouting")
  @js.native
  open class DefaultPeerRouting protected ()
    extends StObject
       with PeerRouting
       with Startable {
    def this(components: DefaultPeerRoutingComponents, init: PeerRoutingInit) = this()
    
    /**
      * Recurrent task to find closest peers and add their addresses to the Address Book.
      */
    def _findClosestPeersTask(): js.Promise[Unit] = js.native
    
    /* private */ var abortController: Any = js.native
    
    /* private */ val components: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val refreshManagerInit: Any = js.native
    
    /* private */ val routers: Any = js.native
    
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
    
    /* private */ var timeoutId: Any = js.native
  }
  
  trait DefaultPeerRoutingComponents extends StObject {
    
    var peerId: PeerId
    
    var peerStore: PeerStore
  }
  object DefaultPeerRoutingComponents {
    
    inline def apply(peerId: PeerId, peerStore: PeerStore): DefaultPeerRoutingComponents = {
      val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultPeerRoutingComponents]
    }
    
    extension [Self <: DefaultPeerRoutingComponents](x: Self) {
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait PeerRoutingInit extends StObject {
    
    var refreshManager: js.UndefOr[RefreshManagerInit] = js.undefined
    
    var routers: js.Array[PeerRouting]
  }
  object PeerRoutingInit {
    
    inline def apply(routers: js.Array[PeerRouting]): PeerRoutingInit = {
      val __obj = js.Dynamic.literal(routers = routers.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerRoutingInit]
    }
    
    extension [Self <: PeerRoutingInit](x: Self) {
      
      inline def setRefreshManager(value: RefreshManagerInit): Self = StObject.set(x, "refreshManager", value.asInstanceOf[js.Any])
      
      inline def setRefreshManagerUndefined: Self = StObject.set(x, "refreshManager", js.undefined)
      
      inline def setRouters(value: js.Array[PeerRouting]): Self = StObject.set(x, "routers", value.asInstanceOf[js.Any])
      
      inline def setRoutersVarargs(value: PeerRouting*): Self = StObject.set(x, "routers", js.Array(value*))
    }
  }
  
  trait RefreshManagerInit extends StObject {
    
    /**
      * Boot delay to start the Refresh Manager (in ms)
      */
    var bootDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to enable the Refresh manager
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Interval between each Refresh Manager run (in ms)
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * How long to let each refresh run (in ms)
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RefreshManagerInit {
    
    inline def apply(): RefreshManagerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshManagerInit]
    }
    
    extension [Self <: RefreshManagerInit](x: Self) {
      
      inline def setBootDelay(value: Double): Self = StObject.set(x, "bootDelay", value.asInstanceOf[js.Any])
      
      inline def setBootDelayUndefined: Self = StObject.set(x, "bootDelay", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
