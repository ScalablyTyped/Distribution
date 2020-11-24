package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1VideoClassificationAnnotation extends js.Object {
  
  /** Label of the segment specified by time_segment. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.native
  
  /** The time segment of the video to which the annotation applies. */
  var timeSegment: js.UndefOr[GoogleCloudDatalabelingV1beta1TimeSegment] = js.native
}
object GoogleCloudDatalabelingV1beta1VideoClassificationAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1VideoClassificationAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1VideoClassificationAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1VideoClassificationAnnotationOps[Self <: GoogleCloudDatalabelingV1beta1VideoClassificationAnnotation] (val x: Self) extends AnyVal {
    
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
    def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = this.set("annotationSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSpec: Self = this.set("annotationSpec", js.undefined)
    
    @scala.inline
    def setTimeSegment(value: GoogleCloudDatalabelingV1beta1TimeSegment): Self = this.set("timeSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSegment: Self = this.set("timeSegment", js.undefined)
  }
}
