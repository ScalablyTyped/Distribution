package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsGuiDefinitionsVerticalLabelsOptions extends StObject {
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  
  var verticalArrow: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions] = js.native
  
  var verticalCounter: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions] = js.native
  
  var verticalLabel: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions] = js.native
}
object StockToolsGuiDefinitionsVerticalLabelsOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsVerticalLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsVerticalLabelsOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsVerticalLabelsOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsVerticalLabelsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setVerticalArrow(value: StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions): Self = StObject.set(x, "verticalArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalArrowUndefined: Self = StObject.set(x, "verticalArrow", js.undefined)
    
    @scala.inline
    def setVerticalCounter(value: StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions): Self = StObject.set(x, "verticalCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalCounterUndefined: Self = StObject.set(x, "verticalCounter", js.undefined)
    
    @scala.inline
    def setVerticalLabel(value: StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions): Self = StObject.set(x, "verticalLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalLabelUndefined: Self = StObject.set(x, "verticalLabel", js.undefined)
  }
}
