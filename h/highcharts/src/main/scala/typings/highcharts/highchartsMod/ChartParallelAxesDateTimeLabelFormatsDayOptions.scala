package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartParallelAxesDateTimeLabelFormatsDayOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object ChartParallelAxesDateTimeLabelFormatsDayOptions {
  @scala.inline
  def apply(main: String = null): ChartParallelAxesDateTimeLabelFormatsDayOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main)
    __obj.asInstanceOf[ChartParallelAxesDateTimeLabelFormatsDayOptions]
  }
}

