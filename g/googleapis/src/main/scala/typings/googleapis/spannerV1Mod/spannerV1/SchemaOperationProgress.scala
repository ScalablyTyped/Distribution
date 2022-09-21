package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperationProgress extends StObject {
  
  /**
    * If set, the time at which this operation failed or was completed successfully.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Percent completion of the operation. Values are between 0 and 100 inclusive.
    */
  var progressPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Time the request was received.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaOperationProgress {
  
  inline def apply(): SchemaOperationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationProgress]
  }
  
  extension [Self <: SchemaOperationProgress](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentNull: Self = StObject.set(x, "progressPercent", null)
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
