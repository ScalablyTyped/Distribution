package typings.lodash.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// truncate
trait TruncateOptions extends js.Object {
  /** The maximum string length. */
  var length: js.UndefOr[Double] = js.undefined
  /** The string to indicate text is omitted. */
  var omission: js.UndefOr[String] = js.undefined
  /** The separator pattern to truncate to. */
  var separator: js.UndefOr[String | RegExp] = js.undefined
}

object TruncateOptions {
  @scala.inline
  def apply(length: Int | Double = null, omission: String = null, separator: String | RegExp = null): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (omission != null) __obj.updateDynamic("omission")(omission.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateOptions]
  }
}

