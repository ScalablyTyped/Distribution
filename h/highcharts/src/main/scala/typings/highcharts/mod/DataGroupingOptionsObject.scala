package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataGroupingOptionsObject extends StObject {
  
  /**
    * (Highstock) Specifies how the points should be located on the X axis
    * inside the group. Points that are extremes can be set separately.
    * Available options:
    *
    * - `start` places the point at the beginning of the group (e.g. range
    * 00:00:00 - 23:59:59 -> 00:00:00)
    *
    * - `middle` places the point in the middle of the group (e.g. range
    * 00:00:00 - 23:59:59 -> 12:00:00)
    *
    * - `end` places the point at the end of the group (e.g. range 00:00:00 -
    * 23:59:59 -> 23:59:59)
    */
  var anchor: js.UndefOr[String | DataGroupingAnchor] = js.undefined
  
  /**
    * (Highstock) The method of approximation inside a group. When for example
    * 30 days are grouped into one month, this determines what value should
    * represent the group. Possible values are "average", "averages", "open",
    * "high", "low", "close" and "sum". For OHLC and candlestick series the
    * approximation is "ohlc" by default, which finds the open, high, low and
    * close values within all the grouped data. For ranges, the approximation
    * is "range", which finds the low and high values. For multi-dimensional
    * data, like ranges and OHLC, "averages" will compute the average for each
    * dimension.
    *
    * Custom aggregate methods can be added by assigning a callback function as
    * the approximation. This function takes a numeric array as the argument
    * and should return a single numeric value or `null`. Note that the numeric
    * array will never contain null values, only true numbers. Instead, if null
    * values are present in the raw data, the numeric array will have an
    * `.hasNulls` property set to `true`. For single-value data sets the data
    * is available in the first argument of the callback function. For OHLC
    * data sets, all the open values are in the first argument, all high values
    * in the second etc.
    *
    * Since v4.2.7, grouping meta data is available in the approximation
    * callback from `this.dataGroupInfo`. It can be used to extract information
    * from the raw data.
    *
    * Defaults to `average` for line-type series, `sum` for columns, `range`
    * for range series, `hlc` for HLC, and `ohlc` for OHLC and candlestick.
    */
  var approximation: js.UndefOr[String | DataGroupingApproximationValue | js.Function] = js.undefined
  
  /**
    * (Highstock) Datetime formats for the header of the tooltip in a stock
    * chart. The format can vary within a chart depending on the currently
    * selected time range and the current data grouping.
    *
    * The default formats are: (see online documentation for example)
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
    * (Highstock) Enable or disable data grouping.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Specifies how the first grouped point is positioned on the
    * xAxis. If firstAnchor and/or lastAnchor are defined, then those options
    * take precedence over anchor for the first and/or last grouped points.
    * Available options:
    *
    * -`start` places the point at the beginning of the group (e.g. range
    * 00:00:00 - 23:59:59 -> 00:00:00)
    *
    * -`middle` places the point in the middle of the group (e.g. range
    * 00:00:00 - 23:59:59 -> 12:00:00)
    *
    * -`end` places the point at the end of the group (e.g. range 00:00:00 -
    * 23:59:59 -> 23:59:59)
    *
    * -`firstPoint` the first point in the group (e.g. points at 00:13, 00:35,
    * 00:59 -> 00:13)
    *
    * -`lastPoint` the last point in the group (e.g. points at 00:13, 00:35,
    * 00:59 -> 00:59)
    */
  var firstAnchor: js.UndefOr[String | DataGroupingAnchorExtremes] = js.undefined
  
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
    * (Highstock) The approximate pixel width of each group. If for example a
    * series with 30 points is displayed over a 600 pixel wide plot area, no
    * grouping is performed. If however the series contains so many points that
    * the spacing is less than the groupPixelWidth, Highcharts will try to
    * group it into appropriate groups so that each is more or less two pixels
    * wide. If multiple series with different group pixel widths are drawn on
    * the same x axis, all series will take the greatest width. For example,
    * line series have 2px default group width, while column series have 10px.
    * If combined, both the line and the column will have 10px by default.
    */
  var groupPixelWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Specifies how the last grouped point is positioned on the
    * xAxis. If firstAnchor and/or lastAnchor are defined, then those options
    * take precedence over anchor for the first and/or last grouped points.
    * Available options:
    *
    * -`start` places the point at the beginning of the group (e.g. range
    * 00:00:00 - 23:59:59 -> 00:00:00)
    *
    * -`middle` places the point in the middle of the group (e.g. range
    * 00:00:00 - 23:59:59 -> 12:00:00)
    *
    * -`end` places the point at the end of the group (e.g. range 00:00:00 -
    * 23:59:59 -> 23:59:59)
    *
    * -`firstPoint` the first point in the group (e.g. points at 00:13, 00:35,
    * 00:59 -> 00:13)
    *
    * -`lastPoint` the last point in the group (e.g. points at 00:13, 00:35,
    * 00:59 -> 00:59)
    */
  var lastAnchor: js.UndefOr[String | DataGroupingAnchorExtremes] = js.undefined
  
  /**
    * (Highstock) An array determining what time intervals the data is allowed
    * to be grouped to. Each array item is an array where the first value is
    * the time unit and the second value another array of allowed multiples.
    *
    * Defaults to: (see online documentation for example)
    */
  var units: js.UndefOr[js.Array[js.Tuple2[String, js.Array[Double] | Null]]] = js.undefined
}
object DataGroupingOptionsObject {
  
  inline def apply(): DataGroupingOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataGroupingOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataGroupingOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: String | DataGroupingAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setApproximation(value: String | DataGroupingApproximationValue | js.Function): Self = StObject.set(x, "approximation", value.asInstanceOf[js.Any])
    
    inline def setApproximationUndefined: Self = StObject.set(x, "approximation", js.undefined)
    
    inline def setDateTimeLabelFormats(value: js.Object): Self = StObject.set(x, "dateTimeLabelFormats", value.asInstanceOf[js.Any])
    
    inline def setDateTimeLabelFormatsUndefined: Self = StObject.set(x, "dateTimeLabelFormats", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFirstAnchor(value: String | DataGroupingAnchorExtremes): Self = StObject.set(x, "firstAnchor", value.asInstanceOf[js.Any])
    
    inline def setFirstAnchorUndefined: Self = StObject.set(x, "firstAnchor", js.undefined)
    
    inline def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
    
    inline def setForcedUndefined: Self = StObject.set(x, "forced", js.undefined)
    
    inline def setGroupAll(value: Boolean): Self = StObject.set(x, "groupAll", value.asInstanceOf[js.Any])
    
    inline def setGroupAllUndefined: Self = StObject.set(x, "groupAll", js.undefined)
    
    inline def setGroupPixelWidth(value: Double): Self = StObject.set(x, "groupPixelWidth", value.asInstanceOf[js.Any])
    
    inline def setGroupPixelWidthUndefined: Self = StObject.set(x, "groupPixelWidth", js.undefined)
    
    inline def setLastAnchor(value: String | DataGroupingAnchorExtremes): Self = StObject.set(x, "lastAnchor", value.asInstanceOf[js.Any])
    
    inline def setLastAnchorUndefined: Self = StObject.set(x, "lastAnchor", js.undefined)
    
    inline def setUnits(value: js.Array[js.Tuple2[String, js.Array[Double] | Null]]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setUnitsVarargs(value: (js.Tuple2[String, js.Array[Double] | Null])*): Self = StObject.set(x, "units", js.Array(value*))
  }
}
