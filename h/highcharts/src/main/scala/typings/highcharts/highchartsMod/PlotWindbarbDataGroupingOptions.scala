package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWindbarbDataGroupingOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Approximation function for the data grouping. The
    * default returns an average of wind speed and a vector average direction
    * weighted by wind speed.
    */
  var approximation: js.UndefOr[String | js.Function] = js.undefined
  /**
    * (Highstock) Datetime formats for the header of the tooltip in a stock
    * chart. The format can vary within a chart depending on the currently
    * selected time range and the current data grouping.
    *
    * The default formats are:
    *
    *  (see online documentation for example)
    *
    * For each of these array definitions, the first item is the format used
    * when the active time span is one unit. For instance, if the current data
    * applies to one week, the first item of the week array is used. The second
    * and third items are used when the active time span is more than two
    * units. For instance, if the current data applies to two weeks, the second
    * and third item of the week array are used, and applied to the start and
    * end date of the time span.
    */
  var dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined
  /**
    * (Highcharts, Highstock) Whether to enable data grouping.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) When data grouping is forced, it runs no matter how small the
    * intervals are. This can be handy for example when the sum should be
    * calculated for values appearing at random times within each hour.
    */
  var forced: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) By default only points within the visible range are grouped.
    * Enabling this option will force data grouping to calculate all grouped
    * points for a given dataset. That option prevents for example a column
    * series from calculating a grouped point partially. The effect is similar
    * to Series.getExtremesFromAll but does not affect yAxis extremes.
    */
  var groupAll: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) The approximate data group width.
    */
  var groupPixelWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Normally, a group is indexed by the start of that group, so
    * for example when 30 daily values are grouped into one month, that month's
    * x value will be the 1st of the month. This apparently shifts the data to
    * the left. When the smoothed option is true, this is compensated for. The
    * data is shifted to the middle of the group, and min and max values are
    * preserved. Internally, this is used in the Navigator series.
    */
  var smoothed: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) An array determining what time intervals the data is allowed
    * to be grouped to. Each array item is an array where the first value is
    * the time unit and the second value another array of allowed multiples.
    * Defaults to:
    *
    *  (see online documentation for example)
    */
  var units: js.UndefOr[js.Array[js.Tuple2[String, js.Array[Double] | Null]]] = js.undefined
}

object PlotWindbarbDataGroupingOptions {
  @scala.inline
  def apply(
    approximation: String | js.Function = null,
    dateTimeLabelFormats: js.Object = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    forced: js.UndefOr[Boolean] = js.undefined,
    groupAll: js.UndefOr[Boolean] = js.undefined,
    groupPixelWidth: Int | Double = null,
    smoothed: js.UndefOr[Boolean] = js.undefined,
    units: js.Array[js.Tuple2[String, js.Array[Double] | Null]] = null
  ): PlotWindbarbDataGroupingOptions = {
    val __obj = js.Dynamic.literal()
    if (approximation != null) __obj.updateDynamic("approximation")(approximation.asInstanceOf[js.Any])
    if (dateTimeLabelFormats != null) __obj.updateDynamic("dateTimeLabelFormats")(dateTimeLabelFormats)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(forced)) __obj.updateDynamic("forced")(forced)
    if (!js.isUndefined(groupAll)) __obj.updateDynamic("groupAll")(groupAll)
    if (groupPixelWidth != null) __obj.updateDynamic("groupPixelWidth")(groupPixelWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothed)) __obj.updateDynamic("smoothed")(smoothed)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[PlotWindbarbDataGroupingOptions]
  }
}

