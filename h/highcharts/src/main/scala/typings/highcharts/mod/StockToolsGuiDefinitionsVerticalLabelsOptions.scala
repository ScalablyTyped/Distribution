package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsVerticalLabelsOptions extends StObject {
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[Any]] = js.undefined
  
  var verticalArrow: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions] = js.undefined
  
  var verticalCounter: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions] = js.undefined
  
  var verticalLabel: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions] = js.undefined
}
object StockToolsGuiDefinitionsVerticalLabelsOptions {
  
  inline def apply(): StockToolsGuiDefinitionsVerticalLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsVerticalLabelsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StockToolsGuiDefinitionsVerticalLabelsOptions] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setVerticalArrow(value: StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions): Self = StObject.set(x, "verticalArrow", value.asInstanceOf[js.Any])
    
    inline def setVerticalArrowUndefined: Self = StObject.set(x, "verticalArrow", js.undefined)
    
    inline def setVerticalCounter(value: StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions): Self = StObject.set(x, "verticalCounter", value.asInstanceOf[js.Any])
    
    inline def setVerticalCounterUndefined: Self = StObject.set(x, "verticalCounter", js.undefined)
    
    inline def setVerticalLabel(value: StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions): Self = StObject.set(x, "verticalLabel", value.asInstanceOf[js.Any])
    
    inline def setVerticalLabelUndefined: Self = StObject.set(x, "verticalLabel", js.undefined)
  }
}
