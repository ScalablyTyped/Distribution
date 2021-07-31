package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRegionsClustersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. The cluster name.
    */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Specifying the cluster_uuid means the RPC should fail (with
    * error NOT_FOUND) if cluster with specified UUID does not exist.
    */
  var clusterUuid: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the Google Cloud Platform project that the cluster
    * belongs to.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Cloud Dataproc region in which to handle the request.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A unique id used to identify the request. If the server
    * receives two DeleteClusterRequest requests with the same id, then the
    * second request will be ignored and the first google.longrunning.Operation
    * created and stored in the backend is returned.It is recommended to always
    * set this value to a UUID
    * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must
    * contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and
    * hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsRegionsClustersDelete {
  
  @scala.inline
  def apply(): ParamsResourceProjectsRegionsClustersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsClustersDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsRegionsClustersDeleteMutableBuilder[Self <: ParamsResourceProjectsRegionsClustersDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    @scala.inline
    def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
