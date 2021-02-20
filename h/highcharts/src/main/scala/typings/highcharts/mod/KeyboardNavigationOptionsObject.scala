package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardNavigationOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
    * the chart.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the focus border
    * drawn around elements while navigating through them.
    */
  var focusBorder: js.UndefOr[KeyboardNavigationFocusBorderOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Order of tab navigation in the
    * chart. Determines which elements are tabbed to first. Available elements
    * are: `series`, `zoom`, `rangeSelector`, `chartMenu`, `legend`. In
    * addition, any custom components can be added here.
    */
  var order: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the keyboard
    * navigation of data points and series.
    */
  var seriesNavigation: js.UndefOr[KeyboardNavigationSeriesNavigationOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to wrap around
    * when reaching the end of arrow-key navigation for an element in the
    * chart.
    */
  var wrapAround: js.UndefOr[Boolean] = js.native
}
object KeyboardNavigationOptionsObject {
  
  @scala.inline
  def apply(): KeyboardNavigationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardNavigationOptionsObject]
  }
  
  @scala.inline
  implicit class KeyboardNavigationOptionsObjectMutableBuilder[Self <: KeyboardNavigationOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFocusBorder(value: KeyboardNavigationFocusBorderOptionsObject): Self = StObject.set(x, "focusBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusBorderUndefined: Self = StObject.set(x, "focusBorder", js.undefined)
    
    @scala.inline
    def setOrder(value: js.Array[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setSeriesNavigation(value: KeyboardNavigationSeriesNavigationOptionsObject): Self = StObject.set(x, "seriesNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesNavigationUndefined: Self = StObject.set(x, "seriesNavigation", js.undefined)
    
    @scala.inline
    def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapAroundUndefined: Self = StObject.set(x, "wrapAround", js.undefined)
  }
}
