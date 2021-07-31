package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.GanttTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttResizeStartEvent
  extends StObject
     with GanttEvent {
  
  var task: js.UndefOr[GanttTask] = js.undefined
}
object GanttResizeStartEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Gantt): GanttResizeStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttResizeStartEvent]
  }
  
  @scala.inline
  implicit class GanttResizeStartEventMutableBuilder[Self <: GanttResizeStartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTask(value: GanttTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
