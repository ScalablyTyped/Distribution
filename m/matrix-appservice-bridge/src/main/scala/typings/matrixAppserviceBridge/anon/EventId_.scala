package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventId_ extends StObject {
  
  var eventId: String = js.native
  
  var roomId: String = js.native
}
object EventId_ {
  
  @scala.inline
  def apply(eventId: String, roomId: String): EventId_ = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventId_]
  }
  
  @scala.inline
  implicit class EventId_MutableBuilder[Self <: EventId_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
  }
}
