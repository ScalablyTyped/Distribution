package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Batch extends StObject {
  
  def firstOffset(): String | Null
  
  var highWatermark: String
  
  def isEmpty(): Boolean
  
  def lastOffset(): String
  
  var messages: js.Array[KafkaMessage]
  
  def offsetLag(): String
  
  def offsetLagLow(): String
  
  var partition: Double
  
  var topic: String
}
object Batch {
  
  inline def apply(
    firstOffset: () => String | Null,
    highWatermark: String,
    isEmpty: () => Boolean,
    lastOffset: () => String,
    messages: js.Array[KafkaMessage],
    offsetLag: () => String,
    offsetLagLow: () => String,
    partition: Double,
    topic: String
  ): Batch = {
    val __obj = js.Dynamic.literal(firstOffset = js.Any.fromFunction0(firstOffset), highWatermark = highWatermark.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), lastOffset = js.Any.fromFunction0(lastOffset), messages = messages.asInstanceOf[js.Any], offsetLag = js.Any.fromFunction0(offsetLag), offsetLagLow = js.Any.fromFunction0(offsetLagLow), partition = partition.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batch]
  }
  
  extension [Self <: Batch](x: Self) {
    
    inline def setFirstOffset(value: () => String | Null): Self = StObject.set(x, "firstOffset", js.Any.fromFunction0(value))
    
    inline def setHighWatermark(value: String): Self = StObject.set(x, "highWatermark", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setLastOffset(value: () => String): Self = StObject.set(x, "lastOffset", js.Any.fromFunction0(value))
    
    inline def setMessages(value: js.Array[KafkaMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: KafkaMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setOffsetLag(value: () => String): Self = StObject.set(x, "offsetLag", js.Any.fromFunction0(value))
    
    inline def setOffsetLagLow(value: () => String): Self = StObject.set(x, "offsetLagLow", js.Any.fromFunction0(value))
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
