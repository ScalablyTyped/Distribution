package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message defines attributes for an HTTP request. If the actual request
  * is not an HTTP request, the runtime system should try to map the actual
  * request to an equivalent HTTP request.
  */
trait SchemaRequest extends StObject {
  
  /**
    * The request authentication. May be absent for unauthenticated requests.
    * Derived from the HTTP request `Authorization` header or equivalent.
    */
  var auth: js.UndefOr[SchemaAuth] = js.undefined
  
  /**
    * The HTTP URL fragment. No URL decoding is performed.
    */
  var fragment: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP request headers. If multiple headers share the same key, they
    * must be merged according to the HTTP spec. All header keys must be
    * lowercased, because HTTP header keys are case-insensitive.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The HTTP request `Host` header value.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID for a request, which can be propagated to downstream
    * systems. The ID should have low probability of collision within a single
    * day for a specific service.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP request method, such as `GET`, `POST`.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP URL path.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The network protocol used with the request, such as &quot;http/1.1&quot;,
    * &quot;spdy/3&quot;, &quot;h2&quot;, &quot;h2c&quot;, &quot;webrtc&quot;,
    * &quot;tcp&quot;, &quot;udp&quot;, &quot;quic&quot;. See
    * https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids
    * for details.
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP URL query in the format of `name1=value`&amp;name2=value2`, as
    * it appears in the first line of the HTTP request. No decoding is
    * performed.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * A special parameter for request reason. It is used by security systems to
    * associate auditing information with a request.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP URL scheme, such as `http` and `https`.
    */
  var scheme: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP request size in bytes. If unknown, it must be -1.
    */
  var size: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the `destination` service receives the first byte of
    * the request.
    */
  var time: js.UndefOr[String] = js.undefined
}
object SchemaRequest {
  
  @scala.inline
  def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  
  @scala.inline
  implicit class SchemaRequestMutableBuilder[Self <: SchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: SchemaAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
