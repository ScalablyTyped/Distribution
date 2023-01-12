package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicOffsets extends StObject {
  
  var partitions: js.Array[PartitionOffset]
  
  var topic: String
}
object TopicOffsets {
  
  inline def apply(partitions: js.Array[PartitionOffset], topic: String): TopicOffsets = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicOffsets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicOffsets] (val x: Self) extends AnyVal {
    
    inline def setPartitions(value: js.Array[PartitionOffset]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: PartitionOffset*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
