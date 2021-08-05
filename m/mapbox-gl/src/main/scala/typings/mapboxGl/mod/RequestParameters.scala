package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxGl.mapboxGlStrings.GET
import typings.mapboxGl.mapboxGlStrings.POST
import typings.mapboxGl.mapboxGlStrings.PUT
import typings.mapboxGl.mapboxGlStrings.`same-origin`
import typings.mapboxGl.mapboxGlStrings.include
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestParameters extends StObject {
  
  var collectResourceTiming: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use `'include'` to send cookies with cross-origin requests.
    */
  var credentials: js.UndefOr[`same-origin` | include] = js.undefined
  
  /**
    * The headers to be sent with the request.
    */
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var method: js.UndefOr[GET | POST | PUT] = js.undefined
  
  /**
    * The URL to be requested.
    */
  var url: String
}
object RequestParameters {
  
  inline def apply(url: String): RequestParameters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParameters]
  }
  
  extension [Self <: RequestParameters](x: Self) {
    
    inline def setCollectResourceTiming(value: Boolean): Self = StObject.set(x, "collectResourceTiming", value.asInstanceOf[js.Any])
    
    inline def setCollectResourceTimingUndefined: Self = StObject.set(x, "collectResourceTiming", js.undefined)
    
    inline def setCredentials(value: `same-origin` | include): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: GET | POST | PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
