package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressiveLoadStatusChangedEventUIParam extends StObject {
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get current status.
    */
  var currentStatus: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.undefined
}
object ProgressiveLoadStatusChangedEventUIParam {
  
  inline def apply(): ProgressiveLoadStatusChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressiveLoadStatusChangedEventUIParam]
  }
  
  extension [Self <: ProgressiveLoadStatusChangedEventUIParam](x: Self) {
    
    inline def setChart(value: js.Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    inline def setCurrentStatus(value: js.Any): Self = StObject.set(x, "currentStatus", value.asInstanceOf[js.Any])
    
    inline def setCurrentStatusUndefined: Self = StObject.set(x, "currentStatus", js.undefined)
    
    inline def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
  }
}
