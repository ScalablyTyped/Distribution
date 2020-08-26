package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointStatesSelectOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock) Enable or disable visible feedback for selection.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) The fill color of the point marker.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highmaps) Set the marker's fixed height on select state.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The number of pixels to increase the height of
    * the hovered point.
    */
  var heightPlus: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The color of the point marker's outline. When
    * `undefined`, the series' or point's color is used.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The radius of the point marker. In hover state,
    * it defaults to the normal state's radius + 2.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highmaps) Set the marker's fixed width on select state.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The number of pixels to increase the width of the
    * hovered point.
    */
  var widthPlus: js.UndefOr[Double] = js.native
}

object PointStatesSelectOptionsObject {
  @scala.inline
  def apply(): PointStatesSelectOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointStatesSelectOptionsObject]
  }
  @scala.inline
  implicit class PointStatesSelectOptionsObjectOps[Self <: PointStatesSelectOptionsObject] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightPlus(value: Double): Self = this.set("heightPlus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightPlus: Self = this.set("heightPlus", js.undefined)
    @scala.inline
    def setLineColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWidthPlus(value: Double): Self = this.set("widthPlus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthPlus: Self = this.set("widthPlus", js.undefined)
  }
  
}

