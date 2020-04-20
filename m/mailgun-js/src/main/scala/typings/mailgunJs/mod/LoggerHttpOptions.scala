package typings.mailgunJs.mod

import typings.mailgunJs.mailgunJsBooleans.`false`
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
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerHttpOptions]
  }
}

