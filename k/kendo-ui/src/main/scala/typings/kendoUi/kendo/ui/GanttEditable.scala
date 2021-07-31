package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttEditable extends StObject {
  
  var confirmation: js.UndefOr[Boolean] = js.undefined
  
  var create: js.UndefOr[Boolean] = js.undefined
  
  var dependencyCreate: js.UndefOr[Boolean] = js.undefined
  
  var dependencyDestroy: js.UndefOr[Boolean] = js.undefined
  
  var destroy: js.UndefOr[Boolean] = js.undefined
  
  var dragPercentComplete: js.UndefOr[Boolean] = js.undefined
  
  var move: js.UndefOr[Boolean] = js.undefined
  
  var plannedTasks: js.UndefOr[Boolean] = js.undefined
  
  var reorder: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var update: js.UndefOr[Boolean] = js.undefined
}
object GanttEditable {
  
  @scala.inline
  def apply(): GanttEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttEditable]
  }
  
  @scala.inline
  implicit class GanttEditableMutableBuilder[Self <: GanttEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmation(value: Boolean): Self = StObject.set(x, "confirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationUndefined: Self = StObject.set(x, "confirmation", js.undefined)
    
    @scala.inline
    def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDependencyCreate(value: Boolean): Self = StObject.set(x, "dependencyCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyCreateUndefined: Self = StObject.set(x, "dependencyCreate", js.undefined)
    
    @scala.inline
    def setDependencyDestroy(value: Boolean): Self = StObject.set(x, "dependencyDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyDestroyUndefined: Self = StObject.set(x, "dependencyDestroy", js.undefined)
    
    @scala.inline
    def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setDragPercentComplete(value: Boolean): Self = StObject.set(x, "dragPercentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragPercentCompleteUndefined: Self = StObject.set(x, "dragPercentComplete", js.undefined)
    
    @scala.inline
    def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    @scala.inline
    def setPlannedTasks(value: Boolean): Self = StObject.set(x, "plannedTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannedTasksUndefined: Self = StObject.set(x, "plannedTasks", js.undefined)
    
    @scala.inline
    def setReorder(value: Boolean): Self = StObject.set(x, "reorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReorderUndefined: Self = StObject.set(x, "reorder", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
