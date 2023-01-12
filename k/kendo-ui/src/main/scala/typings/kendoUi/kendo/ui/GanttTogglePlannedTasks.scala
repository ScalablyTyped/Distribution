package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttTogglePlannedTasks
  extends StObject
     with GanttEvent {
  
  var showPlannedTasks: js.UndefOr[Boolean] = js.undefined
}
object GanttTogglePlannedTasks {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Gantt): GanttTogglePlannedTasks = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttTogglePlannedTasks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GanttTogglePlannedTasks] (val x: Self) extends AnyVal {
    
    inline def setShowPlannedTasks(value: Boolean): Self = StObject.set(x, "showPlannedTasks", value.asInstanceOf[js.Any])
    
    inline def setShowPlannedTasksUndefined: Self = StObject.set(x, "showPlannedTasks", js.undefined)
  }
}
