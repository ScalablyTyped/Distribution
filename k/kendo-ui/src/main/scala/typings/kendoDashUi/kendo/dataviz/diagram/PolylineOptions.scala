package typings.kendoDashUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineOptions extends js.Object {
  var endCap: js.UndefOr[String | PolylineEndCap] = js.undefined
  var fill: js.UndefOr[String | PolylineFill] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var startCap: js.UndefOr[String | PolylineStartCap] = js.undefined
  var stroke: js.UndefOr[PolylineStroke] = js.undefined
}

object PolylineOptions {
  @scala.inline
  def apply(
    endCap: String | PolylineEndCap = null,
    fill: String | PolylineFill = null,
    name: String = null,
    startCap: String | PolylineStartCap = null,
    stroke: PolylineStroke = null
  ): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (endCap != null) __obj.updateDynamic("endCap")(endCap.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (startCap != null) __obj.updateDynamic("startCap")(startCap.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineOptions]
  }
}

