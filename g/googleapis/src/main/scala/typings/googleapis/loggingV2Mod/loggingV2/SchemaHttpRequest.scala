package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A common proto for logging HTTP requests. Only contains semantics defined
  * by the HTTP specification. Product-specific logging information MUST be
  * defined in a separate message.
  */
@js.native
trait SchemaHttpRequest extends StObject {
  
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
    * being served from cache. This field is only meaningful if cache_hit is
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
    * The referer URL of the request, as defined in HTTP/1.1 Header Field
    * Definitions (http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
    */
  var referer: js.UndefOr[String] = js.native
  
  /**
    * The IP address (IPv4 or IPv6) of the client that issued the HTTP request.
    * Examples: &quot;192.168.1.1&quot;, &quot;FE80::0202:B3FF:FE1E:8329&quot;.
    */
  var remoteIp: js.UndefOr[String] = js.native
  
  /**
    * The request method. Examples: &quot;GET&quot;, &quot;HEAD&quot;,
    * &quot;PUT&quot;, &quot;POST&quot;.
    */
  var requestMethod: js.UndefOr[String] = js.native
  
  /**
    * The size of the HTTP request message in bytes, including the request
    * headers and the request body.
    */
  var requestSize: js.UndefOr[String] = js.native
  
  /**
    * The scheme (http, https), the host name, the path and the query portion
    * of the URL that was requested. Example:
    * &quot;http://example.com/some/info?color=red&quot;.
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
    * The response code indicating the status of response. Examples: 200, 404.
    */
  var status: js.UndefOr[Double] = js.native
  
  /**
    * The user agent sent by the client. Example: &quot;Mozilla/4.0
    * (compatible; MSIE 6.0; Windows 98; Q312461; .NET CLR 1.0.3705)&quot;.
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
  implicit class SchemaHttpRequestMutableBuilder[Self <: SchemaHttpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheFillBytes(value: String): Self = StObject.set(x, "cacheFillBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheFillBytesUndefined: Self = StObject.set(x, "cacheFillBytes", js.undefined)
    
    @scala.inline
    def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheHitUndefined: Self = StObject.set(x, "cacheHit", js.undefined)
    
    @scala.inline
    def setCacheLookup(value: Boolean): Self = StObject.set(x, "cacheLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheLookupUndefined: Self = StObject.set(x, "cacheLookup", js.undefined)
    
    @scala.inline
    def setCacheValidatedWithOriginServer(value: Boolean): Self = StObject.set(x, "cacheValidatedWithOriginServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheValidatedWithOriginServerUndefined: Self = StObject.set(x, "cacheValidatedWithOriginServer", js.undefined)
    
    @scala.inline
    def setLatency(value: String): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
    
    @scala.inline
    def setRemoteIp(value: String): Self = StObject.set(x, "remoteIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIpUndefined: Self = StObject.set(x, "remoteIp", js.undefined)
    
    @scala.inline
    def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMethodUndefined: Self = StObject.set(x, "requestMethod", js.undefined)
    
    @scala.inline
    def setRequestSize(value: String): Self = StObject.set(x, "requestSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestSizeUndefined: Self = StObject.set(x, "requestSize", js.undefined)
    
    @scala.inline
    def setRequestUrl(value: String): Self = StObject.set(x, "requestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUrlUndefined: Self = StObject.set(x, "requestUrl", js.undefined)
    
    @scala.inline
    def setResponseSize(value: String): Self = StObject.set(x, "responseSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseSizeUndefined: Self = StObject.set(x, "responseSize", js.undefined)
    
    @scala.inline
    def setServerIp(value: String): Self = StObject.set(x, "serverIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerIpUndefined: Self = StObject.set(x, "serverIp", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
