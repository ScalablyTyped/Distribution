package typings.jasmineAjax

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JasmineAjaxResponse extends StObject {
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var response: js.UndefOr[String] = js.undefined
  
  var responseHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var responseJSON: js.UndefOr[Any] = js.undefined
  
  var responseText: js.UndefOr[String] = js.undefined
  
  var responseURL: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[Double] = js.undefined
  
  var statusText: js.UndefOr[String] = js.undefined
}
object JasmineAjaxResponse {
  
  inline def apply(): JasmineAjaxResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JasmineAjaxResponse]
  }
  
  extension [Self <: JasmineAjaxResponse](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaders(value: StringDictionary[String]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    inline def setResponseJSON(value: Any): Self = StObject.set(x, "responseJSON", value.asInstanceOf[js.Any])
    
    inline def setResponseJSONUndefined: Self = StObject.set(x, "responseJSON", js.undefined)
    
    inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
    
    inline def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
    
    inline def setResponseURL(value: String): Self = StObject.set(x, "responseURL", value.asInstanceOf[js.Any])
    
    inline def setResponseURLUndefined: Self = StObject.set(x, "responseURL", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
