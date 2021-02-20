package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesItemHighlight extends StObject {
  
  var border: js.UndefOr[ChartSeriesItemHighlightBorder] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var line: js.UndefOr[ChartSeriesItemHighlightLine] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var toggle: js.UndefOr[js.Function] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var visual: js.UndefOr[js.Function] = js.native
}
object ChartSeriesItemHighlight {
  
  @scala.inline
  def apply(): ChartSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemHighlight]
  }
  
  @scala.inline
  implicit class ChartSeriesItemHighlightMutableBuilder[Self <: ChartSeriesItemHighlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ChartSeriesItemHighlightBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLine(value: ChartSeriesItemHighlightLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setToggle(value: js.Function): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
