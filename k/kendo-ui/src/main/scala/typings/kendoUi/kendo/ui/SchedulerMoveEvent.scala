package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerMoveEvent
  extends StObject
     with SchedulerEvent {
  
  var event: js.UndefOr[typings.kendoUi.kendo.data.SchedulerEvent] = js.undefined
  
  var slot: js.UndefOr[js.Any] = js.undefined
}
object SchedulerMoveEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Scheduler): SchedulerMoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMoveEvent]
  }
  
  @scala.inline
  implicit class SchedulerMoveEventMutableBuilder[Self <: SchedulerMoveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: typings.kendoUi.kendo.data.SchedulerEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setSlot(value: js.Any): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
  }
}
