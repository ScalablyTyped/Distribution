package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRequest extends StObject {
  
  /**
    * The number of HTTP response bytes inserted into cache. Set only when a cache fill was attempted.
    */
  var cacheFillBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not an entity was served from cache (with or without validation).
    */
  var cacheHit: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether or not a cache lookup was attempted.
    */
  var cacheLookup: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether or not the response was validated with the origin server before being served from cache. This field is only meaningful if cache_hit is True.
    */
  var cacheValidatedWithOriginServer: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The request processing latency on the server, from the time the request was received until the response was sent.
    */
  var latency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Protocol used for the request. Examples: "HTTP/1.1", "HTTP/2", "websocket"
    */
  var protocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The referer URL of the request, as defined in HTTP/1.1 Header Field Definitions (http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
    */
  var referer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IP address (IPv4 or IPv6) of the client that issued the HTTP request. This field can include port information. Examples: "192.168.1.1", "10.0.0.1:80", "FE80::0202:B3FF:FE1E:8329".
    */
  var remoteIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The request method. Examples: "GET", "HEAD", "PUT", "POST".
    */
  var requestMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of the HTTP request message in bytes, including the request headers and the request body.
    */
  var requestSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The scheme (http, https), the host name, the path and the query portion of the URL that was requested. Example: "http://example.com/some/info?color=red".
    */
  var requestUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of the HTTP response message sent back to the client, in bytes, including the response headers and the response body.
    */
  var responseSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IP address (IPv4 or IPv6) of the origin server that the request was sent to. This field can include port information. Examples: "192.168.1.1", "10.0.0.1:80", "FE80::0202:B3FF:FE1E:8329".
    */
  var serverIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The response code indicating the status of response. Examples: 200, 404.
    */
  var status: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The user agent sent by the client. Example: "Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Q312461; .NET CLR 1.0.3705)".
    */
  var userAgent: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpRequest {
  
  inline def apply(): SchemaHttpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRequest]
  }
  
  extension [Self <: SchemaHttpRequest](x: Self) {
    
    inline def setCacheFillBytes(value: String): Self = StObject.set(x, "cacheFillBytes", value.asInstanceOf[js.Any])
    
    inline def setCacheFillBytesNull: Self = StObject.set(x, "cacheFillBytes", null)
    
    inline def setCacheFillBytesUndefined: Self = StObject.set(x, "cacheFillBytes", js.undefined)
    
    inline def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
    
    inline def setCacheHitNull: Self = StObject.set(x, "cacheHit", null)
    
    inline def setCacheHitUndefined: Self = StObject.set(x, "cacheHit", js.undefined)
    
    inline def setCacheLookup(value: Boolean): Self = StObject.set(x, "cacheLookup", value.asInstanceOf[js.Any])
    
    inline def setCacheLookupNull: Self = StObject.set(x, "cacheLookup", null)
    
    inline def setCacheLookupUndefined: Self = StObject.set(x, "cacheLookup", js.undefined)
    
    inline def setCacheValidatedWithOriginServer(value: Boolean): Self = StObject.set(x, "cacheValidatedWithOriginServer", value.asInstanceOf[js.Any])
    
    inline def setCacheValidatedWithOriginServerNull: Self = StObject.set(x, "cacheValidatedWithOriginServer", null)
    
    inline def setCacheValidatedWithOriginServerUndefined: Self = StObject.set(x, "cacheValidatedWithOriginServer", js.undefined)
    
    inline def setLatency(value: String): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyNull: Self = StObject.set(x, "latency", null)
    
    inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    
    inline def setRefererNull: Self = StObject.set(x, "referer", null)
    
    inline def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
    
    inline def setRemoteIp(value: String): Self = StObject.set(x, "remoteIp", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpNull: Self = StObject.set(x, "remoteIp", null)
    
    inline def setRemoteIpUndefined: Self = StObject.set(x, "remoteIp", js.undefined)
    
    inline def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
    
    inline def setRequestMethodNull: Self = StObject.set(x, "requestMethod", null)
    
    inline def setRequestMethodUndefined: Self = StObject.set(x, "requestMethod", js.undefined)
    
    inline def setRequestSize(value: String): Self = StObject.set(x, "requestSize", value.asInstanceOf[js.Any])
    
    inline def setRequestSizeNull: Self = StObject.set(x, "requestSize", null)
    
    inline def setRequestSizeUndefined: Self = StObject.set(x, "requestSize", js.undefined)
    
    inline def setRequestUrl(value: String): Self = StObject.set(x, "requestUrl", value.asInstanceOf[js.Any])
    
    inline def setRequestUrlNull: Self = StObject.set(x, "requestUrl", null)
    
    inline def setRequestUrlUndefined: Self = StObject.set(x, "requestUrl", js.undefined)
    
    inline def setResponseSize(value: String): Self = StObject.set(x, "responseSize", value.asInstanceOf[js.Any])
    
    inline def setResponseSizeNull: Self = StObject.set(x, "responseSize", null)
    
    inline def setResponseSizeUndefined: Self = StObject.set(x, "responseSize", js.undefined)
    
    inline def setServerIp(value: String): Self = StObject.set(x, "serverIp", value.asInstanceOf[js.Any])
    
    inline def setServerIpNull: Self = StObject.set(x, "serverIp", null)
    
    inline def setServerIpUndefined: Self = StObject.set(x, "serverIp", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
