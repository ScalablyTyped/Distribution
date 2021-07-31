package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Label annotation.
  */
trait SchemaGoogleCloudVideointelligenceV1p1beta1LabelAnnotation extends StObject {
  
  /**
    * Common categories for the detected entity. E.g. when the label is
    * `Terrier` the category is likely `dog`. And in some cases there might be
    * more than one categories e.g. `Terrier` could also be a `pet`.
    */
  var categoryEntities: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1Entity]] = js.undefined
  
  /**
    * Detected entity.
    */
  var entity: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p1beta1Entity] = js.undefined
  
  /**
    * All video frames where a label was detected.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1LabelFrame]] = js.undefined
  
  /**
    * All video segments where a label was detected.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegment]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p1beta1LabelAnnotation {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p1beta1LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1LabelAnnotation]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p1beta1LabelAnnotationMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1p1beta1LabelAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryEntities(value: js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1Entity]): Self = StObject.set(x, "categoryEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryEntitiesUndefined: Self = StObject.set(x, "categoryEntities", js.undefined)
    
    @scala.inline
    def setCategoryEntitiesVarargs(value: SchemaGoogleCloudVideointelligenceV1p1beta1Entity*): Self = StObject.set(x, "categoryEntities", js.Array(value :_*))
    
    @scala.inline
    def setEntity(value: SchemaGoogleCloudVideointelligenceV1p1beta1Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1LabelFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: SchemaGoogleCloudVideointelligenceV1p1beta1LabelFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
