package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1VideoEventAnnotation extends StObject {
  
  /** Label of the event in this annotation. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.native
  
  /** The time segment of the video to which the annotation applies. */
  var timeSegment: js.UndefOr[GoogleCloudDatalabelingV1beta1TimeSegment] = js.native
}
object GoogleCloudDatalabelingV1beta1VideoEventAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1VideoEventAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1VideoEventAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1VideoEventAnnotationMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1VideoEventAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    @scala.inline
    def setTimeSegment(value: GoogleCloudDatalabelingV1beta1TimeSegment): Self = StObject.set(x, "timeSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSegmentUndefined: Self = StObject.set(x, "timeSegment", js.undefined)
  }
}
