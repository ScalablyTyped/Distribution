package typings.kendoDashUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var gradient: js.UndefOr[ShapeFillGradient] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object ShapeFill {
  @scala.inline
  def apply(color: String = null, gradient: ShapeFillGradient = null, opacity: Int | Double = null): ShapeFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeFill]
  }
}

