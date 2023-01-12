package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartScrollablePlotAreaOptions extends StObject {
  
  /**
    * (Highcharts, Gantt) The minimum height for the plot area. If it gets
    * smaller than this, the plot area will become scrollable.
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Gantt) The minimum width for the plot area. If it gets
    * smaller than this, the plot area will become scrollable.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Gantt) The opacity of mask applied on one of the sides of
    * the plot area.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
    * area. Ranges from 0 to 1, where 0 aligns the plot area to the left and 1
    * aligns it to the right. Typically we would use 1 if the chart has right
    * aligned Y axes.
    */
  var scrollPositionX: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
    * area. Ranges from 0 to 1, where 0 aligns the plot area to the top and 1
    * aligns it to the bottom.
    */
  var scrollPositionY: js.UndefOr[Double] = js.undefined
}
object ChartScrollablePlotAreaOptions {
  
  inline def apply(): ChartScrollablePlotAreaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartScrollablePlotAreaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartScrollablePlotAreaOptions] (val x: Self) extends AnyVal {
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setScrollPositionX(value: Double): Self = StObject.set(x, "scrollPositionX", value.asInstanceOf[js.Any])
    
    inline def setScrollPositionXUndefined: Self = StObject.set(x, "scrollPositionX", js.undefined)
    
    inline def setScrollPositionY(value: Double): Self = StObject.set(x, "scrollPositionY", value.asInstanceOf[js.Any])
    
    inline def setScrollPositionYUndefined: Self = StObject.set(x, "scrollPositionY", js.undefined)
  }
}
