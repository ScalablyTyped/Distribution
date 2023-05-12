package typings.libp2p

import typings.libp2pInterfaceContentRouting.mod.ContentRouting_
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitRelayServerAdvertServiceMod {
  
  @JSImport("libp2p/dist/src/circuit-relay/server/advert-service", "AdvertService")
  @js.native
  open class AdvertService protected ()
    extends EventEmitter[AdvertServiceEvents]
       with Startable {
    /**
      * Creates an instance of Relay
      */
    def this(components: AdvertServiceComponents) = this()
    def this(components: AdvertServiceComponents, init: AdvertServiceInit) = this()
    
    /**
      * Advertise hop relay service in the network.
      */
    def _advertiseService(): js.Promise[Unit] = js.native
    
    /* private */ val bootDelay: Any = js.native
    
    /* private */ val contentRouting: Any = js.native
    
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
    
    /* private */ var timeout: Any = js.native
  }
  
  trait AdvertServiceComponents extends StObject {
    
    var contentRouting: ContentRouting_
  }
  object AdvertServiceComponents {
    
    inline def apply(contentRouting: ContentRouting_): AdvertServiceComponents = {
      val __obj = js.Dynamic.literal(contentRouting = contentRouting.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdvertServiceComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdvertServiceComponents] (val x: Self) extends AnyVal {
      
      inline def setContentRouting(value: ContentRouting_): Self = StObject.set(x, "contentRouting", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdvertServiceEvents extends StObject {
    
    @JSName("advert:error")
    var advertColonerror: CustomEvent[js.Error]
    
    @JSName("advert:success")
    var advertColonsuccess: CustomEvent[Any]
  }
  object AdvertServiceEvents {
    
    inline def apply(advertColonerror: CustomEvent[js.Error], advertColonsuccess: CustomEvent[Any]): AdvertServiceEvents = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("advert:error")(advertColonerror.asInstanceOf[js.Any])
      __obj.updateDynamic("advert:success")(advertColonsuccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdvertServiceEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdvertServiceEvents] (val x: Self) extends AnyVal {
      
      inline def setAdvertColonerror(value: CustomEvent[js.Error]): Self = StObject.set(x, "advert:error", value.asInstanceOf[js.Any])
      
      inline def setAdvertColonsuccess(value: CustomEvent[Any]): Self = StObject.set(x, "advert:success", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdvertServiceInit extends StObject {
    
    /**
      * How long to wait after startup to begin advertising the service
      * - if some configured content routers take a while to warm up (for
      * example, the DHT needs some peers to be able to publish) this
      * value should be high enough that they will have warmed up
      */
    var bootDelay: js.UndefOr[Double] = js.undefined
  }
  object AdvertServiceInit {
    
    inline def apply(): AdvertServiceInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdvertServiceInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdvertServiceInit] (val x: Self) extends AnyVal {
      
      inline def setBootDelay(value: Double): Self = StObject.set(x, "bootDelay", value.asInstanceOf[js.Any])
      
      inline def setBootDelayUndefined: Self = StObject.set(x, "bootDelay", js.undefined)
    }
  }
}
