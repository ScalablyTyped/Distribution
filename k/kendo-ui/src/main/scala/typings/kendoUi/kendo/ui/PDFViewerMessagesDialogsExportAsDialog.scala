package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerMessagesDialogsExportAsDialog extends js.Object {
  
  var defaultFileName: js.UndefOr[String] = js.native
  
  var labels: js.UndefOr[PDFViewerMessagesDialogsExportAsDialogLabels] = js.native
  
  var pdf: js.UndefOr[String] = js.native
  
  var png: js.UndefOr[String] = js.native
  
  var svg: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object PDFViewerMessagesDialogsExportAsDialog {
  
  @scala.inline
  def apply(): PDFViewerMessagesDialogsExportAsDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesDialogsExportAsDialog]
  }
  
  @scala.inline
  implicit class PDFViewerMessagesDialogsExportAsDialogOps[Self <: PDFViewerMessagesDialogsExportAsDialog] (val x: Self) extends AnyVal {
    
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
    def setDefaultFileName(value: String): Self = this.set("defaultFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFileName: Self = this.set("defaultFileName", js.undefined)
    
    @scala.inline
    def setLabels(value: PDFViewerMessagesDialogsExportAsDialogLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setPdf(value: String): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    
    @scala.inline
    def setPng(value: String): Self = this.set("png", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePng: Self = this.set("png", js.undefined)
    
    @scala.inline
    def setSvg(value: String): Self = this.set("svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
