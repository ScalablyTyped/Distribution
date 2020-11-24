package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManagerMessages extends js.Object {
  
  var dialogs: js.UndefOr[FileManagerMessagesDialogs] = js.native
  
  var previewPane: js.UndefOr[FileManagerMessagesPreviewPane] = js.native
  
  var toolbar: js.UndefOr[FileManagerMessagesToolbar] = js.native
  
  var views: js.UndefOr[FileManagerMessagesViews] = js.native
}
object FileManagerMessages {
  
  @scala.inline
  def apply(): FileManagerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessages]
  }
  
  @scala.inline
  implicit class FileManagerMessagesOps[Self <: FileManagerMessages] (val x: Self) extends AnyVal {
    
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
    def setDialogs(value: FileManagerMessagesDialogs): Self = this.set("dialogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogs: Self = this.set("dialogs", js.undefined)
    
    @scala.inline
    def setPreviewPane(value: FileManagerMessagesPreviewPane): Self = this.set("previewPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewPane: Self = this.set("previewPane", js.undefined)
    
    @scala.inline
    def setToolbar(value: FileManagerMessagesToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setViews(value: FileManagerMessagesViews): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
}
