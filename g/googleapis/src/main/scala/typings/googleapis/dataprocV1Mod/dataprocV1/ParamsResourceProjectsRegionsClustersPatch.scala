package typings.googleapis.dataprocV1Mod.dataprocV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRegionsClustersPatch
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
    * Optional. Timeout for graceful YARN decomissioning. Graceful
    * decommissioning allows removing nodes from the cluster without
    * interrupting jobs in progress. Timeout specifies how long to wait for
    * jobs in progress to finish before forcefully removing nodes (and
    * potentially interrupting jobs). Default timeout is 0 (for forceful
    * decommission), and the maximum allowed timeout is 1 day.Only supported on
    * Dataproc image versions 1.2 and higher.
    */
  var gracefulDecommissionTimeout: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the Google Cloud Platform project the cluster belongs
    * to.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Cloud Dataproc region in which to handle the request.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCluster] = js.undefined
  
  /**
    * Optional. A unique id used to identify the request. If the server
    * receives two UpdateClusterRequest requests with the same id, then the
    * second request will be ignored and the first google.longrunning.Operation
    * created and stored in the backend is returned.It is recommended to always
    * set this value to a UUID
    * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must
    * contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and
    * hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Specifies the path, relative to Cluster, of the field to
    * update. For example, to change the number of workers in a cluster to 5,
    * the update_mask parameter would be specified as
    * config.worker_config.num_instances, and the PATCH request body would
    * specify the new value, as follows: {   "config":{     "workerConfig":{
    * "numInstances":"5"     }   } } Similarly, to change the number of
    * preemptible workers in a cluster to 5, the update_mask parameter would be
    * config.secondary_worker_config.num_instances, and the PATCH request body
    * would be set as follows: {   "config":{     "secondaryWorkerConfig":{
    * "numInstances":"5"     }   } } <strong>Note:</strong> Currently, only the
    * following fields can be updated:<table>  <tbody>  <tr>
    * <td><strong>Mask</strong></td>  <td><strong>Purpose</strong></td>  </tr>
    * <tr>  <td><strong><em>labels</em></strong></td>  <td>Update labels</td>
    * </tr>  <tr>
    * <td><strong><em>config.worker_config.num_instances</em></strong></td>
    * <td>Resize primary worker group</td>  </tr>  <tr>
    * <td><strong><em>config.secondary_worker_config.num_instances</em></strong></td>
    * <td>Resize secondary worker group</td>  </tr>  </tbody>  </table>
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsRegionsClustersPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsRegionsClustersPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsClustersPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsRegionsClustersPatchMutableBuilder[Self <: ParamsResourceProjectsRegionsClustersPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    @scala.inline
    def setGracefulDecommissionTimeout(value: String): Self = StObject.set(x, "gracefulDecommissionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGracefulDecommissionTimeoutUndefined: Self = StObject.set(x, "gracefulDecommissionTimeout", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaCluster): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
