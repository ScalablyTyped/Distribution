package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerPdfjsProcessing extends StObject {
  
  var file: js.UndefOr[Any | String] = js.undefined
}
object PDFViewerPdfjsProcessing {
  
  inline def apply(): PDFViewerPdfjsProcessing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerPdfjsProcessing]
  }
  
  extension [Self <: PDFViewerPdfjsProcessing](x: Self) {
    
    inline def setFile(value: Any | String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
