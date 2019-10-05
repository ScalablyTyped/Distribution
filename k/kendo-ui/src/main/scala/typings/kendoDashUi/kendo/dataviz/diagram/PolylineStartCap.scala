package typings.kendoDashUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineStartCap extends js.Object {
  var fill: js.UndefOr[String | PolylineStartCapFill] = js.undefined
  var stroke: js.UndefOr[String | PolylineStartCapStroke] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PolylineStartCap {
  @scala.inline
  def apply(
    fill: String | PolylineStartCapFill = null,
    stroke: String | PolylineStartCapStroke = null,
    `type`: String = null
  ): PolylineStartCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PolylineStartCap]
  }
}

