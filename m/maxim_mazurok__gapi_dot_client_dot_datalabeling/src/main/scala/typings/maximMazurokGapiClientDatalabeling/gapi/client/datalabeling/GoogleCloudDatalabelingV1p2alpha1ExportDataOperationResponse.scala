package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse extends StObject {
  
  /** Output only. The name of annotated dataset in format "projects/∗/datasets/∗/annotatedDatasets/ *". */
  var annotatedDataset: js.UndefOr[String] = js.undefined
  
  /** Ouptut only. The name of dataset. "projects/∗/datasets/ *" */
  var dataset: js.UndefOr[String] = js.undefined
  
  /** Output only. Number of examples exported successfully. */
  var exportCount: js.UndefOr[Double] = js.undefined
  
  /** Output only. Statistic infos of labels in the exported dataset. */
  var labelStats: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelStats] = js.undefined
  
  /** Output only. output_config in the ExportData request. */
  var outputConfig: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1OutputConfig] = js.undefined
  
  /** Output only. Total number of examples requested to export */
  var totalCount: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse {
  
  inline def apply(): GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse](x: Self) {
    
    inline def setAnnotatedDataset(value: String): Self = StObject.set(x, "annotatedDataset", value.asInstanceOf[js.Any])
    
    inline def setAnnotatedDatasetUndefined: Self = StObject.set(x, "annotatedDataset", js.undefined)
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setExportCount(value: Double): Self = StObject.set(x, "exportCount", value.asInstanceOf[js.Any])
    
    inline def setExportCountUndefined: Self = StObject.set(x, "exportCount", js.undefined)
    
    inline def setLabelStats(value: GoogleCloudDatalabelingV1p2alpha1LabelStats): Self = StObject.set(x, "labelStats", value.asInstanceOf[js.Any])
    
    inline def setLabelStatsUndefined: Self = StObject.set(x, "labelStats", js.undefined)
    
    inline def setOutputConfig(value: GoogleCloudDatalabelingV1p2alpha1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
