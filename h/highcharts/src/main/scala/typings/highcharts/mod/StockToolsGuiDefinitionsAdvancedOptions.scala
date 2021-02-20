package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsGuiDefinitionsAdvancedOptions extends StObject {
  
  var fibonacci: js.UndefOr[StockToolsGuiDefinitionsAdvancedFibonacciOptions] = js.native
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  
  var parallelChannel: js.UndefOr[StockToolsGuiDefinitionsAdvancedParallelChannelOptions] = js.native
  
  var pitchfork: js.UndefOr[StockToolsGuiDefinitionsAdvancedPitchforkOptions] = js.native
}
object StockToolsGuiDefinitionsAdvancedOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsAdvancedOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsAdvancedOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsAdvancedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFibonacci(value: StockToolsGuiDefinitionsAdvancedFibonacciOptions): Self = StObject.set(x, "fibonacci", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFibonacciUndefined: Self = StObject.set(x, "fibonacci", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setParallelChannel(value: StockToolsGuiDefinitionsAdvancedParallelChannelOptions): Self = StObject.set(x, "parallelChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelChannelUndefined: Self = StObject.set(x, "parallelChannel", js.undefined)
    
    @scala.inline
    def setPitchfork(value: StockToolsGuiDefinitionsAdvancedPitchforkOptions): Self = StObject.set(x, "pitchfork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchforkUndefined: Self = StObject.set(x, "pitchfork", js.undefined)
  }
}
