package typings.httpErrors.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpError
  extends Error
     with /* key */ StringDictionary[js.Any] {
  var expose: Boolean
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var status: Double
  var statusCode: Double
}

object HttpError {
  @scala.inline
  def apply(
    expose: Boolean,
    message: String,
    name: String,
    status: Double,
    statusCode: Double,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    headers: StringDictionary[String] = null,
    stack: String = null
  ): HttpError = {
    val __obj = js.Dynamic.literal(expose = expose.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpError]
  }
}

