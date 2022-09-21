package typings.googleapis.servicecontrolV2Mod.servicecontrolV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequest extends StObject {
  
  /**
    * The request authentication. May be absent for unauthenticated requests. Derived from the HTTP request `Authorization` header or equivalent.
    */
  var auth: js.UndefOr[SchemaAuth] = js.undefined
  
  /**
    * The HTTP request headers. If multiple headers share the same key, they must be merged according to the HTTP spec. All header keys must be lowercased, because HTTP header keys are case-insensitive.
    */
  var headers: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The HTTP request `Host` header value.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID for a request, which can be propagated to downstream systems. The ID should have low probability of collision within a single day for a specific service.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The HTTP request method, such as `GET`, `POST`.
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The HTTP URL path, excluding the query parameters.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The network protocol used with the request, such as "http/1.1", "spdy/3", "h2", "h2c", "webrtc", "tcp", "udp", "quic". See https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids for details.
    */
  var protocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The HTTP URL query in the format of `name1=value1&name2=value2`, as it appears in the first line of the HTTP request. No decoding is performed.
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A special parameter for request reason. It is used by security systems to associate auditing information with a request.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The HTTP URL scheme, such as `http` and `https`.
    */
  var scheme: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The HTTP request size in bytes. If unknown, it must be -1.
    */
  var size: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when the `destination` service receives the last byte of the request.
    */
  var time: js.UndefOr[String | Null] = js.undefined
}
object SchemaRequest {
  
  inline def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  
  extension [Self <: SchemaRequest](x: Self) {
    
    inline def setAuth(value: SchemaAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeNull: Self = StObject.set(x, "scheme", null)
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
