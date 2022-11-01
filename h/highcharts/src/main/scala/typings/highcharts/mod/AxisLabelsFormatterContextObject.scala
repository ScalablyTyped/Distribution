package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLabelsFormatterContextObject extends StObject {
  
  /**
    * The axis item of the label
    */
  var axis: Axis
  
  /**
    * The chart instance.
    */
  var chart: Chart_
  
  /**
    * Default formatting of date/time labels.
    */
  var dateTimeLabelFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the label belongs to the first tick on the axis.
    */
  var isFirst: Boolean
  
  /**
    * Whether the label belongs to the last tick on the axis.
    */
  var isLast: Boolean
  
  /**
    * The position on the axis in terms of axis values. For category axes, a
    * zero-based index. For datetime axes, the JavaScript time in milliseconds
    * since 1970.
    */
  var pos: Double
  
  /**
    * The preformatted text as the result of the default formatting. For
    * example dates will be formatted as strings, and numbers with
    * language-specific comma separators, thousands separators and numeric
    * symbols like `k` or `M`.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The Tick instance.
    */
  var tick: Tick
  
  /**
    * This can be either a numeric value or a category string.
    */
  var value: Double | String
}
object AxisLabelsFormatterContextObject {
  
  inline def apply(
    axis: Axis,
    chart: Chart_,
    isFirst: Boolean,
    isLast: Boolean,
    pos: Double,
    tick: Tick,
    value: Double | String
  ): AxisLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], isLast = isLast.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLabelsFormatterContextObject]
  }
  
  extension [Self <: AxisLabelsFormatterContextObject](x: Self) {
    
    inline def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setChart(value: Chart_): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setDateTimeLabelFormat(value: String): Self = StObject.set(x, "dateTimeLabelFormat", value.asInstanceOf[js.Any])
    
    inline def setDateTimeLabelFormatUndefined: Self = StObject.set(x, "dateTimeLabelFormat", js.undefined)
    
    inline def setIsFirst(value: Boolean): Self = StObject.set(x, "isFirst", value.asInstanceOf[js.Any])
    
    inline def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTick(value: Tick): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
