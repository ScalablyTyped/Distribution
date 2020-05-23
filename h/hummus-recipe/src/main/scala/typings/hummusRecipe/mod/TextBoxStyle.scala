package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextBoxStyle extends js.Object {
  var dash: js.UndefOr[js.Array[Double]] = js.undefined
  var fill: js.UndefOr[String | js.Array[Double]] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[String | js.Array[Double]] = js.undefined
}

object TextBoxStyle {
  @scala.inline
  def apply(
    dash: js.Array[Double] = null,
    fill: String | js.Array[Double] = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    stroke: String | js.Array[Double] = null
  ): TextBoxStyle = {
    val __obj = js.Dynamic.literal()
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBoxStyle]
  }
}

