package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipShownEventUIParam extends StObject {
  
  /**
    * Used to get item brush.
    */
  var actualItemBrush: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get series brush.
    */
  var actualSeriesBrush: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get reference to tooltip DOM element.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get reference to current series item object.
    */
  var item: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.undefined
}
object TooltipShownEventUIParam {
  
  inline def apply(): TooltipShownEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipShownEventUIParam]
  }
  
  extension [Self <: TooltipShownEventUIParam](x: Self) {
    
    inline def setActualItemBrush(value: js.Any): Self = StObject.set(x, "actualItemBrush", value.asInstanceOf[js.Any])
    
    inline def setActualItemBrushUndefined: Self = StObject.set(x, "actualItemBrush", js.undefined)
    
    inline def setActualSeriesBrush(value: js.Any): Self = StObject.set(x, "actualSeriesBrush", value.asInstanceOf[js.Any])
    
    inline def setActualSeriesBrushUndefined: Self = StObject.set(x, "actualSeriesBrush", js.undefined)
    
    inline def setChart(value: js.Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    inline def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
  }
}
