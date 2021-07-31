package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.stateLookupMod.StateLookupEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var events: js.Array[StateLookupEvent]
}
object Events {
  
  @scala.inline
  def apply(events: js.Array[StateLookupEvent]): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Array[StateLookupEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: StateLookupEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
  }
}
