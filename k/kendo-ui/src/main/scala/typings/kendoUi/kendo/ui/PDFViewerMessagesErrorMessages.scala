package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerMessagesErrorMessages extends StObject {
  
  var notFound: js.UndefOr[String] = js.undefined
  
  var notSupported: js.UndefOr[String] = js.undefined
  
  var parseError: js.UndefOr[String] = js.undefined
}
object PDFViewerMessagesErrorMessages {
  
  inline def apply(): PDFViewerMessagesErrorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesErrorMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFViewerMessagesErrorMessages] (val x: Self) extends AnyVal {
    
    inline def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
    
    inline def setNotSupported(value: String): Self = StObject.set(x, "notSupported", value.asInstanceOf[js.Any])
    
    inline def setNotSupportedUndefined: Self = StObject.set(x, "notSupported", js.undefined)
    
    inline def setParseError(value: String): Self = StObject.set(x, "parseError", value.asInstanceOf[js.Any])
    
    inline def setParseErrorUndefined: Self = StObject.set(x, "parseError", js.undefined)
  }
}
