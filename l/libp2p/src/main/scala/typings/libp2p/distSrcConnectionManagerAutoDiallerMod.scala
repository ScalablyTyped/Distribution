package typings.libp2p

import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConnectionManagerAutoDiallerMod {
  
  @JSImport("libp2p/dist/src/connection-manager/auto-dialler", "AutoDialler")
  @js.native
  open class AutoDialler protected ()
    extends StObject
       with Startable {
    /**
      * Proactively tries to connect to known peers stored in the PeerStore.
      * It will keep the number of connections below the upper limit and sort
      * the peers to connect based on wether we know their keys and protocols.
      */
    def this(components: AutoDiallerComponents, init: AutoDiallerInit) = this()
    
    def _autoDial(): js.Promise[Unit] = js.native
    
    /* private */ var autoDialTimeout: Any = js.native
    
    /* private */ val components: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val options: Any = js.native
    
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
  
  trait AutoDiallerComponents extends StObject {
    
    var connectionManager: ConnectionManager
    
    var peerId: PeerId
    
    var peerStore: PeerStore
  }
  object AutoDiallerComponents {
    
    inline def apply(connectionManager: ConnectionManager, peerId: PeerId, peerStore: PeerStore): AutoDiallerComponents = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoDiallerComponents]
    }
    
    extension [Self <: AutoDiallerComponents](x: Self) {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutoDiallerInit extends StObject {
    
    /**
      * How often, in milliseconds, it should preemptively guarantee connections are above the low watermark
      */
    var autoDialInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Should preemptively guarantee connections are above the low watermark
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The minimum number of connections to avoid pruning
      */
    var minConnections: js.UndefOr[Double] = js.undefined
  }
  object AutoDiallerInit {
    
    inline def apply(): AutoDiallerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoDiallerInit]
    }
    
    extension [Self <: AutoDiallerInit](x: Self) {
      
      inline def setAutoDialInterval(value: Double): Self = StObject.set(x, "autoDialInterval", value.asInstanceOf[js.Any])
      
      inline def setAutoDialIntervalUndefined: Self = StObject.set(x, "autoDialInterval", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setMinConnections(value: Double): Self = StObject.set(x, "minConnections", value.asInstanceOf[js.Any])
      
      inline def setMinConnectionsUndefined: Self = StObject.set(x, "minConnections", js.undefined)
    }
  }
}
