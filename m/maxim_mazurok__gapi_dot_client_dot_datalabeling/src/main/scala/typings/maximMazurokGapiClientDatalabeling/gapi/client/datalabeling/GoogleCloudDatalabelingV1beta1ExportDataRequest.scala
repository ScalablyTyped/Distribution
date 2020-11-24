package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ExportDataRequest extends js.Object {
  
  /**
    * Required. Annotated dataset resource name. DataItem in Dataset and their annotations in specified annotated dataset will be exported. It's in format of
    * projects/{project_id}/datasets/{dataset_id}/annotatedDatasets/ {annotated_dataset_id}
    */
  var annotatedDataset: js.UndefOr[String] = js.native
  
  /** Optional. Filter is not supported at this moment. */
  var filter: js.UndefOr[String] = js.native
  
  /** Required. Specify the output destination. */
  var outputConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1OutputConfig] = js.native
  
  /** Email of the user who started the export task and should be notified by email. If empty no notification will be sent. */
  var userEmailAddress: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ExportDataRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ExportDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ExportDataRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ExportDataRequestOps[Self <: GoogleCloudDatalabelingV1beta1ExportDataRequest] (val x: Self) extends AnyVal {
    
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
    def setAnnotatedDataset(value: String): Self = this.set("annotatedDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotatedDataset: Self = this.set("annotatedDataset", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: GoogleCloudDatalabelingV1beta1OutputConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
    
    @scala.inline
    def setUserEmailAddress(value: String): Self = this.set("userEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEmailAddress: Self = this.set("userEmailAddress", js.undefined)
  }
}
