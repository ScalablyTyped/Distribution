package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerDplProcessingDownload extends StObject {
  
  var url: js.UndefOr[String] = js.undefined
}
object PDFViewerDplProcessingDownload {
  
  inline def apply(): PDFViewerDplProcessingDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerDplProcessingDownload]
  }
  
  extension [Self <: PDFViewerDplProcessingDownload](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
