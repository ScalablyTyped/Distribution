package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsFlagsOptions extends StObject {
  
  var flagCirclepin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagCirclepinOptions] = js.undefined
  
  var flagDiamondpin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagDiamondpinOptions] = js.undefined
  
  var flagSimplepin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagSimplepinOptions] = js.undefined
  
  var flagSquarepin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagSquarepinOptions] = js.undefined
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object StockToolsGuiDefinitionsFlagsOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsFlagsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsFlagsOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsFlagsOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsFlagsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlagCirclepin(value: StockToolsGuiDefinitionsFlagsFlagCirclepinOptions): Self = StObject.set(x, "flagCirclepin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagCirclepinUndefined: Self = StObject.set(x, "flagCirclepin", js.undefined)
    
    @scala.inline
    def setFlagDiamondpin(value: StockToolsGuiDefinitionsFlagsFlagDiamondpinOptions): Self = StObject.set(x, "flagDiamondpin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagDiamondpinUndefined: Self = StObject.set(x, "flagDiamondpin", js.undefined)
    
    @scala.inline
    def setFlagSimplepin(value: StockToolsGuiDefinitionsFlagsFlagSimplepinOptions): Self = StObject.set(x, "flagSimplepin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagSimplepinUndefined: Self = StObject.set(x, "flagSimplepin", js.undefined)
    
    @scala.inline
    def setFlagSquarepin(value: StockToolsGuiDefinitionsFlagsFlagSquarepinOptions): Self = StObject.set(x, "flagSquarepin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagSquarepinUndefined: Self = StObject.set(x, "flagSquarepin", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
