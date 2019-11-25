package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartParallelAxesDateTimeLabelFormatsMonthOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object ChartParallelAxesDateTimeLabelFormatsMonthOptions {
  @scala.inline
  def apply(main: String = null): ChartParallelAxesDateTimeLabelFormatsMonthOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartParallelAxesDateTimeLabelFormatsMonthOptions]
  }
}

