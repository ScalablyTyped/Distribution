package typings.jasmineAjax

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JasmineAjaxResponse extends StObject {
  
  var contentType: js.UndefOr[String] = js.native
  
  var response: js.UndefOr[String] = js.native
  
  var responseHeaders: js.UndefOr[StringDictionary[String]] = js.native
  
  var responseJSON: js.UndefOr[js.Any] = js.native
  
  var responseText: js.UndefOr[String] = js.native
  
  var responseURL: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[Double] = js.native
  
  var statusText: js.UndefOr[String] = js.native
}
object JasmineAjaxResponse {
  
  @scala.inline
  def apply(): JasmineAjaxResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JasmineAjaxResponse]
  }
  
  @scala.inline
  implicit class JasmineAjaxResponseMutableBuilder[Self <: JasmineAjaxResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeaders(value: StringDictionary[String]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    @scala.inline
    def setResponseJSON(value: js.Any): Self = StObject.set(x, "responseJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseJSONUndefined: Self = StObject.set(x, "responseJSON", js.undefined)
    
    @scala.inline
    def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
    
    @scala.inline
    def setResponseURL(value: String): Self = StObject.set(x, "responseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseURLUndefined: Self = StObject.set(x, "responseURL", js.undefined)
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
