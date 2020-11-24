package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message defines attributes for an HTTP request. If the actual request
  * is not an HTTP request, the runtime system should try to map the actual
  * request to an equivalent HTTP request.
  */
@js.native
trait SchemaRequest extends js.Object {
  
  /**
    * The request authentication. May be absent for unauthenticated requests.
    * Derived from the HTTP request `Authorization` header or equivalent.
    */
  var auth: js.UndefOr[SchemaAuth] = js.native
  
  /**
    * The HTTP URL fragment. No URL decoding is performed.
    */
  var fragment: js.UndefOr[String] = js.native
  
  /**
    * The HTTP request headers. If multiple headers share the same key, they
    * must be merged according to the HTTP spec. All header keys must be
    * lowercased, because HTTP header keys are case-insensitive.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The HTTP request `Host` header value.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * The unique ID for a request, which can be propagated to downstream
    * systems. The ID should have low probability of collision within a single
    * day for a specific service.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The HTTP request method, such as `GET`, `POST`.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * The HTTP URL path.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The network protocol used with the request, such as &quot;http/1.1&quot;,
    * &quot;spdy/3&quot;, &quot;h2&quot;, &quot;h2c&quot;, &quot;webrtc&quot;,
    * &quot;tcp&quot;, &quot;udp&quot;, &quot;quic&quot;. See
    * https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids
    * for details.
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * The HTTP URL query in the format of `name1=value`&amp;name2=value2`, as
    * it appears in the first line of the HTTP request. No decoding is
    * performed.
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * A special parameter for request reason. It is used by security systems to
    * associate auditing information with a request.
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * The HTTP URL scheme, such as `http` and `https`.
    */
  var scheme: js.UndefOr[String] = js.native
  
  /**
    * The HTTP request size in bytes. If unknown, it must be -1.
    */
  var size: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the `destination` service receives the first byte of
    * the request.
    */
  var time: js.UndefOr[String] = js.native
}
object SchemaRequest {
  
  @scala.inline
  def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  
  @scala.inline
  implicit class SchemaRequestOps[Self <: SchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: SchemaAuth): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragment: Self = this.set("fragment", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
