package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegment extends StObject {
  
  /**
    * For conversations derived from multi-channel audio, this is the channel number corresponding to the audio from that channel. For audioChannelCount = N, its output values can range from '1' to 'N'. A channel tag of 0 indicates that the audio is mono.
    */
  var channelTag: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A confidence estimate between 0.0 and 1.0 of the fidelity of this segment. A default value of 0.0 indicates that the value is unset.
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * CCAI metadata relating to the current transcript segment.
    */
  var dialogflowSegmentMetadata: js.UndefOr[
    SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadata
  ] = js.undefined
  
  /**
    * The language code of this segment as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time that the message occurred, if provided.
    */
  var messageTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The participant of this segment.
    */
  var segmentParticipant: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1ConversationParticipant] = js.undefined
  
  /**
    * The sentiment for this transcript segment.
    */
  var sentiment: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1SentimentData] = js.undefined
  
  /**
    * The text of this segment.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of the word-specific information for each word in the segment.
    */
  var words: js.UndefOr[
    js.Array[
      SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfo
    ]
  ] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegment {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegment]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegment](x: Self) {
    
    inline def setChannelTag(value: Double): Self = StObject.set(x, "channelTag", value.asInstanceOf[js.Any])
    
    inline def setChannelTagNull: Self = StObject.set(x, "channelTag", null)
    
    inline def setChannelTagUndefined: Self = StObject.set(x, "channelTag", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setDialogflowSegmentMetadata(
      value: SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadata
    ): Self = StObject.set(x, "dialogflowSegmentMetadata", value.asInstanceOf[js.Any])
    
    inline def setDialogflowSegmentMetadataUndefined: Self = StObject.set(x, "dialogflowSegmentMetadata", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMessageTime(value: String): Self = StObject.set(x, "messageTime", value.asInstanceOf[js.Any])
    
    inline def setMessageTimeNull: Self = StObject.set(x, "messageTime", null)
    
    inline def setMessageTimeUndefined: Self = StObject.set(x, "messageTime", js.undefined)
    
    inline def setSegmentParticipant(value: SchemaGoogleCloudContactcenterinsightsV1ConversationParticipant): Self = StObject.set(x, "segmentParticipant", value.asInstanceOf[js.Any])
    
    inline def setSegmentParticipantUndefined: Self = StObject.set(x, "segmentParticipant", js.undefined)
    
    inline def setSentiment(value: SchemaGoogleCloudContactcenterinsightsV1SentimentData): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setWords(
      value: js.Array[
          SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfo
        ]
    ): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    inline def setWordsVarargs(value: SchemaGoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfo*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
