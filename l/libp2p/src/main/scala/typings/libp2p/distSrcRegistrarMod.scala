package typings.libp2p

import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfaceLibp2p.mod.PeerUpdate
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRegistrarMod {
  
  @JSImport("libp2p/dist/src/registrar", "DEFAULT_MAX_INBOUND_STREAMS")
  @js.native
  val DEFAULT_MAX_INBOUND_STREAMS: /* 32 */ Double = js.native
  
  @JSImport("libp2p/dist/src/registrar", "DEFAULT_MAX_OUTBOUND_STREAMS")
  @js.native
  val DEFAULT_MAX_OUTBOUND_STREAMS: /* 64 */ Double = js.native
  
  @JSImport("libp2p/dist/src/registrar", "DefaultRegistrar")
  @js.native
  open class DefaultRegistrar protected ()
    extends StObject
       with Registrar {
    def this(components: RegistrarComponents) = this()
    
    /**
      * On peer connected if we already have their protocols. Usually used for reconnects
      * as change:protocols event won't be emitted due to identical protocols.
      */
    def _onConnect(evt: CustomEvent[Connection]): Unit = js.native
    
    /**
      * Remove a disconnected peer from the record
      */
    def _onDisconnect(evt: CustomEvent[Connection]): Unit = js.native
    
    /**
      * Check if a new peer support the multicodecs for this topology
      */
    def _onPeerUpdate(evt: CustomEvent[PeerUpdate]): Unit = js.native
    
    /* private */ val components: Any = js.native
    
    /* private */ val handlers: Any = js.native
    
    /* private */ val topologies: Any = js.native
    
    def unhandle(protocols: js.Array[String]): js.Promise[Unit] = js.native
  }
  
  trait RegistrarComponents extends StObject {
    
    var connectionManager: ConnectionManager
    
    var events: EventEmitter[Libp2pEvents]
    
    var peerId: PeerId
    
    var peerStore: PeerStore
  }
  object RegistrarComponents {
    
    inline def apply(
      connectionManager: ConnectionManager,
      events: EventEmitter[Libp2pEvents],
      peerId: PeerId,
      peerStore: PeerStore
    ): RegistrarComponents = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegistrarComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegistrarComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
}
