package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsGuiDefinitionsZoomChangeOptions extends StObject {
  
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
  implicit class StockToolsGuiDefinitionsZoomChangeOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsZoomChangeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setZoomX(value: StockToolsGuiDefinitionsZoomChangeZoomXOptions): Self = StObject.set(x, "zoomX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomXUndefined: Self = StObject.set(x, "zoomX", js.undefined)
    
    @scala.inline
    def setZoomXY(value: StockToolsGuiDefinitionsZoomChangeZoomXYOptions): Self = StObject.set(x, "zoomXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomXYUndefined: Self = StObject.set(x, "zoomXY", js.undefined)
    
    @scala.inline
    def setZoomY(value: StockToolsGuiDefinitionsZoomChangeZoomYOptions): Self = StObject.set(x, "zoomY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomYUndefined: Self = StObject.set(x, "zoomY", js.undefined)
  }
}
