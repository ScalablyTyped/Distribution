package typings.httperr.httperrMod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An instance of the HttpError class. */
trait HttpError extends Error {
  var code: String
  /** The HTTP response status code for the HTTP error. */
  var statusCode: Double
  /** A human-readable title for the HTTP error. */
  var title: String
  def toObject(skip: (String | RegExp)*): js.Any
}

object HttpError {
  @scala.inline
  def apply(
    code: String,
    message: String,
    name: String,
    statusCode: Double,
    title: String,
    toObject: /* repeated */ String | RegExp => js.Any,
    stack: String = null
  ): HttpError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name, statusCode = statusCode, title = title, toObject = js.Any.fromFunction1(toObject))
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[HttpError]
  }
}

