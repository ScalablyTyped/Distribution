package typings.libp2p

import typings.libp2pInterfaceContentRouting.mod.ContentRouting_
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcContentRoutingMod {
  
  @JSImport("libp2p/dist/src/content-routing", "CompoundContentRouting")
  @js.native
  open class CompoundContentRouting protected ()
    extends StObject
       with ContentRouting_
       with Startable {
    def this(components: CompoundContentRoutingComponents, init: CompoundContentRoutingInit) = this()
    
    /* private */ val components: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
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
  }
  
  trait CompoundContentRoutingComponents extends StObject {
    
    var peerStore: PeerStore
  }
  object CompoundContentRoutingComponents {
    
    inline def apply(peerStore: PeerStore): CompoundContentRoutingComponents = {
      val __obj = js.Dynamic.literal(peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompoundContentRoutingComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompoundContentRoutingComponents] (val x: Self) extends AnyVal {
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompoundContentRoutingInit extends StObject {
    
    var routers: js.Array[ContentRouting_]
  }
  object CompoundContentRoutingInit {
    
    inline def apply(routers: js.Array[ContentRouting_]): CompoundContentRoutingInit = {
      val __obj = js.Dynamic.literal(routers = routers.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompoundContentRoutingInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompoundContentRoutingInit] (val x: Self) extends AnyVal {
      
      inline def setRouters(value: js.Array[ContentRouting_]): Self = StObject.set(x, "routers", value.asInstanceOf[js.Any])
      
      inline def setRoutersVarargs(value: ContentRouting_ *): Self = StObject.set(x, "routers", js.Array(value*))
    }
  }
}
