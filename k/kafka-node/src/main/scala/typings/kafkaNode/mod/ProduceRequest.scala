package typings.kafkaNode.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProduceRequest extends StObject {
  
  var attributes: js.UndefOr[Double] = js.undefined
  
  // string[] | Array<KeyedMessage> | string | KeyedMessage
  var key: js.UndefOr[String | Buffer] = js.undefined
  
  var messages: Any
  
  var partition: js.UndefOr[Double] = js.undefined
  
  var topic: String
}
object ProduceRequest {
  
  inline def apply(messages: Any, topic: String): ProduceRequest = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProduceRequest]
  }
  
  extension [Self <: ProduceRequest](x: Self) {
    
    inline def setAttributes(value: Double): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMessages(value: Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
