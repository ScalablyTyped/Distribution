package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsGuiDefinitionsAdvancedOptions extends js.Object {
  
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
  implicit class StockToolsGuiDefinitionsAdvancedOptionsOps[Self <: StockToolsGuiDefinitionsAdvancedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFibonacci(value: StockToolsGuiDefinitionsAdvancedFibonacciOptions): Self = this.set("fibonacci", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFibonacci: Self = this.set("fibonacci", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setParallelChannel(value: StockToolsGuiDefinitionsAdvancedParallelChannelOptions): Self = this.set("parallelChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelChannel: Self = this.set("parallelChannel", js.undefined)
    
    @scala.inline
    def setPitchfork(value: StockToolsGuiDefinitionsAdvancedPitchforkOptions): Self = this.set("pitchfork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitchfork: Self = this.set("pitchfork", js.undefined)
  }
}
