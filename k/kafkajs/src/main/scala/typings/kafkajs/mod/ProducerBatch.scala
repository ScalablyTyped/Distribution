package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProducerBatch extends StObject {
  
  var acks: js.UndefOr[Double] = js.undefined
  
  var compression: js.UndefOr[CompressionTypes] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var topicMessages: js.UndefOr[js.Array[TopicMessages]] = js.undefined
}
object ProducerBatch {
  
  inline def apply(): ProducerBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducerBatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProducerBatch] (val x: Self) extends AnyVal {
    
    inline def setAcks(value: Double): Self = StObject.set(x, "acks", value.asInstanceOf[js.Any])
    
    inline def setAcksUndefined: Self = StObject.set(x, "acks", js.undefined)
    
    inline def setCompression(value: CompressionTypes): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTopicMessages(value: js.Array[TopicMessages]): Self = StObject.set(x, "topicMessages", value.asInstanceOf[js.Any])
    
    inline def setTopicMessagesUndefined: Self = StObject.set(x, "topicMessages", js.undefined)
    
    inline def setTopicMessagesVarargs(value: TopicMessages*): Self = StObject.set(x, "topicMessages", js.Array(value*))
  }
}
