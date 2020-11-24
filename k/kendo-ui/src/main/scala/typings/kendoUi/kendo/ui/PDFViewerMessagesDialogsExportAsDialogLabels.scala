package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerMessagesDialogsExportAsDialogLabels extends js.Object {
  
  var fileName: js.UndefOr[String] = js.native
  
  var page: js.UndefOr[String] = js.native
  
  var saveAsType: js.UndefOr[String] = js.native
}
object PDFViewerMessagesDialogsExportAsDialogLabels {
  
  @scala.inline
  def apply(): PDFViewerMessagesDialogsExportAsDialogLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesDialogsExportAsDialogLabels]
  }
  
  @scala.inline
  implicit class PDFViewerMessagesDialogsExportAsDialogLabelsOps[Self <: PDFViewerMessagesDialogsExportAsDialogLabels] (val x: Self) extends AnyVal {
    
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setSaveAsType(value: String): Self = this.set("saveAsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveAsType: Self = this.set("saveAsType", js.undefined)
  }
}
