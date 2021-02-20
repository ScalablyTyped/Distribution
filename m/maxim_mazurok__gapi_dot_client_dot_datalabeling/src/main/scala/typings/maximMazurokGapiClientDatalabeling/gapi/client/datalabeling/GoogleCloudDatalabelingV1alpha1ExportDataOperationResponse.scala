package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1alpha1ExportDataOperationResponse extends StObject {
  
  /** Output only. The name of annotated dataset in format "projects/∗/datasets/∗/annotatedDatasets/ *". */
  var annotatedDataset: js.UndefOr[String] = js.native
  
  /** Ouptut only. The name of dataset. "projects/∗/datasets/ *" */
  var dataset: js.UndefOr[String] = js.native
  
  /** Output only. Number of examples exported successfully. */
  var exportCount: js.UndefOr[Double] = js.native
  
  /** Output only. Statistic infos of labels in the exported dataset. */
  var labelStats: js.UndefOr[GoogleCloudDatalabelingV1alpha1LabelStats] = js.native
  
  /** Output only. output_config in the ExportData request. */
  var outputConfig: js.UndefOr[GoogleCloudDatalabelingV1alpha1OutputConfig] = js.native
  
  /** Output only. Total number of examples requested to export */
  var totalCount: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1alpha1ExportDataOperationResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1alpha1ExportDataOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1alpha1ExportDataOperationResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1alpha1ExportDataOperationResponseMutableBuilder[Self <: GoogleCloudDatalabelingV1alpha1ExportDataOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotatedDataset(value: String): Self = StObject.set(x, "annotatedDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotatedDatasetUndefined: Self = StObject.set(x, "annotatedDataset", js.undefined)
    
    @scala.inline
    def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setExportCount(value: Double): Self = StObject.set(x, "exportCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportCountUndefined: Self = StObject.set(x, "exportCount", js.undefined)
    
    @scala.inline
    def setLabelStats(value: GoogleCloudDatalabelingV1alpha1LabelStats): Self = StObject.set(x, "labelStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStatsUndefined: Self = StObject.set(x, "labelStats", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: GoogleCloudDatalabelingV1alpha1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
