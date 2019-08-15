package typings.highcharts.highchartsMod

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
    val __obj = js.Dynamic.literal(length = length, start = start)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[DataGroupingInfoObject]
  }
}

