package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerMessagesDialogsExportAsDialogLabels extends StObject {
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[String] = js.undefined
  
  var saveAsType: js.UndefOr[String] = js.undefined
}
object PDFViewerMessagesDialogsExportAsDialogLabels {
  
  inline def apply(): PDFViewerMessagesDialogsExportAsDialogLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesDialogsExportAsDialogLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFViewerMessagesDialogsExportAsDialogLabels] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setSaveAsType(value: String): Self = StObject.set(x, "saveAsType", value.asInstanceOf[js.Any])
    
    inline def setSaveAsTypeUndefined: Self = StObject.set(x, "saveAsType", js.undefined)
  }
}
