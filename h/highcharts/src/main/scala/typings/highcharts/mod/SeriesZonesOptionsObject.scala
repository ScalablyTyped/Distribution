package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesZonesOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock) Styled mode only. A custom class name for the
    * zone.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock) Defines the color of the series.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock) A name for the dash style to use for the graph.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * (Highcharts, Highstock) Defines the fill color for the series (in area
    * type series)
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock) The value up to where the zone extends, if
    * undefined the zones stretches to the last value in the series.
    */
  var value: js.UndefOr[Double] = js.native
}

object SeriesZonesOptionsObject {
  @scala.inline
  def apply(): SeriesZonesOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesZonesOptionsObject]
  }
  @scala.inline
  implicit class SeriesZonesOptionsObjectOps[Self <: SeriesZonesOptionsObject] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDashStyle(value: DashStyleValue): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    @scala.inline
    def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

