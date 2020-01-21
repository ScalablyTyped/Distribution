package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipFormatterContextObject extends js.Object {
  var color: ColorString | GradientColorObject | PatternObject
  var colorIndex: js.UndefOr[Double] = js.undefined
  var key: Double
  var percentage: js.UndefOr[Double] = js.undefined
  var point: Point
  var points: js.UndefOr[js.Array[TooltipFormatterContextObject]] = js.undefined
  var series: Series
  var total: js.UndefOr[Double] = js.undefined
  var x: Double
  var y: Double
}

object TooltipFormatterContextObject {
  @scala.inline
  def apply(
    color: ColorString | GradientColorObject | PatternObject,
    key: Double,
    point: Point,
    series: Series,
    x: Double,
    y: Double,
    colorIndex: Int | Double = null,
    percentage: Int | Double = null,
    points: js.Array[TooltipFormatterContextObject] = null,
    total: Int | Double = null
  ): TooltipFormatterContextObject = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipFormatterContextObject]
  }
}

