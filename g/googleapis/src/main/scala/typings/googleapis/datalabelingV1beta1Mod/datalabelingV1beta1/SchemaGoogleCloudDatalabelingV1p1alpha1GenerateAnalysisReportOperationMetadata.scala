package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1p1alpha1GenerateAnalysisReportOperationMetadata extends StObject {
  
  /**
    * Timestamp when generate report request was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the dataset for which the analysis report is generated. Format: "projects/x/datasets/x"
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1p1alpha1GenerateAnalysisReportOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1p1alpha1GenerateAnalysisReportOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1p1alpha1GenerateAnalysisReportOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1p1alpha1GenerateAnalysisReportOperationMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
  }
}
