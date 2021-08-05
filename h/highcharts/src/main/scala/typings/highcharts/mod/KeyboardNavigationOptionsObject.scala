package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardNavigationOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
    * the chart.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the focus border
    * drawn around elements while navigating through them.
    */
  var focusBorder: js.UndefOr[KeyboardNavigationFocusBorderOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Order of tab navigation in the
    * chart. Determines which elements are tabbed to first. Available elements
    * are: `series`, `zoom`, `rangeSelector`, `chartMenu`, `legend`. In
    * addition, any custom components can be added here.
    */
  var order: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the keyboard
    * navigation of data points and series.
    */
  var seriesNavigation: js.UndefOr[KeyboardNavigationSeriesNavigationOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to wrap around
    * when reaching the end of arrow-key navigation for an element in the
    * chart.
    */
  var wrapAround: js.UndefOr[Boolean] = js.undefined
}
object KeyboardNavigationOptionsObject {
  
  inline def apply(): KeyboardNavigationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardNavigationOptionsObject]
  }
  
  extension [Self <: KeyboardNavigationOptionsObject](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFocusBorder(value: KeyboardNavigationFocusBorderOptionsObject): Self = StObject.set(x, "focusBorder", value.asInstanceOf[js.Any])
    
    inline def setFocusBorderUndefined: Self = StObject.set(x, "focusBorder", js.undefined)
    
    inline def setOrder(value: js.Array[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    inline def setSeriesNavigation(value: KeyboardNavigationSeriesNavigationOptionsObject): Self = StObject.set(x, "seriesNavigation", value.asInstanceOf[js.Any])
    
    inline def setSeriesNavigationUndefined: Self = StObject.set(x, "seriesNavigation", js.undefined)
    
    inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
    
    inline def setWrapAroundUndefined: Self = StObject.set(x, "wrapAround", js.undefined)
  }
}
