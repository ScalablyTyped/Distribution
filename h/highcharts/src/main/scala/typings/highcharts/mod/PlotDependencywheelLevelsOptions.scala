package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotDependencywheelLevelsOptions extends js.Object {
  /**
    * (Highcharts) Can set `borderColor` on all nodes which lay on the same
    * level.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts) Can set `borderWidth` on all nodes which lay on the same
    * level.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Can set `color` on all nodes which lay on the same level.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) Can set `colorByPoint` on all nodes which lay on the same
    * level.
    */
  var colorByPoint: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Can set `dataLabels` on all
    * points which lay on the same level.
    */
  var dataLabels: js.UndefOr[
    SeriesSankeyDataLabelsOptionsObject | js.Array[SeriesSankeyDataLabelsOptionsObject]
  ] = js.undefined
  /**
    * (Highcharts) Decides which level takes effect from the options set in the
    * levels object.
    */
  var level: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Can set `linkOpacity` on all points which lay on the same
    * level.
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Can set `states` on all nodes and points which lay on the
    * same level.
    */
  var states: js.UndefOr[SeriesStatesOptionsObject] = js.undefined
}

object PlotDependencywheelLevelsOptions {
  @scala.inline
  def apply(
    borderColor: ColorString = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorByPoint: js.UndefOr[Boolean] = js.undefined,
    dataLabels: SeriesSankeyDataLabelsOptionsObject | js.Array[SeriesSankeyDataLabelsOptionsObject] = null,
    level: js.UndefOr[Double] = js.undefined,
    linkOpacity: js.UndefOr[Double] = js.undefined,
    states: SeriesStatesOptionsObject = null
  ): PlotDependencywheelLevelsOptions = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByPoint)) __obj.updateDynamic("colorByPoint")(colorByPoint.get.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkOpacity)) __obj.updateDynamic("linkOpacity")(linkOpacity.get.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotDependencywheelLevelsOptions]
  }
}

