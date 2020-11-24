package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerMessagesDialogs extends js.Object {
  
  var cancel: js.UndefOr[String] = js.native
  
  var exportAsDialog: js.UndefOr[PDFViewerMessagesDialogsExportAsDialog] = js.native
  
  var okText: js.UndefOr[String] = js.native
  
  var save: js.UndefOr[String] = js.native
}
object PDFViewerMessagesDialogs {
  
  @scala.inline
  def apply(): PDFViewerMessagesDialogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesDialogs]
  }
  
  @scala.inline
  implicit class PDFViewerMessagesDialogsOps[Self <: PDFViewerMessagesDialogs] (val x: Self) extends AnyVal {
    
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
    def setExportAsDialog(value: PDFViewerMessagesDialogsExportAsDialog): Self = this.set("exportAsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportAsDialog: Self = this.set("exportAsDialog", js.undefined)
    
    @scala.inline
    def setOkText(value: String): Self = this.set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    
    @scala.inline
    def setSave(value: String): Self = this.set("save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
  }
}
