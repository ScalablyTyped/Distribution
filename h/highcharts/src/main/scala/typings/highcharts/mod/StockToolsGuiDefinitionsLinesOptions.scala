package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsLinesOptions extends StObject {
  
  var arrowInfinityLine: js.UndefOr[StockToolsGuiDefinitionsLinesArrowInfinityLineOptions] = js.undefined
  
  var arrowRay: js.UndefOr[StockToolsGuiDefinitionsLinesArrowRayOptions] = js.undefined
  
  var arrowSegment: js.UndefOr[StockToolsGuiDefinitionsLinesArrowSegmentOptions] = js.undefined
  
  var horizontalLine: js.UndefOr[StockToolsGuiDefinitionsLinesHorizontalLineOptions] = js.undefined
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[Any]] = js.undefined
  
  var line: js.UndefOr[StockToolsGuiDefinitionsLinesLineOptions] = js.undefined
  
  var ray: js.UndefOr[StockToolsGuiDefinitionsLinesRayOptions] = js.undefined
  
  var segment: js.UndefOr[StockToolsGuiDefinitionsLinesSegmentOptions] = js.undefined
  
  var verticalLine: js.UndefOr[StockToolsGuiDefinitionsLinesVerticalLineOptions] = js.undefined
}
object StockToolsGuiDefinitionsLinesOptions {
  
  inline def apply(): StockToolsGuiDefinitionsLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsLinesOptions]
  }
  
  extension [Self <: StockToolsGuiDefinitionsLinesOptions](x: Self) {
    
    inline def setArrowInfinityLine(value: StockToolsGuiDefinitionsLinesArrowInfinityLineOptions): Self = StObject.set(x, "arrowInfinityLine", value.asInstanceOf[js.Any])
    
    inline def setArrowInfinityLineUndefined: Self = StObject.set(x, "arrowInfinityLine", js.undefined)
    
    inline def setArrowRay(value: StockToolsGuiDefinitionsLinesArrowRayOptions): Self = StObject.set(x, "arrowRay", value.asInstanceOf[js.Any])
    
    inline def setArrowRayUndefined: Self = StObject.set(x, "arrowRay", js.undefined)
    
    inline def setArrowSegment(value: StockToolsGuiDefinitionsLinesArrowSegmentOptions): Self = StObject.set(x, "arrowSegment", value.asInstanceOf[js.Any])
    
    inline def setArrowSegmentUndefined: Self = StObject.set(x, "arrowSegment", js.undefined)
    
    inline def setHorizontalLine(value: StockToolsGuiDefinitionsLinesHorizontalLineOptions): Self = StObject.set(x, "horizontalLine", value.asInstanceOf[js.Any])
    
    inline def setHorizontalLineUndefined: Self = StObject.set(x, "horizontalLine", js.undefined)
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLine(value: StockToolsGuiDefinitionsLinesLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setRay(value: StockToolsGuiDefinitionsLinesRayOptions): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
    
    inline def setRayUndefined: Self = StObject.set(x, "ray", js.undefined)
    
    inline def setSegment(value: StockToolsGuiDefinitionsLinesSegmentOptions): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setVerticalLine(value: StockToolsGuiDefinitionsLinesVerticalLineOptions): Self = StObject.set(x, "verticalLine", value.asInstanceOf[js.Any])
    
    inline def setVerticalLineUndefined: Self = StObject.set(x, "verticalLine", js.undefined)
  }
}
