package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTiming extends StObject {
  
  /**
    * Time immediately after the user agent establishes the connection to the server
    * to retrieve the resource. The value is given in milliseconds relative to `startTime`,
    * -1 if not available.
    */
  var connectEnd: Double
  
  /**
    * Time immediately before the user agent starts establishing the connection to the server
    * to retrieve the resource. The value is given in milliseconds relative to `startTime`,
    * -1 if not available.
    */
  var connectStart: Double
  
  /**
    * Time immediately after the browser ends the domain name lookup for the resource.
    * The value is given in milliseconds relative to `startTime`, -1 if not available.
    */
  var domainLookupEnd: Double
  
  /**
    * Time immediately before the browser starts the domain name lookup for the resource.
    * The value is given in milliseconds relative to `startTime`, -1 if not available.
    */
  var domainLookupStart: Double
  
  /**
    * Time immediately before the browser starts requesting the resource from the server,
    * cache, or local resource. The value is given in milliseconds relative to `startTime`,
    * -1 if not available.
    */
  var requestStart: Double
  
  /**
    * Time immediately after the browser receives the last byte of the resource or immediately
    * before the transport connection is closed, whichever comes first. The value is given
    * in milliseconds relative to `startTime`, -1 if not available.
    */
  var responseEnd: Double
  
  /**
    * Time immediately after the browser receives the first byte of the response from the server,
    * cache, or local resource. The value is given in milliseconds relative to `startTime`,
    * -1 if not available.
    */
  var responseStart: Double
  
  /**
    * Time immediately before the browser starts the handshake process to secure the current
    * connection. The value is given in milliseconds relative to `startTime`, -1 if not available.
    */
  var secureConnectionStart: Double
  
  /**
    * Request start time in milliseconds elapsed since January 1, 1970 00:00:00 UTC
    */
  var startTime: Double
}
object ResourceTiming {
  
  inline def apply(
    connectEnd: Double,
    connectStart: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    secureConnectionStart: Double,
    startTime: Double
  ): ResourceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceTiming] (val x: Self) extends AnyVal {
    
    inline def setConnectEnd(value: Double): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
    
    inline def setConnectStart(value: Double): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
    
    inline def setDomainLookupEnd(value: Double): Self = StObject.set(x, "domainLookupEnd", value.asInstanceOf[js.Any])
    
    inline def setDomainLookupStart(value: Double): Self = StObject.set(x, "domainLookupStart", value.asInstanceOf[js.Any])
    
    inline def setRequestStart(value: Double): Self = StObject.set(x, "requestStart", value.asInstanceOf[js.Any])
    
    inline def setResponseEnd(value: Double): Self = StObject.set(x, "responseEnd", value.asInstanceOf[js.Any])
    
    inline def setResponseStart(value: Double): Self = StObject.set(x, "responseStart", value.asInstanceOf[js.Any])
    
    inline def setSecureConnectionStart(value: Double): Self = StObject.set(x, "secureConnectionStart", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
