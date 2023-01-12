package typings.k6.httpMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  /** Authentication method. */
  var auth: js.UndefOr[AuthMethod] = js.undefined
  
  /** Request body compression. */
  var compression: js.UndefOr[String] = js.undefined
  
  /** Request scoped cookies. */
  var cookies: js.UndefOr[StringDictionary[ParamsCookieValue]] = js.undefined
  
  /** Request headers. */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** Cookie jar to override default VU cookie jar with. */
  var jar: js.UndefOr[CookieJar_] = js.undefined
  
  /** Maximum redirects to follow. */
  var redirects: js.UndefOr[Double] = js.undefined
  
  /** Sets a ResponseCallback only for this request. */
  var responseCallback: js.UndefOr[ExpectedStatusesCallback] = js.undefined
  
  /** Response type. */
  var responseType: js.UndefOr[ResponseType] = js.undefined
  
  /** Response time metric tags. */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** Request timeout. */
  var timeout: js.UndefOr[String | Double] = js.undefined
}
object Params {
  
  inline def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: AuthMethod): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setCookies(value: StringDictionary[ParamsCookieValue]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setJar(value: CookieJar_): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
    
    inline def setJarUndefined: Self = StObject.set(x, "jar", js.undefined)
    
    inline def setRedirects(value: Double): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
    
    inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
    
    inline def setResponseCallback(value: ExpectedStatusesCallback): Self = StObject.set(x, "responseCallback", value.asInstanceOf[js.Any])
    
    inline def setResponseCallbackUndefined: Self = StObject.set(x, "responseCallback", js.undefined)
    
    inline def setResponseType(value: ResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
