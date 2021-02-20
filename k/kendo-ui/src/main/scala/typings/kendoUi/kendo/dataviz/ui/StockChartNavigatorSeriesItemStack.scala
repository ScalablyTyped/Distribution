package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartNavigatorSeriesItemStack extends StObject {
  
  var group: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object StockChartNavigatorSeriesItemStack {
  
  @scala.inline
  def apply(): StockChartNavigatorSeriesItemStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorSeriesItemStack]
  }
  
  @scala.inline
  implicit class StockChartNavigatorSeriesItemStackMutableBuilder[Self <: StockChartNavigatorSeriesItemStack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
