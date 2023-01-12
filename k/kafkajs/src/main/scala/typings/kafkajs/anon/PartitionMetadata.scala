package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionMetadata extends StObject {
  
  var partitionMetadata: js.Array[typings.kafkajs.mod.PartitionMetadata]
  
  var topic: String
  
  var topicErrorCode: Double
}
object PartitionMetadata {
  
  inline def apply(
    partitionMetadata: js.Array[typings.kafkajs.mod.PartitionMetadata],
    topic: String,
    topicErrorCode: Double
  ): PartitionMetadata = {
    val __obj = js.Dynamic.literal(partitionMetadata = partitionMetadata.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topicErrorCode = topicErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartitionMetadata] (val x: Self) extends AnyVal {
    
    inline def setPartitionMetadata(value: js.Array[typings.kafkajs.mod.PartitionMetadata]): Self = StObject.set(x, "partitionMetadata", value.asInstanceOf[js.Any])
    
    inline def setPartitionMetadataVarargs(value: typings.kafkajs.mod.PartitionMetadata*): Self = StObject.set(x, "partitionMetadata", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicErrorCode(value: Double): Self = StObject.set(x, "topicErrorCode", value.asInstanceOf[js.Any])
  }
}
