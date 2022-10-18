package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.libComponentsStateLookupMod.StateLookupEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var events: js.Array[StateLookupEvent]
}
object Events {
  
  inline def apply(events: js.Array[StateLookupEvent]): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setEvents(value: js.Array[StateLookupEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: StateLookupEvent*): Self = StObject.set(x, "events", js.Array(value*))
  }
}
