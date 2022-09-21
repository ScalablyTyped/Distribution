package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1p1alpha1ImportDataOperationMetadata extends StObject {
  
  /**
    * Output only. Timestamp when import dataset request was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of imported dataset. "projects/x/datasets/x"
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Partial failures encountered. E.g. single files that couldn't be read. Status details field will contain standard GCP error details.
    */
  var partialFailures: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1p1alpha1ImportDataOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1p1alpha1ImportDataOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1p1alpha1ImportDataOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1p1alpha1ImportDataOperationMetadata](x: Self) {
    
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
