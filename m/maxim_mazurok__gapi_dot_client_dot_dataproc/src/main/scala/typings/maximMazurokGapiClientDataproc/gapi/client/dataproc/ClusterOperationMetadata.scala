package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOperationMetadata extends StObject {
  
  /** Output only. Child operation ids */
  var childOperationIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Name of the cluster for the operation. */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /** Output only. Cluster UUID for the operation. */
  var clusterUuid: js.UndefOr[String] = js.undefined
  
  /** Output only. Short description of operation. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Output only. Labels associated with the operation */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterOperationMetadata & TopLevel[Any]
  ] = js.undefined
  
  /** Output only. The operation type. */
  var operationType: js.UndefOr[String] = js.undefined
  
  /** Output only. Current operation status. */
  var status: js.UndefOr[ClusterOperationStatus] = js.undefined
  
  /** Output only. The previous operation status. */
  var statusHistory: js.UndefOr[js.Array[ClusterOperationStatus]] = js.undefined
  
  /** Output only. Errors encountered during operation execution. */
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object ClusterOperationMetadata {
  
  inline def apply(): ClusterOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationMetadata]
  }
  
  extension [Self <: ClusterOperationMetadata](x: Self) {
    
    inline def setChildOperationIds(value: js.Array[String]): Self = StObject.set(x, "childOperationIds", value.asInstanceOf[js.Any])
    
    inline def setChildOperationIdsUndefined: Self = StObject.set(x, "childOperationIds", js.undefined)
    
    inline def setChildOperationIdsVarargs(value: String*): Self = StObject.set(x, "childOperationIds", js.Array(value*))
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    inline def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterOperationMetadata & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setStatus(value: ClusterOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusHistory(value: js.Array[ClusterOperationStatus]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    inline def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    inline def setStatusHistoryVarargs(value: ClusterOperationStatus*): Self = StObject.set(x, "statusHistory", js.Array(value*))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
