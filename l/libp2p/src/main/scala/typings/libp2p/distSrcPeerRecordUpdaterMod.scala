package typings.libp2p

import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceTransport.mod.TransportManager
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPeerRecordUpdaterMod {
  
  @JSImport("libp2p/dist/src/peer-record-updater", "PeerRecordUpdater")
  @js.native
  open class PeerRecordUpdater protected ()
    extends StObject
       with Startable {
    def this(components: PeerRecordUpdaterComponents) = this()
    
    /* private */ val components: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
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
    
    /**
      * Create (or update if existing) self peer record and store it in the AddressBook.
      */
    def update(): Unit = js.native
  }
  
  trait PeerRecordUpdaterComponents extends StObject {
    
    var addressManager: AddressManager
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var transportManager: TransportManager
  }
  object PeerRecordUpdaterComponents {
    
    inline def apply(
      addressManager: AddressManager,
      peerId: PeerId,
      peerStore: PeerStore,
      transportManager: TransportManager
    ): PeerRecordUpdaterComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], transportManager = transportManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerRecordUpdaterComponents]
    }
    
    extension [Self <: PeerRecordUpdaterComponents](x: Self) {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setTransportManager(value: TransportManager): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
    }
  }
}
