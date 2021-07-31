package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YAxisResizeOptions extends StObject {
  
  /**
    * (Highstock) Contains two arrays of axes that are controlled by control
    * line of the axis.
    */
  var controlledAxis: js.UndefOr[YAxisResizeControlledAxisOptions] = js.undefined
  
  /**
    * (Highstock) Cursor style for the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var cursor: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Enable or disable resize by drag for the axis.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Color of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highstock) Dash style of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineDashStyle: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Width of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Horizontal offset of the control line.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Vertical offset of the control line.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object YAxisResizeOptions {
  
  @scala.inline
  def apply(): YAxisResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisResizeOptions]
  }
  
  @scala.inline
  implicit class YAxisResizeOptionsMutableBuilder[Self <: YAxisResizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlledAxis(value: YAxisResizeControlledAxisOptions): Self = StObject.set(x, "controlledAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlledAxisUndefined: Self = StObject.set(x, "controlledAxis", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorString): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineDashStyle(value: String): Self = StObject.set(x, "lineDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashStyleUndefined: Self = StObject.set(x, "lineDashStyle", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
