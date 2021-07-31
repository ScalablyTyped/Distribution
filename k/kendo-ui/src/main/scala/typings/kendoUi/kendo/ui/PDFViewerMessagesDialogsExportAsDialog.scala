package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerMessagesDialogsExportAsDialog extends StObject {
  
  var defaultFileName: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[PDFViewerMessagesDialogsExportAsDialogLabels] = js.undefined
  
  var pdf: js.UndefOr[String] = js.undefined
  
  var png: js.UndefOr[String] = js.undefined
  
  var svg: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PDFViewerMessagesDialogsExportAsDialog {
  
  @scala.inline
  def apply(): PDFViewerMessagesDialogsExportAsDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesDialogsExportAsDialog]
  }
  
  @scala.inline
  implicit class PDFViewerMessagesDialogsExportAsDialogMutableBuilder[Self <: PDFViewerMessagesDialogsExportAsDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultFileName(value: String): Self = StObject.set(x, "defaultFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFileNameUndefined: Self = StObject.set(x, "defaultFileName", js.undefined)
    
    @scala.inline
    def setLabels(value: PDFViewerMessagesDialogsExportAsDialogLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setPdf(value: String): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    @scala.inline
    def setPng(value: String): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPngUndefined: Self = StObject.set(x, "png", js.undefined)
    
    @scala.inline
    def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
