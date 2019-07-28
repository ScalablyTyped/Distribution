package typings.highcharts.highchartsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSolidgaugeDataOptions
  extends /* key */ StringDictionary[js.Any] {
  var accessibility: js.UndefOr[SeriesSolidgaugeDataAccessibilityOptions] = js.undefined
  /**
    * (Highcharts, Gantt) An additional, individual class name for the data
    * point's graphic representation.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual color for the point. By default
    * the color is pulled from the global `colors` array.
    *
    * In styled mode, the `color` option doesn't take effect. Instead, use
    * `colorIndex`.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Gantt) A specific color index to use for the point, so its
    * graphic representations are given the class name `highcharts-color-{n}`.
    * In styled mode this will change the color of the graphic. In non-styled
    * mode, the color by is set by the `fill` attribute, so the change in class
    * name won't have a visual effect by default.
    */
  var colorIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual data label for each point. The
    * options are the same as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject]] = js.undefined
  /**
    * (Highcharts) A description of the point to add to the screen reader
    * information about the point. Requires the Accessibility module.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Point specific options for the draggable-points module.
    * Overrides options on `series.dragDrop`.
    *
    * Requires the `draggable-points` module.
    */
  var dragDrop: js.UndefOr[SeriesSolidgaugeDataDragDropOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual point events
    */
  var events: js.UndefOr[SeriesSolidgaugeDataEventsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The inner radius of an individual point in a solid gauge.
    * Can be given as a number (pixels) or percentage string.
    */
  var innerRadius: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts) The rank for this point's data label in case of collision.
    * If two data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The name of the point as shown in the legend, tooltip,
    * dataLabels etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The outer radius of an individual point in a solid gauge.
    * Can be given as a number (pixels) or percentage string.
    */
  var radius: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) The y value of the point.
    */
  var y: js.UndefOr[Double | Null] = js.undefined
}

object SeriesSolidgaugeDataOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    accessibility: SeriesSolidgaugeDataAccessibilityOptions = null,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorIndex: Int | Double = null,
    dataLabels: DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject] = null,
    description: String = null,
    dragDrop: SeriesSolidgaugeDataDragDropOptions = null,
    events: SeriesSolidgaugeDataEventsOptions = null,
    id: String = null,
    innerRadius: Double | String = null,
    labelrank: Int | Double = null,
    name: String = null,
    radius: Double | String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    y: Int | Double = null
  ): SeriesSolidgaugeDataOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (labelrank != null) __obj.updateDynamic("labelrank")(labelrank.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSolidgaugeDataOptions]
  }
}

