package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerAddEvent
  extends StObject
     with SchedulerEvent {
  
  var event: js.UndefOr[js.Any] = js.undefined
}
object SchedulerAddEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Scheduler): SchedulerAddEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerAddEvent]
  }
  
  @scala.inline
  implicit class SchedulerAddEventMutableBuilder[Self <: SchedulerAddEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
