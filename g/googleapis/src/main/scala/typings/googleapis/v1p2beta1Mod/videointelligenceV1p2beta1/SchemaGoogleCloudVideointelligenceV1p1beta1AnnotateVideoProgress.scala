package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoProgress extends StObject {
  
  /**
    * Progress metadata for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationProgress: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1VideoAnnotationProgress]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoProgress {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoProgress]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoProgress](x: Self) {
    
    inline def setAnnotationProgress(value: js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1VideoAnnotationProgress]): Self = StObject.set(x, "annotationProgress", value.asInstanceOf[js.Any])
    
    inline def setAnnotationProgressUndefined: Self = StObject.set(x, "annotationProgress", js.undefined)
    
    inline def setAnnotationProgressVarargs(value: SchemaGoogleCloudVideointelligenceV1p1beta1VideoAnnotationProgress*): Self = StObject.set(x, "annotationProgress", js.Array(value*))
  }
}
