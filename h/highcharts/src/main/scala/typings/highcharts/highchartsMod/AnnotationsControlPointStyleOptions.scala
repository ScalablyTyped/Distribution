package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsControlPointStyleOptions extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var `stroke-width`: js.UndefOr[Double] = js.undefined
}

object AnnotationsControlPointStyleOptions {
  @scala.inline
  def apply(fill: String = null, stroke: String = null, `stroke-width`: Int | Double = null): AnnotationsControlPointStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (`stroke-width` != null) __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsControlPointStyleOptions]
  }
}

