package typings.mailgunJs.mod

import typings.mailgunJs.mailgunJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggerHttpOptions extends js.Object {
  
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
  implicit class LoggerHttpOptionsOps[Self <: LoggerHttpOptions] (val x: Self) extends AnyVal {
    
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
    def setAgent(value: `false`): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
