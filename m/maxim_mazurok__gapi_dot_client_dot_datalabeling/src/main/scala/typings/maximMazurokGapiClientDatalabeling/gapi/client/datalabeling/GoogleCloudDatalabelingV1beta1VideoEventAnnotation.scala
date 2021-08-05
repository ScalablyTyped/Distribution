package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1VideoEventAnnotation extends StObject {
  
  /** Label of the event in this annotation. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
  
  /** The time segment of the video to which the annotation applies. */
  var timeSegment: js.UndefOr[GoogleCloudDatalabelingV1beta1TimeSegment] = js.undefined
}
object GoogleCloudDatalabelingV1beta1VideoEventAnnotation {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1VideoEventAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1VideoEventAnnotation]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1VideoEventAnnotation](x: Self) {
    
    inline def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    inline def setTimeSegment(value: GoogleCloudDatalabelingV1beta1TimeSegment): Self = StObject.set(x, "timeSegment", value.asInstanceOf[js.Any])
    
    inline def setTimeSegmentUndefined: Self = StObject.set(x, "timeSegment", js.undefined)
  }
}
