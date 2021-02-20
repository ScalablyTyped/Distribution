package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerMessagesDialogsExportAsDialogLabels extends StObject {
  
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
  implicit class PDFViewerMessagesDialogsExportAsDialogLabelsMutableBuilder[Self <: PDFViewerMessagesDialogsExportAsDialogLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setSaveAsType(value: String): Self = StObject.set(x, "saveAsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAsTypeUndefined: Self = StObject.set(x, "saveAsType", js.undefined)
  }
}
