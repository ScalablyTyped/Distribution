package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataproc/v1beta2", "dataproc_v1beta2.Resource$Projects$Regions$Clusters")
@js.native
class ResourceProjectsRegionsClusters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataproc.projects.regions.clusters.create
    * @desc Creates a cluster in a project.
    * @alias dataproc.projects.regions.clusters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the cluster belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {string=} params.requestId Optional. A unique id used to identify the request. If the server receives two CreateClusterRequest requests with the same id, then the second request will be ignored and the first google.longrunning.Operation created and stored in the backend is returned.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    * @param {().Cluster} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: ParamsResourceProjectsRegionsClustersCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsRegionsClustersCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsRegionsClustersCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsRegionsClustersCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsRegionsClustersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.delete
    * @desc Deletes a cluster in a project.
    * @alias dataproc.projects.regions.clusters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterName Required. The cluster name.
    * @param {string=} params.clusterUuid Optional. Specifying the cluster_uuid means the RPC should fail (with error NOT_FOUND) if cluster with specified UUID does not exist.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the cluster belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {string=} params.requestId Optional. A unique id used to identify the request. If the server receives two DeleteClusterRequest requests with the same id, then the second request will be ignored and the first google.longrunning.Operation created and stored in the backend is returned.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: ParamsResourceProjectsRegionsClustersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsRegionsClustersDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsRegionsClustersDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsRegionsClustersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsRegionsClustersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.diagnose
    * @desc Gets cluster diagnostic information. After the operation completes,
    * the Operation.response field contains DiagnoseClusterOutputLocation.
    * @alias dataproc.projects.regions.clusters.diagnose
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterName Required. The cluster name.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the cluster belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {().DiagnoseClusterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def diagnose(): GaxiosPromise[SchemaOperation] = js.native
  def diagnose(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def diagnose(params: ParamsResourceProjectsRegionsClustersDiagnose): GaxiosPromise[SchemaOperation] = js.native
  def diagnose(
    params: ParamsResourceProjectsRegionsClustersDiagnose,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def diagnose(
    params: ParamsResourceProjectsRegionsClustersDiagnose,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def diagnose(params: ParamsResourceProjectsRegionsClustersDiagnose, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def diagnose(
    params: ParamsResourceProjectsRegionsClustersDiagnose,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.get
    * @desc Gets the resource representation for a cluster in a project.
    * @alias dataproc.projects.regions.clusters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterName Required. The cluster name.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the cluster belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCluster] = js.native
  def get(callback: BodyResponseCallback[SchemaCluster]): Unit = js.native
  def get(params: ParamsResourceProjectsRegionsClustersGet): GaxiosPromise[SchemaCluster] = js.native
  def get(params: ParamsResourceProjectsRegionsClustersGet, callback: BodyResponseCallback[SchemaCluster]): Unit = js.native
  def get(
    params: ParamsResourceProjectsRegionsClustersGet,
    options: BodyResponseCallback[SchemaCluster],
    callback: BodyResponseCallback[SchemaCluster]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsRegionsClustersGet, options: MethodOptions): GaxiosPromise[SchemaCluster] = js.native
  def get(
    params: ParamsResourceProjectsRegionsClustersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCluster]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias dataproc.projects.regions.clusters.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsRegionsClustersGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsClustersGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsClustersGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsRegionsClustersGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsClustersGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.list
    * @desc Lists all regions/{region}/clusters in a project.
    * @alias dataproc.projects.regions.clusters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Optional. A filter constraining the clusters to list. Filters are case-sensitive and have the following syntax:field = value AND field = value ...where field is one of status.state, clusterName, or labels.[KEY], and [KEY] is a label key. value can be * to match all values. status.state can be one of the following: ACTIVE, INACTIVE, CREATING, RUNNING, ERROR, DELETING, or UPDATING. ACTIVE contains the CREATING, UPDATING, and RUNNING states. INACTIVE contains the DELETING and ERROR states. clusterName is the name of the cluster provided at creation time. Only the logical AND operator is supported; space-separated items are treated as having an implicit AND operator.Example filter:status.state = ACTIVE AND clusterName = mycluster AND labels.env = staging AND labels.starred = *
    * @param {integer=} params.pageSize Optional. The standard List page size.
    * @param {string=} params.pageToken Optional. The standard List page token.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the cluster belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClustersResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsRegionsClustersList): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsRegionsClustersList,
    callback: BodyResponseCallback[SchemaListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsRegionsClustersList,
    options: BodyResponseCallback[SchemaListClustersResponse],
    callback: BodyResponseCallback[SchemaListClustersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsRegionsClustersList, options: MethodOptions): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsRegionsClustersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListClustersResponse]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.patch
    * @desc Updates a cluster in a project.
    * @alias dataproc.projects.regions.clusters.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterName Required. The cluster name.
    * @param {string=} params.gracefulDecommissionTimeout Optional. Timeout for graceful YARN decomissioning. Graceful decommissioning allows removing nodes from the cluster without interrupting jobs in progress. Timeout specifies how long to wait for jobs in progress to finish before forcefully removing nodes (and potentially interrupting jobs). Default timeout is 0 (for forceful decommission), and the maximum allowed timeout is 1 day.Only supported on Dataproc image versions 1.2 and higher.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project the cluster belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {string=} params.requestId Optional. A unique id used to identify the request. If the server receives two UpdateClusterRequest requests with the same id, then the second request will be ignored and the first google.longrunning.Operation created and stored in the backend is returned.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    * @param {string=} params.updateMask Required. Specifies the path, relative to Cluster, of the field to update. For example, to change the number of workers in a cluster to 5, the update_mask parameter would be specified as config.worker_config.num_instances, and the PATCH request body would specify the new value, as follows: {   "config":{     "workerConfig":{       "numInstances":"5"     }   } } Similarly, to change the number of preemptible workers in a cluster to 5, the update_mask parameter would be config.secondary_worker_config.num_instances, and the PATCH request body would be set as follows: {   "config":{     "secondaryWorkerConfig":{       "numInstances":"5"     }   } } <strong>Note:</strong> currently only the following fields can be updated: <table> <tr> <td><strong>Mask</strong></td><td><strong>Purpose</strong></td> </tr> <tr> <td>labels</td><td>Updates labels</td> </tr> <tr> <td>config.worker_config.num_instances</td><td>Resize primary worker group</td> </tr> <tr> <td>config.secondary_worker_config.num_instances</td><td>Resize secondary worker group</td> </tr> <tr> <td>config.lifecycle_config.auto_delete_ttl</td><td>Reset MAX TTL duration</td> </tr> <tr> <td>config.lifecycle_config.auto_delete_time</td><td>Update MAX TTL deletion timestamp</td> </tr> <tr> <td>config.lifecycle_config.idle_delete_ttl</td><td>Update Idle TTL duration</td> </tr> <tr> <td>config.autoscaling_config.policy_uri</td><td>Use, stop using, or change autoscaling policies</td> </tr> </table>
    * @param {().Cluster} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: ParamsResourceProjectsRegionsClustersPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsRegionsClustersPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsRegionsClustersPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsRegionsClustersPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsRegionsClustersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias dataproc.projects.regions.clusters.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsRegionsClustersSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsClustersSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsClustersSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsRegionsClustersSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsClustersSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.Note: This operation is designed to be
    * used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias dataproc.projects.regions.clusters.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsRegionsClustersTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsClustersTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsClustersTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsRegionsClustersTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsClustersTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}

