package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressTimeseries extends StObject {
  
  /** The current progress of the component, in the range [0,1]. */
  var currentProgress: js.UndefOr[Double] = js.undefined
  
  /** History of progress for the component. Points are sorted by time. */
  var dataPoints: js.UndefOr[js.Array[Point]] = js.undefined
}
object ProgressTimeseries {
  
  inline def apply(): ProgressTimeseries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressTimeseries]
  }
  
  extension [Self <: ProgressTimeseries](x: Self) {
    
    inline def setCurrentProgress(value: Double): Self = StObject.set(x, "currentProgress", value.asInstanceOf[js.Any])
    
    inline def setCurrentProgressUndefined: Self = StObject.set(x, "currentProgress", js.undefined)
    
    inline def setDataPoints(value: js.Array[Point]): Self = StObject.set(x, "dataPoints", value.asInstanceOf[js.Any])
    
    inline def setDataPointsUndefined: Self = StObject.set(x, "dataPoints", js.undefined)
    
    inline def setDataPointsVarargs(value: Point*): Self = StObject.set(x, "dataPoints", js.Array(value :_*))
  }
}
