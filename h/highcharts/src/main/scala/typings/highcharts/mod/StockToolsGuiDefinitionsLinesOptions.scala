package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsLinesOptions extends StObject {
  
  var arrowLine: js.UndefOr[StockToolsGuiDefinitionsLinesArrowLineOptions] = js.undefined
  
  var arrowRay: js.UndefOr[StockToolsGuiDefinitionsLinesArrowRayOptions] = js.undefined
  
  var arrowSegment: js.UndefOr[StockToolsGuiDefinitionsLinesArrowSegmentOptions] = js.undefined
  
  var horizontalLine: js.UndefOr[StockToolsGuiDefinitionsLinesHorizontalLineOptions] = js.undefined
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var line: js.UndefOr[StockToolsGuiDefinitionsLinesLineOptions] = js.undefined
  
  var ray: js.UndefOr[StockToolsGuiDefinitionsLinesRayOptions] = js.undefined
  
  var segment: js.UndefOr[StockToolsGuiDefinitionsLinesSegmentOptions] = js.undefined
  
  var verticalLine: js.UndefOr[StockToolsGuiDefinitionsLinesVerticalLineOptions] = js.undefined
}
object StockToolsGuiDefinitionsLinesOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsLinesOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsLinesOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsLinesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowLine(value: StockToolsGuiDefinitionsLinesArrowLineOptions): Self = StObject.set(x, "arrowLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowLineUndefined: Self = StObject.set(x, "arrowLine", js.undefined)
    
    @scala.inline
    def setArrowRay(value: StockToolsGuiDefinitionsLinesArrowRayOptions): Self = StObject.set(x, "arrowRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowRayUndefined: Self = StObject.set(x, "arrowRay", js.undefined)
    
    @scala.inline
    def setArrowSegment(value: StockToolsGuiDefinitionsLinesArrowSegmentOptions): Self = StObject.set(x, "arrowSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowSegmentUndefined: Self = StObject.set(x, "arrowSegment", js.undefined)
    
    @scala.inline
    def setHorizontalLine(value: StockToolsGuiDefinitionsLinesHorizontalLineOptions): Self = StObject.set(x, "horizontalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalLineUndefined: Self = StObject.set(x, "horizontalLine", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: StockToolsGuiDefinitionsLinesLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setRay(value: StockToolsGuiDefinitionsLinesRayOptions): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRayUndefined: Self = StObject.set(x, "ray", js.undefined)
    
    @scala.inline
    def setSegment(value: StockToolsGuiDefinitionsLinesSegmentOptions): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    @scala.inline
    def setVerticalLine(value: StockToolsGuiDefinitionsLinesVerticalLineOptions): Self = StObject.set(x, "verticalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalLineUndefined: Self = StObject.set(x, "verticalLine", js.undefined)
  }
}
