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
  def apply(
    explicitContentDetectionConfig: SchemaGoogleCloudVideointelligenceV1ExplicitContentDetectionConfig = null,
    labelDetectionConfig: SchemaGoogleCloudVideointelligenceV1LabelDetectionConfig = null,
    segments: js.Array[SchemaGoogleCloudVideointelligenceV1VideoSegment] = null,
    shotChangeDetectionConfig: SchemaGoogleCloudVideointelligenceV1ShotChangeDetectionConfig = null,
    speechTranscriptionConfig: SchemaGoogleCloudVideointelligenceV1SpeechTranscriptionConfig = null,
    textDetectionConfig: SchemaGoogleCloudVideointelligenceV1TextDetectionConfig = null
  ): SchemaGoogleCloudVideointelligenceV1VideoContext = {
    val __obj = js.Dynamic.literal()
    if (explicitContentDetectionConfig != null) __obj.updateDynamic("explicitContentDetectionConfig")(explicitContentDetectionConfig.asInstanceOf[js.Any])
    if (labelDetectionConfig != null) __obj.updateDynamic("labelDetectionConfig")(labelDetectionConfig.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (shotChangeDetectionConfig != null) __obj.updateDynamic("shotChangeDetectionConfig")(shotChangeDetectionConfig.asInstanceOf[js.Any])
    if (speechTranscriptionConfig != null) __obj.updateDynamic("speechTranscriptionConfig")(speechTranscriptionConfig.asInstanceOf[js.Any])
    if (textDetectionConfig != null) __obj.updateDynamic("textDetectionConfig")(textDetectionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1VideoContext]
  }
}

