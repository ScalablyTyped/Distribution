package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ClassificationMetadata extends js.Object {
  
  /** Whether the classification task is multi-label or not. */
  var isMultiLabel: js.UndefOr[Boolean] = js.native
}
object GoogleCloudDatalabelingV1beta1ClassificationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ClassificationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ClassificationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ClassificationMetadataOps[Self <: GoogleCloudDatalabelingV1beta1ClassificationMetadata] (val x: Self) extends AnyVal {
    
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
    def setIsMultiLabel(value: Boolean): Self = this.set("isMultiLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMultiLabel: Self = this.set("isMultiLabel", js.undefined)
  }
}
