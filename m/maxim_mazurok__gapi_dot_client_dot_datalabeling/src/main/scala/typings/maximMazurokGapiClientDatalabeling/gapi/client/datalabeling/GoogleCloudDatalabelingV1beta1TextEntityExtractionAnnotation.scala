package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation extends js.Object {
  
  /** Label of the text entities. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.native
  
  /** Position of the entity. */
  var sequentialSegment: js.UndefOr[GoogleCloudDatalabelingV1beta1SequentialSegment] = js.native
}
object GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotationOps[Self <: GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation] (val x: Self) extends AnyVal {
    
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
    def setSequentialSegment(value: GoogleCloudDatalabelingV1beta1SequentialSegment): Self = this.set("sequentialSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequentialSegment: Self = this.set("sequentialSegment", js.undefined)
  }
}
