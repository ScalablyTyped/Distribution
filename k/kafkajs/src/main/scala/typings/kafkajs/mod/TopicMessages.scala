package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicMessages extends StObject {
  
  var messages: js.Array[Message]
  
  var topic: String
}
object TopicMessages {
  
  inline def apply(messages: js.Array[Message], topic: String): TopicMessages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicMessages]
  }
  
  extension [Self <: TopicMessages](x: Self) {
    
    inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
