package typings.googleapis.visionV1Mod.visionV1

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
  def apply(): SchemaGoogleCloudVisionV1p4beta1FaceAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1FaceAnnotation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1FaceAnnotationOps[Self <: SchemaGoogleCloudVisionV1p4beta1FaceAnnotation] (val x: Self) extends AnyVal {
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
    def setAngerLikelihood(value: String): Self = this.set("angerLikelihood", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngerLikelihood: Self = this.set("angerLikelihood", js.undefined)
    @scala.inline
    def setBlurredLikelihood(value: String): Self = this.set("blurredLikelihood", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurredLikelihood: Self = this.set("blurredLikelihood", js.undefined)
    @scala.inline
    def setBoundingPoly(value: SchemaGoogleCloudVisionV1p4beta1BoundingPoly): Self = this.set("boundingPoly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundingPoly: Self = this.set("boundingPoly", js.undefined)
    @scala.inline
    def setDetectionConfidence(value: Double): Self = this.set("detectionConfidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectionConfidence: Self = this.set("detectionConfidence", js.undefined)
    @scala.inline
    def setFdBoundingPoly(value: SchemaGoogleCloudVisionV1p4beta1BoundingPoly): Self = this.set("fdBoundingPoly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFdBoundingPoly: Self = this.set("fdBoundingPoly", js.undefined)
    @scala.inline
    def setHeadwearLikelihood(value: String): Self = this.set("headwearLikelihood", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadwearLikelihood: Self = this.set("headwearLikelihood", js.undefined)
    @scala.inline
    def setJoyLikelihood(value: String): Self = this.set("joyLikelihood", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoyLikelihood: Self = this.set("joyLikelihood", js.undefined)
    @scala.inline
    def setLandmarkingConfidence(value: Double): Self = this.set("landmarkingConfidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandmarkingConfidence: Self = this.set("landmarkingConfidence", js.undefined)
    @scala.inline
    def setLandmarksVarargs(value: SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark*): Self = this.set("landmarks", js.Array(value :_*))
    @scala.inline
    def setLandmarks(value: js.Array[SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark]): Self = this.set("landmarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandmarks: Self = this.set("landmarks", js.undefined)
    @scala.inline
    def setPanAngle(value: Double): Self = this.set("panAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanAngle: Self = this.set("panAngle", js.undefined)
    @scala.inline
    def setRollAngle(value: Double): Self = this.set("rollAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRollAngle: Self = this.set("rollAngle", js.undefined)
    @scala.inline
    def setSorrowLikelihood(value: String): Self = this.set("sorrowLikelihood", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorrowLikelihood: Self = this.set("sorrowLikelihood", js.undefined)
    @scala.inline
    def setSurpriseLikelihood(value: String): Self = this.set("surpriseLikelihood", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurpriseLikelihood: Self = this.set("surpriseLikelihood", js.undefined)
    @scala.inline
    def setTiltAngle(value: Double): Self = this.set("tiltAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiltAngle: Self = this.set("tiltAngle", js.undefined)
    @scala.inline
    def setUnderExposedLikelihood(value: String): Self = this.set("underExposedLikelihood", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderExposedLikelihood: Self = this.set("underExposedLikelihood", js.undefined)
  }
  
}

