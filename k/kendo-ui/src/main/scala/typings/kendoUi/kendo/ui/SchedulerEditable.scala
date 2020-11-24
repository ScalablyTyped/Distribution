package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerEditable extends js.Object {
  
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
  implicit class SchedulerEditableOps[Self <: SchedulerEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfirmation(value: Boolean | String): Self = this.set("confirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmation: Self = this.set("confirmation", js.undefined)
    
    @scala.inline
    def setCreate(value: Boolean): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDestroy(value: Boolean): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEditRecurringMode(value: String): Self = this.set("editRecurringMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditRecurringMode: Self = this.set("editRecurringMode", js.undefined)
    
    @scala.inline
    def setMove(value: Boolean): Self = this.set("move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setWindow(value: js.Any): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
}
