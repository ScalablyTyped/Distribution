package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataDatasetResyncStatus extends StObject {
  
  /**
    * The type of the inconsistency of the dataset.
    */
  var datasetInconsistencyType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of resyncing the dataset with regards to the detected inconsistency. Empty if `validate_only` is true in the request.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataDatasetResyncStatus {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataDatasetResyncStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataDatasetResyncStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataDatasetResyncStatus](x: Self) {
    
    inline def setDatasetInconsistencyType(value: String): Self = StObject.set(x, "datasetInconsistencyType", value.asInstanceOf[js.Any])
    
    inline def setDatasetInconsistencyTypeNull: Self = StObject.set(x, "datasetInconsistencyType", null)
    
    inline def setDatasetInconsistencyTypeUndefined: Self = StObject.set(x, "datasetInconsistencyType", js.undefined)
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
