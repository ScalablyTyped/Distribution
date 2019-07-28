package typings.got.gotMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StdError extends Error {
  var code: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object StdError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    code: String = null,
    host: String = null,
    hostname: String = null,
    method: String = null,
    path: String = null,
    protocol: String = null,
    response: js.Any = null,
    stack: String = null,
    url: String = null
  ): StdError = {
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
    __obj.asInstanceOf[StdError]
  }
}

