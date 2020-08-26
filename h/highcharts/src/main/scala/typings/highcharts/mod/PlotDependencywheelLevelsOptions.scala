package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotDependencywheelLevelsOptions extends js.Object {
  /**
    * (Highcharts) Can set `borderColor` on all nodes which lay on the same
    * level.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts) Can set `borderWidth` on all nodes which lay on the same
    * level.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Can set `color` on all nodes which lay on the same level.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) Can set `colorByPoint` on all nodes which lay on the same
    * level.
    */
  var colorByPoint: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Can set `dataLabels` on all
    * points which lay on the same level.
    */
  var dataLabels: js.UndefOr[
    SeriesSankeyDataLabelsOptionsObject | js.Array[SeriesSankeyDataLabelsOptionsObject]
  ] = js.native
  /**
    * (Highcharts) Decides which level takes effect from the options set in the
    * levels object.
    */
  var level: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Can set `linkOpacity` on all points which lay on the same
    * level.
    */
  var linkOpacity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Can set `states` on all nodes and points which lay on the
    * same level.
    */
  var states: js.UndefOr[SeriesStatesOptionsObject] = js.native
}

object PlotDependencywheelLevelsOptions {
  @scala.inline
  def apply(): PlotDependencywheelLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotDependencywheelLevelsOptions]
  }
  @scala.inline
  implicit class PlotDependencywheelLevelsOptionsOps[Self <: PlotDependencywheelLevelsOptions] (val x: Self) extends AnyVal {
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
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorByPoint(value: Boolean): Self = this.set("colorByPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorByPoint: Self = this.set("colorByPoint", js.undefined)
    @scala.inline
    def setDataLabelsVarargs(value: SeriesSankeyDataLabelsOptionsObject*): Self = this.set("dataLabels", js.Array(value :_*))
    @scala.inline
    def setDataLabels(value: SeriesSankeyDataLabelsOptionsObject | js.Array[SeriesSankeyDataLabelsOptionsObject]): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setLinkOpacity(value: Double): Self = this.set("linkOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkOpacity: Self = this.set("linkOpacity", js.undefined)
    @scala.inline
    def setStates(value: SeriesStatesOptionsObject): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
  }
  
}

