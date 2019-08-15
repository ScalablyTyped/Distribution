package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesOrganizationDataOptions extends js.Object {
  var accessibility: js.UndefOr[SeriesOrganizationDataAccessibilityOptions] = js.undefined
  /**
    * (Highcharts, Gantt) An additional, individual class name for the data
    * point's graphic representation.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The color for the individual _link_. By default, the link
    * color is the same as the node it extends from. The `series.fillOpacity`
    * option also applies to the points, so when setting a specific link color,
    * consider setting the `fillOpacity` to 1.
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
    * (Highcharts) Individual data label for each point. The options are the
    * same as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[
    SeriesOrganizationDataLabelsOptionsObject | js.Array[SeriesOrganizationDataLabelsOptionsObject]
  ] = js.undefined
  /**
    * (Highcharts) A description of the point to add to the screen reader
    * information about the point. Requires the Accessibility module.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual point events
    */
  var events: js.UndefOr[SeriesOrganizationDataEventsOptions] = js.undefined
  /**
    * (Highcharts) The node that the link runs from.
    */
  var from: js.UndefOr[String] = js.undefined
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
    * (Highcharts) The name of the point as shown in the legend, tooltip,
    * dataLabels etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Whether the link goes out of the system.
    */
  var outgoing: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The node that the link runs to.
    */
  var to: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The weight of the link.
    */
  var weight: js.UndefOr[Double | Null] = js.undefined
}

object SeriesOrganizationDataOptions {
  @scala.inline
  def apply(
    accessibility: SeriesOrganizationDataAccessibilityOptions = null,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorIndex: Int | Double = null,
    dataLabels: SeriesOrganizationDataLabelsOptionsObject | js.Array[SeriesOrganizationDataLabelsOptionsObject] = null,
    description: String = null,
    events: SeriesOrganizationDataEventsOptions = null,
    from: String = null,
    id: String = null,
    labelrank: Int | Double = null,
    name: String = null,
    outgoing: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    to: String = null,
    weight: Int | Double = null
  ): SeriesOrganizationDataOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (events != null) __obj.updateDynamic("events")(events)
    if (from != null) __obj.updateDynamic("from")(from)
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelrank != null) __obj.updateDynamic("labelrank")(labelrank.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(outgoing)) __obj.updateDynamic("outgoing")(outgoing)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (to != null) __obj.updateDynamic("to")(to)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesOrganizationDataOptions]
  }
}

