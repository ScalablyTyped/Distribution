package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordMetadata extends StObject {
  
  var baseOffset: js.UndefOr[String] = js.undefined
  
  var errorCode: Double
  
  var logAppendTime: js.UndefOr[String] = js.undefined
  
  var logStartOffset: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[String] = js.undefined
  
  var partition: Double
  
  var timestamp: js.UndefOr[String] = js.undefined
  
  var topicName: String
}
object RecordMetadata {
  
  inline def apply(errorCode: Double, partition: Double, topicName: String): RecordMetadata = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], topicName = topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordMetadata] (val x: Self) extends AnyVal {
    
    inline def setBaseOffset(value: String): Self = StObject.set(x, "baseOffset", value.asInstanceOf[js.Any])
    
    inline def setBaseOffsetUndefined: Self = StObject.set(x, "baseOffset", js.undefined)
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setLogAppendTime(value: String): Self = StObject.set(x, "logAppendTime", value.asInstanceOf[js.Any])
    
    inline def setLogAppendTimeUndefined: Self = StObject.set(x, "logAppendTime", js.undefined)
    
    inline def setLogStartOffset(value: String): Self = StObject.set(x, "logStartOffset", value.asInstanceOf[js.Any])
    
    inline def setLogStartOffsetUndefined: Self = StObject.set(x, "logStartOffset", js.undefined)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
  }
}
