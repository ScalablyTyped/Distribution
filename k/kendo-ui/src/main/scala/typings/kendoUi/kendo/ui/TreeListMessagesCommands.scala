package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListMessagesCommands extends js.Object {
  
  var cancel: js.UndefOr[String] = js.native
  
  var canceledit: js.UndefOr[String] = js.native
  
  var create: js.UndefOr[String] = js.native
  
  var createchild: js.UndefOr[String] = js.native
  
  var destroy: js.UndefOr[String] = js.native
  
  var edit: js.UndefOr[String] = js.native
  
  var excel: js.UndefOr[String] = js.native
  
  var pdf: js.UndefOr[String] = js.native
  
  var save: js.UndefOr[String] = js.native
  
  var update: js.UndefOr[String] = js.native
}
object TreeListMessagesCommands {
  
  @scala.inline
  def apply(): TreeListMessagesCommands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListMessagesCommands]
  }
  
  @scala.inline
  implicit class TreeListMessagesCommandsOps[Self <: TreeListMessagesCommands] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCanceledit(value: String): Self = this.set("canceledit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanceledit: Self = this.set("canceledit", js.undefined)
    
    @scala.inline
    def setCreate(value: String): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCreatechild(value: String): Self = this.set("createchild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatechild: Self = this.set("createchild", js.undefined)
    
    @scala.inline
    def setDestroy(value: String): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEdit(value: String): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    
    @scala.inline
    def setExcel(value: String): Self = this.set("excel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcel: Self = this.set("excel", js.undefined)
    
    @scala.inline
    def setPdf(value: String): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    
    @scala.inline
    def setSave(value: String): Self = this.set("save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    
    @scala.inline
    def setUpdate(value: String): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
