package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerMessagesDialogs extends StObject {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var exportAsDialog: js.UndefOr[PDFViewerMessagesDialogsExportAsDialog] = js.undefined
  
  var okText: js.UndefOr[String] = js.undefined
  
  var save: js.UndefOr[String] = js.undefined
}
object PDFViewerMessagesDialogs {
  
  inline def apply(): PDFViewerMessagesDialogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesDialogs]
  }
  
  extension [Self <: PDFViewerMessagesDialogs](x: Self) {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setExportAsDialog(value: PDFViewerMessagesDialogsExportAsDialog): Self = StObject.set(x, "exportAsDialog", value.asInstanceOf[js.Any])
    
    inline def setExportAsDialogUndefined: Self = StObject.set(x, "exportAsDialog", js.undefined)
    
    inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
    
    inline def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
