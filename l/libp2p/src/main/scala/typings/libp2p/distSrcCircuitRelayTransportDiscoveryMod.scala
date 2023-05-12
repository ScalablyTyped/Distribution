package typings.libp2p

import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceContentRouting.mod.ContentRouting_
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaceTransport.mod.TransportManager
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitRelayTransportDiscoveryMod {
  
  @JSImport("libp2p/dist/src/circuit-relay/transport/discovery", "RelayDiscovery")
  @js.native
  open class RelayDiscovery protected ()
    extends EventEmitter[RelayDiscoveryEvents]
       with Startable {
    def this(components: RelayDiscoveryComponents) = this()
    
    /* private */ val contentRouting: Any = js.native
    
    /**
      * Try to listen on available hop relay connections.
      * The following order will happen while we do not have enough relays:
      *
      * 1. Check the metadata store for known relays, try to listen on the ones we are already connected
      * 2. Dial and try to listen on the peers we know that support hop but are not connected
      * 3. Search the network
      */
    def discover(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val peerId: Any = js.native
    
    /* private */ val peerStore: Any = js.native
    
    /* private */ val registrar: Any = js.native
    
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
    
    /* private */ var topologyId: Any = js.native
  }
  
  trait RelayDiscoveryComponents extends StObject {
    
    var connectionManager: ConnectionManager
    
    var contentRouting: ContentRouting_
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var registrar: Registrar
    
    var transportManager: TransportManager
  }
  object RelayDiscoveryComponents {
    
    inline def apply(
      connectionManager: ConnectionManager,
      contentRouting: ContentRouting_,
      peerId: PeerId,
      peerStore: PeerStore,
      registrar: Registrar,
      transportManager: TransportManager
    ): RelayDiscoveryComponents = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], contentRouting = contentRouting.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any], transportManager = transportManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayDiscoveryComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelayDiscoveryComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setContentRouting(value: ContentRouting_): Self = StObject.set(x, "contentRouting", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
      
      inline def setTransportManager(value: TransportManager): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
    }
  }
  
  trait RelayDiscoveryEvents extends StObject {
    
    @JSName("relay:discover")
    var relayColondiscover: CustomEvent[PeerId]
  }
  object RelayDiscoveryEvents {
    
    inline def apply(relayColondiscover: CustomEvent[PeerId]): RelayDiscoveryEvents = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("relay:discover")(relayColondiscover.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayDiscoveryEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelayDiscoveryEvents] (val x: Self) extends AnyVal {
      
      inline def setRelayColondiscover(value: CustomEvent[PeerId]): Self = StObject.set(x, "relay:discover", value.asInstanceOf[js.Any])
    }
  }
}
