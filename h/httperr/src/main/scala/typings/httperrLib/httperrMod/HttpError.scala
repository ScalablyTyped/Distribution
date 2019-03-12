package typings
package httperrLib.httperrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An instance of the HttpError class. */
trait HttpError
  extends stdLib.Error {
  var code: java.lang.String
  /** The HTTP response status code for the HTTP error. */
  var statusCode: scala.Double
  /** A human-readable title for the HTTP error. */
  var title: java.lang.String
  def toObject(skip: (java.lang.String | stdLib.RegExp)*): js.Any
}

object HttpError {
  @scala.inline
  def apply(
    code: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    statusCode: scala.Double,
    title: java.lang.String,
    toObject: /* repeated */ java.lang.String | stdLib.RegExp => js.Any,
    stack: java.lang.String = null
  ): HttpError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name, statusCode = statusCode, title = title, toObject = js.Any.fromFunction1(toObject))
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[HttpError]
  }
}

