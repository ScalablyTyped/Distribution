package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerMessages extends StObject {
  
  var defaultFileName: js.UndefOr[String] = js.undefined
  
  var dialogs: js.UndefOr[PDFViewerMessagesDialogs] = js.undefined
  
  var errorMessages: js.UndefOr[PDFViewerMessagesErrorMessages] = js.undefined
  
  var toolbar: js.UndefOr[PDFViewerMessagesToolbar] = js.undefined
}
object PDFViewerMessages {
  
  inline def apply(): PDFViewerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessages]
  }
  
  extension [Self <: PDFViewerMessages](x: Self) {
    
    inline def setDefaultFileName(value: String): Self = StObject.set(x, "defaultFileName", value.asInstanceOf[js.Any])
    
    inline def setDefaultFileNameUndefined: Self = StObject.set(x, "defaultFileName", js.undefined)
    
    inline def setDialogs(value: PDFViewerMessagesDialogs): Self = StObject.set(x, "dialogs", value.asInstanceOf[js.Any])
    
    inline def setDialogsUndefined: Self = StObject.set(x, "dialogs", js.undefined)
    
    inline def setErrorMessages(value: PDFViewerMessagesErrorMessages): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
    
    inline def setErrorMessagesUndefined: Self = StObject.set(x, "errorMessages", js.undefined)
    
    inline def setToolbar(value: PDFViewerMessagesToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
