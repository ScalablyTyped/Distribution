package typings.libp2pPubsub

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePubsub.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.typedarray.Uint8Array
    
    var from: PeerId
    
    var sequenceNumber: js.BigInt
    
    var topic: String
  }
  object Data {
    
    inline def apply(data: js.typedarray.Uint8Array, from: PeerId, sequenceNumber: js.BigInt, topic: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumber(value: js.BigInt): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait Messages extends StObject {
    
    var messages: js.UndefOr[js.Array[Message]] = js.undefined
    
    var subscribe: js.UndefOr[Boolean] = js.undefined
    
    var subscriptions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Messages {
    
    inline def apply(): Messages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Messages]
    }
    
    extension [Self <: Messages](x: Self) {
      
      inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      
      inline def setSubscriptions(value: js.Array[String]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
      
      inline def setSubscriptionsVarargs(value: String*): Self = StObject.set(x, "subscriptions", js.Array(value*))
    }
  }
}
