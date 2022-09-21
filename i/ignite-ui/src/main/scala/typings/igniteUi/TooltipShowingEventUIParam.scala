package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipShowingEventUIParam extends StObject {
  
  /**
    * Used to get item brush.
    */
  var actualItemBrush: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get series brush.
    */
  var actualSeriesBrush: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get reference to tooltip DOM element.
    */
  var element: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get reference to current series item object.
    */
  var item: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[Any] = js.undefined
}
object TooltipShowingEventUIParam {
  
  inline def apply(): TooltipShowingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipShowingEventUIParam]
  }
  
  extension [Self <: TooltipShowingEventUIParam](x: Self) {
    
    inline def setActualItemBrush(value: Any): Self = StObject.set(x, "actualItemBrush", value.asInstanceOf[js.Any])
    
    inline def setActualItemBrushUndefined: Self = StObject.set(x, "actualItemBrush", js.undefined)
    
    inline def setActualSeriesBrush(value: Any): Self = StObject.set(x, "actualSeriesBrush", value.asInstanceOf[js.Any])
    
    inline def setActualSeriesBrushUndefined: Self = StObject.set(x, "actualSeriesBrush", js.undefined)
    
    inline def setChart(value: Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setSeries(value: Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
  }
}
