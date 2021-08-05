package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video annotation response. Included in the `response` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
trait SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse extends StObject {
  
  /**
    * Annotation results for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationResults: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse](x: Self) {
    
    inline def setAnnotationResults(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults]): Self = StObject.set(x, "annotationResults", value.asInstanceOf[js.Any])
    
    inline def setAnnotationResultsUndefined: Self = StObject.set(x, "annotationResults", js.undefined)
    
    inline def setAnnotationResultsVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults*): Self = StObject.set(x, "annotationResults", js.Array(value :_*))
  }
}
