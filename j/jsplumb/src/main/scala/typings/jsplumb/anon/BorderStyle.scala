package typings.jsplumb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderStyle extends js.Object {
  var borderStyle: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  // integer
  var padding: js.UndefOr[Double] = js.undefined
}

object BorderStyle {
  @scala.inline
  def apply(
    borderStyle: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    color: String = null,
    fill: String = null,
    font: String = null,
    padding: js.UndefOr[Double] = js.undefined
  ): BorderStyle = {
    val __obj = js.Dynamic.literal()
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderStyle]
  }
}

