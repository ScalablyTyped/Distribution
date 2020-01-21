package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineDataLabelsFormatterContextObject extends DataLabelsFormatterContextObject {
  var key: js.UndefOr[String] = js.undefined
}

object TimelineDataLabelsFormatterContextObject {
  @scala.inline
  def apply(
    point: Point,
    series: Series,
    x: Double,
    key: String = null,
    percentage: Int | Double = null,
    total: Int | Double = null,
    y: Int | Double = null
  ): TimelineDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineDataLabelsFormatterContextObject]
  }
}

