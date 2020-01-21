package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

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
  def apply(frames: js.Array[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentFrame] = null): SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation]
  }
}

