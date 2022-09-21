package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartIsInsideOptionsObject extends StObject {
  
  var ignoreX: js.UndefOr[Boolean] = js.undefined
  
  var ignoreY: js.UndefOr[Boolean] = js.undefined
  
  var inverted: js.UndefOr[Boolean] = js.undefined
  
  var paneCoordinates: js.UndefOr[Boolean] = js.undefined
  
  var series: js.UndefOr[Series] = js.undefined
  
  var visiblePlotOnly: js.UndefOr[Boolean] = js.undefined
}
object ChartIsInsideOptionsObject {
  
  inline def apply(): ChartIsInsideOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartIsInsideOptionsObject]
  }
  
  extension [Self <: ChartIsInsideOptionsObject](x: Self) {
    
    inline def setIgnoreX(value: Boolean): Self = StObject.set(x, "ignoreX", value.asInstanceOf[js.Any])
    
    inline def setIgnoreXUndefined: Self = StObject.set(x, "ignoreX", js.undefined)
    
    inline def setIgnoreY(value: Boolean): Self = StObject.set(x, "ignoreY", value.asInstanceOf[js.Any])
    
    inline def setIgnoreYUndefined: Self = StObject.set(x, "ignoreY", js.undefined)
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    inline def setPaneCoordinates(value: Boolean): Self = StObject.set(x, "paneCoordinates", value.asInstanceOf[js.Any])
    
    inline def setPaneCoordinatesUndefined: Self = StObject.set(x, "paneCoordinates", js.undefined)
    
    inline def setSeries(value: Series): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setVisiblePlotOnly(value: Boolean): Self = StObject.set(x, "visiblePlotOnly", value.asInstanceOf[js.Any])
    
    inline def setVisiblePlotOnlyUndefined: Self = StObject.set(x, "visiblePlotOnly", js.undefined)
  }
}
