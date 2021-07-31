package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsSimpleShapesOptions extends StObject {
  
  var circle: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesCircleOptions] = js.undefined
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var label: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesLabelOptions] = js.undefined
  
  var rectangle: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesRectangleOptions] = js.undefined
}
object StockToolsGuiDefinitionsSimpleShapesOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsSimpleShapesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsSimpleShapesOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsSimpleShapesOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsSimpleShapesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircle(value: StockToolsGuiDefinitionsSimpleShapesCircleOptions): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: StockToolsGuiDefinitionsSimpleShapesLabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setRectangle(value: StockToolsGuiDefinitionsSimpleShapesRectangleOptions): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
  }
}
