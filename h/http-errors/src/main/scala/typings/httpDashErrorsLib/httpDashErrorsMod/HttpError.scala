package typings
package httpDashErrorsLib.httpDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpError
  extends stdLib.Error
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var expose: scala.Boolean
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var status: scala.Double
  var statusCode: scala.Double
}

object HttpError {
  @scala.inline
  def apply(
    expose: scala.Boolean,
    message: java.lang.String,
    name: java.lang.String,
    status: scala.Double,
    statusCode: scala.Double,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    stack: java.lang.String = null
  ): HttpError = {
    val __obj = js.Dynamic.literal(expose = expose, message = message, name = name, status = status, statusCode = statusCode)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[HttpError]
  }
}

