package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProducerRecord extends StObject {
  
  var acks: js.UndefOr[Double] = js.undefined
  
  var compression: js.UndefOr[CompressionTypes] = js.undefined
  
  var messages: js.Array[Message]
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var topic: String
}
object ProducerRecord {
  
  inline def apply(messages: js.Array[Message], topic: String): ProducerRecord = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerRecord]
  }
  
  extension [Self <: ProducerRecord](x: Self) {
    
    inline def setAcks(value: Double): Self = StObject.set(x, "acks", value.asInstanceOf[js.Any])
    
    inline def setAcksUndefined: Self = StObject.set(x, "acks", js.undefined)
    
    inline def setCompression(value: CompressionTypes): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
