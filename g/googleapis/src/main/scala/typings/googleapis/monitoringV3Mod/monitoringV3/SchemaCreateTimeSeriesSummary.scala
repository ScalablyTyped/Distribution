package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateTimeSeriesSummary extends StObject {
  
  /**
    * The number of points that failed to be written. Order is not guaranteed.
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.undefined
  
  /**
    * The number of points that were successfully written.
    */
  var successPointCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of points in the request.
    */
  var totalPointCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCreateTimeSeriesSummary {
  
  inline def apply(): SchemaCreateTimeSeriesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateTimeSeriesSummary]
  }
  
  extension [Self <: SchemaCreateTimeSeriesSummary](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setSuccessPointCount(value: Double): Self = StObject.set(x, "successPointCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessPointCountNull: Self = StObject.set(x, "successPointCount", null)
    
    inline def setSuccessPointCountUndefined: Self = StObject.set(x, "successPointCount", js.undefined)
    
    inline def setTotalPointCount(value: Double): Self = StObject.set(x, "totalPointCount", value.asInstanceOf[js.Any])
    
    inline def setTotalPointCountNull: Self = StObject.set(x, "totalPointCount", null)
    
    inline def setTotalPointCountUndefined: Self = StObject.set(x, "totalPointCount", js.undefined)
  }
}
