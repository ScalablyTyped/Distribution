package typings
package gotLib.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPError
  extends StdError
     with gotLib.gotMod.gotNs.GotError {
  var body: nodeLib.Buffer | java.lang.String | js.Object
  var headers: nodeLib.httpMod.IncomingHttpHeaders
  var name: gotLib.gotLibStrings.HTTPError
  var statusCode: scala.Double
  var statusMessage: java.lang.String
}

object HTTPError {
  @scala.inline
  def apply(
    body: nodeLib.Buffer | java.lang.String | js.Object,
    headers: nodeLib.httpMod.IncomingHttpHeaders,
    name: gotLib.gotLibStrings.HTTPError,
    statusCode: scala.Double,
    statusMessage: java.lang.String,
    code: java.lang.String = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    method: java.lang.String = null,
    path: java.lang.String = null,
    protocol: java.lang.String = null,
    response: js.Any = null,
    stack: java.lang.String = null,
    url: java.lang.String = null
  ): HTTPError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("statusMessage")(statusMessage)
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

