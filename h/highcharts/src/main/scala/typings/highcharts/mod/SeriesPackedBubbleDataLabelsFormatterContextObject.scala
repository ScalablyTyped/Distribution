package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPackedBubbleDataLabelsFormatterContextObject extends PointLabelObject {
  /**
    * The color of the node.
    */
  @JSName("color")
  var color_SeriesPackedBubbleDataLabelsFormatterContextObject: ColorString
  /**
    * The ID of the node.
    */
  @JSName("key")
  var key_SeriesPackedBubbleDataLabelsFormatterContextObject: String
}

object SeriesPackedBubbleDataLabelsFormatterContextObject {
  @scala.inline
  def apply(
    color: ColorString,
    colorIndex: Double,
    key: String,
    percentage: Double,
    point: Point,
    series: Series,
    total: js.UndefOr[Double] = js.undefined,
    x: Double | String = null,
    y: js.UndefOr[Double] = js.undefined
  ): SeriesPackedBubbleDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorIndex = colorIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsFormatterContextObject]
  }
}

