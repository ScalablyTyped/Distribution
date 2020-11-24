package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest extends js.Object {
  
  /** Required. Annotation spec set to create. Annotation specs must be included. Only one annotation spec will be accepted for annotation specs with same display_name. */
  var annotationSpecSet: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
}
object GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequestOps[Self <: GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest] (val x: Self) extends AnyVal {
    
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
    def setAnnotationSpecSet(value: GoogleCloudDatalabelingV1beta1AnnotationSpecSet): Self = this.set("annotationSpecSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSpecSet: Self = this.set("annotationSpecSet", js.undefined)
  }
}
