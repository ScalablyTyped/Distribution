package typings.highcharts.highchartsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesMapDataOptions
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
  var events: js.UndefOr[SeriesMapDataEventsOptions] = js.undefined
  /**
    * (Highmaps) An id for the point. This can be used after render time to get
    * a pointer to the point object through `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highmaps) When data labels are laid out on a map, Highmaps runs a
    * simplified algorithm to detect collision. When two labels collide, the
    * one with the lowest rank is hidden. By default the rank is computed from
    * the area.
    */
  var labelrank: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The relative mid point of an area, used to place the data
    * label. Ranges from 0 to 1\. When `mapData` is used, middleX can be
    * defined there.
    */
  var middleX: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The relative mid point of an area, used to place the data
    * label. Ranges from 0 to 1\. When `mapData` is used, middleY can be
    * defined there.
    */
  var middleY: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The name of the point as shown in the legend, tooltip,
    * dataLabel etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highmaps) For map and mapline series types, the SVG path for the shape.
    * For compatibily with old IE, not all SVG path definitions are supported,
    * but M, L and C operators are safe.
    *
    * To achieve a better separation between the structure and the data, it is
    * recommended to use `mapData` to define that paths instead of defining
    * them on the data points themselves.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * (Highmaps) The numeric value of the data point.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}

object SeriesMapDataOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    dataLabels: js.Object = null,
    drilldown: String = null,
    events: SeriesMapDataEventsOptions = null,
    id: String = null,
    labelrank: Int | Double = null,
    middleX: Int | Double = null,
    middleY: Int | Double = null,
    name: String = null,
    path: String = null,
    value: Int | Double = null
  ): SeriesMapDataOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelrank != null) __obj.updateDynamic("labelrank")(labelrank.asInstanceOf[js.Any])
    if (middleX != null) __obj.updateDynamic("middleX")(middleX.asInstanceOf[js.Any])
    if (middleY != null) __obj.updateDynamic("middleY")(middleY.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesMapDataOptions]
  }
}

