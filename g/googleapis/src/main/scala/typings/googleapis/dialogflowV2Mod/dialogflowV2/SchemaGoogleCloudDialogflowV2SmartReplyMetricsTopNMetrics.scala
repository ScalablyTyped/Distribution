package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2SmartReplyMetricsTopNMetrics extends StObject {
  
  /**
    * Number of retrieved smart replies. For example, when `n` is 3, this evaluation contains metrics for when Dialogflow retrieves 3 smart replies with the model.
    */
  var n: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Defined as `number of queries whose top n smart replies have at least one similar (token match similarity above the defined threshold) reply as the real reply` divided by `number of queries with at least one smart reply`. Value ranges from 0.0 to 1.0 inclusive.
    */
  var recall: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2SmartReplyMetricsTopNMetrics {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2SmartReplyMetricsTopNMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SmartReplyMetricsTopNMetrics]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2SmartReplyMetricsTopNMetrics](x: Self) {
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNNull: Self = StObject.set(x, "n", null)
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setRecall(value: Double): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setRecallNull: Self = StObject.set(x, "recall", null)
    
    inline def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
  }
}
