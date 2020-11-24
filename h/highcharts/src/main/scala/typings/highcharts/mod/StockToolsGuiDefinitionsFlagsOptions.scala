package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsGuiDefinitionsFlagsOptions extends js.Object {
  
  var flagCirclepin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagCirclepinOptions] = js.native
  
  var flagDiamondpin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagDiamondpinOptions] = js.native
  
  var flagSimplepin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagSimplepinOptions] = js.native
  
  var flagSquarepin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagSquarepinOptions] = js.native
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
}
object StockToolsGuiDefinitionsFlagsOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsFlagsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsFlagsOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsFlagsOptionsOps[Self <: StockToolsGuiDefinitionsFlagsOptions] (val x: Self) extends AnyVal {
    
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
    def setFlagCirclepin(value: StockToolsGuiDefinitionsFlagsFlagCirclepinOptions): Self = this.set("flagCirclepin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagCirclepin: Self = this.set("flagCirclepin", js.undefined)
    
    @scala.inline
    def setFlagDiamondpin(value: StockToolsGuiDefinitionsFlagsFlagDiamondpinOptions): Self = this.set("flagDiamondpin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagDiamondpin: Self = this.set("flagDiamondpin", js.undefined)
    
    @scala.inline
    def setFlagSimplepin(value: StockToolsGuiDefinitionsFlagsFlagSimplepinOptions): Self = this.set("flagSimplepin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagSimplepin: Self = this.set("flagSimplepin", js.undefined)
    
    @scala.inline
    def setFlagSquarepin(value: StockToolsGuiDefinitionsFlagsFlagSquarepinOptions): Self = this.set("flagSquarepin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagSquarepin: Self = this.set("flagSquarepin", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
