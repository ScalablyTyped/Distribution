package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerMessagesDialogs extends StObject {
  
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
  implicit class PDFViewerMessagesDialogsMutableBuilder[Self <: PDFViewerMessagesDialogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setExportAsDialog(value: PDFViewerMessagesDialogsExportAsDialog): Self = StObject.set(x, "exportAsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAsDialogUndefined: Self = StObject.set(x, "exportAsDialog", js.undefined)
    
    @scala.inline
    def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
    
    @scala.inline
    def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
