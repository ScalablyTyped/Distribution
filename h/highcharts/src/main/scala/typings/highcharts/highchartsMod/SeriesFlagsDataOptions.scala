package typings.highcharts.highchartsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesFlagsDataOptions
  extends /* key */ StringDictionary[js.Any] {
  var accessibility: js.UndefOr[SeriesFlagsDataAccessibilityOptions] = js.undefined
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
    * (Highstock) A description of the point to add to the screen reader
    * information about the point. Requires the Accessibility module.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Point specific options for the draggable-points module.
    * Overrides options on `series.dragDrop`.
    *
    * Requires the `draggable-points` module.
    */
  var dragDrop: js.UndefOr[SeriesFlagsDataDragDropOptions] = js.undefined
  /**
    * (Highcharts) The `id` of a series in the drilldown.series array to use
    * for a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual point events
    */
  var events: js.UndefOr[SeriesFlagsDataEventsOptions] = js.undefined
  /**
    * (Highstock) The fill color of an individual flag. By default it inherits
    * from the series color.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) The rank for this point's data label in case of collision. If
    * two data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) The longer text to be shown in the flag's tooltip.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) The short text to be shown on the flag.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) The x value of the point. For datetime axes, the
    * X value is the timestamp in milliseconds since 1970.
    */
  var x: js.UndefOr[Double] = js.undefined
}

object SeriesFlagsDataOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    accessibility: SeriesFlagsDataAccessibilityOptions = null,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorIndex: Int | Double = null,
    description: String = null,
    dragDrop: SeriesFlagsDataDragDropOptions = null,
    drilldown: String = null,
    events: SeriesFlagsDataEventsOptions = null,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    id: String = null,
    labelrank: Int | Double = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    title: String = null,
    x: Int | Double = null
  ): SeriesFlagsDataOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop)
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown)
    if (events != null) __obj.updateDynamic("events")(events)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelrank != null) __obj.updateDynamic("labelrank")(labelrank.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesFlagsDataOptions]
  }
}

