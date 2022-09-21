package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartClusterRequest extends StObject {
  
  /** Optional. Specifying the cluster_uuid means the RPC will fail (with error NOT_FOUND) if a cluster with the specified UUID does not exist. */
  var clusterUuid: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A unique ID used to identify the request. If the server receives two StartClusterRequest
    * (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.StartClusterRequest)s with the same id, then the second request will be
    * ignored and the first google.longrunning.Operation created and stored in the backend is returned.Recommendation: Set this value to a UUID
    * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40
    * characters.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object StartClusterRequest {
  
  inline def apply(): StartClusterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartClusterRequest]
  }
  
  extension [Self <: StartClusterRequest](x: Self) {
    
    inline def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    inline def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
