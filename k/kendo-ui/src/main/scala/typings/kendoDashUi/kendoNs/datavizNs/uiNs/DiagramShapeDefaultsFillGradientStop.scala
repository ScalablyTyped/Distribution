package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsFillGradientStop extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object DiagramShapeDefaultsFillGradientStop {
  @scala.inline
  def apply(color: String = null, offset: Int | Double = null, opacity: Int | Double = null): DiagramShapeDefaultsFillGradientStop = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsFillGradientStop]
  }
}

