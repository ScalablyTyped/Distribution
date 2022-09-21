package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1alpha1ExportDataOperationMetadata extends StObject {
  
  /**
    * Output only. The name of annotated dataset in format "projects/x/datasets/x/annotatedDatasets/x".
    */
  var annotatedDataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp when export dataset request was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of dataset to be exported. "projects/x/datasets/x"
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Partial failures encountered. E.g. single files that couldn't be read. Status details field will contain standard GCP error details.
    */
  var partialFailures: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1alpha1ExportDataOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1alpha1ExportDataOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1alpha1ExportDataOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1alpha1ExportDataOperationMetadata](x: Self) {
    
    inline def setAnnotatedDataset(value: String): Self = StObject.set(x, "annotatedDataset", value.asInstanceOf[js.Any])
    
    inline def setAnnotatedDatasetNull: Self = StObject.set(x, "annotatedDataset", null)
    
    inline def setAnnotatedDatasetUndefined: Self = StObject.set(x, "annotatedDataset", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setPartialFailures(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "partialFailures", value.asInstanceOf[js.Any])
    
    inline def setPartialFailuresUndefined: Self = StObject.set(x, "partialFailures", js.undefined)
    
    inline def setPartialFailuresVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "partialFailures", js.Array(value*))
  }
}
