package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicPartition extends StObject {
  
  var partition: Double
  
  var topic: String
}
object TopicPartition {
  
  inline def apply(partition: Double, topic: String): TopicPartition = {
    val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicPartition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicPartition] (val x: Self) extends AnyVal {
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
