package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends js.Object {
  var center: js.UndefOr[js.Any] = js.undefined
  var fill: js.UndefOr[String | CircleFill] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[CircleStroke] = js.undefined
}

object CircleOptions {
  @scala.inline
  def apply(
    center: js.Any = null,
    fill: String | CircleFill = null,
    name: String = null,
    radius: js.UndefOr[Double] = js.undefined,
    stroke: CircleStroke = null
  ): CircleOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
}

