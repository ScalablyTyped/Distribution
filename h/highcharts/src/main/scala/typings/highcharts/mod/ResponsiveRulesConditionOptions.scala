package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveRulesConditionOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to gain
    * complete control on when the responsive rule applies. Return `true` if it
    * applies. This opens for checking against other metrics than the chart
    * size, for example the document size or other elements.
    */
  var callback: js.UndefOr[ResponsiveCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
    * the chart height is less than this.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
    * the chart width is less than this.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
    * the chart height is greater than this.
    */
  var minHeight: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
    * the chart width is greater than this.
    */
  var minWidth: js.UndefOr[Double] = js.native
}
object ResponsiveRulesConditionOptions {
  
  @scala.inline
  def apply(): ResponsiveRulesConditionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveRulesConditionOptions]
  }
  
  @scala.inline
  implicit class ResponsiveRulesConditionOptionsMutableBuilder[Self <: ResponsiveRulesConditionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: ResponsiveCallbackFunction): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
  }
}
