package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsSimpleShapesOptions extends StObject {
  
  var circle: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesCircleOptions] = js.undefined
  
  var ellipse: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesEllipseOptions] = js.undefined
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[Any]] = js.undefined
  
  var label: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesLabelOptions] = js.undefined
  
  var rectangle: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesRectangleOptions] = js.undefined
}
object StockToolsGuiDefinitionsSimpleShapesOptions {
  
  inline def apply(): StockToolsGuiDefinitionsSimpleShapesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsSimpleShapesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StockToolsGuiDefinitionsSimpleShapesOptions] (val x: Self) extends AnyVal {
    
    inline def setCircle(value: StockToolsGuiDefinitionsSimpleShapesCircleOptions): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    inline def setEllipse(value: StockToolsGuiDefinitionsSimpleShapesEllipseOptions): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
    
    inline def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: StockToolsGuiDefinitionsSimpleShapesLabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRectangle(value: StockToolsGuiDefinitionsSimpleShapesRectangleOptions): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
  }
}
