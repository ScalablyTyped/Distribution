package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRequestContext extends StObject {
  
  /** The type of HTTP request, such as `GET`, `POST`, etc. */
  var method: js.UndefOr[String] = js.undefined
  
  /** The referrer information that is provided with the request. */
  var referrer: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address from which the request originated. This can be IPv4, IPv6, or a token which is derived from the IP address, depending on the data that has been provided in the error
    * report.
    */
  var remoteIp: js.UndefOr[String] = js.undefined
  
  /** The HTTP response status code for the request. */
  var responseStatusCode: js.UndefOr[Double] = js.undefined
  
  /** The URL of the request. */
  var url: js.UndefOr[String] = js.undefined
  
  /** The user agent information that is provided with the request. */
  var userAgent: js.UndefOr[String] = js.undefined
}
object HttpRequestContext {
  
  inline def apply(): HttpRequestContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequestContext]
  }
  
  extension [Self <: HttpRequestContext](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setRemoteIp(value: String): Self = StObject.set(x, "remoteIp", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpUndefined: Self = StObject.set(x, "remoteIp", js.undefined)
    
    inline def setResponseStatusCode(value: Double): Self = StObject.set(x, "responseStatusCode", value.asInstanceOf[js.Any])
    
    inline def setResponseStatusCodeUndefined: Self = StObject.set(x, "responseStatusCode", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
