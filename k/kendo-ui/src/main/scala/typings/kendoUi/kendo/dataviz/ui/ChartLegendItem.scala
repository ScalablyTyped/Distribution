package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLegendItem extends StObject {
  
  var cursor: js.UndefOr[String] = js.native
  
  var visual: js.UndefOr[js.Function] = js.native
}
object ChartLegendItem {
  
  @scala.inline
  def apply(): ChartLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendItem]
  }
  
  @scala.inline
  implicit class ChartLegendItemMutableBuilder[Self <: ChartLegendItem] (val x: Self) extends AnyVal {
    
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
