package typings.httpDashErrors.httpDashErrorsMod

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
    val __obj = js.Dynamic.literal(expose = expose, message = message, name = name, status = status, statusCode = statusCode)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[HttpError]
  }
}

