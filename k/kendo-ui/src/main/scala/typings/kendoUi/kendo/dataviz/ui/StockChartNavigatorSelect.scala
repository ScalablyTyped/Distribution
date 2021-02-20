package typings.kendoUi.kendo.dataviz.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartNavigatorSelect extends StObject {
  
  var from: js.UndefOr[Date] = js.native
  
  var mousewheel: js.UndefOr[Boolean | StockChartNavigatorSelectMousewheel] = js.native
  
  var to: js.UndefOr[Date] = js.native
}
object StockChartNavigatorSelect {
  
  @scala.inline
  def apply(): StockChartNavigatorSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorSelect]
  }
  
  @scala.inline
  implicit class StockChartNavigatorSelectMutableBuilder[Self <: StockChartNavigatorSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setMousewheel(value: Boolean | StockChartNavigatorSelectMousewheel): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    @scala.inline
    def setTo(value: Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
