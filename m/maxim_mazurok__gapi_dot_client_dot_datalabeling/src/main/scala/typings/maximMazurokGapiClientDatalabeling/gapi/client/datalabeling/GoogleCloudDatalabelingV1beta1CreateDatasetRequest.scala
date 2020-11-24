package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1CreateDatasetRequest extends js.Object {
  
  /** Required. The dataset to be created. */
  var dataset: js.UndefOr[GoogleCloudDatalabelingV1beta1Dataset] = js.native
}
object GoogleCloudDatalabelingV1beta1CreateDatasetRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1CreateDatasetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1CreateDatasetRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1CreateDatasetRequestOps[Self <: GoogleCloudDatalabelingV1beta1CreateDatasetRequest] (val x: Self) extends AnyVal {
    
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
    def setDataset(value: GoogleCloudDatalabelingV1beta1Dataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
  }
}
