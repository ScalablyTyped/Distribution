package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ImportDataOperationResponse extends js.Object {
  
  /** Ouptut only. The name of imported dataset. */
  var dataset: js.UndefOr[String] = js.native
  
  /** Output only. Number of examples imported successfully. */
  var importCount: js.UndefOr[Double] = js.native
  
  /** Output only. Total number of examples requested to import */
  var totalCount: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1ImportDataOperationResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ImportDataOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImportDataOperationResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ImportDataOperationResponseOps[Self <: GoogleCloudDatalabelingV1beta1ImportDataOperationResponse] (val x: Self) extends AnyVal {
    
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
    def setDataset(value: String): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setImportCount(value: Double): Self = this.set("importCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportCount: Self = this.set("importCount", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
}
