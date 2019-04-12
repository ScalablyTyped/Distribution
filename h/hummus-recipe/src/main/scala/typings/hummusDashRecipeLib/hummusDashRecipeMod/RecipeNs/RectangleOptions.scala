package typings
package hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectangleOptions extends js.Object {
  var color: js.UndefOr[java.lang.String | js.Array[scala.Double]] = js.undefined
  var dash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var fill: js.UndefOr[java.lang.String | js.Array[scala.Double]] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var rotationOrigin: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var stroke: js.UndefOr[java.lang.String | js.Array[scala.Double]] = js.undefined
}

object RectangleOptions {
  @scala.inline
  def apply(
    color: java.lang.String | js.Array[scala.Double] = null,
    dash: js.Array[scala.Double] = null,
    fill: java.lang.String | js.Array[scala.Double] = null,
    lineWidth: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null,
    rotationOrigin: js.Array[scala.Double] = null,
    stroke: java.lang.String | js.Array[scala.Double] = null
  ): RectangleOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash)
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationOrigin != null) __obj.updateDynamic("rotationOrigin")(rotationOrigin)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleOptions]
  }
}

