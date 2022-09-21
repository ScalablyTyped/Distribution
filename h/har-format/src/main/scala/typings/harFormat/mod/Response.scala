package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  /** _non-standard_  */
  var _transferSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Size of the received response body in bytes.
    *
    * - Set to zero in case of responses coming from the cache (`304`).
    * - Set to `-1` if the info is not available.
    */
  var bodySize: Double
  
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  
  /** Details about the response body. */
  var content: Content
  
  /** List of cookie objects. */
  var cookies: js.Array[Cookie]
  
  /** List of header objects. */
  var headers: js.Array[Header]
  
  /**
    * Total number of bytes from the start of the HTTP response message until
    * (and including) the double CRLF before the body.
    *
    * Set to `-1` if the info is not available.
    *
    * _The size of received response-headers is computed only from headers
    * that are really received from the server. Additional headers appended by
    * the browser are not included in this number, but they appear in the list
    * of header objects._
    */
  var headersSize: Double
  
  /** Response HTTP Version. */
  var httpVersion: String
  
  /** Redirection target URL from the Location response header. */
  var redirectURL: String
  
  /** Response status. */
  var status: Double
  
  /** Response status description. */
  var statusText: String
}
object Response {
  
  inline def apply(
    bodySize: Double,
    content: Content,
    cookies: js.Array[Cookie],
    headers: js.Array[Header],
    headersSize: Double,
    httpVersion: String,
    redirectURL: String,
    status: Double,
    statusText: String
  ): Response = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersSize = headersSize.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], redirectURL = redirectURL.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  extension [Self <: Response](x: Self) {
    
    inline def setBodySize(value: Double): Self = StObject.set(x, "bodySize", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setCookies(value: js.Array[Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesVarargs(value: Cookie*): Self = StObject.set(x, "cookies", js.Array(value*))
    
    inline def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersSize(value: Double): Self = StObject.set(x, "headersSize", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setHttpVersion(value: String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
    
    inline def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def set_transferSize(value: Double): Self = StObject.set(x, "_transferSize", value.asInstanceOf[js.Any])
    
    inline def set_transferSizeNull: Self = StObject.set(x, "_transferSize", null)
    
    inline def set_transferSizeUndefined: Self = StObject.set(x, "_transferSize", js.undefined)
  }
}
