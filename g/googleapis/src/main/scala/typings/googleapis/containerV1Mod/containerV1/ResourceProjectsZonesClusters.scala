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

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Zones$Clusters")
@js.native
open class ResourceProjectsZonesClusters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addons(): GaxiosPromise[SchemaOperation] = js.native
  def addons(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addons(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addons(params: ParamsResourceProjectsZonesClustersAddons): GaxiosPromise[SchemaOperation] = js.native
  def addons(params: ParamsResourceProjectsZonesClustersAddons, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addons(
    params: ParamsResourceProjectsZonesClustersAddons,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def addons(params: ParamsResourceProjectsZonesClustersAddons, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addons(
    params: ParamsResourceProjectsZonesClustersAddons,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sets the addons for a specific cluster.
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
    *   const res = await container.projects.zones.clusters.addons({
    *     // Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    *     zone: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "addonsConfig": {},
    *       //   "clusterId": "my_clusterId",
    *       //   "name": "my_name",
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
  def addons(params: ParamsResourceProjectsZonesClustersAddons, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addons(
    params: ParamsResourceProjectsZonesClustersAddons,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def completeIpRotation(): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def completeIpRotation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(params: ParamsResourceProjectsZonesClustersCompleteiprotation): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsZonesClustersCompleteiprotation,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsZonesClustersCompleteiprotation,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def completeIpRotation(params: ParamsResourceProjectsZonesClustersCompleteiprotation, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsZonesClustersCompleteiprotation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Completes master IP rotation.
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
    *   const res = await container.projects.zones.clusters.completeIpRotation({
    *     // Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
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
  def completeIpRotation(params: ParamsResourceProjectsZonesClustersCompleteiprotation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsZonesClustersCompleteiprotation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsZonesClustersCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsZonesClustersCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceProjectsZonesClustersCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsZonesClustersCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsZonesClustersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a cluster, consisting of the specified number and type of Google Compute Engine instances. By default, the cluster is created in the project's [default network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks). One firewall is added for the cluster. After cluster creation, the Kubelet creates routes for each node to allow the containers on that node to communicate with all other instances in the cluster. Finally, an entry is added to the project's global metadata indicating which CIDR range the cluster is using.
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
    *   const res = await container.projects.zones.clusters.create({
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the parent field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
    *     zone: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cluster": {},
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
  def create(params: ParamsResourceProjectsZonesClustersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsZonesClustersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsZonesClustersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsZonesClustersDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsZonesClustersDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsZonesClustersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsZonesClustersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes the cluster, including the Kubernetes endpoint and all worker nodes. Firewalls and routes that were configured during cluster creation are also deleted. Other Google Compute Engine resources that might be in use by the cluster, such as load balancer resources, are not deleted if they weren't present when the cluster was initially created.
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
    *   const res = await container.projects.zones.clusters.delete({
    *     // Deprecated. The name of the cluster to delete. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // The name (project, location, cluster) of the cluster to delete. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'placeholder-value',
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
  def delete(params: ParamsResourceProjectsZonesClustersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsZonesClustersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCluster] = js.native
  def get(callback: BodyResponseCallback[SchemaCluster]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCluster] = js.native
  def get(params: ParamsResourceProjectsZonesClustersGet): GaxiosPromise[SchemaCluster] = js.native
  def get(params: ParamsResourceProjectsZonesClustersGet, callback: BodyResponseCallback[SchemaCluster]): Unit = js.native
  def get(
    params: ParamsResourceProjectsZonesClustersGet,
    options: BodyResponseCallback[Readable | SchemaCluster],
    callback: BodyResponseCallback[Readable | SchemaCluster]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsZonesClustersGet, options: MethodOptions): GaxiosPromise[SchemaCluster] = js.native
  def get(
    params: ParamsResourceProjectsZonesClustersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCluster]
  ): Unit = js.native
  /**
    * Gets the details of a specific cluster.
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
    *   const res = await container.projects.zones.clusters.get({
    *     // Deprecated. The name of the cluster to retrieve. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // The name (project, location, cluster) of the cluster to retrieve. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    *     zone: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addonsConfig": {},
    *   //   "authenticatorGroupsConfig": {},
    *   //   "autopilot": {},
    *   //   "autoscaling": {},
    *   //   "binaryAuthorization": {},
    *   //   "clusterIpv4Cidr": "my_clusterIpv4Cidr",
    *   //   "conditions": [],
    *   //   "confidentialNodes": {},
    *   //   "createTime": "my_createTime",
    *   //   "currentMasterVersion": "my_currentMasterVersion",
    *   //   "currentNodeCount": 0,
    *   //   "currentNodeVersion": "my_currentNodeVersion",
    *   //   "databaseEncryption": {},
    *   //   "defaultMaxPodsConstraint": {},
    *   //   "description": "my_description",
    *   //   "enableKubernetesAlpha": false,
    *   //   "enableTpu": false,
    *   //   "endpoint": "my_endpoint",
    *   //   "expireTime": "my_expireTime",
    *   //   "id": "my_id",
    *   //   "identityServiceConfig": {},
    *   //   "initialClusterVersion": "my_initialClusterVersion",
    *   //   "initialNodeCount": 0,
    *   //   "instanceGroupUrls": [],
    *   //   "ipAllocationPolicy": {},
    *   //   "labelFingerprint": "my_labelFingerprint",
    *   //   "legacyAbac": {},
    *   //   "location": "my_location",
    *   //   "locations": [],
    *   //   "loggingConfig": {},
    *   //   "loggingService": "my_loggingService",
    *   //   "maintenancePolicy": {},
    *   //   "masterAuth": {},
    *   //   "masterAuthorizedNetworksConfig": {},
    *   //   "meshCertificates": {},
    *   //   "monitoringConfig": {},
    *   //   "monitoringService": "my_monitoringService",
    *   //   "name": "my_name",
    *   //   "network": "my_network",
    *   //   "networkConfig": {},
    *   //   "networkPolicy": {},
    *   //   "nodeConfig": {},
    *   //   "nodeIpv4CidrSize": 0,
    *   //   "nodePoolAutoConfig": {},
    *   //   "nodePoolDefaults": {},
    *   //   "nodePools": [],
    *   //   "notificationConfig": {},
    *   //   "privateClusterConfig": {},
    *   //   "releaseChannel": {},
    *   //   "resourceLabels": {},
    *   //   "resourceUsageExportConfig": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "servicesIpv4Cidr": "my_servicesIpv4Cidr",
    *   //   "shieldedNodes": {},
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "subnetwork": "my_subnetwork",
    *   //   "tpuIpv4CidrBlock": "my_tpuIpv4CidrBlock",
    *   //   "verticalPodAutoscaling": {},
    *   //   "workloadIdentityConfig": {},
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
  def get(params: ParamsResourceProjectsZonesClustersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsZonesClustersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def legacyAbac(): GaxiosPromise[SchemaOperation] = js.native
  def legacyAbac(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def legacyAbac(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def legacyAbac(params: ParamsResourceProjectsZonesClustersLegacyabac): GaxiosPromise[SchemaOperation] = js.native
  def legacyAbac(
    params: ParamsResourceProjectsZonesClustersLegacyabac,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def legacyAbac(
    params: ParamsResourceProjectsZonesClustersLegacyabac,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def legacyAbac(params: ParamsResourceProjectsZonesClustersLegacyabac, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def legacyAbac(
    params: ParamsResourceProjectsZonesClustersLegacyabac,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Enables or disables the ABAC authorization mechanism on a cluster.
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
    *   const res = await container.projects.zones.clusters.legacyAbac({
    *     // Deprecated. The name of the cluster to update. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
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
    *       //   "enabled": false,
    *       //   "name": "my_name",
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
  def legacyAbac(params: ParamsResourceProjectsZonesClustersLegacyabac, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def legacyAbac(
    params: ParamsResourceProjectsZonesClustersLegacyabac,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClustersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(params: ParamsResourceProjectsZonesClustersList): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersList,
    callback: BodyResponseCallback[SchemaListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersList,
    options: BodyResponseCallback[Readable | SchemaListClustersResponse],
    callback: BodyResponseCallback[Readable | SchemaListClustersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsZonesClustersList, options: MethodOptions): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListClustersResponse]
  ): Unit = js.native
  /**
    * Lists all clusters owned by a project in either the specified zone or all zones.
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
    *   const res = await container.projects.zones.clusters.list({
    *     // The parent (project and location) where the clusters will be listed. Specified in the format `projects/x/locations/x`. Location "-" matches all zones and all regions.
    *     parent: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the parent field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides, or "-" for all zones. This field has been deprecated and replaced by the parent field.
    *     zone: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusters": [],
    *   //   "missingZones": []
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
  def list(params: ParamsResourceProjectsZonesClustersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def locations(): GaxiosPromise[SchemaOperation] = js.native
  def locations(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def locations(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def locations(params: ParamsResourceProjectsZonesClustersLocations): GaxiosPromise[SchemaOperation] = js.native
  def locations(
    params: ParamsResourceProjectsZonesClustersLocations,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def locations(
    params: ParamsResourceProjectsZonesClustersLocations,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def locations(params: ParamsResourceProjectsZonesClustersLocations, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def locations(
    params: ParamsResourceProjectsZonesClustersLocations,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sets the locations for a specific cluster. Deprecated. Use [projects.locations.clusters.update](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/update) instead.
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
    *   const res = await container.projects.zones.clusters.locations({
    *     // Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
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
    *       //   "locations": [],
    *       //   "name": "my_name",
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
  def locations(params: ParamsResourceProjectsZonesClustersLocations, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def locations(
    params: ParamsResourceProjectsZonesClustersLocations,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def logging(): GaxiosPromise[SchemaOperation] = js.native
  def logging(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def logging(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def logging(params: ParamsResourceProjectsZonesClustersLogging): GaxiosPromise[SchemaOperation] = js.native
  def logging(
    params: ParamsResourceProjectsZonesClustersLogging,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def logging(
    params: ParamsResourceProjectsZonesClustersLogging,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def logging(params: ParamsResourceProjectsZonesClustersLogging, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def logging(
    params: ParamsResourceProjectsZonesClustersLogging,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sets the logging service for a specific cluster.
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
    *   const res = await container.projects.zones.clusters.logging({
    *     // Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
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
    *       //   "loggingService": "my_loggingService",
    *       //   "name": "my_name",
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
  def logging(params: ParamsResourceProjectsZonesClustersLogging, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def logging(
    params: ParamsResourceProjectsZonesClustersLogging,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def master(): GaxiosPromise[SchemaOperation] = js.native
  def master(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def master(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def master(params: ParamsResourceProjectsZonesClustersMaster): GaxiosPromise[SchemaOperation] = js.native
  def master(params: ParamsResourceProjectsZonesClustersMaster, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def master(
    params: ParamsResourceProjectsZonesClustersMaster,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def master(params: ParamsResourceProjectsZonesClustersMaster, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def master(
    params: ParamsResourceProjectsZonesClustersMaster,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the master for a specific cluster.
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
    *   const res = await container.projects.zones.clusters.master({
    *     // Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
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
    *       //   "masterVersion": "my_masterVersion",
    *       //   "name": "my_name",
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
  def master(params: ParamsResourceProjectsZonesClustersMaster, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def master(
    params: ParamsResourceProjectsZonesClustersMaster,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def monitoring(): GaxiosPromise[SchemaOperation] = js.native
  def monitoring(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def monitoring(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def monitoring(params: ParamsResourceProjectsZonesClustersMonitoring): GaxiosPromise[SchemaOperation] = js.native
  def monitoring(
    params: ParamsResourceProjectsZonesClustersMonitoring,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def monitoring(
    params: ParamsResourceProjectsZonesClustersMonitoring,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def monitoring(params: ParamsResourceProjectsZonesClustersMonitoring, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def monitoring(
    params: ParamsResourceProjectsZonesClustersMonitoring,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sets the monitoring service for a specific cluster.
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
    *   const res = await container.projects.zones.clusters.monitoring({
    *     // Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
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
    *       //   "monitoringService": "my_monitoringService",
    *       //   "name": "my_name",
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
  def monitoring(params: ParamsResourceProjectsZonesClustersMonitoring, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def monitoring(
    params: ParamsResourceProjectsZonesClustersMonitoring,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var nodePools: ResourceProjectsZonesClustersNodepools = js.native
  
  def resourceLabels(): GaxiosPromise[SchemaOperation] = js.native
  def resourceLabels(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resourceLabels(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resourceLabels(params: ParamsResourceProjectsZonesClustersResourcelabels): GaxiosPromise[SchemaOperation] = js.native
  def resourceLabels(
    params: ParamsResourceProjectsZonesClustersResourcelabels,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def resourceLabels(
    params: ParamsResourceProjectsZonesClustersResourcelabels,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def resourceLabels(params: ParamsResourceProjectsZonesClustersResourcelabels, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resourceLabels(
    params: ParamsResourceProjectsZonesClustersResourcelabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sets labels on a cluster.
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
    *   const res = await container.projects.zones.clusters.resourceLabels({
    *     // Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
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
    *       //   "labelFingerprint": "my_labelFingerprint",
    *       //   "name": "my_name",
    *       //   "projectId": "my_projectId",
    *       //   "resourceLabels": {},
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
  def resourceLabels(params: ParamsResourceProjectsZonesClustersResourcelabels, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resourceLabels(
    params: ParamsResourceProjectsZonesClustersResourcelabels,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setMaintenancePolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMaintenancePolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(params: ParamsResourceProjectsZonesClustersSetmaintenancepolicy): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsZonesClustersSetmaintenancepolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsZonesClustersSetmaintenancepolicy,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setMaintenancePolicy(params: ParamsResourceProjectsZonesClustersSetmaintenancepolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsZonesClustersSetmaintenancepolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sets the maintenance policy for a cluster.
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
    *   const res = await container.projects.zones.clusters.setMaintenancePolicy({
    *     // Required. The name of the cluster to update.
    *     clusterId: 'placeholder-value',
    *     // Required. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
    *     projectId: 'placeholder-value',
    *     // Required. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
    *     zone: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clusterId": "my_clusterId",
    *       //   "maintenancePolicy": {},
    *       //   "name": "my_name",
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
  def setMaintenancePolicy(params: ParamsResourceProjectsZonesClustersSetmaintenancepolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsZonesClustersSetmaintenancepolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setMasterAuth(): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMasterAuth(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(params: ParamsResourceProjectsZonesClustersSetmasterauth): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsZonesClustersSetmasterauth,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsZonesClustersSetmasterauth,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setMasterAuth(params: ParamsResourceProjectsZonesClustersSetmasterauth, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsZonesClustersSetmasterauth,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sets master auth materials. Currently supports changing the admin password or a specific cluster, either via password generation or explicitly setting the password.
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
    *   const res = await container.projects.zones.clusters.setMasterAuth({
    *     // Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    *     zone: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": "my_action",
    *       //   "clusterId": "my_clusterId",
    *       //   "name": "my_name",
    *       //   "projectId": "my_projectId",
    *       //   "update": {},
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
  def setMasterAuth(params: ParamsResourceProjectsZonesClustersSetmasterauth, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsZonesClustersSetmasterauth,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setNetworkPolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setNetworkPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(params: ParamsResourceProjectsZonesClustersSetnetworkpolicy): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsZonesClustersSetnetworkpolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsZonesClustersSetnetworkpolicy,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setNetworkPolicy(params: ParamsResourceProjectsZonesClustersSetnetworkpolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsZonesClustersSetnetworkpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Enables or disables Network Policy for a cluster.
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
    *   const res = await container.projects.zones.clusters.setNetworkPolicy({
    *     // Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
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
    *       //   "networkPolicy": {},
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
  def setNetworkPolicy(params: ParamsResourceProjectsZonesClustersSetnetworkpolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsZonesClustersSetnetworkpolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def startIpRotation(): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def startIpRotation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(params: ParamsResourceProjectsZonesClustersStartiprotation): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(
    params: ParamsResourceProjectsZonesClustersStartiprotation,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def startIpRotation(
    params: ParamsResourceProjectsZonesClustersStartiprotation,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def startIpRotation(params: ParamsResourceProjectsZonesClustersStartiprotation, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(
    params: ParamsResourceProjectsZonesClustersStartiprotation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Starts master IP rotation.
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
    *   const res = await container.projects.zones.clusters.startIpRotation({
    *     // Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
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
    *       //   "projectId": "my_projectId",
    *       //   "rotateCredentials": false,
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
  def startIpRotation(params: ParamsResourceProjectsZonesClustersStartiprotation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def startIpRotation(
    params: ParamsResourceProjectsZonesClustersStartiprotation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceProjectsZonesClustersUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceProjectsZonesClustersUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceProjectsZonesClustersUpdate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsZonesClustersUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsZonesClustersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the settings of a specific cluster.
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
    *   const res = await container.projects.zones.clusters.update({
    *     // Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
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
    *       //   "projectId": "my_projectId",
    *       //   "update": {},
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
  def update(params: ParamsResourceProjectsZonesClustersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsZonesClustersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
