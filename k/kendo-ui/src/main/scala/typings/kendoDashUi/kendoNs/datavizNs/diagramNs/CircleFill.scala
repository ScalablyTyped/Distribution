package typings.kendoDashUi.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var gradient: js.UndefOr[CircleFillGradient] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object CircleFill {
  @scala.inline
  def apply(color: String = null, gradient: CircleFillGradient = null, opacity: Int | Double = null): CircleFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleFill]
  }
}

