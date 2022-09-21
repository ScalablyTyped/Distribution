package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress extends StObject {
  
  /**
    * Progress metadata for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationProgress: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationProgress]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress](x: Self) {
    
    inline def setAnnotationProgress(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationProgress]): Self = StObject.set(x, "annotationProgress", value.asInstanceOf[js.Any])
    
    inline def setAnnotationProgressUndefined: Self = StObject.set(x, "annotationProgress", js.undefined)
    
    inline def setAnnotationProgressVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationProgress*): Self = StObject.set(x, "annotationProgress", js.Array(value*))
  }
}
