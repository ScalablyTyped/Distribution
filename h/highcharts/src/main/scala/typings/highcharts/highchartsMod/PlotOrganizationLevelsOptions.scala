package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotOrganizationLevelsOptions extends js.Object {
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
    * (Highcharts) Can set `dataLabels` on all points which lay on the same
    * level.
    */
  var dataLabels: js.UndefOr[SeriesSankeyDataLabelsOptionsObject] = js.undefined
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
  var states: js.UndefOr[PointStatesOptionsObject] = js.undefined
}

object PlotOrganizationLevelsOptions {
  @scala.inline
  def apply(
    borderColor: ColorString = null,
    borderWidth: Int | Double = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorByPoint: js.UndefOr[Boolean] = js.undefined,
    dataLabels: SeriesSankeyDataLabelsOptionsObject = null,
    level: Int | Double = null,
    linkOpacity: Int | Double = null,
    states: PointStatesOptionsObject = null
  ): PlotOrganizationLevelsOptions = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByPoint)) __obj.updateDynamic("colorByPoint")(colorByPoint)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (linkOpacity != null) __obj.updateDynamic("linkOpacity")(linkOpacity.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states)
    __obj.asInstanceOf[PlotOrganizationLevelsOptions]
  }
}

