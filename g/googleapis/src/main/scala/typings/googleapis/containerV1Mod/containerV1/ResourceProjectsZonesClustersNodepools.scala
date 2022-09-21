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

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Zones$Clusters$Nodepools")
@js.native
open class ResourceProjectsZonesClustersNodepools protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def autoscaling(): GaxiosPromise[SchemaOperation] = js.native
  def autoscaling(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def autoscaling(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def autoscaling(params: ParamsResourceProjectsZonesClustersNodepoolsAutoscaling): GaxiosPromise[SchemaOperation] = js.native
  def autoscaling(
    params: ParamsResourceProjectsZonesClustersNodepoolsAutoscaling,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def autoscaling(
    params: ParamsResourceProjectsZonesClustersNodepoolsAutoscaling,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def autoscaling(params: ParamsResourceProjectsZonesClustersNodepoolsAutoscaling, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def autoscaling(
    params: ParamsResourceProjectsZonesClustersNodepoolsAutoscaling,
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
    *   const res = await container.projects.zones.clusters.nodePools.autoscaling({
    *     // Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced by the name field.
    *     nodePoolId: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    *     zone: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "autoscaling": {},
    *       //   "clusterId": "my_clusterId",
    *       //   "name": "my_name",
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
  def autoscaling(params: ParamsResourceProjectsZonesClustersNodepoolsAutoscaling, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def autoscaling(
    params: ParamsResourceProjectsZonesClustersNodepoolsAutoscaling,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsZonesClustersNodepoolsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsZonesClustersNodepoolsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsZonesClustersNodepoolsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsZonesClustersNodepoolsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsZonesClustersNodepoolsCreate,
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
    *   const res = await container.projects.zones.clusters.nodePools.create({
    *     // Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
    *     clusterId: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the parent field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
    *     zone: 'placeholder-value',
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
  def create(params: ParamsResourceProjectsZonesClustersNodepoolsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsZonesClustersNodepoolsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsZonesClustersNodepoolsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsZonesClustersNodepoolsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsZonesClustersNodepoolsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsZonesClustersNodepoolsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsZonesClustersNodepoolsDelete,
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
    *   const res = await container.projects.zones.clusters.nodePools.delete({
    *     // Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // The name (project, location, cluster, node pool id) of the node pool to delete. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    *     name: 'placeholder-value',
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
  def delete(params: ParamsResourceProjectsZonesClustersNodepoolsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsZonesClustersNodepoolsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaNodePool] = js.native
  def get(callback: BodyResponseCallback[SchemaNodePool]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNodePool] = js.native
  def get(params: ParamsResourceProjectsZonesClustersNodepoolsGet): GaxiosPromise[SchemaNodePool] = js.native
  def get(
    params: ParamsResourceProjectsZonesClustersNodepoolsGet,
    callback: BodyResponseCallback[SchemaNodePool]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsZonesClustersNodepoolsGet,
    options: BodyResponseCallback[Readable | SchemaNodePool],
    callback: BodyResponseCallback[Readable | SchemaNodePool]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsZonesClustersNodepoolsGet, options: MethodOptions): GaxiosPromise[SchemaNodePool] = js.native
  def get(
    params: ParamsResourceProjectsZonesClustersNodepoolsGet,
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
    *   const res = await container.projects.zones.clusters.nodePools.get({
    *     // Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // The name (project, location, cluster, node pool id) of the node pool to get. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    *     name: 'placeholder-value',
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
  def get(params: ParamsResourceProjectsZonesClustersNodepoolsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsZonesClustersNodepoolsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNodePoolsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(params: ParamsResourceProjectsZonesClustersNodepoolsList): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersNodepoolsList,
    callback: BodyResponseCallback[SchemaListNodePoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersNodepoolsList,
    options: BodyResponseCallback[Readable | SchemaListNodePoolsResponse],
    callback: BodyResponseCallback[Readable | SchemaListNodePoolsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsZonesClustersNodepoolsList, options: MethodOptions): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersNodepoolsList,
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
    *   const res = await container.projects.zones.clusters.nodePools.list({
    *     // Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
    *     clusterId: 'placeholder-value',
    *     // The parent (project, location, cluster name) where the node pools will be listed. Specified in the format `projects/x/locations/x/clusters/x`.
    *     parent: 'placeholder-value',
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
  def list(params: ParamsResourceProjectsZonesClustersNodepoolsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersNodepoolsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rollback(): GaxiosPromise[SchemaOperation] = js.native
  def rollback(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def rollback(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rollback(params: ParamsResourceProjectsZonesClustersNodepoolsRollback): GaxiosPromise[SchemaOperation] = js.native
  def rollback(
    params: ParamsResourceProjectsZonesClustersNodepoolsRollback,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def rollback(
    params: ParamsResourceProjectsZonesClustersNodepoolsRollback,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsZonesClustersNodepoolsRollback, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rollback(
    params: ParamsResourceProjectsZonesClustersNodepoolsRollback,
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
    *   const res = await container.projects.zones.clusters.nodePools.rollback({
    *     // Deprecated. The name of the cluster to rollback. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // Deprecated. The name of the node pool to rollback. This field has been deprecated and replaced by the name field.
    *     nodePoolId: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    *     zone: 'placeholder-value',
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
  def rollback(params: ParamsResourceProjectsZonesClustersNodepoolsRollback, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rollback(
    params: ParamsResourceProjectsZonesClustersNodepoolsRollback,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setManagement(): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setManagement(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(params: ParamsResourceProjectsZonesClustersNodepoolsSetmanagement): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetmanagement,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setManagement(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetmanagement,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setManagement(params: ParamsResourceProjectsZonesClustersNodepoolsSetmanagement, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetmanagement,
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
    *   const res = await container.projects.zones.clusters.nodePools.setManagement({
    *     // Deprecated. The name of the cluster to update. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // Deprecated. The name of the node pool to update. This field has been deprecated and replaced by the name field.
    *     nodePoolId: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    *     zone: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clusterId": "my_clusterId",
    *       //   "management": {},
    *       //   "name": "my_name",
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
  def setManagement(params: ParamsResourceProjectsZonesClustersNodepoolsSetmanagement, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setManagement(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetmanagement,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setSize(): GaxiosPromise[SchemaOperation] = js.native
  def setSize(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setSize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSize(params: ParamsResourceProjectsZonesClustersNodepoolsSetsize): GaxiosPromise[SchemaOperation] = js.native
  def setSize(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetsize,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSize(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetsize,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setSize(params: ParamsResourceProjectsZonesClustersNodepoolsSetsize, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSize(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetsize,
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
    *   const res = await container.projects.zones.clusters.nodePools.setSize({
    *     // Deprecated. The name of the cluster to update. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // Deprecated. The name of the node pool to update. This field has been deprecated and replaced by the name field.
    *     nodePoolId: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    *     zone: 'placeholder-value',
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
  def setSize(params: ParamsResourceProjectsZonesClustersNodepoolsSetsize, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setSize(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetsize,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceProjectsZonesClustersNodepoolsUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsZonesClustersNodepoolsUpdate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsZonesClustersNodepoolsUpdate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsZonesClustersNodepoolsUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsZonesClustersNodepoolsUpdate,
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
    *   const res = await container.projects.zones.clusters.nodePools.update({
    *     // Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced by the name field.
    *     nodePoolId: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    *     zone: 'placeholder-value',
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
  def update(params: ParamsResourceProjectsZonesClustersNodepoolsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsZonesClustersNodepoolsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
