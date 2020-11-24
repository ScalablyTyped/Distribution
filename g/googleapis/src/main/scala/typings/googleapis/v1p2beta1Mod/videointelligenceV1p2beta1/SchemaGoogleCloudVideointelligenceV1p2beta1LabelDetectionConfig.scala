package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config for LABEL_DETECTION.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1LabelDetectionConfig extends js.Object {
  
  /**
    * The confidence threshold we perform filtering on the labels from
    * frame-level detection. If not set, it is set to 0.4 by default. The valid
    * range for this threshold is [0.1, 0.9]. Any value set outside of this
    * range will be clipped. Note: for best results please follow the default
    * threshold. We will update the default threshold everytime when we release
    * a new model.
    */
  var frameConfidenceThreshold: js.UndefOr[Double] = js.native
  
  /**
    * What labels should be detected with LABEL_DETECTION, in addition to
    * video-level labels or segment-level labels. If unspecified, defaults to
    * `SHOT_MODE`.
    */
  var labelDetectionMode: js.UndefOr[String] = js.native
  
  /**
    * Model to use for label detection. Supported values:
    * &quot;builtin/stable&quot; (the default if unset) and
    * &quot;builtin/latest&quot;.
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * Whether the video has been shot from a stationary (i.e. non-moving)
    * camera. When set to true, might improve detection accuracy for moving
    * objects. Should be used with `SHOT_AND_FRAME_MODE` enabled.
    */
  var stationaryCamera: js.UndefOr[Boolean] = js.native
  
  /**
    * The confidence threshold we perform filtering on the labels from
    * video-level and shot-level detections. If not set, it is set to 0.3 by
    * default. The valid range for this threshold is [0.1, 0.9]. Any value set
    * outside of this range will be clipped. Note: for best results please
    * follow the default threshold. We will update the default threshold
    * everytime when we release a new model.
    */
  var videoConfidenceThreshold: js.UndefOr[Double] = js.native
}
object SchemaGoogleCloudVideointelligenceV1p2beta1LabelDetectionConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1LabelDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1LabelDetectionConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1LabelDetectionConfigOps[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1LabelDetectionConfig] (val x: Self) extends AnyVal {
    
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
    def setFrameConfidenceThreshold(value: Double): Self = this.set("frameConfidenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameConfidenceThreshold: Self = this.set("frameConfidenceThreshold", js.undefined)
    
    @scala.inline
    def setLabelDetectionMode(value: String): Self = this.set("labelDetectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelDetectionMode: Self = this.set("labelDetectionMode", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setStationaryCamera(value: Boolean): Self = this.set("stationaryCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStationaryCamera: Self = this.set("stationaryCamera", js.undefined)
    
    @scala.inline
    def setVideoConfidenceThreshold(value: Double): Self = this.set("videoConfidenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoConfidenceThreshold: Self = this.set("videoConfidenceThreshold", js.undefined)
  }
}
