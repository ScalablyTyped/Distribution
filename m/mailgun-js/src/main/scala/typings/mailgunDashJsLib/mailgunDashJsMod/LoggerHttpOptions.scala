package typings
package mailgunDashJsLib.mailgunDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerHttpOptions extends js.Object {
  var agent: mailgunDashJsLib.mailgunDashJsLibNumbers.`false`
  var auth: java.lang.String
  var headers: js.Any
  var hostname: java.lang.String
  var method: java.lang.String
  var path: java.lang.String
  var port: scala.Double
  var protocol: java.lang.String
  var timeout: scala.Double
}

object LoggerHttpOptions {
  @scala.inline
  def apply(
    agent: mailgunDashJsLib.mailgunDashJsLibNumbers.`false`,
    auth: java.lang.String,
    headers: js.Any,
    hostname: java.lang.String,
    method: java.lang.String,
    path: java.lang.String,
    port: scala.Double,
    protocol: java.lang.String,
    timeout: scala.Double
  ): LoggerHttpOptions = {
    val __obj = js.Dynamic.literal(agent = agent, auth = auth, headers = headers, hostname = hostname, method = method, path = path, port = port, protocol = protocol, timeout = timeout)
  
    __obj.asInstanceOf[LoggerHttpOptions]
  }
}

