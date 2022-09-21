package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProgressTimeseries extends StObject {
  
  /**
    * The current progress of the component, in the range [0,1].
    */
  var currentProgress: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * History of progress for the component. Points are sorted by time.
    */
  var dataPoints: js.UndefOr[js.Array[SchemaPoint]] = js.undefined
}
object SchemaProgressTimeseries {
  
  inline def apply(): SchemaProgressTimeseries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProgressTimeseries]
  }
  
  extension [Self <: SchemaProgressTimeseries](x: Self) {
    
    inline def setCurrentProgress(value: Double): Self = StObject.set(x, "currentProgress", value.asInstanceOf[js.Any])
    
    inline def setCurrentProgressNull: Self = StObject.set(x, "currentProgress", null)
    
    inline def setCurrentProgressUndefined: Self = StObject.set(x, "currentProgress", js.undefined)
    
    inline def setDataPoints(value: js.Array[SchemaPoint]): Self = StObject.set(x, "dataPoints", value.asInstanceOf[js.Any])
    
    inline def setDataPointsUndefined: Self = StObject.set(x, "dataPoints", js.undefined)
    
    inline def setDataPointsVarargs(value: SchemaPoint*): Self = StObject.set(x, "dataPoints", js.Array(value*))
  }
}
