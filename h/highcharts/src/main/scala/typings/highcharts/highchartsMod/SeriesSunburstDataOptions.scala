package typings.highcharts.highchartsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSunburstDataOptions
  extends /* key */ StringDictionary[js.Any] {
  var accessibility: js.UndefOr[SeriesSunburstDataAccessibilityOptions] = js.undefined
  /**
    * (Highcharts, Gantt) An additional, individual class name for the data
    * point's graphic representation.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highmaps) The color of the point. In heat maps the point
    * color is rarely set explicitly, as we use the color to denote the
    * `value`. Options for this are set in the colorAxis configuration.
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
    * (Highcharts) Serves a purpose only if a `colorAxis` object is defined in
    * the chart options. This value will decide which color the point gets from
    * the scale of the colorAxis.
    */
  var colorValue: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Individual data label for each point. The options are the
    * same as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[
    SeriesSunburstDataLabelsOptionsObject | js.Array[SeriesSunburstDataLabelsOptionsObject]
  ] = js.undefined
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
  var dragDrop: js.UndefOr[SeriesSunburstDataDragDropOptions] = js.undefined
  /**
    * (Highcharts) The `id` of a series in the drilldown.series array to use
    * for a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual point events
    */
  var events: js.UndefOr[SeriesSunburstDataEventsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The rank for this point's data label in case of collision.
    * If two data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The name decides the text for a word.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Only for treemap. Use this option to build a tree structure.
    * The value should be the id of the point which is the parent. If no points
    * has a matching id, or this option is undefined, then the parent will be
    * set to the root.
    */
  var parent: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highmaps) Point padding for a single point.
    */
  var pointPadding: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Whether to display a slice offset from the center. When a
    * sunburst point is sliced, its children are also offset.
    */
  var sliced: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The value of the point, resulting in a relative area of the
    * point in the sunburst.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
  /**
    * (Highcharts) The weighting of a word. The weight decides the relative
    * size of a word compared to the rest of the collection.
    */
  var weight: js.UndefOr[Double] = js.undefined
}

object SeriesSunburstDataOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    accessibility: SeriesSunburstDataAccessibilityOptions = null,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorIndex: Int | Double = null,
    colorValue: Int | Double = null,
    dataLabels: SeriesSunburstDataLabelsOptionsObject | js.Array[SeriesSunburstDataLabelsOptionsObject] = null,
    description: String = null,
    dragDrop: SeriesSunburstDataDragDropOptions = null,
    drilldown: String = null,
    events: SeriesSunburstDataEventsOptions = null,
    id: String = null,
    labelrank: Int | Double = null,
    name: String = null,
    parent: String = null,
    pointPadding: Int | Double = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    sliced: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null,
    weight: Int | Double = null
  ): SeriesSunburstDataOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (colorValue != null) __obj.updateDynamic("colorValue")(colorValue.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop)
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelrank != null) __obj.updateDynamic("labelrank")(labelrank.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (pointPadding != null) __obj.updateDynamic("pointPadding")(pointPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(sliced)) __obj.updateDynamic("sliced")(sliced)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSunburstDataOptions]
  }
}

