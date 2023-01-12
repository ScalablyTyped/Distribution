package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsMeasureOptions extends StObject {
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[Any]] = js.undefined
  
  var measureX: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureXOptions] = js.undefined
  
  var measureXY: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureXYOptions] = js.undefined
  
  var measureY: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureYOptions] = js.undefined
}
object StockToolsGuiDefinitionsMeasureOptions {
  
  inline def apply(): StockToolsGuiDefinitionsMeasureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsMeasureOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StockToolsGuiDefinitionsMeasureOptions] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMeasureX(value: StockToolsGuiDefinitionsMeasureMeasureXOptions): Self = StObject.set(x, "measureX", value.asInstanceOf[js.Any])
    
    inline def setMeasureXUndefined: Self = StObject.set(x, "measureX", js.undefined)
    
    inline def setMeasureXY(value: StockToolsGuiDefinitionsMeasureMeasureXYOptions): Self = StObject.set(x, "measureXY", value.asInstanceOf[js.Any])
    
    inline def setMeasureXYUndefined: Self = StObject.set(x, "measureXY", js.undefined)
    
    inline def setMeasureY(value: StockToolsGuiDefinitionsMeasureMeasureYOptions): Self = StObject.set(x, "measureY", value.asInstanceOf[js.Any])
    
    inline def setMeasureYUndefined: Self = StObject.set(x, "measureY", js.undefined)
  }
}
