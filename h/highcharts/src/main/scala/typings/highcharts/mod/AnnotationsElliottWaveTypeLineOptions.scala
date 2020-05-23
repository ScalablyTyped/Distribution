package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsElliottWaveTypeLineOptions extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object AnnotationsElliottWaveTypeLineOptions {
  @scala.inline
  def apply(fill: String = null, strokeWidth: js.UndefOr[Double] = js.undefined): AnnotationsElliottWaveTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsElliottWaveTypeLineOptions]
  }
}

