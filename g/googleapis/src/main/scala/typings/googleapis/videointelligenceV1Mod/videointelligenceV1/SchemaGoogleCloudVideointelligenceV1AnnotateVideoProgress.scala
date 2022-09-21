package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1AnnotateVideoProgress extends StObject {
  
  /**
    * Progress metadata for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationProgress: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1VideoAnnotationProgress]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1AnnotateVideoProgress {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1AnnotateVideoProgress]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1AnnotateVideoProgress](x: Self) {
    
    inline def setAnnotationProgress(value: js.Array[SchemaGoogleCloudVideointelligenceV1VideoAnnotationProgress]): Self = StObject.set(x, "annotationProgress", value.asInstanceOf[js.Any])
    
    inline def setAnnotationProgressUndefined: Self = StObject.set(x, "annotationProgress", js.undefined)
    
    inline def setAnnotationProgressVarargs(value: SchemaGoogleCloudVideointelligenceV1VideoAnnotationProgress*): Self = StObject.set(x, "annotationProgress", js.Array(value*))
  }
}
