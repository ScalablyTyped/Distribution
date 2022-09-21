package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1beta2VideoContext extends StObject {
  
  /**
    * Config for EXPLICIT_CONTENT_DETECTION.
    */
  var explicitContentDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig] = js.undefined
  
  /**
    * Config for FACE_DETECTION.
    */
  var faceDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2FaceDetectionConfig] = js.undefined
  
  /**
    * Config for LABEL_DETECTION.
    */
  var labelDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2LabelDetectionConfig] = js.undefined
  
  /**
    * Config for OBJECT_TRACKING.
    */
  var objectTrackingConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingConfig] = js.undefined
  
  /**
    * Config for PERSON_DETECTION.
    */
  var personDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2PersonDetectionConfig] = js.undefined
  
  /**
    * Video segments to annotate. The segments may overlap and are not required to be contiguous or span the whole video. If unspecified, each video is treated as a single segment.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]] = js.undefined
  
  /**
    * Config for SHOT_CHANGE_DETECTION.
    */
  var shotChangeDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig] = js.undefined
  
  /**
    * Config for SPEECH_TRANSCRIPTION.
    */
  var speechTranscriptionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig] = js.undefined
  
  /**
    * Config for TEXT_DETECTION.
    */
  var textDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2TextDetectionConfig] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2VideoContext {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2VideoContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2VideoContext]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2VideoContext](x: Self) {
    
    inline def setExplicitContentDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig): Self = StObject.set(x, "explicitContentDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setExplicitContentDetectionConfigUndefined: Self = StObject.set(x, "explicitContentDetectionConfig", js.undefined)
    
    inline def setFaceDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2FaceDetectionConfig): Self = StObject.set(x, "faceDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setFaceDetectionConfigUndefined: Self = StObject.set(x, "faceDetectionConfig", js.undefined)
    
    inline def setLabelDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2LabelDetectionConfig): Self = StObject.set(x, "labelDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setLabelDetectionConfigUndefined: Self = StObject.set(x, "labelDetectionConfig", js.undefined)
    
    inline def setObjectTrackingConfig(value: SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingConfig): Self = StObject.set(x, "objectTrackingConfig", value.asInstanceOf[js.Any])
    
    inline def setObjectTrackingConfigUndefined: Self = StObject.set(x, "objectTrackingConfig", js.undefined)
    
    inline def setPersonDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2PersonDetectionConfig): Self = StObject.set(x, "personDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setPersonDetectionConfigUndefined: Self = StObject.set(x, "personDetectionConfig", js.undefined)
    
    inline def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2VideoSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setShotChangeDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig): Self = StObject.set(x, "shotChangeDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setShotChangeDetectionConfigUndefined: Self = StObject.set(x, "shotChangeDetectionConfig", js.undefined)
    
    inline def setSpeechTranscriptionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig): Self = StObject.set(x, "speechTranscriptionConfig", value.asInstanceOf[js.Any])
    
    inline def setSpeechTranscriptionConfigUndefined: Self = StObject.set(x, "speechTranscriptionConfig", js.undefined)
    
    inline def setTextDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2TextDetectionConfig): Self = StObject.set(x, "textDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setTextDetectionConfigUndefined: Self = StObject.set(x, "textDetectionConfig", js.undefined)
  }
}
