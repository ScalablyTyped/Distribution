package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineDataLabelsFormatterContextObject extends PointLabelObject

object TimelineDataLabelsFormatterContextObject {
  @scala.inline
  def apply(
    colorIndex: Double,
    percentage: Double,
    point: Point,
    series: Series,
    color: ColorString | GradientColorObject | PatternObject = null,
    key: String = null,
    total: js.UndefOr[Double] = js.undefined,
    x: Double | String = null,
    y: js.UndefOr[Double] = js.undefined
  ): TimelineDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(colorIndex = colorIndex.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineDataLabelsFormatterContextObject]
  }
}

