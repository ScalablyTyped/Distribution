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
  def apply(colors: js.UndefOr[Boolean] = js.undefined, indent: js.UndefOr[Double] = js.undefined): FormatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptions]
  }
}

