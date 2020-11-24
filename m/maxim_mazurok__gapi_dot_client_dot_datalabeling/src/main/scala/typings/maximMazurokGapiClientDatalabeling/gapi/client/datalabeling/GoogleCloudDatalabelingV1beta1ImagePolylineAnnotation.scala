package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation extends js.Object {
  
  /** Label of this polyline. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.native
  
  var normalizedPolyline: js.UndefOr[GoogleCloudDatalabelingV1beta1NormalizedPolyline] = js.native
  
  var polyline: js.UndefOr[GoogleCloudDatalabelingV1beta1Polyline] = js.native
}
object GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ImagePolylineAnnotationOps[Self <: GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation] (val x: Self) extends AnyVal {
    
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
    def setNormalizedPolyline(value: GoogleCloudDatalabelingV1beta1NormalizedPolyline): Self = this.set("normalizedPolyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedPolyline: Self = this.set("normalizedPolyline", js.undefined)
    
    @scala.inline
    def setPolyline(value: GoogleCloudDatalabelingV1beta1Polyline): Self = this.set("polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolyline: Self = this.set("polyline", js.undefined)
  }
}
