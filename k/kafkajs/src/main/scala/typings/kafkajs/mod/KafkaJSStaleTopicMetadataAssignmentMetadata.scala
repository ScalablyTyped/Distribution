package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaJSStaleTopicMetadataAssignmentMetadata extends StObject {
  
  var topic: String
  
  var unknownPartitions: js.Array[PartitionMetadata]
}
object KafkaJSStaleTopicMetadataAssignmentMetadata {
  
  inline def apply(topic: String, unknownPartitions: js.Array[PartitionMetadata]): KafkaJSStaleTopicMetadataAssignmentMetadata = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], unknownPartitions = unknownPartitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaJSStaleTopicMetadataAssignmentMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KafkaJSStaleTopicMetadataAssignmentMetadata] (val x: Self) extends AnyVal {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setUnknownPartitions(value: js.Array[PartitionMetadata]): Self = StObject.set(x, "unknownPartitions", value.asInstanceOf[js.Any])
    
    inline def setUnknownPartitionsVarargs(value: PartitionMetadata*): Self = StObject.set(x, "unknownPartitions", js.Array(value*))
  }
}
