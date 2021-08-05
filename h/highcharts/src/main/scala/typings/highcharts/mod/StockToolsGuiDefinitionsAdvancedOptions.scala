package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsAdvancedOptions extends StObject {
  
  var fibonacci: js.UndefOr[StockToolsGuiDefinitionsAdvancedFibonacciOptions] = js.undefined
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var parallelChannel: js.UndefOr[StockToolsGuiDefinitionsAdvancedParallelChannelOptions] = js.undefined
  
  var pitchfork: js.UndefOr[StockToolsGuiDefinitionsAdvancedPitchforkOptions] = js.undefined
}
object StockToolsGuiDefinitionsAdvancedOptions {
  
  inline def apply(): StockToolsGuiDefinitionsAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsAdvancedOptions]
  }
  
  extension [Self <: StockToolsGuiDefinitionsAdvancedOptions](x: Self) {
    
    inline def setFibonacci(value: StockToolsGuiDefinitionsAdvancedFibonacciOptions): Self = StObject.set(x, "fibonacci", value.asInstanceOf[js.Any])
    
    inline def setFibonacciUndefined: Self = StObject.set(x, "fibonacci", js.undefined)
    
    inline def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setParallelChannel(value: StockToolsGuiDefinitionsAdvancedParallelChannelOptions): Self = StObject.set(x, "parallelChannel", value.asInstanceOf[js.Any])
    
    inline def setParallelChannelUndefined: Self = StObject.set(x, "parallelChannel", js.undefined)
    
    inline def setPitchfork(value: StockToolsGuiDefinitionsAdvancedPitchforkOptions): Self = StObject.set(x, "pitchfork", value.asInstanceOf[js.Any])
    
    inline def setPitchforkUndefined: Self = StObject.set(x, "pitchfork", js.undefined)
  }
}
