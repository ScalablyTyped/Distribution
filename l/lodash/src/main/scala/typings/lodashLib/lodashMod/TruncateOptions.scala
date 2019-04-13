package typings
package lodashLib.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// truncate
trait TruncateOptions extends js.Object {
  /** The maximum string length. */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** The string to indicate text is omitted. */
  var omission: js.UndefOr[java.lang.String] = js.undefined
  /** The separator pattern to truncate to. */
  var separator: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
}

object TruncateOptions {
  @scala.inline
  def apply(
    length: scala.Int | scala.Double = null,
    omission: java.lang.String = null,
    separator: java.lang.String | stdLib.RegExp = null
  ): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (omission != null) __obj.updateDynamic("omission")(omission)
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateOptions]
  }
}

