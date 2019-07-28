package typings.kendoDashUi.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeFillGradient extends js.Object {
  var center: js.UndefOr[js.Any] = js.undefined
  var end: js.UndefOr[js.Any] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[js.Any] = js.undefined
  var stops: js.UndefOr[js.Array[ShapeFillGradientStop]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ShapeFillGradient {
  @scala.inline
  def apply(
    center: js.Any = null,
    end: js.Any = null,
    radius: Int | Double = null,
    start: js.Any = null,
    stops: js.Array[ShapeFillGradientStop] = null,
    `type`: String = null
  ): ShapeFillGradient = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (end != null) __obj.updateDynamic("end")(end)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start)
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ShapeFillGradient]
  }
}

