package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesItemHighlight extends StObject {
  
  var border: js.UndefOr[ChartSeriesItemHighlightBorder] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var inactiveOpacity: js.UndefOr[Double] = js.undefined
  
  var line: js.UndefOr[ChartSeriesItemHighlightLine] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var toggle: js.UndefOr[js.Function] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var visual: js.UndefOr[js.Function] = js.undefined
}
object ChartSeriesItemHighlight {
  
  inline def apply(): ChartSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemHighlight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartSeriesItemHighlight] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: ChartSeriesItemHighlightBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setInactiveOpacity(value: Double): Self = StObject.set(x, "inactiveOpacity", value.asInstanceOf[js.Any])
    
    inline def setInactiveOpacityUndefined: Self = StObject.set(x, "inactiveOpacity", js.undefined)
    
    inline def setLine(value: ChartSeriesItemHighlightLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setToggle(value: js.Function): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    inline def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
