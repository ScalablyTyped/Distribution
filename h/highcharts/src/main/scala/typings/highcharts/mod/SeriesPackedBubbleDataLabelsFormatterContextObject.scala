package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesPackedBubbleDataLabelsFormatterContextObject extends PointLabelObject {
  /**
    * The color of the node.
    */
  @JSName("color")
  var color_SeriesPackedBubbleDataLabelsFormatterContextObject: ColorString = js.native
  /**
    * The ID of the node.
    */
  @JSName("key")
  var key_SeriesPackedBubbleDataLabelsFormatterContextObject: String = js.native
}

object SeriesPackedBubbleDataLabelsFormatterContextObject {
  @scala.inline
  def apply(
    color: ColorString,
    colorIndex: Double,
    key: String,
    percentage: Double,
    point: Point,
    series: Series
  ): SeriesPackedBubbleDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorIndex = colorIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsFormatterContextObject]
  }
  @scala.inline
  implicit class SeriesPackedBubbleDataLabelsFormatterContextObjectOps[Self <: SeriesPackedBubbleDataLabelsFormatterContextObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: ColorString): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

