package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String | js.Array[Double]] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var rotationOrigin: js.UndefOr[js.Array[Double]] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var strikeOut: js.UndefOr[Boolean] = js.undefined
  var textBox: js.UndefOr[TextBox] = js.undefined
  var underline: js.UndefOr[Boolean] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(
    align: String = null,
    color: String | js.Array[Double] = null,
    font: String = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    rotationOrigin: js.Array[Double] = null,
    size: js.UndefOr[Double] = js.undefined,
    strikeOut: js.UndefOr[Boolean] = js.undefined,
    textBox: TextBox = null,
    underline: js.UndefOr[Boolean] = js.undefined
  ): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (rotationOrigin != null) __obj.updateDynamic("rotationOrigin")(rotationOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strikeOut)) __obj.updateDynamic("strikeOut")(strikeOut.get.asInstanceOf[js.Any])
    if (textBox != null) __obj.updateDynamic("textBox")(textBox.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions]
  }
}

