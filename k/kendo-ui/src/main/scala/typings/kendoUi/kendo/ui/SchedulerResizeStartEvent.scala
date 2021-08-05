package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerResizeStartEvent
  extends StObject
     with SchedulerEvent {
  
  var event: js.UndefOr[typings.kendoUi.kendo.data.SchedulerEvent] = js.undefined
}
object SchedulerResizeStartEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Scheduler): SchedulerResizeStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerResizeStartEvent]
  }
  
  extension [Self <: SchedulerResizeStartEvent](x: Self) {
    
    inline def setEvent(value: typings.kendoUi.kendo.data.SchedulerEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
