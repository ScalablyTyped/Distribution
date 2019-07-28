package typings.mailgunDashJs.mailgunDashJsMod

import typings.mailgunDashJs.mailgunDashJsNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerHttpOptions extends js.Object {
  var agent: `false`
  var auth: String
  var headers: js.Any
  var hostname: String
  var method: String
  var path: String
  var port: Double
  var protocol: String
  var timeout: Double
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
    val __obj = js.Dynamic.literal(agent = agent, auth = auth, headers = headers, hostname = hostname, method = method, path = path, port = port, protocol = protocol, timeout = timeout)
  
    __obj.asInstanceOf[LoggerHttpOptions]
  }
}

