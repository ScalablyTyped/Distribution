package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Explicit content annotation (based on per-frame visual signals only). If no
  * explicit content has been detected in a frame, no annotations are present
  * for that frame.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation extends js.Object {
  /**
    * All video frames where explicit content was detected.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentFrame]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotationOps[Self <: SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation] (val x: Self) extends AnyVal {
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
    def setFramesVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentFrame*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
  }
  
}

