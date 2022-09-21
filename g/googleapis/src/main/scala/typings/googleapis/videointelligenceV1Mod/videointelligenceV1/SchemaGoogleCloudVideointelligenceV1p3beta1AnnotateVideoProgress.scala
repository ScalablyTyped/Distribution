package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress extends StObject {
  
  /**
    * Progress metadata for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationProgress: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress](x: Self) {
    
    inline def setAnnotationProgress(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress]): Self = StObject.set(x, "annotationProgress", value.asInstanceOf[js.Any])
    
    inline def setAnnotationProgressUndefined: Self = StObject.set(x, "annotationProgress", js.undefined)
    
    inline def setAnnotationProgressVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress*): Self = StObject.set(x, "annotationProgress", js.Array(value*))
  }
}
