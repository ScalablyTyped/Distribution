package typings
package hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String | js.Array[scala.Double]] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var rotationOrigin: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var strikeOut: js.UndefOr[scala.Boolean] = js.undefined
  var textBox: js.UndefOr[TextBox] = js.undefined
  var underline: js.UndefOr[scala.Boolean] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    color: java.lang.String | js.Array[scala.Double] = null,
    font: java.lang.String = null,
    highlight: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null,
    rotationOrigin: js.Array[scala.Double] = null,
    size: scala.Int | scala.Double = null,
    strikeOut: js.UndefOr[scala.Boolean] = js.undefined,
    textBox: TextBox = null,
    underline: js.UndefOr[scala.Boolean] = js.undefined
  ): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationOrigin != null) __obj.updateDynamic("rotationOrigin")(rotationOrigin)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strikeOut)) __obj.updateDynamic("strikeOut")(strikeOut)
    if (textBox != null) __obj.updateDynamic("textBox")(textBox)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[TextOptions]
  }
}

