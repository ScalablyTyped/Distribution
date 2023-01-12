package typings.kafkajs.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSetEntry
  extends StObject
     with KafkaMessage {
  
  var attributes: Double
  
  var headers: js.UndefOr[scala.Nothing] = js.undefined
  
  var key: Buffer | Null
  
  var offset: String
  
  var size: Double
  
  var timestamp: String
  
  var value: Buffer | Null
}
object MessageSetEntry {
  
  inline def apply(attributes: Double, offset: String, size: Double, timestamp: String): MessageSetEntry = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], key = null, value = null)
    __obj.asInstanceOf[MessageSetEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageSetEntry] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Double): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
