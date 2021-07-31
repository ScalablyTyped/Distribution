package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

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
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponseMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationResults(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults]): Self = StObject.set(x, "annotationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationResultsUndefined: Self = StObject.set(x, "annotationResults", js.undefined)
    
    @scala.inline
    def setAnnotationResultsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults*): Self = StObject.set(x, "annotationResults", js.Array(value :_*))
  }
}
