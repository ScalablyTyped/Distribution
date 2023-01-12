package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomeventsEventcontext extends StObject {
  
  var room_events: Eventcontext
}
object RoomeventsEventcontext {
  
  inline def apply(room_events: Eventcontext): RoomeventsEventcontext = {
    val __obj = js.Dynamic.literal(room_events = room_events.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomeventsEventcontext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoomeventsEventcontext] (val x: Self) extends AnyVal {
    
    inline def setRoom_events(value: Eventcontext): Self = StObject.set(x, "room_events", value.asInstanceOf[js.Any])
  }
}
