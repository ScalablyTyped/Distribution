package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry extends js.Object {
  
  /** The annotation spec of a predicted label. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.native
  
  /** Number of items predicted to have this label. (The ground truth label for these items is the `Row.annotationSpec` of this entry's parent.) */
  var itemCount: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ConfusionMatrixEntryOps[Self <: GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry] (val x: Self) extends AnyVal {
    
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
    def setItemCount(value: Double): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCount: Self = this.set("itemCount", js.undefined)
  }
}
