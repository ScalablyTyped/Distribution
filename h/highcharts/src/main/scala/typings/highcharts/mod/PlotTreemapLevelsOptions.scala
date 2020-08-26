package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTreemapLevelsOptions extends js.Object {
  /**
    * (Highcharts) Can set a `borderColor` on all points which lies on the same
    * level.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts) Set the dash style of the border of all the point which lies
    * on the level. See plotOptions.scatter.dashStyle for possible options.
    */
  var borderDashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * (Highcharts) Can set the borderWidth on all points which lies on the same
    * level.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Can set a color on all points which lies on the same level.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) A configuration object to define how the color of a child
    * varies from the parent's color. The variation is distributed among the
    * children of node. For example when setting brightness, the brightness
    * change will range from the parent's original brightness on the first
    * child, to the amount set in the `to` setting on the last node. This
    * allows a gradient-like color scheme that sets children out from each
    * other while highlighting the grouping on treemaps and sectors on sunburst
    * charts.
    */
  var colorVariation: js.UndefOr[PlotTreemapLevelsColorVariationOptions] = js.native
  /**
    * (Highcharts) Can set the options of dataLabels on each point which lies
    * on the level. plotOptions.treemap.dataLabels for possible values.
    */
  var dataLabels: js.UndefOr[
    PlotTreemapLevelsDataLabelsOptions | js.Array[PlotTreemapLevelsDataLabelsOptions]
  ] = js.native
  /**
    * (Highcharts) Can set the layoutAlgorithm option on a specific level.
    */
  var layoutAlgorithm: js.UndefOr[OptionsLayoutAlgorithmValue] = js.native
  /**
    * (Highcharts) Can set the layoutStartingDirection option on a specific
    * level.
    */
  var layoutStartingDirection: js.UndefOr[OptionsLayoutStartingDirectionValue] = js.native
  /**
    * (Highcharts) Decides which level takes effect from the options set in the
    * levels object.
    */
  var level: js.UndefOr[Double] = js.native
}

object PlotTreemapLevelsOptions {
  @scala.inline
  def apply(): PlotTreemapLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapLevelsOptions]
  }
  @scala.inline
  implicit class PlotTreemapLevelsOptionsOps[Self <: PlotTreemapLevelsOptions] (val x: Self) extends AnyVal {
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
    def setColorVariation(value: PlotTreemapLevelsColorVariationOptions): Self = this.set("colorVariation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorVariation: Self = this.set("colorVariation", js.undefined)
    @scala.inline
    def setDataLabelsVarargs(value: PlotTreemapLevelsDataLabelsOptions*): Self = this.set("dataLabels", js.Array(value :_*))
    @scala.inline
    def setDataLabels(value: PlotTreemapLevelsDataLabelsOptions | js.Array[PlotTreemapLevelsDataLabelsOptions]): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    @scala.inline
    def setLayoutAlgorithm(value: OptionsLayoutAlgorithmValue): Self = this.set("layoutAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutAlgorithm: Self = this.set("layoutAlgorithm", js.undefined)
    @scala.inline
    def setLayoutStartingDirection(value: OptionsLayoutStartingDirectionValue): Self = this.set("layoutStartingDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutStartingDirection: Self = this.set("layoutStartingDirection", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

