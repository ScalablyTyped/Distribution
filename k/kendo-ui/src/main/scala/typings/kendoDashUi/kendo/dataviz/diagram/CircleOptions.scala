package typings.kendoDashUi.kendo.dataviz.diagram

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
    radius: Int | Double = null,
    stroke: CircleStroke = null
  ): CircleOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[CircleOptions]
  }
}

