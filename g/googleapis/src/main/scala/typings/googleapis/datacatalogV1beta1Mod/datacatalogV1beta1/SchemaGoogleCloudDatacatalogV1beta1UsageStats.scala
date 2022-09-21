package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1UsageStats extends StObject {
  
  /**
    * The number of times that the underlying entry was attempted to be used but was cancelled by the user.
    */
  var totalCancellations: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of times that the underlying entry was successfully used.
    */
  var totalCompletions: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Total time spent (in milliseconds) during uses the resulted in completions.
    */
  var totalExecutionTimeForCompletionsMillis: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of times that the underlying entry was attempted to be used but failed.
    */
  var totalFailures: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1UsageStats {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1UsageStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1UsageStats]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1UsageStats](x: Self) {
    
    inline def setTotalCancellations(value: Double): Self = StObject.set(x, "totalCancellations", value.asInstanceOf[js.Any])
    
    inline def setTotalCancellationsNull: Self = StObject.set(x, "totalCancellations", null)
    
    inline def setTotalCancellationsUndefined: Self = StObject.set(x, "totalCancellations", js.undefined)
    
    inline def setTotalCompletions(value: Double): Self = StObject.set(x, "totalCompletions", value.asInstanceOf[js.Any])
    
    inline def setTotalCompletionsNull: Self = StObject.set(x, "totalCompletions", null)
    
    inline def setTotalCompletionsUndefined: Self = StObject.set(x, "totalCompletions", js.undefined)
    
    inline def setTotalExecutionTimeForCompletionsMillis(value: Double): Self = StObject.set(x, "totalExecutionTimeForCompletionsMillis", value.asInstanceOf[js.Any])
    
    inline def setTotalExecutionTimeForCompletionsMillisNull: Self = StObject.set(x, "totalExecutionTimeForCompletionsMillis", null)
    
    inline def setTotalExecutionTimeForCompletionsMillisUndefined: Self = StObject.set(x, "totalExecutionTimeForCompletionsMillis", js.undefined)
    
    inline def setTotalFailures(value: Double): Self = StObject.set(x, "totalFailures", value.asInstanceOf[js.Any])
    
    inline def setTotalFailuresNull: Self = StObject.set(x, "totalFailures", null)
    
    inline def setTotalFailuresUndefined: Self = StObject.set(x, "totalFailures", js.undefined)
  }
}
