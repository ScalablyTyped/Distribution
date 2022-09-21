package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfo extends StObject {
  
  /**
    * A confidence estimate between 0.0 and 1.0 of the fidelity of this word. A default value of 0.0 indicates that the value is unset.
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Time offset of the end of this word relative to the beginning of the total conversation.
    */
  var endOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time offset of the start of this word relative to the beginning of the total conversation.
    */
  var startOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The word itself. Includes punctuation marks that surround the word.
    */
  var word: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfo {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfo]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfo](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setEndOffset(value: String): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetNull: Self = StObject.set(x, "endOffset", null)
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    inline def setStartOffset(value: String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetNull: Self = StObject.set(x, "startOffset", null)
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    inline def setWordNull: Self = StObject.set(x, "word", null)
    
    inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
