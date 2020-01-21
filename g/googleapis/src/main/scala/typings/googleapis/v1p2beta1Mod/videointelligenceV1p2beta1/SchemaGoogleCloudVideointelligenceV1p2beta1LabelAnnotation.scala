package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Label annotation.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1LabelAnnotation extends js.Object {
  /**
    * Common categories for the detected entity. E.g. when the label is
    * `Terrier` the category is likely `dog`. And in some cases there might be
    * more than one categories e.g. `Terrier` could also be a `pet`.
    */
  var categoryEntities: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1Entity]] = js.native
  /**
    * Detected entity.
    */
  var entity: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1Entity] = js.native
  /**
    * All video frames where a label was detected.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1LabelFrame]] = js.native
  /**
    * All video segments where a label was detected.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1LabelAnnotation {
  @scala.inline
  def apply(
    categoryEntities: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1Entity] = null,
    entity: SchemaGoogleCloudVideointelligenceV1p2beta1Entity = null,
    frames: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1LabelFrame] = null,
    segments: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment] = null
  ): SchemaGoogleCloudVideointelligenceV1p2beta1LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    if (categoryEntities != null) __obj.updateDynamic("categoryEntities")(categoryEntities.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1LabelAnnotation]
  }
}

