package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesSankeyDataLabelsFormatterContextObject extends PointLabelObject {
  /**
    * The node object. The node name, if defined, is available through
    * `this.point.name`.
    */
  @JSName("point")
  var point_SeriesSankeyDataLabelsFormatterContextObject: SankeyNodeObject = js.native
}

object SeriesSankeyDataLabelsFormatterContextObject {
  @scala.inline
  def apply(colorIndex: Double, percentage: Double, point: SankeyNodeObject, series: Series): SeriesSankeyDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(colorIndex = colorIndex.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSankeyDataLabelsFormatterContextObject]
  }
  @scala.inline
  implicit class SeriesSankeyDataLabelsFormatterContextObjectOps[Self <: SeriesSankeyDataLabelsFormatterContextObject] (val x: Self) extends AnyVal {
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
    def setPoint(value: SankeyNodeObject): Self = this.set("point", value.asInstanceOf[js.Any])
  }
  
}

