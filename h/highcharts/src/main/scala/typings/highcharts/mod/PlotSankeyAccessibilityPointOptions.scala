package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSankeyAccessibilityPointOptions extends StObject {
  
  /**
    * (Highcharts) Date format to use for points on datetime axes when
    * describing them to screen reader users.
    *
    * Defaults to the same format as in tooltip.
    *
    * For an overview of the replacement codes, see dateFormat.
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) Formatter function to determine the date/time format used
    * with points on datetime axes when describing them to screen reader users.
    * Receives one argument, `point`, referring to the point to describe.
    * Should return a date format string compatible with dateFormat.
    */
  var dateFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.undefined
  
  /**
    * (Highcharts) Whether or not to describe points with the value `null` to
    * assistive technology, such as screen readers.
    */
  var describeNull: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Formatter function to use instead of the default for point
    * descriptions. Same as `accessibility.point.descriptionFormatter`, but
    * applies to a series instead of the whole chart.
    *
    * Note: Prefer using accessibility.point.valueDescriptionFormat instead if
    * possible, as default functionality such as describing annotations will be
    * preserved.
    */
  var descriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.undefined
  
  /**
    * (Highcharts) Decimals to use for the values in the point descriptions.
    * Uses tooltip.valueDecimals if not defined.
    */
  var valueDecimals: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Format to use for describing the values of data points to
    * assistive technology - including screen readers. The point context is
    * available as `{point}`.
    *
    * Other available context variables include `{index}`, `{value}`, and
    * `{xDescription}`.
    *
    * Additionally, the series name, annotation info, and description added in
    * `point.accessibility.description` is added by default if relevant. To
    * override this, use the accessibility.point.descriptionFormatter option.
    */
  var valueDescriptionFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) Prefix to add to the values in the point descriptions. Uses
    * tooltip.valuePrefix if not defined.
    */
  var valuePrefix: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) Suffix to add to the values in the point descriptions. Uses
    * tooltip.valueSuffix if not defined.
    */
  var valueSuffix: js.UndefOr[String] = js.undefined
}
object PlotSankeyAccessibilityPointOptions {
  
  inline def apply(): PlotSankeyAccessibilityPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSankeyAccessibilityPointOptions]
  }
  
  extension [Self <: PlotSankeyAccessibilityPointOptions](x: Self) {
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setDateFormatter(value: Point => String): Self = StObject.set(x, "dateFormatter", js.Any.fromFunction1(value))
    
    inline def setDateFormatterUndefined: Self = StObject.set(x, "dateFormatter", js.undefined)
    
    inline def setDescribeNull(value: Boolean): Self = StObject.set(x, "describeNull", value.asInstanceOf[js.Any])
    
    inline def setDescribeNullUndefined: Self = StObject.set(x, "describeNull", js.undefined)
    
    inline def setDescriptionFormatter(value: Point => String): Self = StObject.set(x, "descriptionFormatter", js.Any.fromFunction1(value))
    
    inline def setDescriptionFormatterUndefined: Self = StObject.set(x, "descriptionFormatter", js.undefined)
    
    inline def setValueDecimals(value: Double): Self = StObject.set(x, "valueDecimals", value.asInstanceOf[js.Any])
    
    inline def setValueDecimalsUndefined: Self = StObject.set(x, "valueDecimals", js.undefined)
    
    inline def setValueDescriptionFormat(value: String): Self = StObject.set(x, "valueDescriptionFormat", value.asInstanceOf[js.Any])
    
    inline def setValueDescriptionFormatUndefined: Self = StObject.set(x, "valueDescriptionFormat", js.undefined)
    
    inline def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
    
    inline def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
    
    inline def setValueSuffix(value: String): Self = StObject.set(x, "valueSuffix", value.asInstanceOf[js.Any])
    
    inline def setValueSuffixUndefined: Self = StObject.set(x, "valueSuffix", js.undefined)
  }
}
