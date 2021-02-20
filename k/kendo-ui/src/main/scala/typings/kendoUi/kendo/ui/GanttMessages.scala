package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttMessages extends StObject {
  
  var actions: js.UndefOr[GanttMessagesActions] = js.native
  
  var cancel: js.UndefOr[String] = js.native
  
  var deleteDependencyConfirmation: js.UndefOr[String] = js.native
  
  var deleteDependencyWindowTitle: js.UndefOr[String] = js.native
  
  var deleteTaskConfirmation: js.UndefOr[String] = js.native
  
  var deleteTaskWindowTitle: js.UndefOr[String] = js.native
  
  var destroy: js.UndefOr[String] = js.native
  
  var editor: js.UndefOr[GanttMessagesEditor] = js.native
  
  var plannedTasks: js.UndefOr[GanttMessagesPlannedTasks] = js.native
  
  var save: js.UndefOr[String] = js.native
  
  var views: js.UndefOr[GanttMessagesViews] = js.native
}
object GanttMessages {
  
  @scala.inline
  def apply(): GanttMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessages]
  }
  
  @scala.inline
  implicit class GanttMessagesMutableBuilder[Self <: GanttMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: GanttMessagesActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setDeleteDependencyConfirmation(value: String): Self = StObject.set(x, "deleteDependencyConfirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDependencyConfirmationUndefined: Self = StObject.set(x, "deleteDependencyConfirmation", js.undefined)
    
    @scala.inline
    def setDeleteDependencyWindowTitle(value: String): Self = StObject.set(x, "deleteDependencyWindowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDependencyWindowTitleUndefined: Self = StObject.set(x, "deleteDependencyWindowTitle", js.undefined)
    
    @scala.inline
    def setDeleteTaskConfirmation(value: String): Self = StObject.set(x, "deleteTaskConfirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTaskConfirmationUndefined: Self = StObject.set(x, "deleteTaskConfirmation", js.undefined)
    
    @scala.inline
    def setDeleteTaskWindowTitle(value: String): Self = StObject.set(x, "deleteTaskWindowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTaskWindowTitleUndefined: Self = StObject.set(x, "deleteTaskWindowTitle", js.undefined)
    
    @scala.inline
    def setDestroy(value: String): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setEditor(value: GanttMessagesEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setPlannedTasks(value: GanttMessagesPlannedTasks): Self = StObject.set(x, "plannedTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannedTasksUndefined: Self = StObject.set(x, "plannedTasks", js.undefined)
    
    @scala.inline
    def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setViews(value: GanttMessagesViews): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
  }
}
