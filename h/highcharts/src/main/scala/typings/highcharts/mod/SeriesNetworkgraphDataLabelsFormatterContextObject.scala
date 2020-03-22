package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesNetworkgraphDataLabelsFormatterContextObject extends PointLabelObject {
  /**
    * The color of the node.
    */
  @JSName("color")
  var color_SeriesNetworkgraphDataLabelsFormatterContextObject: ColorString
  /**
    * The ID of the node.
    */
  @JSName("key")
  var key_SeriesNetworkgraphDataLabelsFormatterContextObject: String
}

object SeriesNetworkgraphDataLabelsFormatterContextObject {
  @scala.inline
  def apply(
    color: ColorString,
    colorIndex: Double,
    key: String,
    percentage: Double,
    point: Point,
    series: Series,
    total: Int | Double = null,
    x: Double | String = null,
    y: Int | Double = null
  ): SeriesNetworkgraphDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorIndex = colorIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesNetworkgraphDataLabelsFormatterContextObject]
  }
}

