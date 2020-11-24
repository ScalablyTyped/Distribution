package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation extends js.Object {
  
  /** Label of image. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.native
}
object GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ImageClassificationAnnotationOps[Self <: GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation] (val x: Self) extends AnyVal {
    
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
  }
}
