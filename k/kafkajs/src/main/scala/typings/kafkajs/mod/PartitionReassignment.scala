package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionReassignment extends StObject {
  
  var partitionAssignment: js.Array[ReplicaAssignment]
  
  var topic: String
}
object PartitionReassignment {
  
  inline def apply(partitionAssignment: js.Array[ReplicaAssignment], topic: String): PartitionReassignment = {
    val __obj = js.Dynamic.literal(partitionAssignment = partitionAssignment.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionReassignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartitionReassignment] (val x: Self) extends AnyVal {
    
    inline def setPartitionAssignment(value: js.Array[ReplicaAssignment]): Self = StObject.set(x, "partitionAssignment", value.asInstanceOf[js.Any])
    
    inline def setPartitionAssignmentVarargs(value: ReplicaAssignment*): Self = StObject.set(x, "partitionAssignment", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
