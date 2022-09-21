package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1CallAnnotation extends StObject {
  
  /**
    * The boundary in the conversation where the annotation ends, inclusive.
    */
  var annotationEndBoundary: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary] = js.undefined
  
  /**
    * The boundary in the conversation where the annotation starts, inclusive.
    */
  var annotationStartBoundary: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary] = js.undefined
  
  /**
    * The channel of the audio where the annotation occurs. For single-channel audio, this field is not populated.
    */
  var channelTag: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Data specifying an entity mention.
    */
  var entityMentionData: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1EntityMentionData] = js.undefined
  
  /**
    * Data specifying a hold.
    */
  var holdData: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1HoldData] = js.undefined
  
  /**
    * Data specifying an intent match.
    */
  var intentMatchData: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1IntentMatchData] = js.undefined
  
  /**
    * Data specifying an interruption.
    */
  var interruptionData: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1InterruptionData] = js.undefined
  
  /**
    * Data specifying a phrase match.
    */
  var phraseMatchData: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1PhraseMatchData] = js.undefined
  
  /**
    * Data specifying sentiment.
    */
  var sentimentData: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1SentimentData] = js.undefined
  
  /**
    * Data specifying silence.
    */
  var silenceData: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1SilenceData] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1CallAnnotation {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1CallAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1CallAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1CallAnnotation](x: Self) {
    
    inline def setAnnotationEndBoundary(value: SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary): Self = StObject.set(x, "annotationEndBoundary", value.asInstanceOf[js.Any])
    
    inline def setAnnotationEndBoundaryUndefined: Self = StObject.set(x, "annotationEndBoundary", js.undefined)
    
    inline def setAnnotationStartBoundary(value: SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary): Self = StObject.set(x, "annotationStartBoundary", value.asInstanceOf[js.Any])
    
    inline def setAnnotationStartBoundaryUndefined: Self = StObject.set(x, "annotationStartBoundary", js.undefined)
    
    inline def setChannelTag(value: Double): Self = StObject.set(x, "channelTag", value.asInstanceOf[js.Any])
    
    inline def setChannelTagNull: Self = StObject.set(x, "channelTag", null)
    
    inline def setChannelTagUndefined: Self = StObject.set(x, "channelTag", js.undefined)
    
    inline def setEntityMentionData(value: SchemaGoogleCloudContactcenterinsightsV1EntityMentionData): Self = StObject.set(x, "entityMentionData", value.asInstanceOf[js.Any])
    
    inline def setEntityMentionDataUndefined: Self = StObject.set(x, "entityMentionData", js.undefined)
    
    inline def setHoldData(value: SchemaGoogleCloudContactcenterinsightsV1HoldData): Self = StObject.set(x, "holdData", value.asInstanceOf[js.Any])
    
    inline def setHoldDataUndefined: Self = StObject.set(x, "holdData", js.undefined)
    
    inline def setIntentMatchData(value: SchemaGoogleCloudContactcenterinsightsV1IntentMatchData): Self = StObject.set(x, "intentMatchData", value.asInstanceOf[js.Any])
    
    inline def setIntentMatchDataUndefined: Self = StObject.set(x, "intentMatchData", js.undefined)
    
    inline def setInterruptionData(value: SchemaGoogleCloudContactcenterinsightsV1InterruptionData): Self = StObject.set(x, "interruptionData", value.asInstanceOf[js.Any])
    
    inline def setInterruptionDataUndefined: Self = StObject.set(x, "interruptionData", js.undefined)
    
    inline def setPhraseMatchData(value: SchemaGoogleCloudContactcenterinsightsV1PhraseMatchData): Self = StObject.set(x, "phraseMatchData", value.asInstanceOf[js.Any])
    
    inline def setPhraseMatchDataUndefined: Self = StObject.set(x, "phraseMatchData", js.undefined)
    
    inline def setSentimentData(value: SchemaGoogleCloudContactcenterinsightsV1SentimentData): Self = StObject.set(x, "sentimentData", value.asInstanceOf[js.Any])
    
    inline def setSentimentDataUndefined: Self = StObject.set(x, "sentimentData", js.undefined)
    
    inline def setSilenceData(value: SchemaGoogleCloudContactcenterinsightsV1SilenceData): Self = StObject.set(x, "silenceData", value.asInstanceOf[js.Any])
    
    inline def setSilenceDataUndefined: Self = StObject.set(x, "silenceData", js.undefined)
  }
}
