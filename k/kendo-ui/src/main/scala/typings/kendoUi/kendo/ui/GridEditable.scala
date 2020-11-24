package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridEditable extends js.Object {
  
  var cancelDelete: js.UndefOr[String] = js.native
  
  var confirmDelete: js.UndefOr[String] = js.native
  
  var confirmation: js.UndefOr[Boolean | String | js.Function] = js.native
  
  var createAt: js.UndefOr[String] = js.native
  
  var destroy: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var update: js.UndefOr[Boolean] = js.native
  
  var window: js.UndefOr[js.Any] = js.native
}
object GridEditable {
  
  @scala.inline
  def apply(): GridEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridEditable]
  }
  
  @scala.inline
  implicit class GridEditableOps[Self <: GridEditable] (val x: Self) extends AnyVal {
    
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
    def setCancelDelete(value: String): Self = this.set("cancelDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelDelete: Self = this.set("cancelDelete", js.undefined)
    
    @scala.inline
    def setConfirmDelete(value: String): Self = this.set("confirmDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmDelete: Self = this.set("confirmDelete", js.undefined)
    
    @scala.inline
    def setConfirmation(value: Boolean | String | js.Function): Self = this.set("confirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmation: Self = this.set("confirmation", js.undefined)
    
    @scala.inline
    def setCreateAt(value: String): Self = this.set("createAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateAt: Self = this.set("createAt", js.undefined)
    
    @scala.inline
    def setDestroy(value: Boolean): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
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
