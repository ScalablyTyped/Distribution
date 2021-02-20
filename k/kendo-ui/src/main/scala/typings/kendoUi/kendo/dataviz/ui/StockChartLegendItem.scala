package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartLegendItem extends StObject {
  
  var cursor: js.UndefOr[String] = js.native
  
  var visual: js.UndefOr[js.Function] = js.native
}
object StockChartLegendItem {
  
  @scala.inline
  def apply(): StockChartLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartLegendItem]
  }
  
  @scala.inline
  implicit class StockChartLegendItemMutableBuilder[Self <: StockChartLegendItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
