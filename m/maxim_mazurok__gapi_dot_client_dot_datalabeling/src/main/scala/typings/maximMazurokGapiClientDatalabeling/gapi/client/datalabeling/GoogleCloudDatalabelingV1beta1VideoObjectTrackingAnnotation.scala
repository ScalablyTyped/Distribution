package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation extends StObject {
  
  /** Label of the object tracked in this annotation. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
  
  /** The list of frames where this object track appears. */
  var objectTrackingFrames: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1ObjectTrackingFrame]] = js.undefined
  
  /** The time segment of the video to which object tracking applies. */
  var timeSegment: js.UndefOr[GoogleCloudDatalabelingV1beta1TimeSegment] = js.undefined
}
object GoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation](x: Self) {
    
    inline def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    inline def setObjectTrackingFrames(value: js.Array[GoogleCloudDatalabelingV1beta1ObjectTrackingFrame]): Self = StObject.set(x, "objectTrackingFrames", value.asInstanceOf[js.Any])
    
    inline def setObjectTrackingFramesUndefined: Self = StObject.set(x, "objectTrackingFrames", js.undefined)
    
    inline def setObjectTrackingFramesVarargs(value: GoogleCloudDatalabelingV1beta1ObjectTrackingFrame*): Self = StObject.set(x, "objectTrackingFrames", js.Array(value*))
    
    inline def setTimeSegment(value: GoogleCloudDatalabelingV1beta1TimeSegment): Self = StObject.set(x, "timeSegment", value.asInstanceOf[js.Any])
    
    inline def setTimeSegmentUndefined: Self = StObject.set(x, "timeSegment", js.undefined)
  }
}
