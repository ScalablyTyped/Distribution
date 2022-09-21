package typings.kafkaNode.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var highWaterOffset: js.UndefOr[Double] = js.undefined
  
  var key: js.UndefOr[String | Buffer] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var partition: js.UndefOr[Double] = js.undefined
  
  var topic: String
  
  var value: String | Buffer
}
object Message {
  
  inline def apply(topic: String, value: String | Buffer): Message = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setHighWaterOffset(value: Double): Self = StObject.set(x, "highWaterOffset", value.asInstanceOf[js.Any])
    
    inline def setHighWaterOffsetUndefined: Self = StObject.set(x, "highWaterOffset", js.undefined)
    
    inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
