package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video annotation progress. Included in the `metadata` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress extends StObject {
  
  /**
    * Progress metadata for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationProgress: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationProgress]] = js.native
}
object SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgressMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationProgress(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationProgress]): Self = StObject.set(x, "annotationProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationProgressUndefined: Self = StObject.set(x, "annotationProgress", js.undefined)
    
    @scala.inline
    def setAnnotationProgressVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationProgress*): Self = StObject.set(x, "annotationProgress", js.Array(value :_*))
  }
}
