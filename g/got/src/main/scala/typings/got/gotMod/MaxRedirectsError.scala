package typings.got.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxRedirectsError
  extends StdError
     with GotError {
  @JSName("name")
  var name_MaxRedirectsError: typings.got.gotStrings.MaxRedirectsError
  var redirectUrls: js.Array[String]
  var statusCode: Double
  var statusMessage: String
}

object MaxRedirectsError {
  @scala.inline
  def apply(
    message: String,
    name: typings.got.gotStrings.MaxRedirectsError,
    redirectUrls: js.Array[String],
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
  ): MaxRedirectsError = {
    val __obj = js.Dynamic.literal(message = message, name = name, redirectUrls = redirectUrls, statusCode = statusCode, statusMessage = statusMessage)
    if (code != null) __obj.updateDynamic("code")(code)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (response != null) __obj.updateDynamic("response")(response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MaxRedirectsError]
  }
}

