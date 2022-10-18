package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITopicPartitionConfig extends StObject {
  
  var assignments: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var count: Double
  
  var topic: String
}
object ITopicPartitionConfig {
  
  inline def apply(count: Double, topic: String): ITopicPartitionConfig = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopicPartitionConfig]
  }
  
  extension [Self <: ITopicPartitionConfig](x: Self) {
    
    inline def setAssignments(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "assignments", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
