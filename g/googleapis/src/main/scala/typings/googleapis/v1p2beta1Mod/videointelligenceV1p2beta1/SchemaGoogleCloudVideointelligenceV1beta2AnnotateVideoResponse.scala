package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video annotation response. Included in the `response` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
trait SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse extends StObject {
  
  /**
    * Annotation results for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationResults: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse](x: Self) {
    
    inline def setAnnotationResults(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults]): Self = StObject.set(x, "annotationResults", value.asInstanceOf[js.Any])
    
    inline def setAnnotationResultsUndefined: Self = StObject.set(x, "annotationResults", js.undefined)
    
    inline def setAnnotationResultsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults*): Self = StObject.set(x, "annotationResults", js.Array(value :_*))
  }
}
