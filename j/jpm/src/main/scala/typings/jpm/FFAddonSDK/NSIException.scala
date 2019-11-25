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
    inner: NSIException = null,
    location: js.Any = null
  ): NSIException = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    if (inner != null) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[NSIException]
  }
}

