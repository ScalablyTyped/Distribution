package typings.googleapis.containerV1Mod.containerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Locations$Clusters$Nodepools")
@js.native
open class ResourceProjectsLocationsClustersNodepools protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def completeUpgrade(): GaxiosPromise[SchemaEmpty] = js.native
  def completeUpgrade(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def completeUpgrade(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def completeUpgrade(params: ParamsResourceProjectsLocationsClustersNodepoolsCompleteupgrade): GaxiosPromise[SchemaEmpty] = js.native
  def completeUpgrade(
    params: ParamsResourceProjectsLocationsClustersNodepoolsCompleteupgrade,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def completeUpgrade(
    params: ParamsResourceProjectsLocationsClustersNodepoolsCompleteupgrade,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def completeUpgrade(params: ParamsResourceProjectsLocationsClustersNodepoolsCompleteupgrade, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def completeUpgrade(
    params: ParamsResourceProjectsLocationsClustersNodepoolsCompleteupgrade,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * CompleteNodePoolUpgrade will signal an on-going node pool upgrade to complete.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/container.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const container = google.container('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await container.projects.locations.clusters.nodePools.completeUpgrade({
    *       // The name (project, location, cluster, node pool id) of the node pool to complete upgrade. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    *       name: 'projects/my-project/locations/my-location/clusters/my-cluster/nodePools/my-nodePool',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def completeUpgrade(
    params: ParamsResourceProjectsLocationsClustersNodepoolsCompleteupgrade,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def completeUpgrade(
    params: ParamsResourceProjectsLocationsClustersNodepoolsCompleteupgrade,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsClustersNodepoolsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersNodepoolsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersNodepoolsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsClustersNodepoolsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersNodepoolsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a node pool for a cluster.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/container.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const container = google.container('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await container.projects.locations.clusters.nodePools.create({
    *     // The parent (project, location, cluster name) where the node pool will be created. Specified in the format `projects/x/locations/x/clusters/x`.
    *     parent: 'projects/my-project/locations/my-location/clusters/my-cluster',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clusterId": "my_clusterId",
    *       //   "nodePool": {},
    *       //   "parent": "my_parent",
    *       //   "projectId": "my_projectId",
    *       //   "zone": "my_zone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusterConditions": [],
    *   //   "detail": "my_detail",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "nodepoolConditions": [],
    *   //   "operationType": "my_operationType",
    *   //   "progress": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetLink": "my_targetLink",
    *   //   "zone": "my_zone"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def create(params: ParamsResourceProjectsLocationsClustersNodepoolsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersNodepoolsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsClustersNodepoolsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersNodepoolsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersNodepoolsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsClustersNodepoolsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersNodepoolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a node pool from a cluster.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/container.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const container = google.container('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await container.projects.locations.clusters.nodePools.delete({
    *     // Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // The name (project, location, cluster, node pool id) of the node pool to delete. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster/nodePools/my-nodePool',
    *     // Deprecated. The name of the node pool to delete. This field has been deprecated and replaced by the name field.
    *     nodePoolId: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    *     zone: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusterConditions": [],
    *   //   "detail": "my_detail",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "nodepoolConditions": [],
    *   //   "operationType": "my_operationType",
    *   //   "progress": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetLink": "my_targetLink",
    *   //   "zone": "my_zone"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceProjectsLocationsClustersNodepoolsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersNodepoolsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaNodePool] = js.native
  def get(callback: BodyResponseCallback[SchemaNodePool]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNodePool] = js.native
  def get(params: ParamsResourceProjectsLocationsClustersNodepoolsGet): GaxiosPromise[SchemaNodePool] = js.native
  def get(
    params: ParamsResourceProjectsLocationsClustersNodepoolsGet,
    callback: BodyResponseCallback[SchemaNodePool]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsClustersNodepoolsGet,
    options: BodyResponseCallback[Readable | SchemaNodePool],
    callback: BodyResponseCallback[Readable | SchemaNodePool]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsClustersNodepoolsGet, options: MethodOptions): GaxiosPromise[SchemaNodePool] = js.native
  def get(
    params: ParamsResourceProjectsLocationsClustersNodepoolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNodePool]
  ): Unit = js.native
  /**
    * Retrieves the requested node pool.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/container.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const container = google.container('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await container.projects.locations.clusters.nodePools.get({
    *     // Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // The name (project, location, cluster, node pool id) of the node pool to get. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster/nodePools/my-nodePool',
    *     // Deprecated. The name of the node pool. This field has been deprecated and replaced by the name field.
    *     nodePoolId: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    *     zone: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "autoscaling": {},
    *   //   "conditions": [],
    *   //   "config": {},
    *   //   "initialNodeCount": 0,
    *   //   "instanceGroupUrls": [],
    *   //   "locations": [],
    *   //   "management": {},
    *   //   "maxPodsConstraint": {},
    *   //   "name": "my_name",
    *   //   "networkConfig": {},
    *   //   "podIpv4CidrSize": 0,
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "updateInfo": {},
    *   //   "upgradeSettings": {},
    *   //   "version": "my_version"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceProjectsLocationsClustersNodepoolsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsClustersNodepoolsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNodePoolsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsClustersNodepoolsList): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersNodepoolsList,
    callback: BodyResponseCallback[SchemaListNodePoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersNodepoolsList,
    options: BodyResponseCallback[Readable | SchemaListNodePoolsResponse],
    callback: BodyResponseCallback[Readable | SchemaListNodePoolsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsClustersNodepoolsList, options: MethodOptions): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersNodepoolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNodePoolsResponse]
  ): Unit = js.native
  /**
    * Lists the node pools for a cluster.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/container.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const container = google.container('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await container.projects.locations.clusters.nodePools.list({
    *     // Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
    *     clusterId: 'placeholder-value',
    *     // The parent (project, location, cluster name) where the node pools will be listed. Specified in the format `projects/x/locations/x/clusters/x`.
    *     parent: 'projects/my-project/locations/my-location/clusters/my-cluster',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the parent field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
    *     zone: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nodePools": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceProjectsLocationsClustersNodepoolsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersNodepoolsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rollback(): GaxiosPromise[SchemaOperation] = js.native
  def rollback(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def rollback(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rollback(params: ParamsResourceProjectsLocationsClustersNodepoolsRollback): GaxiosPromise[SchemaOperation] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsClustersNodepoolsRollback,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsClustersNodepoolsRollback,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsLocationsClustersNodepoolsRollback, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsClustersNodepoolsRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Rolls back a previously Aborted or Failed NodePool upgrade. This makes no changes if the last upgrade successfully completed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/container.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const container = google.container('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await container.projects.locations.clusters.nodePools.rollback({
    *     // The name (project, location, cluster, node pool id) of the node poll to rollback upgrade. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster/nodePools/my-nodePool',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clusterId": "my_clusterId",
    *       //   "name": "my_name",
    *       //   "nodePoolId": "my_nodePoolId",
    *       //   "projectId": "my_projectId",
    *       //   "respectPdb": false,
    *       //   "zone": "my_zone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusterConditions": [],
    *   //   "detail": "my_detail",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "nodepoolConditions": [],
    *   //   "operationType": "my_operationType",
    *   //   "progress": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetLink": "my_targetLink",
    *   //   "zone": "my_zone"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def rollback(params: ParamsResourceProjectsLocationsClustersNodepoolsRollback, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsClustersNodepoolsRollback,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setAutoscaling(): GaxiosPromise[SchemaOperation] = js.native
  def setAutoscaling(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setAutoscaling(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAutoscaling(params: ParamsResourceProjectsLocationsClustersNodepoolsSetautoscaling): GaxiosPromise[SchemaOperation] = js.native
  def setAutoscaling(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetautoscaling,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setAutoscaling(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetautoscaling,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setAutoscaling(params: ParamsResourceProjectsLocationsClustersNodepoolsSetautoscaling, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAutoscaling(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetautoscaling,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sets the autoscaling settings for the specified node pool.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/container.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const container = google.container('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await container.projects.locations.clusters.nodePools.setAutoscaling({
    *       // The name (project, location, cluster, node pool) of the node pool to set autoscaler settings. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    *       name: 'projects/my-project/locations/my-location/clusters/my-cluster/nodePools/my-nodePool',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "autoscaling": {},
    *         //   "clusterId": "my_clusterId",
    *         //   "name": "my_name",
    *         //   "nodePoolId": "my_nodePoolId",
    *         //   "projectId": "my_projectId",
    *         //   "zone": "my_zone"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusterConditions": [],
    *   //   "detail": "my_detail",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "nodepoolConditions": [],
    *   //   "operationType": "my_operationType",
    *   //   "progress": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetLink": "my_targetLink",
    *   //   "zone": "my_zone"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def setAutoscaling(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetautoscaling,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setAutoscaling(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetautoscaling,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setManagement(): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setManagement(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(params: ParamsResourceProjectsLocationsClustersNodepoolsSetmanagement): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetmanagement,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setManagement(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetmanagement,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setManagement(params: ParamsResourceProjectsLocationsClustersNodepoolsSetmanagement, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetmanagement,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sets the NodeManagement options for a node pool.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/container.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const container = google.container('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await container.projects.locations.clusters.nodePools.setManagement({
    *       // The name (project, location, cluster, node pool id) of the node pool to set management properties. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    *       name: 'projects/my-project/locations/my-location/clusters/my-cluster/nodePools/my-nodePool',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "clusterId": "my_clusterId",
    *         //   "management": {},
    *         //   "name": "my_name",
    *         //   "nodePoolId": "my_nodePoolId",
    *         //   "projectId": "my_projectId",
    *         //   "zone": "my_zone"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusterConditions": [],
    *   //   "detail": "my_detail",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "nodepoolConditions": [],
    *   //   "operationType": "my_operationType",
    *   //   "progress": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetLink": "my_targetLink",
    *   //   "zone": "my_zone"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def setManagement(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetmanagement,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setManagement(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetmanagement,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setSize(): GaxiosPromise[SchemaOperation] = js.native
  def setSize(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setSize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSize(params: ParamsResourceProjectsLocationsClustersNodepoolsSetsize): GaxiosPromise[SchemaOperation] = js.native
  def setSize(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetsize,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSize(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetsize,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setSize(params: ParamsResourceProjectsLocationsClustersNodepoolsSetsize, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSize(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetsize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sets the size for a specific node pool. The new size will be used for all replicas, including future replicas created by modifying NodePool.locations.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/container.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const container = google.container('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await container.projects.locations.clusters.nodePools.setSize({
    *     // The name (project, location, cluster, node pool id) of the node pool to set size. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster/nodePools/my-nodePool',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clusterId": "my_clusterId",
    *       //   "name": "my_name",
    *       //   "nodeCount": 0,
    *       //   "nodePoolId": "my_nodePoolId",
    *       //   "projectId": "my_projectId",
    *       //   "zone": "my_zone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusterConditions": [],
    *   //   "detail": "my_detail",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "nodepoolConditions": [],
    *   //   "operationType": "my_operationType",
    *   //   "progress": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetLink": "my_targetLink",
    *   //   "zone": "my_zone"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def setSize(params: ParamsResourceProjectsLocationsClustersNodepoolsSetsize, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setSize(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetsize,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceProjectsLocationsClustersNodepoolsUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersNodepoolsUpdate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersNodepoolsUpdate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsLocationsClustersNodepoolsUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersNodepoolsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the version and/or image type for the specified node pool.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/container.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const container = google.container('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await container.projects.locations.clusters.nodePools.update({
    *     // The name (project, location, cluster, node pool) of the node pool to update. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster/nodePools/my-nodePool',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clusterId": "my_clusterId",
    *       //   "confidentialNodes": {},
    *       //   "gcfsConfig": {},
    *       //   "gvnic": {},
    *       //   "imageType": "my_imageType",
    *       //   "kubeletConfig": {},
    *       //   "labels": {},
    *       //   "linuxNodeConfig": {},
    *       //   "locations": [],
    *       //   "name": "my_name",
    *       //   "nodeNetworkConfig": {},
    *       //   "nodePoolId": "my_nodePoolId",
    *       //   "nodeVersion": "my_nodeVersion",
    *       //   "projectId": "my_projectId",
    *       //   "tags": {},
    *       //   "taints": {},
    *       //   "upgradeSettings": {},
    *       //   "workloadMetadataConfig": {},
    *       //   "zone": "my_zone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusterConditions": [],
    *   //   "detail": "my_detail",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "nodepoolConditions": [],
    *   //   "operationType": "my_operationType",
    *   //   "progress": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetLink": "my_targetLink",
    *   //   "zone": "my_zone"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def update(params: ParamsResourceProjectsLocationsClustersNodepoolsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersNodepoolsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
