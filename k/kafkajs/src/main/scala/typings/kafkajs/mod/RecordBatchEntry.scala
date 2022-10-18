package typings.kafkajs.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordBatchEntry
  extends StObject
     with KafkaMessage {
  
  var attributes: Double
  
  var headers: IHeaders
  
  var key: Buffer | Null
  
  var offset: String
  
  var size: js.UndefOr[scala.Nothing] = js.undefined
  
  var timestamp: String
  
  var value: Buffer | Null
}
object RecordBatchEntry {
  
  inline def apply(attributes: Double, headers: IHeaders, offset: String, timestamp: String): RecordBatchEntry = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], key = null, value = null)
    __obj.asInstanceOf[RecordBatchEntry]
  }
  
  extension [Self <: RecordBatchEntry](x: Self) {
    
    inline def setAttributes(value: Double): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: IHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
