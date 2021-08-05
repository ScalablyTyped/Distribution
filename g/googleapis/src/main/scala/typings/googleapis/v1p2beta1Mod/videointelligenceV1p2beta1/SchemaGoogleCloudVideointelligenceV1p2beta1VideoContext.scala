package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video context and/or feature-specific parameters.
  */
trait SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext extends StObject {
  
  /**
    * Config for EXPLICIT_CONTENT_DETECTION.
    */
  var explicitContentDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentDetectionConfig] = js.undefined
  
  /**
    * Config for LABEL_DETECTION.
    */
  var labelDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1LabelDetectionConfig] = js.undefined
  
  /**
    * Video segments to annotate. The segments may overlap and are not required
    * to be contiguous or span the whole video. If unspecified, each video is
    * treated as a single segment.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment]] = js.undefined
  
  /**
    * Config for SHOT_CHANGE_DETECTION.
    */
  var shotChangeDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1ShotChangeDetectionConfig] = js.undefined
  
  /**
    * Config for SPEECH_TRANSCRIPTION.
    */
  var speechTranscriptionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1SpeechTranscriptionConfig] = js.undefined
  
  /**
    * Config for TEXT_DETECTION.
    */
  var textDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1TextDetectionConfig] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext](x: Self) {
    
    inline def setExplicitContentDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentDetectionConfig): Self = StObject.set(x, "explicitContentDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setExplicitContentDetectionConfigUndefined: Self = StObject.set(x, "explicitContentDetectionConfig", js.undefined)
    
    inline def setLabelDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1LabelDetectionConfig): Self = StObject.set(x, "labelDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setLabelDetectionConfigUndefined: Self = StObject.set(x, "labelDetectionConfig", js.undefined)
    
    inline def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    inline def setShotChangeDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1ShotChangeDetectionConfig): Self = StObject.set(x, "shotChangeDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setShotChangeDetectionConfigUndefined: Self = StObject.set(x, "shotChangeDetectionConfig", js.undefined)
    
    inline def setSpeechTranscriptionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1SpeechTranscriptionConfig): Self = StObject.set(x, "speechTranscriptionConfig", value.asInstanceOf[js.Any])
    
    inline def setSpeechTranscriptionConfigUndefined: Self = StObject.set(x, "speechTranscriptionConfig", js.undefined)
    
    inline def setTextDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1TextDetectionConfig): Self = StObject.set(x, "textDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setTextDetectionConfigUndefined: Self = StObject.set(x, "textDetectionConfig", js.undefined)
  }
}
