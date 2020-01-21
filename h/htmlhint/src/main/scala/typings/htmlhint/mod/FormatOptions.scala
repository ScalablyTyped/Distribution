package typings.htmlhint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  var colors: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
}

object FormatOptions {
  @scala.inline
  def apply(colors: js.UndefOr[Boolean] = js.undefined, indent: Int | Double = null): FormatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptions]
  }
}

