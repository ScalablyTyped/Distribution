package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Streaming annotation results corresponding to a portion of the video that
  * is currently being processed.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults extends js.Object {
  
  /**
    * Explicit content annotation results.
    */
  var explicitAnnotation: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation] = js.native
  
  /**
    * Label annotation results.
    */
  var labelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation]] = js.native
  
  /**
    * Object tracking results.
    */
  var objectAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation]] = js.native
  
  /**
    * Shot annotation results. Each shot is represented as a video segment.
    */
  var shotAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment]] = js.native
}
object SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResultsOps[Self <: SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExplicitAnnotation(value: SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation): Self = this.set("explicitAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitAnnotation: Self = this.set("explicitAnnotation", js.undefined)
    
    @scala.inline
    def setLabelAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation*): Self = this.set("labelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation]): Self = this.set("labelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAnnotations: Self = this.set("labelAnnotations", js.undefined)
    
    @scala.inline
    def setObjectAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation*): Self = this.set("objectAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setObjectAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation]): Self = this.set("objectAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectAnnotations: Self = this.set("objectAnnotations", js.undefined)
    
    @scala.inline
    def setShotAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment*): Self = this.set("shotAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setShotAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment]): Self = this.set("shotAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShotAnnotations: Self = this.set("shotAnnotations", js.undefined)
  }
}
