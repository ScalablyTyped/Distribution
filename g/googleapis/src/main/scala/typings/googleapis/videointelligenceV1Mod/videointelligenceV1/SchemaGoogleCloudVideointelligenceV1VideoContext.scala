package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video context and/or feature-specific parameters.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1VideoContext extends js.Object {
  /**
    * Config for EXPLICIT_CONTENT_DETECTION.
    */
  var explicitContentDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1ExplicitContentDetectionConfig] = js.native
  /**
    * Config for LABEL_DETECTION.
    */
  var labelDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1LabelDetectionConfig] = js.native
  /**
    * Video segments to annotate. The segments may overlap and are not required
    * to be contiguous or span the whole video. If unspecified, each video is
    * treated as a single segment.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1VideoSegment]] = js.native
  /**
    * Config for SHOT_CHANGE_DETECTION.
    */
  var shotChangeDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1ShotChangeDetectionConfig] = js.native
  /**
    * Config for SPEECH_TRANSCRIPTION.
    */
  var speechTranscriptionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1SpeechTranscriptionConfig] = js.native
  /**
    * Config for TEXT_DETECTION.
    */
  var textDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1TextDetectionConfig] = js.native
}

object SchemaGoogleCloudVideointelligenceV1VideoContext {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1VideoContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1VideoContext]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1VideoContextOps[Self <: SchemaGoogleCloudVideointelligenceV1VideoContext] (val x: Self) extends AnyVal {
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
    def setExplicitContentDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1ExplicitContentDetectionConfig): Self = this.set("explicitContentDetectionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicitContentDetectionConfig: Self = this.set("explicitContentDetectionConfig", js.undefined)
    @scala.inline
    def setLabelDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1LabelDetectionConfig): Self = this.set("labelDetectionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDetectionConfig: Self = this.set("labelDetectionConfig", js.undefined)
    @scala.inline
    def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1VideoSegment*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1VideoSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    @scala.inline
    def setShotChangeDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1ShotChangeDetectionConfig): Self = this.set("shotChangeDetectionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShotChangeDetectionConfig: Self = this.set("shotChangeDetectionConfig", js.undefined)
    @scala.inline
    def setSpeechTranscriptionConfig(value: SchemaGoogleCloudVideointelligenceV1SpeechTranscriptionConfig): Self = this.set("speechTranscriptionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeechTranscriptionConfig: Self = this.set("speechTranscriptionConfig", js.undefined)
    @scala.inline
    def setTextDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1TextDetectionConfig): Self = this.set("textDetectionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDetectionConfig: Self = this.set("textDetectionConfig", js.undefined)
  }
  
}

