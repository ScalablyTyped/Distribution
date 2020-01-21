package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsRegionsClustersPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The cluster name.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Optional. Timeout for graceful YARN decomissioning. Graceful
    * decommissioning allows removing nodes from the cluster without
    * interrupting jobs in progress. Timeout specifies how long to wait for
    * jobs in progress to finish before forcefully removing nodes (and
    * potentially interrupting jobs). Default timeout is 0 (for forceful
    * decommission), and the maximum allowed timeout is 1 day.Only supported on
    * Dataproc image versions 1.2 and higher.
    */
  var gracefulDecommissionTimeout: js.UndefOr[String] = js.native
  /**
    * Required. The ID of the Google Cloud Platform project the cluster belongs
    * to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Required. The Cloud Dataproc region in which to handle the request.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCluster] = js.native
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
  var requestId: js.UndefOr[String] = js.native
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
    * "numInstances":"5"     }   } } <strong>Note:</strong> currently only the
    * following fields can be updated: <table> <tr>
    * <td><strong>Mask</strong></td><td><strong>Purpose</strong></td> </tr>
    * <tr> <td>labels</td><td>Updates labels</td> </tr> <tr>
    * <td>config.worker_config.num_instances</td><td>Resize primary worker
    * group</td> </tr> <tr>
    * <td>config.secondary_worker_config.num_instances</td><td>Resize secondary
    * worker group</td> </tr> <tr>
    * <td>config.lifecycle_config.auto_delete_ttl</td><td>Reset MAX TTL
    * duration</td> </tr> <tr>
    * <td>config.lifecycle_config.auto_delete_time</td><td>Update MAX TTL
    * deletion timestamp</td> </tr> <tr>
    * <td>config.lifecycle_config.idle_delete_ttl</td><td>Update Idle TTL
    * duration</td> </tr> <tr>
    * <td>config.autoscaling_config.policy_uri</td><td>Use, stop using, or
    * change autoscaling policies</td> </tr> </table>
    */
  var updateMask: js.UndefOr[String] = js.native
}

