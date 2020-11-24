package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1p1alpha1ExportDataOperationResponse extends js.Object {
  
  /** Output only. The name of annotated dataset in format "projects/∗/datasets/∗/annotatedDatasets/ *". */
  var annotatedDataset: js.UndefOr[String] = js.native
  
  /** Ouptut only. The name of dataset. "projects/∗/datasets/ *" */
  var dataset: js.UndefOr[String] = js.native
  
  /** Output only. Number of examples exported successfully. */
  var exportCount: js.UndefOr[Double] = js.native
  
  /** Output only. Statistic infos of labels in the exported dataset. */
  var labelStats: js.UndefOr[GoogleCloudDatalabelingV1p1alpha1LabelStats] = js.native
  
  /** Output only. output_config in the ExportData request. */
  var outputConfig: js.UndefOr[GoogleCloudDatalabelingV1p1alpha1OutputConfig] = js.native
  
  /** Output only. Total number of examples requested to export */
  var totalCount: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1p1alpha1ExportDataOperationResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p1alpha1ExportDataOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p1alpha1ExportDataOperationResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p1alpha1ExportDataOperationResponseOps[Self <: GoogleCloudDatalabelingV1p1alpha1ExportDataOperationResponse] (val x: Self) extends AnyVal {
    
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
    def setDataset(value: String): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setExportCount(value: Double): Self = this.set("exportCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportCount: Self = this.set("exportCount", js.undefined)
    
    @scala.inline
    def setLabelStats(value: GoogleCloudDatalabelingV1p1alpha1LabelStats): Self = this.set("labelStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStats: Self = this.set("labelStats", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: GoogleCloudDatalabelingV1p1alpha1OutputConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
}
