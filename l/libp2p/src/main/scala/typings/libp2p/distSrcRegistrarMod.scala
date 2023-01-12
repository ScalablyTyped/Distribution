package typings.libp2p

import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerProtocolsChangeData
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.Registrar
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
      * Remove a disconnected peer from the record
      */
    def _onDisconnect(evt: CustomEvent[Connection]): Unit = js.native
    
    /**
      * Check if a new peer support the multicodecs for this topology
      */
    def _onProtocolChange(evt: CustomEvent[PeerProtocolsChangeData]): Unit = js.native
    
    /* private */ val components: Any = js.native
    
    /* private */ val handlers: Any = js.native
    
    /* private */ val topologies: Any = js.native
    
    def unhandle(protocols: js.Array[String]): js.Promise[Unit] = js.native
  }
  
  trait RegistrarComponents extends StObject {
    
    var connectionManager: ConnectionManager
    
    var peerId: PeerId
    
    var peerStore: PeerStore
  }
  object RegistrarComponents {
    
    inline def apply(connectionManager: ConnectionManager, peerId: PeerId, peerStore: PeerStore): RegistrarComponents = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegistrarComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegistrarComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
}
