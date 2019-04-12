package typings
package hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOptions extends js.Object {
  var color: js.UndefOr[java.lang.String | js.Array[scala.Double]] = js.undefined
  var dash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[java.lang.String | js.Array[scala.Double]] = js.undefined
}

object LineOptions {
  @scala.inline
  def apply(
    color: java.lang.String | js.Array[scala.Double] = null,
    dash: js.Array[scala.Double] = null,
    lineWidth: scala.Int | scala.Double = null,
    stroke: java.lang.String | js.Array[scala.Double] = null
  ): LineOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOptions]
  }
}

