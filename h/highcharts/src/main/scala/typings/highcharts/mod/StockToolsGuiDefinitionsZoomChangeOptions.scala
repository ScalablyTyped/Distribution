package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsZoomChangeOptions extends StObject {
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[Any]] = js.undefined
  
  var zoomX: js.UndefOr[StockToolsGuiDefinitionsZoomChangeZoomXOptions] = js.undefined
  
  var zoomXY: js.UndefOr[StockToolsGuiDefinitionsZoomChangeZoomXYOptions] = js.undefined
  
  var zoomY: js.UndefOr[StockToolsGuiDefinitionsZoomChangeZoomYOptions] = js.undefined
}
object StockToolsGuiDefinitionsZoomChangeOptions {
  
  inline def apply(): StockToolsGuiDefinitionsZoomChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsZoomChangeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StockToolsGuiDefinitionsZoomChangeOptions] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setZoomX(value: StockToolsGuiDefinitionsZoomChangeZoomXOptions): Self = StObject.set(x, "zoomX", value.asInstanceOf[js.Any])
    
    inline def setZoomXUndefined: Self = StObject.set(x, "zoomX", js.undefined)
    
    inline def setZoomXY(value: StockToolsGuiDefinitionsZoomChangeZoomXYOptions): Self = StObject.set(x, "zoomXY", value.asInstanceOf[js.Any])
    
    inline def setZoomXYUndefined: Self = StObject.set(x, "zoomXY", js.undefined)
    
    inline def setZoomY(value: StockToolsGuiDefinitionsZoomChangeZoomYOptions): Self = StObject.set(x, "zoomY", value.asInstanceOf[js.Any])
    
    inline def setZoomYUndefined: Self = StObject.set(x, "zoomY", js.undefined)
  }
}
