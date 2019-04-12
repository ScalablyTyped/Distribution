package typings
package hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextBox extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var style: js.UndefOr[TextBoxStyle] = js.undefined
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TextBox {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    lineHeight: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    padding: scala.Double | js.Array[scala.Double] = null,
    style: TextBoxStyle = null,
    textAlign: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): TextBox = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBox]
  }
}

