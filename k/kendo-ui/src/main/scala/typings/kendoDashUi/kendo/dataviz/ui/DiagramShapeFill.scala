package typings.kendoDashUi.kendo.dataviz.ui

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
  def apply(color: String = null, gradient: DiagramShapeFillGradient = null, opacity: Int | Double = null): DiagramShapeFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeFill]
  }
}

