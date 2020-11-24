package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata extends js.Object {
  
  /** Basic human annotation config used in labeling request. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1HumanAnnotationConfig] = js.native
}
object GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadataOps[Self <: GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setBasicConfig(value: GoogleCloudDatalabelingV1p2alpha1HumanAnnotationConfig): Self = this.set("basicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicConfig: Self = this.set("basicConfig", js.undefined)
  }
}
