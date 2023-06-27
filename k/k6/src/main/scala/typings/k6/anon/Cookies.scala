package typings.k6.anon

import org.scalablytyped.runtime.StringDictionary
import typings.k6.httpMod.RequestCookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookies extends StObject {
  
  /** Request body. */
  var body: String
  
  /** Request cookies. */
  var cookies: StringDictionary[js.Array[RequestCookie]]
  
  /** Request headers. */
  var headers: StringDictionary[js.Array[String]]
  
  /** Request method. */
  var method: String
  
  /** Request URL. */
  var url: String
}
object Cookies {
  
  inline def apply(
    body: String,
    cookies: StringDictionary[js.Array[RequestCookie]],
    headers: StringDictionary[js.Array[String]],
    method: String,
    url: String
  ): Cookies = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cookies] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCookies(value: StringDictionary[js.Array[RequestCookie]]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
