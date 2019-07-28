package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsElliottWaveTypeLineOptions extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object AnnotationsElliottWaveTypeLineOptions {
  @scala.inline
  def apply(fill: String = null, strokeWidth: Int | Double = null): AnnotationsElliottWaveTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsElliottWaveTypeLineOptions]
  }
}

