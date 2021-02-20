package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A face annotation object contains the results of face detection.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1FaceAnnotation extends StObject {
  
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
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1BoundingPoly] = js.native
  
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
  var fdBoundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1BoundingPoly] = js.native
  
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
  var landmarks: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1FaceAnnotationLandmark]] = js.native
  
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
object SchemaGoogleCloudVisionV1p3beta1FaceAnnotation {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1FaceAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1FaceAnnotation]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1FaceAnnotationMutableBuilder[Self <: SchemaGoogleCloudVisionV1p3beta1FaceAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngerLikelihood(value: String): Self = StObject.set(x, "angerLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngerLikelihoodUndefined: Self = StObject.set(x, "angerLikelihood", js.undefined)
    
    @scala.inline
    def setBlurredLikelihood(value: String): Self = StObject.set(x, "blurredLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurredLikelihoodUndefined: Self = StObject.set(x, "blurredLikelihood", js.undefined)
    
    @scala.inline
    def setBoundingPoly(value: SchemaGoogleCloudVisionV1p3beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setDetectionConfidence(value: Double): Self = StObject.set(x, "detectionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectionConfidenceUndefined: Self = StObject.set(x, "detectionConfidence", js.undefined)
    
    @scala.inline
    def setFdBoundingPoly(value: SchemaGoogleCloudVisionV1p3beta1BoundingPoly): Self = StObject.set(x, "fdBoundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFdBoundingPolyUndefined: Self = StObject.set(x, "fdBoundingPoly", js.undefined)
    
    @scala.inline
    def setHeadwearLikelihood(value: String): Self = StObject.set(x, "headwearLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadwearLikelihoodUndefined: Self = StObject.set(x, "headwearLikelihood", js.undefined)
    
    @scala.inline
    def setJoyLikelihood(value: String): Self = StObject.set(x, "joyLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoyLikelihoodUndefined: Self = StObject.set(x, "joyLikelihood", js.undefined)
    
    @scala.inline
    def setLandmarkingConfidence(value: Double): Self = StObject.set(x, "landmarkingConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandmarkingConfidenceUndefined: Self = StObject.set(x, "landmarkingConfidence", js.undefined)
    
    @scala.inline
    def setLandmarks(value: js.Array[SchemaGoogleCloudVisionV1p3beta1FaceAnnotationLandmark]): Self = StObject.set(x, "landmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandmarksUndefined: Self = StObject.set(x, "landmarks", js.undefined)
    
    @scala.inline
    def setLandmarksVarargs(value: SchemaGoogleCloudVisionV1p3beta1FaceAnnotationLandmark*): Self = StObject.set(x, "landmarks", js.Array(value :_*))
    
    @scala.inline
    def setPanAngle(value: Double): Self = StObject.set(x, "panAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanAngleUndefined: Self = StObject.set(x, "panAngle", js.undefined)
    
    @scala.inline
    def setRollAngle(value: Double): Self = StObject.set(x, "rollAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollAngleUndefined: Self = StObject.set(x, "rollAngle", js.undefined)
    
    @scala.inline
    def setSorrowLikelihood(value: String): Self = StObject.set(x, "sorrowLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSorrowLikelihoodUndefined: Self = StObject.set(x, "sorrowLikelihood", js.undefined)
    
    @scala.inline
    def setSurpriseLikelihood(value: String): Self = StObject.set(x, "surpriseLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurpriseLikelihoodUndefined: Self = StObject.set(x, "surpriseLikelihood", js.undefined)
    
    @scala.inline
    def setTiltAngle(value: Double): Self = StObject.set(x, "tiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltAngleUndefined: Self = StObject.set(x, "tiltAngle", js.undefined)
    
    @scala.inline
    def setUnderExposedLikelihood(value: String): Self = StObject.set(x, "underExposedLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderExposedLikelihoodUndefined: Self = StObject.set(x, "underExposedLikelihood", js.undefined)
  }
}
