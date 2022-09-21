package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1UsageStats extends StObject {
  
  /** The number of cancelled attempts to use the underlying entry. */
  var totalCancellations: js.UndefOr[Double] = js.undefined
  
  /** The number of successful uses of the underlying entry. */
  var totalCompletions: js.UndefOr[Double] = js.undefined
  
  /** Total time spent only on successful uses, in milliseconds. */
  var totalExecutionTimeForCompletionsMillis: js.UndefOr[Double] = js.undefined
  
  /** The number of failed attempts to use the underlying entry. */
  var totalFailures: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDatacatalogV1UsageStats {
  
  inline def apply(): GoogleCloudDatacatalogV1UsageStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1UsageStats]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1UsageStats](x: Self) {
    
    inline def setTotalCancellations(value: Double): Self = StObject.set(x, "totalCancellations", value.asInstanceOf[js.Any])
    
    inline def setTotalCancellationsUndefined: Self = StObject.set(x, "totalCancellations", js.undefined)
    
    inline def setTotalCompletions(value: Double): Self = StObject.set(x, "totalCompletions", value.asInstanceOf[js.Any])
    
    inline def setTotalCompletionsUndefined: Self = StObject.set(x, "totalCompletions", js.undefined)
    
    inline def setTotalExecutionTimeForCompletionsMillis(value: Double): Self = StObject.set(x, "totalExecutionTimeForCompletionsMillis", value.asInstanceOf[js.Any])
    
    inline def setTotalExecutionTimeForCompletionsMillisUndefined: Self = StObject.set(x, "totalExecutionTimeForCompletionsMillis", js.undefined)
    
    inline def setTotalFailures(value: Double): Self = StObject.set(x, "totalFailures", value.asInstanceOf[js.Any])
    
    inline def setTotalFailuresUndefined: Self = StObject.set(x, "totalFailures", js.undefined)
  }
}
