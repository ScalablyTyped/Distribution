package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerEditable extends StObject {
  
  var confirmation: js.UndefOr[Boolean | String] = js.native
  
  var create: js.UndefOr[Boolean] = js.native
  
  var destroy: js.UndefOr[Boolean] = js.native
  
  var editRecurringMode: js.UndefOr[String] = js.native
  
  var move: js.UndefOr[Boolean] = js.native
  
  var resize: js.UndefOr[Boolean] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var update: js.UndefOr[Boolean] = js.native
  
  var window: js.UndefOr[js.Any] = js.native
}
object SchedulerEditable {
  
  @scala.inline
  def apply(): SchedulerEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerEditable]
  }
  
  @scala.inline
  implicit class SchedulerEditableMutableBuilder[Self <: SchedulerEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmation(value: Boolean | String): Self = StObject.set(x, "confirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationUndefined: Self = StObject.set(x, "confirmation", js.undefined)
    
    @scala.inline
    def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setEditRecurringMode(value: String): Self = StObject.set(x, "editRecurringMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditRecurringModeUndefined: Self = StObject.set(x, "editRecurringMode", js.undefined)
    
    @scala.inline
    def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
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
    
    @scala.inline
    def setWindow(value: js.Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
