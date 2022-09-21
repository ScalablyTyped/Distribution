package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  /**
    * Size of the request body (POST data payload) in bytes.
    *
    * Set to `-1` if the info is not available.
    */
  var bodySize: Double
  
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  
  /** List of cookie objects. */
  var cookies: js.Array[Cookie]
  
  /** List of header objects. */
  var headers: js.Array[Header]
  
  /**
    * Total number of bytes from the start of the HTTP request message until
    * (and including) the double CRLF before the body.
    *
    * Set to `-1` if the info is not available.
    */
  var headersSize: Double
  
  /** Request HTTP Version. */
  var httpVersion: String
  
  /** Request method (`GET`, `POST`, ...). */
  var method: String
  
  /** Posted data info. */
  var postData: js.UndefOr[PostData] = js.undefined
  
  /** List of query parameter objects. */
  var queryString: js.Array[QueryString]
  
  /** Absolute URL of the request (fragments are not included). */
  var url: String
}
object Request {
  
  inline def apply(
    bodySize: Double,
    cookies: js.Array[Cookie],
    headers: js.Array[Header],
    headersSize: Double,
    httpVersion: String,
    method: String,
    queryString: js.Array[QueryString],
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersSize = headersSize.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setBodySize(value: Double): Self = StObject.set(x, "bodySize", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCookies(value: js.Array[Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesVarargs(value: Cookie*): Self = StObject.set(x, "cookies", js.Array(value*))
    
    inline def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersSize(value: Double): Self = StObject.set(x, "headersSize", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setHttpVersion(value: String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPostData(value: PostData): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    inline def setQueryString(value: js.Array[QueryString]): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringVarargs(value: QueryString*): Self = StObject.set(x, "queryString", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
