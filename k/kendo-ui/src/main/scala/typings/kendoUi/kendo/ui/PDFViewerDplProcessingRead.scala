package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerDplProcessingRead extends StObject {
  
  var dataType: js.UndefOr[String] = js.undefined
  
  var pageField: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object PDFViewerDplProcessingRead {
  
  inline def apply(): PDFViewerDplProcessingRead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerDplProcessingRead]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFViewerDplProcessingRead] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setPageField(value: String): Self = StObject.set(x, "pageField", value.asInstanceOf[js.Any])
    
    inline def setPageFieldUndefined: Self = StObject.set(x, "pageField", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
