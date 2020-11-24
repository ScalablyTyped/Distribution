package typings.kendoUi.kendo.dataviz.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartNavigatorSelect extends js.Object {
  
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
  implicit class StockChartNavigatorSelectOps[Self <: StockChartNavigatorSelect] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Date): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setMousewheel(value: Boolean | StockChartNavigatorSelectMousewheel): Self = this.set("mousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMousewheel: Self = this.set("mousewheel", js.undefined)
    
    @scala.inline
    def setTo(value: Date): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
