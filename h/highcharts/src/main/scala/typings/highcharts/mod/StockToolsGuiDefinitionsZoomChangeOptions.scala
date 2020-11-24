package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsGuiDefinitionsZoomChangeOptions extends js.Object {
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  
  var zoomX: js.UndefOr[StockToolsGuiDefinitionsZoomChangeZoomXOptions] = js.native
  
  var zoomXY: js.UndefOr[StockToolsGuiDefinitionsZoomChangeZoomXYOptions] = js.native
  
  var zoomY: js.UndefOr[StockToolsGuiDefinitionsZoomChangeZoomYOptions] = js.native
}
object StockToolsGuiDefinitionsZoomChangeOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsZoomChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsZoomChangeOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsZoomChangeOptionsOps[Self <: StockToolsGuiDefinitionsZoomChangeOptions] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setZoomX(value: StockToolsGuiDefinitionsZoomChangeZoomXOptions): Self = this.set("zoomX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomX: Self = this.set("zoomX", js.undefined)
    
    @scala.inline
    def setZoomXY(value: StockToolsGuiDefinitionsZoomChangeZoomXYOptions): Self = this.set("zoomXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomXY: Self = this.set("zoomXY", js.undefined)
    
    @scala.inline
    def setZoomY(value: StockToolsGuiDefinitionsZoomChangeZoomYOptions): Self = this.set("zoomY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomY: Self = this.set("zoomY", js.undefined)
  }
}
