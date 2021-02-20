package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxGl.mapboxGlStrings.GET
import typings.mapboxGl.mapboxGlStrings.POST
import typings.mapboxGl.mapboxGlStrings.PUT
import typings.mapboxGl.mapboxGlStrings.`same-origin`
import typings.mapboxGl.mapboxGlStrings.include
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestParameters extends StObject {
  
  var collectResourceTiming: js.UndefOr[Boolean] = js.native
  
  /**
    * Use `'include'` to send cookies with cross-origin requests.
    */
  var credentials: js.UndefOr[`same-origin` | include] = js.native
  
  /**
    * The headers to be sent with the request.
    */
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var method: js.UndefOr[GET | POST | PUT] = js.native
  
  /**
    * The URL to be requested.
    */
  var url: String = js.native
}
object RequestParameters {
  
  @scala.inline
  def apply(url: String): RequestParameters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParameters]
  }
  
  @scala.inline
  implicit class RequestParametersMutableBuilder[Self <: RequestParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectResourceTiming(value: Boolean): Self = StObject.set(x, "collectResourceTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectResourceTimingUndefined: Self = StObject.set(x, "collectResourceTiming", js.undefined)
    
    @scala.inline
    def setCredentials(value: `same-origin` | include): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | POST | PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
