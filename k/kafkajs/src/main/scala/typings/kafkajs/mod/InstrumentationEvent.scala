package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstrumentationEvent[T] extends StObject {
  
  var id: String
  
  var payload: T
  
  var timestamp: Double
  
  var `type`: String
}
object InstrumentationEvent {
  
  inline def apply[T](id: String, payload: T, timestamp: Double, `type`: String): InstrumentationEvent[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstrumentationEvent[T]]
  }
  
  extension [Self <: InstrumentationEvent[?], T](x: Self & InstrumentationEvent[T]) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
