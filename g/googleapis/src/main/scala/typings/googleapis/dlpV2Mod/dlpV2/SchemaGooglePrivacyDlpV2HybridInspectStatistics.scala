package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2HybridInspectStatistics extends StObject {
  
  /**
    * The number of hybrid inspection requests aborted because the job ran out of quota or was ended before they could be processed.
    */
  var abortedCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of hybrid requests currently being processed. Only populated when called via method `getDlpJob`. A burst of traffic may cause hybrid inspect requests to be enqueued. Processing will take place as quickly as possible, but resource limitations may impact how long a request is enqueued for.
    */
  var pendingCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of hybrid inspection requests processed within this job.
    */
  var processedCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2HybridInspectStatistics {
  
  inline def apply(): SchemaGooglePrivacyDlpV2HybridInspectStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2HybridInspectStatistics]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2HybridInspectStatistics](x: Self) {
    
    inline def setAbortedCount(value: String): Self = StObject.set(x, "abortedCount", value.asInstanceOf[js.Any])
    
    inline def setAbortedCountNull: Self = StObject.set(x, "abortedCount", null)
    
    inline def setAbortedCountUndefined: Self = StObject.set(x, "abortedCount", js.undefined)
    
    inline def setPendingCount(value: String): Self = StObject.set(x, "pendingCount", value.asInstanceOf[js.Any])
    
    inline def setPendingCountNull: Self = StObject.set(x, "pendingCount", null)
    
    inline def setPendingCountUndefined: Self = StObject.set(x, "pendingCount", js.undefined)
    
    inline def setProcessedCount(value: String): Self = StObject.set(x, "processedCount", value.asInstanceOf[js.Any])
    
    inline def setProcessedCountNull: Self = StObject.set(x, "processedCount", null)
    
    inline def setProcessedCountUndefined: Self = StObject.set(x, "processedCount", js.undefined)
  }
}
