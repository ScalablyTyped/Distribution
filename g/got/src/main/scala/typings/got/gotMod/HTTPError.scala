package typings.got.gotMod

import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPError
  extends StdError
     with GotError {
  var body: Buffer | String | js.Object
  var headers: IncomingHttpHeaders
  @JSName("name")
  var name_HTTPError: typings.got.gotStrings.HTTPError
  var statusCode: Double
  var statusMessage: String
}

object HTTPError {
  @scala.inline
  def apply(
    body: Buffer | String | js.Object,
    headers: IncomingHttpHeaders,
    message: String,
    name: typings.got.gotStrings.HTTPError,
    statusCode: Double,
    statusMessage: String,
    code: String = null,
    host: String = null,
    hostname: String = null,
    method: String = null,
    path: String = null,
    protocol: String = null,
    response: js.Any = null,
    stack: String = null,
    url: String = null
  ): HTTPError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers, message = message, name = name, statusCode = statusCode, statusMessage = statusMessage)
    if (code != null) __obj.updateDynamic("code")(code)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (response != null) __obj.updateDynamic("response")(response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[HTTPError]
  }
}

