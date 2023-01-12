package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaJSDeleteTopicRecordsErrorTopic extends StObject {
  
  var partitions: js.Array[KafkaJSDeleteTopicRecordsErrorPartition]
  
  var topic: String
}
object KafkaJSDeleteTopicRecordsErrorTopic {
  
  inline def apply(partitions: js.Array[KafkaJSDeleteTopicRecordsErrorPartition], topic: String): KafkaJSDeleteTopicRecordsErrorTopic = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaJSDeleteTopicRecordsErrorTopic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KafkaJSDeleteTopicRecordsErrorTopic] (val x: Self) extends AnyVal {
    
    inline def setPartitions(value: js.Array[KafkaJSDeleteTopicRecordsErrorPartition]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: KafkaJSDeleteTopicRecordsErrorPartition*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
