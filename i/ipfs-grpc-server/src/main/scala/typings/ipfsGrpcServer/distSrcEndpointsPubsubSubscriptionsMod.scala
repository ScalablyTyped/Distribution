package typings.ipfsGrpcServer

import typings.libp2pInterfaces.distSrcEventsMod.EventHandler
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEndpointsPubsubSubscriptionsMod {
  
  @JSImport("ipfs-grpc-server/dist/src/endpoints/pubsub/subscriptions", "subscriptions")
  @js.native
  val subscriptions: Map[String, Subscription] = js.native
  
  type Message = typings.libp2pInterfacePubsub.mod.Message
  
  trait Subscription extends StObject {
    
    var onMessage: EventHandler[Message]
    
    def onUnsubscribe(): Unit
  }
  object Subscription {
    
    inline def apply(onMessage: EventHandler[Message], onUnsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(onMessage = onMessage.asInstanceOf[js.Any], onUnsubscribe = js.Any.fromFunction0(onUnsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      inline def setOnMessage(value: EventHandler[Message]): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
      
      inline def setOnMessageFunction1(value: Message => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      inline def setOnUnsubscribe(value: () => Unit): Self = StObject.set(x, "onUnsubscribe", js.Any.fromFunction0(value))
    }
  }
}
