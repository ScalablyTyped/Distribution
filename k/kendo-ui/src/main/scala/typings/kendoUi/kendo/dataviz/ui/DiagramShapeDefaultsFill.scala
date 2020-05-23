package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var gradient: js.UndefOr[DiagramShapeDefaultsFillGradient] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object DiagramShapeDefaultsFill {
  @scala.inline
  def apply(
    color: String = null,
    gradient: DiagramShapeDefaultsFillGradient = null,
    opacity: js.UndefOr[Double] = js.undefined
  ): DiagramShapeDefaultsFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsFill]
  }
}

