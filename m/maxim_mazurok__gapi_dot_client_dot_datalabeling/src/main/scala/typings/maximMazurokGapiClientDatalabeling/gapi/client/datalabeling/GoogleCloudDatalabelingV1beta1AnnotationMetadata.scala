package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1AnnotationMetadata extends js.Object {
  
  /** Metadata related to human labeling. */
  var operatorMetadata: js.UndefOr[GoogleCloudDatalabelingV1beta1OperatorMetadata] = js.native
}
object GoogleCloudDatalabelingV1beta1AnnotationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1AnnotationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1AnnotationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1AnnotationMetadataOps[Self <: GoogleCloudDatalabelingV1beta1AnnotationMetadata] (val x: Self) extends AnyVal {
    
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
    def setOperatorMetadata(value: GoogleCloudDatalabelingV1beta1OperatorMetadata): Self = this.set("operatorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorMetadata: Self = this.set("operatorMetadata", js.undefined)
  }
}
