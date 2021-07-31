package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.GanttTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttRemoveEvent
  extends StObject
     with GanttEvent {
  
  var dependencies: js.UndefOr[js.Any] = js.undefined
  
  var task: js.UndefOr[GanttTask] = js.undefined
}
object GanttRemoveEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Gantt): GanttRemoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttRemoveEvent]
  }
  
  @scala.inline
  implicit class GanttRemoveEventMutableBuilder[Self <: GanttRemoveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependencies(value: js.Any): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setTask(value: GanttTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
