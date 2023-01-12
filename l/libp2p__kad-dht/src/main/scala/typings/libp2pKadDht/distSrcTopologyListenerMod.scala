package typings.libp2pKadDht

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.libp2pKadDht.mod.KadDHTComponents
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTopologyListenerMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/topology-listener", "TopologyListener")
  @js.native
  open class TopologyListener protected ()
    extends EventEmitter[TopologyListenerEvents]
       with Startable {
    def this(components: KadDHTComponents, init: TopologyListenerInit) = this()
    
    /* private */ val components: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ val protocol: Any = js.native
    
    /* private */ var registrarId: Any = js.native
    
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
  
  trait TopologyListenerEvents extends StObject {
    
    var peer: CustomEvent[PeerId]
  }
  object TopologyListenerEvents {
    
    inline def apply(peer: CustomEvent[PeerId]): TopologyListenerEvents = {
      val __obj = js.Dynamic.literal(peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopologyListenerEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TopologyListenerEvents] (val x: Self) extends AnyVal {
      
      inline def setPeer(value: CustomEvent[PeerId]): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    }
  }
  
  trait TopologyListenerInit extends StObject {
    
    var lan: Boolean
    
    var protocol: String
  }
  object TopologyListenerInit {
    
    inline def apply(lan: Boolean, protocol: String): TopologyListenerInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopologyListenerInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TopologyListenerInit] (val x: Self) extends AnyVal {
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
}
