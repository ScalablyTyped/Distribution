package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see [nsIException]{@link https://developer.mozilla.org/en-US/docs/Mozilla/Tech/XPCOM/Reference/Interface/nsIException}
  */
trait NSIException extends js.Object {
  var columnNumber: scala.Double
  var data: js.Any
  var filename: java.lang.String
  var inner: js.UndefOr[NSIException] = js.undefined
  var lineNumber: scala.Double
  var location: js.UndefOr[js.Any] = js.undefined
  var message: java.lang.String
  var name: java.lang.String
  var result: js.Any
}

object NSIException {
  @scala.inline
  def apply(
    columnNumber: scala.Double,
    data: js.Any,
    filename: java.lang.String,
    lineNumber: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    result: js.Any,
    toString: js.Function0[java.lang.String],
    inner: NSIException = null,
    location: js.Any = null
  ): NSIException = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber, data = data, filename = filename, lineNumber = lineNumber, message = message, name = name, result = result, toString = toString)
    if (inner != null) __obj.updateDynamic("inner")(inner)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[NSIException]
  }
}

