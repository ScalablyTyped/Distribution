package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A common proto for logging HTTP requests. Only contains semantics defined
  * by the HTTP specification. Product-specific logging information MUST be
  * defined in a separate message.
  */
@js.native
trait SchemaHttpRequest extends js.Object {
  
  /**
    * The number of HTTP response bytes inserted into cache. Set only when a
    * cache fill was attempted.
    */
  var cacheFillBytes: js.UndefOr[String] = js.native
  
  /**
    * Whether or not an entity was served from cache (with or without
    * validation).
    */
  var cacheHit: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not a cache lookup was attempted.
    */
  var cacheLookup: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the response was validated with the origin server before
    * being served from cache. This field is only meaningful if `cache_hit` is
    * True.
    */
  var cacheValidatedWithOriginServer: js.UndefOr[Boolean] = js.native
  
  /**
    * The request processing latency on the server, from the time the request
    * was received until the response was sent.
    */
  var latency: js.UndefOr[String] = js.native
  
  /**
    * Protocol used for the request. Examples: &quot;HTTP/1.1&quot;,
    * &quot;HTTP/2&quot;, &quot;websocket&quot;
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * The referer URL of the request, as defined in [HTTP/1.1 Header Field
    * Definitions](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
    */
  var referer: js.UndefOr[String] = js.native
  
  /**
    * The IP address (IPv4 or IPv6) of the client that issued the HTTP request.
    * Examples: `&quot;192.168.1.1&quot;`,
    * `&quot;FE80::0202:B3FF:FE1E:8329&quot;`.
    */
  var remoteIp: js.UndefOr[String] = js.native
  
  /**
    * The request method. Examples: `&quot;GET&quot;`, `&quot;HEAD&quot;`,
    * `&quot;PUT&quot;`, `&quot;POST&quot;`.
    */
  var requestMethod: js.UndefOr[String] = js.native
  
  /**
    * The size of the HTTP request message in bytes, including the request
    * headers and the request body.
    */
  var requestSize: js.UndefOr[String] = js.native
  
  /**
    * The scheme (http, https), the host name, the path, and the query portion
    * of the URL that was requested. Example:
    * `&quot;http://example.com/some/info?color=red&quot;`.
    */
  var requestUrl: js.UndefOr[String] = js.native
  
  /**
    * The size of the HTTP response message sent back to the client, in bytes,
    * including the response headers and the response body.
    */
  var responseSize: js.UndefOr[String] = js.native
  
  /**
    * The IP address (IPv4 or IPv6) of the origin server that the request was
    * sent to.
    */
  var serverIp: js.UndefOr[String] = js.native
  
  /**
    * The response code indicating the status of the response. Examples: 200,
    * 404.
    */
  var status: js.UndefOr[Double] = js.native
  
  /**
    * The user agent sent by the client. Example: `&quot;Mozilla/4.0
    * (compatible; MSIE 6.0; Windows 98; Q312461; .NET CLR 1.0.3705)&quot;`.
    */
  var userAgent: js.UndefOr[String] = js.native
}
object SchemaHttpRequest {
  
  @scala.inline
  def apply(): SchemaHttpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRequest]
  }
  
  @scala.inline
  implicit class SchemaHttpRequestOps[Self <: SchemaHttpRequest] (val x: Self) extends AnyVal {
    
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
    def setCacheFillBytes(value: String): Self = this.set("cacheFillBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheFillBytes: Self = this.set("cacheFillBytes", js.undefined)
    
    @scala.inline
    def setCacheHit(value: Boolean): Self = this.set("cacheHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheHit: Self = this.set("cacheHit", js.undefined)
    
    @scala.inline
    def setCacheLookup(value: Boolean): Self = this.set("cacheLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheLookup: Self = this.set("cacheLookup", js.undefined)
    
    @scala.inline
    def setCacheValidatedWithOriginServer(value: Boolean): Self = this.set("cacheValidatedWithOriginServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheValidatedWithOriginServer: Self = this.set("cacheValidatedWithOriginServer", js.undefined)
    
    @scala.inline
    def setLatency(value: String): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setReferer(value: String): Self = this.set("referer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferer: Self = this.set("referer", js.undefined)
    
    @scala.inline
    def setRemoteIp(value: String): Self = this.set("remoteIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteIp: Self = this.set("remoteIp", js.undefined)
    
    @scala.inline
    def setRequestMethod(value: String): Self = this.set("requestMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMethod: Self = this.set("requestMethod", js.undefined)
    
    @scala.inline
    def setRequestSize(value: String): Self = this.set("requestSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestSize: Self = this.set("requestSize", js.undefined)
    
    @scala.inline
    def setRequestUrl(value: String): Self = this.set("requestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestUrl: Self = this.set("requestUrl", js.undefined)
    
    @scala.inline
    def setResponseSize(value: String): Self = this.set("responseSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseSize: Self = this.set("responseSize", js.undefined)
    
    @scala.inline
    def setServerIp(value: String): Self = this.set("serverIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerIp: Self = this.set("serverIp", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
