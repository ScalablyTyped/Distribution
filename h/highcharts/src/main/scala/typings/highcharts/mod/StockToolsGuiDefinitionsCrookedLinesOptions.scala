package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsCrookedLinesOptions extends StObject {
  
  var crooked3: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesCrooked3Options] = js.undefined
  
  var crooked5: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesCrooked5Options] = js.undefined
  
  var elliott3: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesElliott3Options] = js.undefined
  
  var elliott5: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesElliott5Options] = js.undefined
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[Any]] = js.undefined
}
object StockToolsGuiDefinitionsCrookedLinesOptions {
  
  inline def apply(): StockToolsGuiDefinitionsCrookedLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsCrookedLinesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StockToolsGuiDefinitionsCrookedLinesOptions] (val x: Self) extends AnyVal {
    
    inline def setCrooked3(value: StockToolsGuiDefinitionsCrookedLinesCrooked3Options): Self = StObject.set(x, "crooked3", value.asInstanceOf[js.Any])
    
    inline def setCrooked3Undefined: Self = StObject.set(x, "crooked3", js.undefined)
    
    inline def setCrooked5(value: StockToolsGuiDefinitionsCrookedLinesCrooked5Options): Self = StObject.set(x, "crooked5", value.asInstanceOf[js.Any])
    
    inline def setCrooked5Undefined: Self = StObject.set(x, "crooked5", js.undefined)
    
    inline def setElliott3(value: StockToolsGuiDefinitionsCrookedLinesElliott3Options): Self = StObject.set(x, "elliott3", value.asInstanceOf[js.Any])
    
    inline def setElliott3Undefined: Self = StObject.set(x, "elliott3", js.undefined)
    
    inline def setElliott5(value: StockToolsGuiDefinitionsCrookedLinesElliott5Options): Self = StObject.set(x, "elliott5", value.asInstanceOf[js.Any])
    
    inline def setElliott5Undefined: Self = StObject.set(x, "elliott5", js.undefined)
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
