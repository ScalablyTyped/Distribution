package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicPartitions extends StObject {
  
  var partitions: js.Array[Double]
  
  var topic: String
}
object TopicPartitions {
  
  inline def apply(partitions: js.Array[Double], topic: String): TopicPartitions = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicPartitions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicPartitions] (val x: Self) extends AnyVal {
    
    inline def setPartitions(value: js.Array[Double]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: Double*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
