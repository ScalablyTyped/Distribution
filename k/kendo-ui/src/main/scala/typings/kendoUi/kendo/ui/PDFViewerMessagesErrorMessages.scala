package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerMessagesErrorMessages extends StObject {
  
  var notFound: js.UndefOr[String] = js.native
  
  var notSupported: js.UndefOr[String] = js.native
  
  var parseError: js.UndefOr[String] = js.native
}
object PDFViewerMessagesErrorMessages {
  
  @scala.inline
  def apply(): PDFViewerMessagesErrorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesErrorMessages]
  }
  
  @scala.inline
  implicit class PDFViewerMessagesErrorMessagesMutableBuilder[Self <: PDFViewerMessagesErrorMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
    
    @scala.inline
    def setNotSupported(value: String): Self = StObject.set(x, "notSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSupportedUndefined: Self = StObject.set(x, "notSupported", js.undefined)
    
    @scala.inline
    def setParseError(value: String): Self = StObject.set(x, "parseError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseErrorUndefined: Self = StObject.set(x, "parseError", js.undefined)
  }
}
