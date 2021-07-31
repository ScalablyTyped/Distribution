package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video annotation progress. Included in the `metadata` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
trait SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress extends StObject {
  
  /**
    * Progress metadata for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationProgress: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgressMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationProgress(value: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress]): Self = StObject.set(x, "annotationProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationProgressUndefined: Self = StObject.set(x, "annotationProgress", js.undefined)
    
    @scala.inline
    def setAnnotationProgressVarargs(value: SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress*): Self = StObject.set(x, "annotationProgress", js.Array(value :_*))
  }
}
