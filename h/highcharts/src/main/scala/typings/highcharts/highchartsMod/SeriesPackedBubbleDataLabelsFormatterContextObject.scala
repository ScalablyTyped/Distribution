package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPackedBubbleDataLabelsFormatterContextObject extends DataLabelsFormatterContextObject {
  /**
    * The color of the node.
    */
  var color: ColorString
  /**
    * The ID of the node.
    */
  var key: String
}

object SeriesPackedBubbleDataLabelsFormatterContextObject {
  @scala.inline
  def apply(
    color: ColorString,
    key: String,
    point: Point,
    series: Series,
    x: Double,
    percentage: Int | Double = null,
    total: Int | Double = null,
    y: Int | Double = null
  ): SeriesPackedBubbleDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsFormatterContextObject]
  }
}

