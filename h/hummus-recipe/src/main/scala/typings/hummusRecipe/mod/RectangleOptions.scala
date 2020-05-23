package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectangleOptions extends js.Object {
  var color: js.UndefOr[String | js.Array[Double]] = js.undefined
  var dash: js.UndefOr[js.Array[Double]] = js.undefined
  var fill: js.UndefOr[String | js.Array[Double]] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var rotationOrigin: js.UndefOr[js.Array[Double]] = js.undefined
  var stroke: js.UndefOr[String | js.Array[Double]] = js.undefined
}

object RectangleOptions {
  @scala.inline
  def apply(
    color: String | js.Array[Double] = null,
    dash: js.Array[Double] = null,
    fill: String | js.Array[Double] = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    rotationOrigin: js.Array[Double] = null,
    stroke: String | js.Array[Double] = null
  ): RectangleOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (rotationOrigin != null) __obj.updateDynamic("rotationOrigin")(rotationOrigin.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleOptions]
  }
}

