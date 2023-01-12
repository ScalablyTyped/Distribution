package typings.hapiHapi.mod

import typings.hapiHapi.anon.IsOriginMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestInfo extends StObject {
  
  /** the request preferred encoding. */
  var acceptEncoding: String
  
  /** request processing completion timestamp (0 is still processing). */
  var completed: Double
  
  /** if CORS is enabled for the route, contains the following: */
  var cors: IsOriginMatch
  
  /** content of the HTTP 'Host' header (e.g. 'example.com:8080'). */
  var host: String
  
  /** the hostname part of the 'Host' header (e.g. 'example.com'). */
  var hostname: String
  
  /** a unique request identifier (using the format '{now}:{connection.info.id}:{5 digits counter}') */
  var id: String
  
  /** request reception timestamp. */
  var received: Double
  
  /** content of the HTTP 'Referrer' (or 'Referer') header. */
  var referrer: String
  
  /** remote client IP address. */
  var remoteAddress: String
  
  /** remote client port. */
  var remotePort: String
  
  /** request response timestamp (0 is not responded yet). */
  var responded: Double
}
object RequestInfo {
  
  inline def apply(
    acceptEncoding: String,
    completed: Double,
    cors: IsOriginMatch,
    host: String,
    hostname: String,
    id: String,
    received: Double,
    referrer: String,
    remoteAddress: String,
    remotePort: String,
    responded: Double
  ): RequestInfo = {
    val __obj = js.Dynamic.literal(acceptEncoding = acceptEncoding.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], cors = cors.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], responded = responded.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestInfo] (val x: Self) extends AnyVal {
    
    inline def setAcceptEncoding(value: String): Self = StObject.set(x, "acceptEncoding", value.asInstanceOf[js.Any])
    
    inline def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCors(value: IsOriginMatch): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReceived(value: Double): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    inline def setRemotePort(value: String): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
    
    inline def setResponded(value: Double): Self = StObject.set(x, "responded", value.asInstanceOf[js.Any])
  }
}
