package typings.libp2p

import typings.libp2p.mod.RelayConfig
import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.IncomingStreamData
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaceTransport.mod.Transport
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitTransportMod {
  
  @JSImport("libp2p/dist/src/circuit/transport", "Circuit")
  @js.native
  open class Circuit protected ()
    extends StObject
       with Transport
       with Startable {
    def this(components: CircuitComponents, init: RelayConfig) = this()
    
    /* private */ val _init: Any = js.native
    
    def _onProtocol(data: IncomingStreamData): js.Promise[Unit] = js.native
    
    /* private */ var _started: Any = js.native
    
    /* private */ val components: Any = js.native
    
    /**
      * Dial a peer over a relay
      */
    def dial(ma: Multiaddr_): js.Promise[Connection] = js.native
    def dial(ma: Multiaddr_, options: AbortOptions): js.Promise[Connection] = js.native
    
    var get: Any = js.native
    
    /* private */ var handler: Any = js.native
    
    def hopActive(): Boolean = js.native
    
    def hopEnabled(): Boolean = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
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
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_Circuit: js.Function0[String] = js.native
  }
  
  trait CircuitComponents extends StObject {
    
    var addressManager: AddressManager
    
    var connectionManager: ConnectionManager
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var registrar: Registrar
    
    var upgrader: Upgrader
  }
  object CircuitComponents {
    
    inline def apply(
      addressManager: AddressManager,
      connectionManager: ConnectionManager,
      peerId: PeerId,
      peerStore: PeerStore,
      registrar: Registrar,
      upgrader: Upgrader
    ): CircuitComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], connectionManager = connectionManager.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any], upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircuitComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircuitComponents] (val x: Self) extends AnyVal {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
      
      inline def setUpgrader(value: Upgrader): Self = StObject.set(x, "upgrader", value.asInstanceOf[js.Any])
    }
  }
}
