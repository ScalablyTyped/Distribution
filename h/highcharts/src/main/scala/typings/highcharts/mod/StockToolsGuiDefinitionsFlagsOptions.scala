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
  
  inline def apply(): StockToolsGuiDefinitionsFlagsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsFlagsOptions]
  }
  
  extension [Self <: StockToolsGuiDefinitionsFlagsOptions](x: Self) {
    
    inline def setFlagCirclepin(value: StockToolsGuiDefinitionsFlagsFlagCirclepinOptions): Self = StObject.set(x, "flagCirclepin", value.asInstanceOf[js.Any])
    
    inline def setFlagCirclepinUndefined: Self = StObject.set(x, "flagCirclepin", js.undefined)
    
    inline def setFlagDiamondpin(value: StockToolsGuiDefinitionsFlagsFlagDiamondpinOptions): Self = StObject.set(x, "flagDiamondpin", value.asInstanceOf[js.Any])
    
    inline def setFlagDiamondpinUndefined: Self = StObject.set(x, "flagDiamondpin", js.undefined)
    
    inline def setFlagSimplepin(value: StockToolsGuiDefinitionsFlagsFlagSimplepinOptions): Self = StObject.set(x, "flagSimplepin", value.asInstanceOf[js.Any])
    
    inline def setFlagSimplepinUndefined: Self = StObject.set(x, "flagSimplepin", js.undefined)
    
    inline def setFlagSquarepin(value: StockToolsGuiDefinitionsFlagsFlagSquarepinOptions): Self = StObject.set(x, "flagSquarepin", value.asInstanceOf[js.Any])
    
    inline def setFlagSquarepinUndefined: Self = StObject.set(x, "flagSquarepin", js.undefined)
    
    inline def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
