package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilitySeriesOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to add series
    * descriptions to charts with a single series.
    */
  var describeSingleSeries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format to use for describing the
    * data series group to assistive technology - including screen readers.
    *
    * The series context and its subproperties are available under the variable
    * `{series}`, for example `{series.name}` for the series name, and
    * `{series.points.length}` for the number of data points.
    *
    * The chart context and its subproperties are available under the variable
    * `{chart}`, for example `{chart.series.length}` for the number of series
    * in the chart.
    *
    * `{seriesDescription}` refers to the automatic description of the series
    * type and number of points added by Highcharts by default.
    * `{authorDescription}` refers to the description added in
    * series.description if one is present. `{axisDescription}` refers to the
    * description added if the chart has multiple X or Y axes.
    *
    * Note that if series.descriptionFormatter is declared it will take
    * precedence, and this option will be overridden.
    */
  var descriptionFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
    * instead of the default for series descriptions. Receives one argument,
    * `series`, referring to the series to describe. Should return a string
    * with the description of the series for a screen reader user. If `false`
    * is returned, the default formatter will be used for that series.
    */
  var descriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Series]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
    * points than this, we no longer expose information about individual points
    * to screen readers.
    *
    * Set to `false` to disable.
    */
  var pointDescriptionEnabledThreshold: js.UndefOr[Boolean | Double] = js.undefined
}
object AccessibilitySeriesOptions {
  
  inline def apply(): AccessibilitySeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilitySeriesOptions]
  }
  
  extension [Self <: AccessibilitySeriesOptions](x: Self) {
    
    inline def setDescribeSingleSeries(value: Boolean): Self = StObject.set(x, "describeSingleSeries", value.asInstanceOf[js.Any])
    
    inline def setDescribeSingleSeriesUndefined: Self = StObject.set(x, "describeSingleSeries", js.undefined)
    
    inline def setDescriptionFormat(value: String): Self = StObject.set(x, "descriptionFormat", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFormatUndefined: Self = StObject.set(x, "descriptionFormat", js.undefined)
    
    inline def setDescriptionFormatter(value: Series => String): Self = StObject.set(x, "descriptionFormatter", js.Any.fromFunction1(value))
    
    inline def setDescriptionFormatterUndefined: Self = StObject.set(x, "descriptionFormatter", js.undefined)
    
    inline def setPointDescriptionEnabledThreshold(value: Boolean | Double): Self = StObject.set(x, "pointDescriptionEnabledThreshold", value.asInstanceOf[js.Any])
    
    inline def setPointDescriptionEnabledThresholdUndefined: Self = StObject.set(x, "pointDescriptionEnabledThreshold", js.undefined)
  }
}
