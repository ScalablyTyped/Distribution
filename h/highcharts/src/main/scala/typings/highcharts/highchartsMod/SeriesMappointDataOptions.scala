package typings.highcharts.highchartsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesMappointDataOptions
  extends /* key */ StringDictionary[js.Any] {
  /**
    * (Highmaps) Individual color for the point. By default the color is either
    * used to denote the value, or pulled from the global `colors` array.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highmaps) Individual data label for each point. The options are the same
    * as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[js.Object] = js.undefined
  /**
    * (Highmaps) The `id` of a series in the drilldown.series array to use for
    * a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.undefined
  /**
    * (Highmaps) Individual point events
    */
  var events: js.UndefOr[SeriesMappointDataEventsOptions] = js.undefined
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
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    dataLabels: js.Object = null,
    drilldown: String = null,
    events: SeriesMappointDataEventsOptions = null,
    id: String = null,
    lat: Int | Double = null,
    lon: Int | Double = null,
    name: String = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): SeriesMappointDataOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (lon != null) __obj.updateDynamic("lon")(lon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesMappointDataOptions]
  }
}

