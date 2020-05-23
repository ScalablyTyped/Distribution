package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeFillGradient extends js.Object {
  var center: js.UndefOr[js.Any] = js.undefined
  var end: js.UndefOr[js.Any] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[js.Any] = js.undefined
  var stops: js.UndefOr[js.Array[DiagramShapeFillGradientStop]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DiagramShapeFillGradient {
  @scala.inline
  def apply(
    center: js.Any = null,
    end: js.Any = null,
    radius: js.UndefOr[Double] = js.undefined,
    start: js.Any = null,
    stops: js.Array[DiagramShapeFillGradientStop] = null,
    `type`: String = null
  ): DiagramShapeFillGradient = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeFillGradient]
  }
}

