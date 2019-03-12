package typings
package gotLib.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedProtocolError
  extends StdError
     with gotLib.gotMod.gotNs.GotError {
  @JSName("name")
  var name_UnsupportedProtocolError: gotLib.gotLibStrings.UnsupportedProtocolError
}

object UnsupportedProtocolError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: gotLib.gotLibStrings.UnsupportedProtocolError,
    code: java.lang.String = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    method: java.lang.String = null,
    path: java.lang.String = null,
    protocol: java.lang.String = null,
    response: js.Any = null,
    stack: java.lang.String = null,
    url: java.lang.String = null
  ): UnsupportedProtocolError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (code != null) __obj.updateDynamic("code")(code)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (response != null) __obj.updateDynamic("response")(response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UnsupportedProtocolError]
  }
}

