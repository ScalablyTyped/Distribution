package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OngoingTopicReassignment extends StObject {
  
  var partitions: js.Array[OngoingPartitionReassignment]
  
  var topic: String
}
object OngoingTopicReassignment {
  
  inline def apply(partitions: js.Array[OngoingPartitionReassignment], topic: String): OngoingTopicReassignment = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[OngoingTopicReassignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OngoingTopicReassignment] (val x: Self) extends AnyVal {
    
    inline def setPartitions(value: js.Array[OngoingPartitionReassignment]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: OngoingPartitionReassignment*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
