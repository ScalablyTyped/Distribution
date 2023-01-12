package typings.libp2pInterfacePubsub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubSubRPC extends StObject {
  
  var messages: js.Array[PubSubRPCMessage]
  
  var subscriptions: js.Array[PubSubRPCSubscription]
}
object PubSubRPC {
  
  inline def apply(messages: js.Array[PubSubRPCMessage], subscriptions: js.Array[PubSubRPCSubscription]): PubSubRPC = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubSubRPC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PubSubRPC] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: js.Array[PubSubRPCMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: PubSubRPCMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setSubscriptions(value: js.Array[PubSubRPCSubscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsVarargs(value: PubSubRPCSubscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
  }
}
