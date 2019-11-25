package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTreemapLevelsOptions extends js.Object {
  /**
    * (Highcharts) Can set a `borderColor` on all points which lies on the same
    * level.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts) Set the dash style of the border of all the point which lies
    * on the level. See (see online documentation for example) for possible
    * options.
    */
  var borderDashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts) Can set the borderWidth on all points which lies on the same
    * level.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Can set a color on all points which lies on the same level.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
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
  var colorVariation: js.UndefOr[PlotTreemapLevelsColorVariationOptions] = js.undefined
  /**
    * (Highcharts) Can set the options of dataLabels on each point which lies
    * on the level. plotOptions.treemap.dataLabels for possible values.
    */
  var dataLabels: js.UndefOr[DataLabelsOptionsObject] = js.undefined
  /**
    * (Highcharts) Can set the layoutAlgorithm option on a specific level.
    */
  var layoutAlgorithm: js.UndefOr[OptionsLayoutAlgorithmValue] = js.undefined
  /**
    * (Highcharts) Can set the layoutStartingDirection option on a specific
    * level.
    */
  var layoutStartingDirection: js.UndefOr[OptionsLayoutStartingDirectionValue] = js.undefined
  /**
    * (Highcharts) Decides which level takes effect from the options set in the
    * levels object.
    */
  var level: js.UndefOr[Double] = js.undefined
}

object PlotTreemapLevelsOptions {
  @scala.inline
  def apply(
    borderColor: ColorString = null,
    borderDashStyle: DashStyleValue = null,
    borderWidth: Int | Double = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorVariation: PlotTreemapLevelsColorVariationOptions = null,
    dataLabels: DataLabelsOptionsObject = null,
    layoutAlgorithm: OptionsLayoutAlgorithmValue = null,
    layoutStartingDirection: OptionsLayoutStartingDirectionValue = null,
    level: Int | Double = null
  ): PlotTreemapLevelsOptions = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderDashStyle != null) __obj.updateDynamic("borderDashStyle")(borderDashStyle.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorVariation != null) __obj.updateDynamic("colorVariation")(colorVariation.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (layoutAlgorithm != null) __obj.updateDynamic("layoutAlgorithm")(layoutAlgorithm.asInstanceOf[js.Any])
    if (layoutStartingDirection != null) __obj.updateDynamic("layoutStartingDirection")(layoutStartingDirection.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTreemapLevelsOptions]
  }
}

