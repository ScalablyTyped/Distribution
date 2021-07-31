package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOperationMetadata extends StObject {
  
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
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterOperationMetadata & TopLevel[js.Any]
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
  
  @scala.inline
  def apply(): ClusterOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationMetadata]
  }
  
  @scala.inline
  implicit class ClusterOperationMetadataMutableBuilder[Self <: ClusterOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    @scala.inline
    def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterOperationMetadata & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setStatus(value: ClusterOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusHistory(value: js.Array[ClusterOperationStatus]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    @scala.inline
    def setStatusHistoryVarargs(value: ClusterOperationStatus*): Self = StObject.set(x, "statusHistory", js.Array(value :_*))
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
