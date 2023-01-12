package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerDplProcessingUpload extends StObject {
  
  var saveField: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object PDFViewerDplProcessingUpload {
  
  inline def apply(): PDFViewerDplProcessingUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerDplProcessingUpload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFViewerDplProcessingUpload] (val x: Self) extends AnyVal {
    
    inline def setSaveField(value: String): Self = StObject.set(x, "saveField", value.asInstanceOf[js.Any])
    
    inline def setSaveFieldUndefined: Self = StObject.set(x, "saveField", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
