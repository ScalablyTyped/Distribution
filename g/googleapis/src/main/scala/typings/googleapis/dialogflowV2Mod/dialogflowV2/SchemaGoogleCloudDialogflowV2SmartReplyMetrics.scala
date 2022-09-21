package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2SmartReplyMetrics extends StObject {
  
  /**
    * Percentage of target participant messages in the evaluation dataset for which similar messages have appeared at least once in the allowlist. Should be [0, 1].
    */
  var allowlistCoverage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Total number of conversations used to generate this metric.
    */
  var conversationCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metrics of top n smart replies, sorted by TopNMetric.n.
    */
  var topNMetrics: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2SmartReplyMetricsTopNMetrics]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2SmartReplyMetrics {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2SmartReplyMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SmartReplyMetrics]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2SmartReplyMetrics](x: Self) {
    
    inline def setAllowlistCoverage(value: Double): Self = StObject.set(x, "allowlistCoverage", value.asInstanceOf[js.Any])
    
    inline def setAllowlistCoverageNull: Self = StObject.set(x, "allowlistCoverage", null)
    
    inline def setAllowlistCoverageUndefined: Self = StObject.set(x, "allowlistCoverage", js.undefined)
    
    inline def setConversationCount(value: String): Self = StObject.set(x, "conversationCount", value.asInstanceOf[js.Any])
    
    inline def setConversationCountNull: Self = StObject.set(x, "conversationCount", null)
    
    inline def setConversationCountUndefined: Self = StObject.set(x, "conversationCount", js.undefined)
    
    inline def setTopNMetrics(value: js.Array[SchemaGoogleCloudDialogflowV2SmartReplyMetricsTopNMetrics]): Self = StObject.set(x, "topNMetrics", value.asInstanceOf[js.Any])
    
    inline def setTopNMetricsUndefined: Self = StObject.set(x, "topNMetrics", js.undefined)
    
    inline def setTopNMetricsVarargs(value: SchemaGoogleCloudDialogflowV2SmartReplyMetricsTopNMetrics*): Self = StObject.set(x, "topNMetrics", js.Array(value*))
  }
}
