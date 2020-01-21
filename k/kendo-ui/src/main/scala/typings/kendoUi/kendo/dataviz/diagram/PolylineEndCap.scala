package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineEndCap extends js.Object {
  var fill: js.UndefOr[String | PolylineEndCapFill] = js.undefined
  var stroke: js.UndefOr[String | PolylineEndCapStroke] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PolylineEndCap {
  @scala.inline
  def apply(
    fill: String | PolylineEndCapFill = null,
    stroke: String | PolylineEndCapStroke = null,
    `type`: String = null
  ): PolylineEndCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineEndCap]
  }
}

