package typings.mailgunJs.mod

import typings.mailgunJs.mailgunJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerHttpOptions extends StObject {
  
  var agent: `false`
  
  var auth: String
  
  var headers: Any
  
  var hostname: String
  
  var method: String
  
  var path: String
  
  var port: Double
  
  var protocol: String
  
  var timeout: Double
}
object LoggerHttpOptions {
  
  inline def apply(
    auth: String,
    headers: Any,
    hostname: String,
    method: String,
    path: String,
    port: Double,
    protocol: String,
    timeout: Double
  ): LoggerHttpOptions = {
    val __obj = js.Dynamic.literal(agent = false, auth = auth.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerHttpOptions]
  }
  
  extension [Self <: LoggerHttpOptions](x: Self) {
    
    inline def setAgent(value: `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
