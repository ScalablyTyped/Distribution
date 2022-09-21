package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation extends StObject {
  
  /**
    * Label of the text entities.
    */
  var annotationSpec: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
  
  /**
    * Position of the entity.
    */
  var sequentialSegment: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1SequentialSegment] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation](x: Self) {
    
    inline def setAnnotationSpec(value: SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    inline def setSequentialSegment(value: SchemaGoogleCloudDatalabelingV1beta1SequentialSegment): Self = StObject.set(x, "sequentialSegment", value.asInstanceOf[js.Any])
    
    inline def setSequentialSegmentUndefined: Self = StObject.set(x, "sequentialSegment", js.undefined)
  }
}
