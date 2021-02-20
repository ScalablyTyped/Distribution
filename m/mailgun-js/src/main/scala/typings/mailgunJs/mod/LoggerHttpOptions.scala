package typings.mailgunJs.mod

import typings.mailgunJs.mailgunJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggerHttpOptions extends StObject {
  
  var agent: `false` = js.native
  
  var auth: String = js.native
  
  var headers: js.Any = js.native
  
  var hostname: String = js.native
  
  var method: String = js.native
  
  var path: String = js.native
  
  var port: Double = js.native
  
  var protocol: String = js.native
  
  var timeout: Double = js.native
}
object LoggerHttpOptions {
  
  @scala.inline
  def apply(
    agent: `false`,
    auth: String,
    headers: js.Any,
    hostname: String,
    method: String,
    path: String,
    port: Double,
    protocol: String,
    timeout: Double
  ): LoggerHttpOptions = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerHttpOptions]
  }
  
  @scala.inline
  implicit class LoggerHttpOptionsMutableBuilder[Self <: LoggerHttpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
