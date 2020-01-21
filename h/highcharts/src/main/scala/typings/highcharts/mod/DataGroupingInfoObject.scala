package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataGroupingInfoObject extends js.Object {
  var length: Double
  var options: js.UndefOr[SeriesOptionsType] = js.undefined
  var start: Double
}

object DataGroupingInfoObject {
  @scala.inline
  def apply(length: Double, start: Double, options: SeriesOptionsType = null): DataGroupingInfoObject = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGroupingInfoObject]
  }
}

