package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1VideoEventAnnotation extends StObject {
  
  /**
    * Label of the event in this annotation.
    */
  var annotationSpec: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
  
  /**
    * The time segment of the video to which the annotation applies.
    */
  var timeSegment: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1TimeSegment] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1VideoEventAnnotation {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1VideoEventAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1VideoEventAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1VideoEventAnnotation](x: Self) {
    
    inline def setAnnotationSpec(value: SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    inline def setTimeSegment(value: SchemaGoogleCloudDatalabelingV1beta1TimeSegment): Self = StObject.set(x, "timeSegment", value.asInstanceOf[js.Any])
    
    inline def setTimeSegmentUndefined: Self = StObject.set(x, "timeSegment", js.undefined)
  }
}
