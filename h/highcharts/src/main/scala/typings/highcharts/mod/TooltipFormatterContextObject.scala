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
    colorIndex: js.UndefOr[Double] = js.undefined,
    percentage: js.UndefOr[Double] = js.undefined,
    points: js.Array[TooltipFormatterContextObject] = null,
    total: js.UndefOr[Double] = js.undefined
  ): TooltipFormatterContextObject = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipFormatterContextObject]
  }
}

