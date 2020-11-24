package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1p2alpha1ExportDataOperationMetadata extends js.Object {
  
  /** Output only. The name of annotated dataset in format "projects/∗/datasets/∗/annotatedDatasets/ *". */
  var annotatedDataset: js.UndefOr[String] = js.native
  
  /** Output only. Timestamp when export dataset request was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The name of dataset to be exported. "projects/∗/datasets/ *" */
  var dataset: js.UndefOr[String] = js.native
  
  /** Output only. Partial failures encountered. E.g. single files that couldn't be read. Status details field will contain standard GCP error details. */
  var partialFailures: js.UndefOr[js.Array[GoogleRpcStatus]] = js.native
}
object GoogleCloudDatalabelingV1p2alpha1ExportDataOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p2alpha1ExportDataOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p2alpha1ExportDataOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p2alpha1ExportDataOperationMetadataOps[Self <: GoogleCloudDatalabelingV1p2alpha1ExportDataOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDataset(value: String): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setPartialFailuresVarargs(value: GoogleRpcStatus*): Self = this.set("partialFailures", js.Array(value :_*))
    
    @scala.inline
    def setPartialFailures(value: js.Array[GoogleRpcStatus]): Self = this.set("partialFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialFailures: Self = this.set("partialFailures", js.undefined)
  }
}
