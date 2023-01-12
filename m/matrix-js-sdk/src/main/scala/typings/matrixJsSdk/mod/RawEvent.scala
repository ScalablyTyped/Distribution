package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawEvent[IEventContentType, EventTypeName] extends StObject {
  
  var content: IEventContentType
  
  var event_id: String
  
  var origin_server_ts: Double
  
  // only set when the event is of type "m.room.redaction"
  var redacts: js.UndefOr[String] = js.undefined
  
  var room_id: String
  
  var sender: String
  
  var `type`: EventTypeName
  
  var unsigned: js.UndefOr[UnsignedType] = js.undefined
}
object RawEvent {
  
  inline def apply[IEventContentType, EventTypeName](
    content: IEventContentType,
    event_id: String,
    origin_server_ts: Double,
    room_id: String,
    sender: String,
    `type`: EventTypeName
  ): RawEvent[IEventContentType, EventTypeName] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any], origin_server_ts = origin_server_ts.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawEvent[IEventContentType, EventTypeName]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawEvent[?, ?], IEventContentType, EventTypeName] (val x: Self & (RawEvent[IEventContentType, EventTypeName])) extends AnyVal {
    
    inline def setContent(value: IEventContentType): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
    
    inline def setOrigin_server_ts(value: Double): Self = StObject.set(x, "origin_server_ts", value.asInstanceOf[js.Any])
    
    inline def setRedacts(value: String): Self = StObject.set(x, "redacts", value.asInstanceOf[js.Any])
    
    inline def setRedactsUndefined: Self = StObject.set(x, "redacts", js.undefined)
    
    inline def setRoom_id(value: String): Self = StObject.set(x, "room_id", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setType(value: EventTypeName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnsigned(value: UnsignedType): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
    
    inline def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
  }
}
