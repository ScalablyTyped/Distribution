package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepairClusterRequest extends StObject {
  
  /** Optional. Specifying the cluster_uuid means the RPC will fail (with error NOT_FOUND) if a cluster with the specified UUID does not exist. */
  var clusterUuid: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Timeout for graceful YARN decomissioning. Graceful decommissioning facilitates the removal of cluster nodes without interrupting jobs in progress. The timeout specifies
    * the amount of time to wait for jobs finish before forcefully removing nodes. The default timeout is 0 for forceful decommissioning, and the maximum timeout period is 1 day. (see
    * JSON Mapping—Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).graceful_decommission_timeout is supported in Dataproc image versions 1.2+.
    */
  var gracefulDecommissionTimeout: js.UndefOr[String] = js.undefined
  
  /** Optional. Node pools and corresponding repair action to be taken. All node pools should be unique in this request. i.e. Multiple entries for the same node pool id are not allowed. */
  var nodePools: js.UndefOr[js.Array[NodePool]] = js.undefined
  
  /** Optional. operation id of the parent operation sending the repair request */
  var parentOperationId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A unique ID used to identify the request. If the server receives two RepairClusterRequests with the same ID, the second request is ignored, and the first
    * google.longrunning.Operation created and stored in the backend is returned.Recommendation: Set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The
    * ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object RepairClusterRequest {
  
  inline def apply(): RepairClusterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepairClusterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepairClusterRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    inline def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    inline def setGracefulDecommissionTimeout(value: String): Self = StObject.set(x, "gracefulDecommissionTimeout", value.asInstanceOf[js.Any])
    
    inline def setGracefulDecommissionTimeoutUndefined: Self = StObject.set(x, "gracefulDecommissionTimeout", js.undefined)
    
    inline def setNodePools(value: js.Array[NodePool]): Self = StObject.set(x, "nodePools", value.asInstanceOf[js.Any])
    
    inline def setNodePoolsUndefined: Self = StObject.set(x, "nodePools", js.undefined)
    
    inline def setNodePoolsVarargs(value: NodePool*): Self = StObject.set(x, "nodePools", js.Array(value*))
    
    inline def setParentOperationId(value: String): Self = StObject.set(x, "parentOperationId", value.asInstanceOf[js.Any])
    
    inline def setParentOperationIdUndefined: Self = StObject.set(x, "parentOperationId", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
