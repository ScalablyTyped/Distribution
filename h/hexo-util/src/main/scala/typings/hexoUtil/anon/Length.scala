package typings.hexoUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var omission: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object Length {
  @scala.inline
  def apply(length: js.UndefOr[Double] = js.undefined, omission: String = null, separator: String = null): Length = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (omission != null) __obj.updateDynamic("omission")(omission.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

