package typings.kafkajs.anon

import typings.kafkajs.mod.FetchOffsetsPartition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topic extends StObject {
  
  var partitions: js.Array[FetchOffsetsPartition]
  
  var topic: String
}
object Topic {
  
  inline def apply(partitions: js.Array[FetchOffsetsPartition], topic: String): Topic = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Topic] (val x: Self) extends AnyVal {
    
    inline def setPartitions(value: js.Array[FetchOffsetsPartition]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: FetchOffsetsPartition*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
