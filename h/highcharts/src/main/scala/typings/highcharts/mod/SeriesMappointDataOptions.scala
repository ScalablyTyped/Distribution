package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesMappointDataOptions extends js.Object {
  /**
    * (Highmaps) Individual color for the point. By default the color is either
    * used to denote the value, or pulled from the global `colors` array.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highmaps) Individual data label for each point. The options are the same
    * as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[DataLabelsOptions] = js.undefined
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
    * (Highmaps) The latitude of the point. Must be combined with the `lon`
    * option to work. Overrides `x` and `y` values.
    */
  var lat: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The longitude of the point. Must be combined with the `lon`
    * option to work. Overrides `x` and `y` values.
    */
  var lon: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The name of the point as shown in the legend, tooltip,
    * dataLabel etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highmaps) The x coordinate of the point in terms of the map path
    * coordinates.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The x coordinate of the point in terms of the map path
    * coordinates.
    */
  var y: js.UndefOr[Double | Null] = js.undefined
}

object SeriesMappointDataOptions {
  @scala.inline
  def apply(
    color: ColorString | GradientColorObject | PatternObject = null,
    dataLabels: DataLabelsOptions = null,
    drilldown: String = null,
    events: PointEventsOptionsObject = null,
    id: String = null,
    lat: js.UndefOr[Double] = js.undefined,
    lon: js.UndefOr[Double] = js.undefined,
    name: String = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Null | Double] = js.undefined
  ): SeriesMappointDataOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(lat)) __obj.updateDynamic("lat")(lat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lon)) __obj.updateDynamic("lon")(lon.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesMappointDataOptions]
  }
}

