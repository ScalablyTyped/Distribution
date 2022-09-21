package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ConversationTranscript extends StObject {
  
  /**
    * A list of sequential transcript segments that comprise the conversation.
    */
  var transcriptSegments: js.UndefOr[
    js.Array[SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegment]
  ] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ConversationTranscript {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ConversationTranscript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ConversationTranscript]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ConversationTranscript](x: Self) {
    
    inline def setTranscriptSegments(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegment]): Self = StObject.set(x, "transcriptSegments", value.asInstanceOf[js.Any])
    
    inline def setTranscriptSegmentsUndefined: Self = StObject.set(x, "transcriptSegments", js.undefined)
    
    inline def setTranscriptSegmentsVarargs(value: SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegment*): Self = StObject.set(x, "transcriptSegments", js.Array(value*))
  }
}
