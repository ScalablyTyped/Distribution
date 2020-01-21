package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradientOptions extends js.Object {
  var center: js.UndefOr[js.Any | Point] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var stops: js.UndefOr[js.Any] = js.undefined
}

object RadialGradientOptions {
  @scala.inline
  def apply(
    center: js.Any | Point = null,
    name: String = null,
    radius: Int | Double = null,
    stops: js.Any = null
  ): RadialGradientOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradientOptions]
  }
}

