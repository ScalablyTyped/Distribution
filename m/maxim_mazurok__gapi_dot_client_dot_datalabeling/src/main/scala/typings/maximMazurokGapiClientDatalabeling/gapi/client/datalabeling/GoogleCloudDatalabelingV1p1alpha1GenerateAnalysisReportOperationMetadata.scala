package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1p1alpha1GenerateAnalysisReportOperationMetadata extends StObject {
  
  /** Timestamp when generate report request was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The name of the dataset for which the analysis report is generated. Format: "projects/ *‍/datasets/ *" */
  var dataset: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1p1alpha1GenerateAnalysisReportOperationMetadata {
  
  inline def apply(): GoogleCloudDatalabelingV1p1alpha1GenerateAnalysisReportOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p1alpha1GenerateAnalysisReportOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1p1alpha1GenerateAnalysisReportOperationMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
  }
}
