package typings.hummusDashRecipe.hummusDashRecipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextBox extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var style: js.UndefOr[TextBoxStyle] = js.undefined
  var textAlign: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object TextBox {
  @scala.inline
  def apply(
    height: Int | Double = null,
    lineHeight: Int | Double = null,
    minHeight: Int | Double = null,
    padding: Double | js.Array[Double] = null,
    style: TextBoxStyle = null,
    textAlign: String = null,
    width: Int | Double = null
  ): TextBox = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBox]
  }
}

