package typings.ipfsHttpClient

import typings.libp2pInterfaces.distSrcEventsMod.EventHandler
import typings.std.AbortController
import typings.std.AbortSignal
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPubsubSubscriptionTrackerMod {
  
  @JSImport("ipfs-http-client/dist/src/pubsub/subscription-tracker", "SubscriptionTracker")
  @js.native
  open class SubscriptionTracker () extends StObject {
    
    /** @type {Map<string, Subscription[]>} */
    var _subs: Map[String, js.Array[Subscription]] = js.native
    
    /**
      * @param {string} topic
      * @param {MessageHandlerFn} handler
      * @param {AbortSignal} [signal]
      */
    def subscribe(topic: String, handler: MessageHandlerFn): AbortSignal = js.native
    def subscribe(topic: String, handler: MessageHandlerFn, signal: AbortSignal): AbortSignal = js.native
    
    /**
      * @param {string} topic
      * @param {MessageHandlerFn} [handler]
      */
    def unsubscribe(topic: String): Unit = js.native
    def unsubscribe(topic: String, handler: MessageHandlerFn): Unit = js.native
  }
  
  type Message = typings.libp2pInterfacePubsub.mod.Message
  
  type MessageHandlerFn = EventHandler[Message]
  
  trait Subscription extends StObject {
    
    var controller: AbortController
    
    var handler: MessageHandlerFn
  }
  object Subscription {
    
    inline def apply(controller: AbortController, handler: MessageHandlerFn): Subscription = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      inline def setController(value: AbortController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: MessageHandlerFn): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerFunction1(value: Message => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    }
  }
}
