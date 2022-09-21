package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttMessages extends StObject {
  
  var actions: js.UndefOr[GanttMessagesActions] = js.undefined
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var deleteDependencyConfirmation: js.UndefOr[String] = js.undefined
  
  var deleteDependencyWindowTitle: js.UndefOr[String] = js.undefined
  
  var deleteTaskConfirmation: js.UndefOr[String] = js.undefined
  
  var deleteTaskWindowTitle: js.UndefOr[String] = js.undefined
  
  var destroy: js.UndefOr[String] = js.undefined
  
  var editor: js.UndefOr[GanttMessagesEditor] = js.undefined
  
  var plannedTasks: js.UndefOr[GanttMessagesPlannedTasks] = js.undefined
  
  var save: js.UndefOr[String] = js.undefined
  
  var selectView: js.UndefOr[String] = js.undefined
  
  var views: js.UndefOr[GanttMessagesViews] = js.undefined
}
object GanttMessages {
  
  inline def apply(): GanttMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessages]
  }
  
  extension [Self <: GanttMessages](x: Self) {
    
    inline def setActions(value: GanttMessagesActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setDeleteDependencyConfirmation(value: String): Self = StObject.set(x, "deleteDependencyConfirmation", value.asInstanceOf[js.Any])
    
    inline def setDeleteDependencyConfirmationUndefined: Self = StObject.set(x, "deleteDependencyConfirmation", js.undefined)
    
    inline def setDeleteDependencyWindowTitle(value: String): Self = StObject.set(x, "deleteDependencyWindowTitle", value.asInstanceOf[js.Any])
    
    inline def setDeleteDependencyWindowTitleUndefined: Self = StObject.set(x, "deleteDependencyWindowTitle", js.undefined)
    
    inline def setDeleteTaskConfirmation(value: String): Self = StObject.set(x, "deleteTaskConfirmation", value.asInstanceOf[js.Any])
    
    inline def setDeleteTaskConfirmationUndefined: Self = StObject.set(x, "deleteTaskConfirmation", js.undefined)
    
    inline def setDeleteTaskWindowTitle(value: String): Self = StObject.set(x, "deleteTaskWindowTitle", value.asInstanceOf[js.Any])
    
    inline def setDeleteTaskWindowTitleUndefined: Self = StObject.set(x, "deleteTaskWindowTitle", js.undefined)
    
    inline def setDestroy(value: String): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setEditor(value: GanttMessagesEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setPlannedTasks(value: GanttMessagesPlannedTasks): Self = StObject.set(x, "plannedTasks", value.asInstanceOf[js.Any])
    
    inline def setPlannedTasksUndefined: Self = StObject.set(x, "plannedTasks", js.undefined)
    
    inline def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setSelectView(value: String): Self = StObject.set(x, "selectView", value.asInstanceOf[js.Any])
    
    inline def setSelectViewUndefined: Self = StObject.set(x, "selectView", js.undefined)
    
    inline def setViews(value: GanttMessagesViews): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
  }
}
