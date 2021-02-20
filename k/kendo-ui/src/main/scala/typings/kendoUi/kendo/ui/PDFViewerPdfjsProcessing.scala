package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerPdfjsProcessing extends StObject {
  
  var file: js.UndefOr[js.Any | String] = js.native
}
object PDFViewerPdfjsProcessing {
  
  @scala.inline
  def apply(): PDFViewerPdfjsProcessing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerPdfjsProcessing]
  }
  
  @scala.inline
  implicit class PDFViewerPdfjsProcessingMutableBuilder[Self <: PDFViewerPdfjsProcessing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: js.Any | String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
