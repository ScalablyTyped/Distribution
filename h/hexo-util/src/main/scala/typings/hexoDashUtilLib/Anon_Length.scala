package typings
package hexoDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  var length: js.UndefOr[scala.Double] = js.undefined
  var omission: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Length {
  @scala.inline
  def apply(
    length: scala.Int | scala.Double = null,
    omission: java.lang.String = null,
    separator: java.lang.String = null
  ): Anon_Length = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (omission != null) __obj.updateDynamic("omission")(omission)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[Anon_Length]
  }
}

