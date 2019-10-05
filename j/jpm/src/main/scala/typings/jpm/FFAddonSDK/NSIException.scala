package typings.jpm.FFAddonSDK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see [nsIException]{@link https://developer.mozilla.org/en-US/docs/Mozilla/Tech/XPCOM/Reference/Interface/nsIException}
  */
trait NSIException extends js.Object {
  var columnNumber: Double
  var data: js.Any
  var filename: String
  var inner: js.UndefOr[NSIException] = js.undefined
  var lineNumber: Double
  var location: js.UndefOr[js.Any] = js.undefined
  var message: String
  var name: String
  var result: js.Any
}

object NSIException {
  @scala.inline
  def apply(
    columnNumber: Double,
    data: js.Any,
    filename: String,
    lineNumber: Double,
    message: String,
    name: String,
    result: js.Any,
    toString: () => String,
    inner: NSIException = null,
    location: js.Any = null
  ): NSIException = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber, data = data, filename = filename, lineNumber = lineNumber, message = message, name = name, result = result, toString = js.Any.fromFunction0(toString))
    if (inner != null) __obj.updateDynamic("inner")(inner)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[NSIException]
  }
}

