package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A face annotation object contains the results of face detection.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1FaceAnnotation extends js.Object {
  /**
    * Anger likelihood.
    */
  var angerLikelihood: js.UndefOr[String] = js.native
  /**
    * Blurred likelihood.
    */
  var blurredLikelihood: js.UndefOr[String] = js.native
  /**
    * The bounding polygon around the face. The coordinates of the bounding box
    * are in the original image&#39;s scale. The bounding box is computed to
    * &quot;frame&quot; the face in accordance with human expectations. It is
    * based on the landmarker results. Note that one or more x and/or y
    * coordinates may not be generated in the `BoundingPoly` (the polygon will
    * be unbounded) if only a partial face appears in the image to be
    * annotated.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1BoundingPoly] = js.native
  /**
    * Detection confidence. Range [0, 1].
    */
  var detectionConfidence: js.UndefOr[Double] = js.native
  /**
    * The `fd_bounding_poly` bounding polygon is tighter than the
    * `boundingPoly`, and encloses only the skin part of the face. Typically,
    * it is used to eliminate the face from any image analysis that detects the
    * &quot;amount of skin&quot; visible in an image. It is not based on the
    * landmarker results, only on the initial face detection, hence the
    * &lt;code&gt;fd&lt;/code&gt; (face detection) prefix.
    */
  var fdBoundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1BoundingPoly] = js.native
  /**
    * Headwear likelihood.
    */
  var headwearLikelihood: js.UndefOr[String] = js.native
  /**
    * Joy likelihood.
    */
  var joyLikelihood: js.UndefOr[String] = js.native
  /**
    * Face landmarking confidence. Range [0, 1].
    */
  var landmarkingConfidence: js.UndefOr[Double] = js.native
  /**
    * Detected face landmarks.
    */
  var landmarks: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark]] = js.native
  /**
    * Yaw angle, which indicates the leftward/rightward angle that the face is
    * pointing relative to the vertical plane perpendicular to the image. Range
    * [-180,180].
    */
  var panAngle: js.UndefOr[Double] = js.native
  /**
    * Roll angle, which indicates the amount of clockwise/anti-clockwise
    * rotation of the face relative to the image vertical about the axis
    * perpendicular to the face. Range [-180,180].
    */
  var rollAngle: js.UndefOr[Double] = js.native
  /**
    * Sorrow likelihood.
    */
  var sorrowLikelihood: js.UndefOr[String] = js.native
  /**
    * Surprise likelihood.
    */
  var surpriseLikelihood: js.UndefOr[String] = js.native
  /**
    * Pitch angle, which indicates the upwards/downwards angle that the face is
    * pointing relative to the image&#39;s horizontal plane. Range [-180,180].
    */
  var tiltAngle: js.UndefOr[Double] = js.native
  /**
    * Under-exposed likelihood.
    */
  var underExposedLikelihood: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1FaceAnnotation {
  @scala.inline
  def apply(
    angerLikelihood: String = null,
    blurredLikelihood: String = null,
    boundingPoly: SchemaGoogleCloudVisionV1p4beta1BoundingPoly = null,
    detectionConfidence: js.UndefOr[Double] = js.undefined,
    fdBoundingPoly: SchemaGoogleCloudVisionV1p4beta1BoundingPoly = null,
    headwearLikelihood: String = null,
    joyLikelihood: String = null,
    landmarkingConfidence: js.UndefOr[Double] = js.undefined,
    landmarks: js.Array[SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark] = null,
    panAngle: js.UndefOr[Double] = js.undefined,
    rollAngle: js.UndefOr[Double] = js.undefined,
    sorrowLikelihood: String = null,
    surpriseLikelihood: String = null,
    tiltAngle: js.UndefOr[Double] = js.undefined,
    underExposedLikelihood: String = null
  ): SchemaGoogleCloudVisionV1p4beta1FaceAnnotation = {
    val __obj = js.Dynamic.literal()
    if (angerLikelihood != null) __obj.updateDynamic("angerLikelihood")(angerLikelihood.asInstanceOf[js.Any])
    if (blurredLikelihood != null) __obj.updateDynamic("blurredLikelihood")(blurredLikelihood.asInstanceOf[js.Any])
    if (boundingPoly != null) __obj.updateDynamic("boundingPoly")(boundingPoly.asInstanceOf[js.Any])
    if (!js.isUndefined(detectionConfidence)) __obj.updateDynamic("detectionConfidence")(detectionConfidence.get.asInstanceOf[js.Any])
    if (fdBoundingPoly != null) __obj.updateDynamic("fdBoundingPoly")(fdBoundingPoly.asInstanceOf[js.Any])
    if (headwearLikelihood != null) __obj.updateDynamic("headwearLikelihood")(headwearLikelihood.asInstanceOf[js.Any])
    if (joyLikelihood != null) __obj.updateDynamic("joyLikelihood")(joyLikelihood.asInstanceOf[js.Any])
    if (!js.isUndefined(landmarkingConfidence)) __obj.updateDynamic("landmarkingConfidence")(landmarkingConfidence.get.asInstanceOf[js.Any])
    if (landmarks != null) __obj.updateDynamic("landmarks")(landmarks.asInstanceOf[js.Any])
    if (!js.isUndefined(panAngle)) __obj.updateDynamic("panAngle")(panAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rollAngle)) __obj.updateDynamic("rollAngle")(rollAngle.get.asInstanceOf[js.Any])
    if (sorrowLikelihood != null) __obj.updateDynamic("sorrowLikelihood")(sorrowLikelihood.asInstanceOf[js.Any])
    if (surpriseLikelihood != null) __obj.updateDynamic("surpriseLikelihood")(surpriseLikelihood.asInstanceOf[js.Any])
    if (!js.isUndefined(tiltAngle)) __obj.updateDynamic("tiltAngle")(tiltAngle.get.asInstanceOf[js.Any])
    if (underExposedLikelihood != null) __obj.updateDynamic("underExposedLikelihood")(underExposedLikelihood.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1FaceAnnotation]
  }
}

