package typings
package htmlhintLib.htmlhintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  var colors: js.UndefOr[scala.Boolean] = js.undefined
  var indent: js.UndefOr[scala.Double] = js.undefined
}

object FormatOptions {
  @scala.inline
  def apply(colors: js.UndefOr[scala.Boolean] = js.undefined, indent: scala.Int | scala.Double = null): FormatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors)
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptions]
  }
}

