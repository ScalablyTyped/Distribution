package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventId_ extends StObject {
  
  var eventId: String
  
  var roomId: String
}
object EventId_ {
  
  inline def apply(eventId: String, roomId: String): EventId_ = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventId_]
  }
  
  extension [Self <: EventId_](x: Self) {
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
  }
}
