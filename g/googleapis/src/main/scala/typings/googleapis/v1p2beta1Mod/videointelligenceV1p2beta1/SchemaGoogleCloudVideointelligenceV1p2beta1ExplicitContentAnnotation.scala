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
trait SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentAnnotation extends js.Object {
  /**
    * All video frames where explicit content was detected.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentFrame]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentAnnotation {
  @scala.inline
  def apply(frames: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentFrame] = null): SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentAnnotation]
  }
}

