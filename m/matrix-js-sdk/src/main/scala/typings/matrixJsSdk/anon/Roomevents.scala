package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Roomevents extends StObject {
  
  var room_events: Count
}
object Roomevents {
  
  inline def apply(room_events: Count): Roomevents = {
    val __obj = js.Dynamic.literal(room_events = room_events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Roomevents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Roomevents] (val x: Self) extends AnyVal {
    
    inline def setRoom_events(value: Count): Self = StObject.set(x, "room_events", value.asInstanceOf[js.Any])
  }
}
