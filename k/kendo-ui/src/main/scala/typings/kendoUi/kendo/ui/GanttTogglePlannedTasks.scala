package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttTogglePlannedTasks extends GanttEvent {
  
  var showPlannedTasks: js.UndefOr[Boolean] = js.native
}
object GanttTogglePlannedTasks {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Gantt): GanttTogglePlannedTasks = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttTogglePlannedTasks]
  }
  
  @scala.inline
  implicit class GanttTogglePlannedTasksMutableBuilder[Self <: GanttTogglePlannedTasks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowPlannedTasks(value: Boolean): Self = StObject.set(x, "showPlannedTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPlannedTasksUndefined: Self = StObject.set(x, "showPlannedTasks", js.undefined)
  }
}
