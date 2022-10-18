package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaJSErrorMetadata extends StObject {
  
  var metadata: js.UndefOr[PartitionMetadata] = js.undefined
  
  var partitionId: js.UndefOr[Double] = js.undefined
  
  var retriable: js.UndefOr[Boolean] = js.undefined
  
  var topic: js.UndefOr[String] = js.undefined
}
object KafkaJSErrorMetadata {
  
  inline def apply(): KafkaJSErrorMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaJSErrorMetadata]
  }
  
  extension [Self <: KafkaJSErrorMetadata](x: Self) {
    
    inline def setMetadata(value: PartitionMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPartitionId(value: Double): Self = StObject.set(x, "partitionId", value.asInstanceOf[js.Any])
    
    inline def setPartitionIdUndefined: Self = StObject.set(x, "partitionId", js.undefined)
    
    inline def setRetriable(value: Boolean): Self = StObject.set(x, "retriable", value.asInstanceOf[js.Any])
    
    inline def setRetriableUndefined: Self = StObject.set(x, "retriable", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
