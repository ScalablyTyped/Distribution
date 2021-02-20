package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsGuiDefinitionsMeasureOptions extends StObject {
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  
  var measureX: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureXOptions] = js.native
  
  var measureXY: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureXYOptions] = js.native
  
  var measureY: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureYOptions] = js.native
}
object StockToolsGuiDefinitionsMeasureOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsMeasureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsMeasureOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsMeasureOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsMeasureOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMeasureX(value: StockToolsGuiDefinitionsMeasureMeasureXOptions): Self = StObject.set(x, "measureX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureXUndefined: Self = StObject.set(x, "measureX", js.undefined)
    
    @scala.inline
    def setMeasureXY(value: StockToolsGuiDefinitionsMeasureMeasureXYOptions): Self = StObject.set(x, "measureXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureXYUndefined: Self = StObject.set(x, "measureXY", js.undefined)
    
    @scala.inline
    def setMeasureY(value: StockToolsGuiDefinitionsMeasureMeasureYOptions): Self = StObject.set(x, "measureY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureYUndefined: Self = StObject.set(x, "measureY", js.undefined)
  }
}
