package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video context and/or feature-specific parameters.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext extends js.Object {
  
  /**
    * Config for EXPLICIT_CONTENT_DETECTION.
    */
  var explicitContentDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentDetectionConfig] = js.native
  
  /**
    * Config for LABEL_DETECTION.
    */
  var labelDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1LabelDetectionConfig] = js.native
  
  /**
    * Video segments to annotate. The segments may overlap and are not required
    * to be contiguous or span the whole video. If unspecified, each video is
    * treated as a single segment.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment]] = js.native
  
  /**
    * Config for SHOT_CHANGE_DETECTION.
    */
  var shotChangeDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1ShotChangeDetectionConfig] = js.native
  
  /**
    * Config for SPEECH_TRANSCRIPTION.
    */
  var speechTranscriptionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1SpeechTranscriptionConfig] = js.native
  
  /**
    * Config for TEXT_DETECTION.
    */
  var textDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1TextDetectionConfig] = js.native
}
object SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1VideoContextOps[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExplicitContentDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentDetectionConfig): Self = this.set("explicitContentDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitContentDetectionConfig: Self = this.set("explicitContentDetectionConfig", js.undefined)
    
    @scala.inline
    def setLabelDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1LabelDetectionConfig): Self = this.set("labelDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelDetectionConfig: Self = this.set("labelDetectionConfig", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setShotChangeDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1ShotChangeDetectionConfig): Self = this.set("shotChangeDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShotChangeDetectionConfig: Self = this.set("shotChangeDetectionConfig", js.undefined)
    
    @scala.inline
    def setSpeechTranscriptionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1SpeechTranscriptionConfig): Self = this.set("speechTranscriptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechTranscriptionConfig: Self = this.set("speechTranscriptionConfig", js.undefined)
    
    @scala.inline
    def setTextDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1TextDetectionConfig): Self = this.set("textDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDetectionConfig: Self = this.set("textDetectionConfig", js.undefined)
  }
}
