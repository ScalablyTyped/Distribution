package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionsArrayTopicString extends StObject {
  
  var partitions: js.Array[Partition]
  
  var topic: String
}
object PartitionsArrayTopicString {
  
  inline def apply(partitions: js.Array[Partition], topic: String): PartitionsArrayTopicString = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionsArrayTopicString]
  }
  
  extension [Self <: PartitionsArrayTopicString](x: Self) {
    
    inline def setPartitions(value: js.Array[Partition]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: Partition*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
