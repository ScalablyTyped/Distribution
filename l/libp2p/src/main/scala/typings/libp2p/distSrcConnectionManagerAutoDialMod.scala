package typings.libp2p

import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConnectionManagerAutoDialMod {
  
  @JSImport("libp2p/dist/src/connection-manager/auto-dial", "AutoDial")
  @js.native
  open class AutoDial protected ()
    extends StObject
       with Startable {
    /**
      * Proactively tries to connect to known peers stored in the PeerStore.
      * It will keep the number of connections below the upper limit and sort
      * the peers to connect based on whether we know their keys and protocols.
      */
    def this(components: AutoDialComponents, init: AutoDialInit) = this()
    
    @JSName("afterStart")
    def afterStart_MAutoDial(): Unit = js.native
    
    def autoDial(): js.Promise[Unit] = js.native
    
    /* private */ var autoDialInterval: Any = js.native
    
    /* private */ val autoDialIntervalMs: Any = js.native
    
    /* private */ val autoDialPriority: Any = js.native
    
    /* private */ val connectionManager: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val minConnections: Any = js.native
    
    /* private */ val peerStore: Any = js.native
    
    /* private */ val queue: Any = js.native
    
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
  }
  
  trait AutoDialComponents extends StObject {
    
    var connectionManager: ConnectionManager
    
    var events: EventEmitter[Libp2pEvents]
    
    var peerStore: PeerStore
  }
  object AutoDialComponents {
    
    inline def apply(connectionManager: ConnectionManager, events: EventEmitter[Libp2pEvents], peerStore: PeerStore): AutoDialComponents = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoDialComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoDialComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutoDialInit extends StObject {
    
    var autoDialConcurrency: js.UndefOr[Double] = js.undefined
    
    var autoDialInterval: js.UndefOr[Double] = js.undefined
    
    var autoDialPriority: js.UndefOr[Double] = js.undefined
    
    var minConnections: js.UndefOr[Double] = js.undefined
  }
  object AutoDialInit {
    
    inline def apply(): AutoDialInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoDialInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoDialInit] (val x: Self) extends AnyVal {
      
      inline def setAutoDialConcurrency(value: Double): Self = StObject.set(x, "autoDialConcurrency", value.asInstanceOf[js.Any])
      
      inline def setAutoDialConcurrencyUndefined: Self = StObject.set(x, "autoDialConcurrency", js.undefined)
      
      inline def setAutoDialInterval(value: Double): Self = StObject.set(x, "autoDialInterval", value.asInstanceOf[js.Any])
      
      inline def setAutoDialIntervalUndefined: Self = StObject.set(x, "autoDialInterval", js.undefined)
      
      inline def setAutoDialPriority(value: Double): Self = StObject.set(x, "autoDialPriority", value.asInstanceOf[js.Any])
      
      inline def setAutoDialPriorityUndefined: Self = StObject.set(x, "autoDialPriority", js.undefined)
      
      inline def setMinConnections(value: Double): Self = StObject.set(x, "minConnections", value.asInstanceOf[js.Any])
      
      inline def setMinConnectionsUndefined: Self = StObject.set(x, "minConnections", js.undefined)
    }
  }
}
