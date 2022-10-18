package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomeventsCount extends StObject {
  
  var room_events: Count
}
object RoomeventsCount {
  
  inline def apply(room_events: Count): RoomeventsCount = {
    val __obj = js.Dynamic.literal(room_events = room_events.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomeventsCount]
  }
  
  extension [Self <: RoomeventsCount](x: Self) {
    
    inline def setRoom_events(value: Count): Self = StObject.set(x, "room_events", value.asInstanceOf[js.Any])
  }
}
