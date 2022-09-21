package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadata extends StObject {
  
  /**
    * Whether the transcript segment was covered under the configured smart reply allowlist in Agent Assist.
    */
  var smartReplyAllowlistCovered: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadata {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadata](x: Self) {
    
    inline def setSmartReplyAllowlistCovered(value: Boolean): Self = StObject.set(x, "smartReplyAllowlistCovered", value.asInstanceOf[js.Any])
    
    inline def setSmartReplyAllowlistCoveredNull: Self = StObject.set(x, "smartReplyAllowlistCovered", null)
    
    inline def setSmartReplyAllowlistCoveredUndefined: Self = StObject.set(x, "smartReplyAllowlistCovered", js.undefined)
  }
}
