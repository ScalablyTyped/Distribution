package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisCrosshairOptions extends StObject {
  
  /**
    * (Highcharts) A class name for the crosshair, especially as a hook for
    * styling.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The color of the crosshair. Defaults to `#cccccc` for
    * numeric and datetime axes, and `rgba(204,214,235,0.25)` for category
    * axes, where the crosshair by default highlights the whole category.
    */
  var color: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highcharts) The dash style for the crosshair. See
    * plotOptions.series.dashStyle for possible values.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  
  /**
    * (Highstock) A label on the axis next to the crosshair.
    *
    * In styled mode, the label is styled with the
    * `.highcharts-crosshair-label` class.
    */
  var label: js.UndefOr[AxisCrosshairLabelOptions] = js.undefined
  
  /**
    * (Highcharts) Whether the crosshair should snap to the point or follow the
    * pointer independent of points.
    */
  var snap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) The pixel width of the crosshair. Defaults to 1 for numeric
    * or datetime axes, and for one category width for category axes.
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The Z index of the crosshair. Higher Z indices allow drawing
    * the crosshair on top of the series or behind the grid lines.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object AxisCrosshairOptions {
  
  inline def apply(): AxisCrosshairOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisCrosshairOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisCrosshairOptions] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: DashStyleValue): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setLabel(value: AxisCrosshairLabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
