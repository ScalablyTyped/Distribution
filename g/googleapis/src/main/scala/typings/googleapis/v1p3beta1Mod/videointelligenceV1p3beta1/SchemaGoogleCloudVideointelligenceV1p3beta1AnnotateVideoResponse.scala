package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    
    inline def setAnnotationResultsVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults*): Self = StObject.set(x, "annotationResults", js.Array(value*))
  }
}
