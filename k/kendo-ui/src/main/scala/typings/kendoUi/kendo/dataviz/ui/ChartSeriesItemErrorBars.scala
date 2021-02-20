package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesItemErrorBars extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var endCaps: js.UndefOr[Boolean] = js.native
  
  var line: js.UndefOr[ChartSeriesItemErrorBarsLine] = js.native
  
  var value: js.UndefOr[String | Double | js.Any | js.Function] = js.native
  
  var visual: js.UndefOr[js.Function] = js.native
  
  var xValue: js.UndefOr[String | Double | js.Any | js.Function] = js.native
  
  var yValue: js.UndefOr[String | Double | js.Any | js.Function] = js.native
}
object ChartSeriesItemErrorBars {
  
  @scala.inline
  def apply(): ChartSeriesItemErrorBars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemErrorBars]
  }
  
  @scala.inline
  implicit class ChartSeriesItemErrorBarsMutableBuilder[Self <: ChartSeriesItemErrorBars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setEndCaps(value: Boolean): Self = StObject.set(x, "endCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCapsUndefined: Self = StObject.set(x, "endCaps", js.undefined)
    
    @scala.inline
    def setLine(value: ChartSeriesItemErrorBarsLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | js.Any | js.Function): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
    
    @scala.inline
    def setXValue(value: String | Double | js.Any | js.Function): Self = StObject.set(x, "xValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXValueUndefined: Self = StObject.set(x, "xValue", js.undefined)
    
    @scala.inline
    def setYValue(value: String | Double | js.Any | js.Function): Self = StObject.set(x, "yValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYValueUndefined: Self = StObject.set(x, "yValue", js.undefined)
  }
}
