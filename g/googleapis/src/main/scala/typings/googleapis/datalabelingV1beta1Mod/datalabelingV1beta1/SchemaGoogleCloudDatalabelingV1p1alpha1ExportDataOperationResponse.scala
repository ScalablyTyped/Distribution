package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1p1alpha1ExportDataOperationResponse extends StObject {
  
  /**
    * Output only. The name of annotated dataset in format "projects/x/datasets/x/annotatedDatasets/x".
    */
  var annotatedDataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ouptut only. The name of dataset. "projects/x/datasets/x"
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Number of examples exported successfully.
    */
  var exportCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Statistic infos of labels in the exported dataset.
    */
  var labelStats: js.UndefOr[SchemaGoogleCloudDatalabelingV1p1alpha1LabelStats] = js.undefined
  
  /**
    * Output only. output_config in the ExportData request.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1p1alpha1OutputConfig] = js.undefined
  
  /**
    * Output only. Total number of examples requested to export
    */
  var totalCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1p1alpha1ExportDataOperationResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1p1alpha1ExportDataOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1p1alpha1ExportDataOperationResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1p1alpha1ExportDataOperationResponse](x: Self) {
    
    inline def setAnnotatedDataset(value: String): Self = StObject.set(x, "annotatedDataset", value.asInstanceOf[js.Any])
    
    inline def setAnnotatedDatasetNull: Self = StObject.set(x, "annotatedDataset", null)
    
    inline def setAnnotatedDatasetUndefined: Self = StObject.set(x, "annotatedDataset", js.undefined)
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setExportCount(value: Double): Self = StObject.set(x, "exportCount", value.asInstanceOf[js.Any])
    
    inline def setExportCountNull: Self = StObject.set(x, "exportCount", null)
    
    inline def setExportCountUndefined: Self = StObject.set(x, "exportCount", js.undefined)
    
    inline def setLabelStats(value: SchemaGoogleCloudDatalabelingV1p1alpha1LabelStats): Self = StObject.set(x, "labelStats", value.asInstanceOf[js.Any])
    
    inline def setLabelStatsUndefined: Self = StObject.set(x, "labelStats", js.undefined)
    
    inline def setOutputConfig(value: SchemaGoogleCloudDatalabelingV1p1alpha1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountNull: Self = StObject.set(x, "totalCount", null)
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
