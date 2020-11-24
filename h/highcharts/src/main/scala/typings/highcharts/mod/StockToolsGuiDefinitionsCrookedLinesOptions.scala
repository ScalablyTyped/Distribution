package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsGuiDefinitionsCrookedLinesOptions extends js.Object {
  
  var crooked3: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesCrooked3Options] = js.native
  
  var crooked5: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesCrooked5Options] = js.native
  
  var elliott3: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesElliott3Options] = js.native
  
  var elliott5: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesElliott5Options] = js.native
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
}
object StockToolsGuiDefinitionsCrookedLinesOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsCrookedLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsCrookedLinesOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsCrookedLinesOptionsOps[Self <: StockToolsGuiDefinitionsCrookedLinesOptions] (val x: Self) extends AnyVal {
    
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
    def setCrooked3(value: StockToolsGuiDefinitionsCrookedLinesCrooked3Options): Self = this.set("crooked3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrooked3: Self = this.set("crooked3", js.undefined)
    
    @scala.inline
    def setCrooked5(value: StockToolsGuiDefinitionsCrookedLinesCrooked5Options): Self = this.set("crooked5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrooked5: Self = this.set("crooked5", js.undefined)
    
    @scala.inline
    def setElliott3(value: StockToolsGuiDefinitionsCrookedLinesElliott3Options): Self = this.set("elliott3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElliott3: Self = this.set("elliott3", js.undefined)
    
    @scala.inline
    def setElliott5(value: StockToolsGuiDefinitionsCrookedLinesElliott5Options): Self = this.set("elliott5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElliott5: Self = this.set("elliott5", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
