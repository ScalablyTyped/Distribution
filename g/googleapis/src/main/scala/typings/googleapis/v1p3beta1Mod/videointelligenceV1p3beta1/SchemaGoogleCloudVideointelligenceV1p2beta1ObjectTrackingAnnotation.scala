package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotations corresponding to one tracked object.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation extends js.Object {
  /**
    * Object category&#39;s labeling confidence of this track.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Entity to specify the object category that this track is labeled as.
    */
  var entity: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1Entity] = js.native
  /**
    * Information corresponding to all frames where this object track appears.
    * Non-streaming batch mode: it may be one or multiple ObjectTrackingFrame
    * messages in frames. Streaming mode: it can only be one
    * ObjectTrackingFrame message in frames.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame]] = js.native
  /**
    * Non-streaming batch mode ONLY. Each object track corresponds to one video
    * segment where it appears.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment] = js.native
  /**
    * Streaming mode ONLY. In streaming mode, we do not know the end time of a
    * tracked object before it is completed. Hence, there is no VideoSegment
    * info returned. Instead, we provide a unique identifiable integer track_id
    * so that the customers can correlate the results of the ongoing
    * ObjectTrackAnnotation of the same track_id over time.
    */
  var trackId: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation {
  @scala.inline
  def apply(
    confidence: Int | Double = null,
    entity: SchemaGoogleCloudVideointelligenceV1p2beta1Entity = null,
    frames: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame] = null,
    segment: SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment = null,
    trackId: String = null
  ): SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (trackId != null) __obj.updateDynamic("trackId")(trackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation]
  }
}

