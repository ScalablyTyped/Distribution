package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotSunburstLevelsOptions extends js.Object {
  /**
    * (Highcharts) Can set a `borderColor` on all points which lies on the same
    * level.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts) Can set a `borderDashStyle` on all points which lies on the
    * same level.
    */
  var borderDashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * (Highcharts) Can set a `borderWidth` on all points which lies on the same
    * level.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Can set a `color` on all points which lies on the same
    * level.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) Can set a `colorVariation` on all points which lies on the
    * same level.
    */
  var colorVariation: js.UndefOr[PlotSunburstLevelsColorVariationOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Can set `dataLabels` on all
    * points which lies on the same level.
    */
  var dataLabels: js.UndefOr[
    SeriesSunburstDataLabelsOptionsObject | js.Array[SeriesSunburstDataLabelsOptionsObject]
  ] = js.native
  /**
    * (Highcharts) Can set a `levelSize` on all points which lies on the same
    * level.
    */
  var levelSize: js.UndefOr[js.Object] = js.native
  /**
    * (Highcharts) Can set a `rotation` on all points which lies on the same
    * level.
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Can set a `rotationMode` on all points which lies on the
    * same level.
    */
  var rotationMode: js.UndefOr[String] = js.native
}

object PlotSunburstLevelsOptions {
  @scala.inline
  def apply(): PlotSunburstLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstLevelsOptions]
  }
  @scala.inline
  implicit class PlotSunburstLevelsOptionsOps[Self <: PlotSunburstLevelsOptions] (val x: Self) extends AnyVal {
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
    def setBorderColor(value: ColorString): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderDashStyle(value: DashStyleValue): Self = this.set("borderDashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderDashStyle: Self = this.set("borderDashStyle", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorVariation(value: PlotSunburstLevelsColorVariationOptions): Self = this.set("colorVariation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorVariation: Self = this.set("colorVariation", js.undefined)
    @scala.inline
    def setDataLabelsVarargs(value: SeriesSunburstDataLabelsOptionsObject*): Self = this.set("dataLabels", js.Array(value :_*))
    @scala.inline
    def setDataLabels(value: SeriesSunburstDataLabelsOptionsObject | js.Array[SeriesSunburstDataLabelsOptionsObject]): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    @scala.inline
    def setLevelSize(value: js.Object): Self = this.set("levelSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevelSize: Self = this.set("levelSize", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setRotationMode(value: String): Self = this.set("rotationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationMode: Self = this.set("rotationMode", js.undefined)
  }
  
}

