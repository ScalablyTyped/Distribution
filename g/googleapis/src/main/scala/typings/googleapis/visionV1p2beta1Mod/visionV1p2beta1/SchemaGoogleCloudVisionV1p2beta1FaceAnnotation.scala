package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A face annotation object contains the results of face detection.
  */
trait SchemaGoogleCloudVisionV1p2beta1FaceAnnotation extends StObject {
  
  /**
    * Anger likelihood.
    */
  var angerLikelihood: js.UndefOr[String] = js.undefined
  
  /**
    * Blurred likelihood.
    */
  var blurredLikelihood: js.UndefOr[String] = js.undefined
  
  /**
    * The bounding polygon around the face. The coordinates of the bounding box
    * are in the original image&#39;s scale. The bounding box is computed to
    * &quot;frame&quot; the face in accordance with human expectations. It is
    * based on the landmarker results. Note that one or more x and/or y
    * coordinates may not be generated in the `BoundingPoly` (the polygon will
    * be unbounded) if only a partial face appears in the image to be
    * annotated.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1BoundingPoly] = js.undefined
  
  /**
    * Detection confidence. Range [0, 1].
    */
  var detectionConfidence: js.UndefOr[Double] = js.undefined
  
  /**
    * The `fd_bounding_poly` bounding polygon is tighter than the
    * `boundingPoly`, and encloses only the skin part of the face. Typically,
    * it is used to eliminate the face from any image analysis that detects the
    * &quot;amount of skin&quot; visible in an image. It is not based on the
    * landmarker results, only on the initial face detection, hence the
    * &lt;code&gt;fd&lt;/code&gt; (face detection) prefix.
    */
  var fdBoundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1BoundingPoly] = js.undefined
  
  /**
    * Headwear likelihood.
    */
  var headwearLikelihood: js.UndefOr[String] = js.undefined
  
  /**
    * Joy likelihood.
    */
  var joyLikelihood: js.UndefOr[String] = js.undefined
  
  /**
    * Face landmarking confidence. Range [0, 1].
    */
  var landmarkingConfidence: js.UndefOr[Double] = js.undefined
  
  /**
    * Detected face landmarks.
    */
  var landmarks: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1FaceAnnotationLandmark]] = js.undefined
  
  /**
    * Yaw angle, which indicates the leftward/rightward angle that the face is
    * pointing relative to the vertical plane perpendicular to the image. Range
    * [-180,180].
    */
  var panAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Roll angle, which indicates the amount of clockwise/anti-clockwise
    * rotation of the face relative to the image vertical about the axis
    * perpendicular to the face. Range [-180,180].
    */
  var rollAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Sorrow likelihood.
    */
  var sorrowLikelihood: js.UndefOr[String] = js.undefined
  
  /**
    * Surprise likelihood.
    */
  var surpriseLikelihood: js.UndefOr[String] = js.undefined
  
  /**
    * Pitch angle, which indicates the upwards/downwards angle that the face is
    * pointing relative to the image&#39;s horizontal plane. Range [-180,180].
    */
  var tiltAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Under-exposed likelihood.
    */
  var underExposedLikelihood: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1FaceAnnotation {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1FaceAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1FaceAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1FaceAnnotation](x: Self) {
    
    inline def setAngerLikelihood(value: String): Self = StObject.set(x, "angerLikelihood", value.asInstanceOf[js.Any])
    
    inline def setAngerLikelihoodUndefined: Self = StObject.set(x, "angerLikelihood", js.undefined)
    
    inline def setBlurredLikelihood(value: String): Self = StObject.set(x, "blurredLikelihood", value.asInstanceOf[js.Any])
    
    inline def setBlurredLikelihoodUndefined: Self = StObject.set(x, "blurredLikelihood", js.undefined)
    
    inline def setBoundingPoly(value: SchemaGoogleCloudVisionV1p2beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    inline def setDetectionConfidence(value: Double): Self = StObject.set(x, "detectionConfidence", value.asInstanceOf[js.Any])
    
    inline def setDetectionConfidenceUndefined: Self = StObject.set(x, "detectionConfidence", js.undefined)
    
    inline def setFdBoundingPoly(value: SchemaGoogleCloudVisionV1p2beta1BoundingPoly): Self = StObject.set(x, "fdBoundingPoly", value.asInstanceOf[js.Any])
    
    inline def setFdBoundingPolyUndefined: Self = StObject.set(x, "fdBoundingPoly", js.undefined)
    
    inline def setHeadwearLikelihood(value: String): Self = StObject.set(x, "headwearLikelihood", value.asInstanceOf[js.Any])
    
    inline def setHeadwearLikelihoodUndefined: Self = StObject.set(x, "headwearLikelihood", js.undefined)
    
    inline def setJoyLikelihood(value: String): Self = StObject.set(x, "joyLikelihood", value.asInstanceOf[js.Any])
    
    inline def setJoyLikelihoodUndefined: Self = StObject.set(x, "joyLikelihood", js.undefined)
    
    inline def setLandmarkingConfidence(value: Double): Self = StObject.set(x, "landmarkingConfidence", value.asInstanceOf[js.Any])
    
    inline def setLandmarkingConfidenceUndefined: Self = StObject.set(x, "landmarkingConfidence", js.undefined)
    
    inline def setLandmarks(value: js.Array[SchemaGoogleCloudVisionV1p2beta1FaceAnnotationLandmark]): Self = StObject.set(x, "landmarks", value.asInstanceOf[js.Any])
    
    inline def setLandmarksUndefined: Self = StObject.set(x, "landmarks", js.undefined)
    
    inline def setLandmarksVarargs(value: SchemaGoogleCloudVisionV1p2beta1FaceAnnotationLandmark*): Self = StObject.set(x, "landmarks", js.Array(value :_*))
    
    inline def setPanAngle(value: Double): Self = StObject.set(x, "panAngle", value.asInstanceOf[js.Any])
    
    inline def setPanAngleUndefined: Self = StObject.set(x, "panAngle", js.undefined)
    
    inline def setRollAngle(value: Double): Self = StObject.set(x, "rollAngle", value.asInstanceOf[js.Any])
    
    inline def setRollAngleUndefined: Self = StObject.set(x, "rollAngle", js.undefined)
    
    inline def setSorrowLikelihood(value: String): Self = StObject.set(x, "sorrowLikelihood", value.asInstanceOf[js.Any])
    
    inline def setSorrowLikelihoodUndefined: Self = StObject.set(x, "sorrowLikelihood", js.undefined)
    
    inline def setSurpriseLikelihood(value: String): Self = StObject.set(x, "surpriseLikelihood", value.asInstanceOf[js.Any])
    
    inline def setSurpriseLikelihoodUndefined: Self = StObject.set(x, "surpriseLikelihood", js.undefined)
    
    inline def setTiltAngle(value: Double): Self = StObject.set(x, "tiltAngle", value.asInstanceOf[js.Any])
    
    inline def setTiltAngleUndefined: Self = StObject.set(x, "tiltAngle", js.undefined)
    
    inline def setUnderExposedLikelihood(value: String): Self = StObject.set(x, "underExposedLikelihood", value.asInstanceOf[js.Any])
    
    inline def setUnderExposedLikelihoodUndefined: Self = StObject.set(x, "underExposedLikelihood", js.undefined)
  }
}
