package typings.libp2p

import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConnectionManagerConnectionPrunerMod {
  
  @JSImport("libp2p/dist/src/connection-manager/connection-pruner", "ConnectionPruner")
  @js.native
  open class ConnectionPruner protected () extends StObject {
    def this(components: ConnectionPrunerComponents) = this()
    def this(components: ConnectionPrunerComponents, init: ConnectionPrunerInit) = this()
    
    /* private */ val allow: Any = js.native
    
    /* private */ val connectionManager: Any = js.native
    
    /* private */ val events: Any = js.native
    
    /* private */ val maxConnections: Any = js.native
    
    /**
      * If we have more connections than our maximum, select some excess connections
      * to prune based on peer value
      */
    def maybePruneConnections(): js.Promise[Unit] = js.native
    
    /* private */ val peerStore: Any = js.native
  }
  
  trait ConnectionPrunerComponents extends StObject {
    
    var connectionManager: ConnectionManager
    
    var events: EventEmitter[Libp2pEvents]
    
    var peerStore: PeerStore
  }
  object ConnectionPrunerComponents {
    
    inline def apply(connectionManager: ConnectionManager, events: EventEmitter[Libp2pEvents], peerStore: PeerStore): ConnectionPrunerComponents = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionPrunerComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionPrunerComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionPrunerInit extends StObject {
    
    var allow: js.UndefOr[js.Array[Multiaddr_]] = js.undefined
    
    var maxConnections: js.UndefOr[Double] = js.undefined
  }
  object ConnectionPrunerInit {
    
    inline def apply(): ConnectionPrunerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPrunerInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionPrunerInit] (val x: Self) extends AnyVal {
      
      inline def setAllow(value: js.Array[Multiaddr_]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setAllowVarargs(value: Multiaddr_ *): Self = StObject.set(x, "allow", js.Array(value*))
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
    }
  }
}
