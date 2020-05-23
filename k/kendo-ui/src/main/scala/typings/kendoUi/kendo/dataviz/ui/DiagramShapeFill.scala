package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var gradient: js.UndefOr[DiagramShapeFillGradient] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object DiagramShapeFill {
  @scala.inline
  def apply(
    color: String = null,
    gradient: DiagramShapeFillGradient = null,
    opacity: js.UndefOr[Double] = js.undefined
  ): DiagramShapeFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeFill]
  }
}

