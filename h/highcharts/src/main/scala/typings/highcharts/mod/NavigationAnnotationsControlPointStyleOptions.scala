package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationAnnotationsControlPointStyleOptions extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var `stroke-width`: js.UndefOr[Double] = js.undefined
}

object NavigationAnnotationsControlPointStyleOptions {
  @scala.inline
  def apply(fill: String = null, stroke: String = null, `stroke-width`: js.UndefOr[Double] = js.undefined): NavigationAnnotationsControlPointStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(`stroke-width`)) __obj.updateDynamic("stroke-width")(`stroke-width`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationAnnotationsControlPointStyleOptions]
  }
}

