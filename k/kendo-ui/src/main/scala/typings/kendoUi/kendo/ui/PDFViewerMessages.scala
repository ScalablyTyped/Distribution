package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerMessages extends StObject {
  
  var defaultFileName: js.UndefOr[String] = js.native
  
  var dialogs: js.UndefOr[PDFViewerMessagesDialogs] = js.native
  
  var errorMessages: js.UndefOr[PDFViewerMessagesErrorMessages] = js.native
  
  var toolbar: js.UndefOr[PDFViewerMessagesToolbar] = js.native
}
object PDFViewerMessages {
  
  @scala.inline
  def apply(): PDFViewerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessages]
  }
  
  @scala.inline
  implicit class PDFViewerMessagesMutableBuilder[Self <: PDFViewerMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultFileName(value: String): Self = StObject.set(x, "defaultFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFileNameUndefined: Self = StObject.set(x, "defaultFileName", js.undefined)
    
    @scala.inline
    def setDialogs(value: PDFViewerMessagesDialogs): Self = StObject.set(x, "dialogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogsUndefined: Self = StObject.set(x, "dialogs", js.undefined)
    
    @scala.inline
    def setErrorMessages(value: PDFViewerMessagesErrorMessages): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessagesUndefined: Self = StObject.set(x, "errorMessages", js.undefined)
    
    @scala.inline
    def setToolbar(value: PDFViewerMessagesToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
