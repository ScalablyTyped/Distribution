package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesMapbubbleDataOptions extends js.Object {
  /**
    * (Highmaps) Individual color for the point. By default the color is either
    * used to denote the value, or pulled from the global `colors` array.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highmaps) Individual data label for each point. The options are the same
    * as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[DataLabelsOptionsObject] = js.undefined
  /**
    * (Highmaps) The `id` of a series in the drilldown.series array to use for
    * a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.undefined
  /**
    * (Highmaps) Individual point events
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.undefined
  /**
    * (Highmaps) An id for the point. This can be used after render time to get
    * a pointer to the point object through `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highmaps) The name of the point as shown in the legend, tooltip,
    * dataLabel etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highmaps) While the `x` and `y` values of the bubble are determined by
    * the underlying map, the `z` indicates the actual value that gives the
    * size of the bubble.
    */
  var z: js.UndefOr[Double | Null] = js.undefined
}

object SeriesMapbubbleDataOptions {
  @scala.inline
  def apply(
    color: ColorString | GradientColorObject | PatternObject = null,
    dataLabels: DataLabelsOptionsObject = null,
    drilldown: String = null,
    events: PointEventsOptionsObject = null,
    id: String = null,
    name: String = null,
    z: Int | Double = null
  ): SeriesMapbubbleDataOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesMapbubbleDataOptions]
  }
}

