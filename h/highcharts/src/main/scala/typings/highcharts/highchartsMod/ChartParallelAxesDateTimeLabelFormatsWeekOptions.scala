package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartParallelAxesDateTimeLabelFormatsWeekOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object ChartParallelAxesDateTimeLabelFormatsWeekOptions {
  @scala.inline
  def apply(main: String = null): ChartParallelAxesDateTimeLabelFormatsWeekOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartParallelAxesDateTimeLabelFormatsWeekOptions]
  }
}

