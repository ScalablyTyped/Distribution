package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaJSDeleteTopicRecordsErrorPartition extends StObject {
  
  var error: KafkaJSError
  
  var offset: String
  
  var partition: Double
}
object KafkaJSDeleteTopicRecordsErrorPartition {
  
  inline def apply(error: KafkaJSError, offset: String, partition: Double): KafkaJSDeleteTopicRecordsErrorPartition = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaJSDeleteTopicRecordsErrorPartition]
  }
  
  extension [Self <: KafkaJSDeleteTopicRecordsErrorPartition](x: Self) {
    
    inline def setError(value: KafkaJSError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
  }
}
