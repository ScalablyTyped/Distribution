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

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Locations$Clusters")
@js.native
open class ResourceProjectsLocationsClusters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def completeIpRotation(): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def completeIpRotation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(params: ParamsResourceProjectsLocationsClustersCompleteiprotation): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsLocationsClustersCompleteiprotation,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsLocationsClustersCompleteiprotation,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def completeIpRotation(params: ParamsResourceProjectsLocationsClustersCompleteiprotation, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsLocationsClustersCompleteiprotation,
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
    *   const res = await container.projects.locations.clusters.completeIpRotation({
    *     // The name (project, location, cluster name) of the cluster to complete IP rotation. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def completeIpRotation(params: ParamsResourceProjectsLocationsClustersCompleteiprotation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsLocationsClustersCompleteiprotation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsClustersCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsClustersCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersCreate,
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
    *   const res = await container.projects.locations.clusters.create({
    *     // The parent (project and location) where the cluster will be created. Specified in the format `projects/x/locations/x`.
    *     parent: 'projects/my-project/locations/my-location',
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
  def create(params: ParamsResourceProjectsLocationsClustersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsClustersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsClustersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersDelete,
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
    *   const res = await container.projects.locations.clusters.delete({
    *     // Deprecated. The name of the cluster to delete. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // The name (project, location, cluster) of the cluster to delete. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def delete(params: ParamsResourceProjectsLocationsClustersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCluster] = js.native
  def get(callback: BodyResponseCallback[SchemaCluster]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCluster] = js.native
  def get(params: ParamsResourceProjectsLocationsClustersGet): GaxiosPromise[SchemaCluster] = js.native
  def get(params: ParamsResourceProjectsLocationsClustersGet, callback: BodyResponseCallback[SchemaCluster]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsClustersGet,
    options: BodyResponseCallback[Readable | SchemaCluster],
    callback: BodyResponseCallback[Readable | SchemaCluster]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsClustersGet, options: MethodOptions): GaxiosPromise[SchemaCluster] = js.native
  def get(
    params: ParamsResourceProjectsLocationsClustersGet,
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
    *   const res = await container.projects.locations.clusters.get({
    *     // Deprecated. The name of the cluster to retrieve. This field has been deprecated and replaced by the name field.
    *     clusterId: 'placeholder-value',
    *     // The name (project, location, cluster) of the cluster to retrieve. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def get(params: ParamsResourceProjectsLocationsClustersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsClustersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getJwks(): GaxiosPromise[SchemaGetJSONWebKeysResponse] = js.native
  def getJwks(callback: BodyResponseCallback[SchemaGetJSONWebKeysResponse]): Unit = js.native
  def getJwks(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetJSONWebKeysResponse] = js.native
  def getJwks(params: ParamsResourceProjectsLocationsClustersGetjwks): GaxiosPromise[SchemaGetJSONWebKeysResponse] = js.native
  def getJwks(
    params: ParamsResourceProjectsLocationsClustersGetjwks,
    callback: BodyResponseCallback[SchemaGetJSONWebKeysResponse]
  ): Unit = js.native
  def getJwks(
    params: ParamsResourceProjectsLocationsClustersGetjwks,
    options: BodyResponseCallback[Readable | SchemaGetJSONWebKeysResponse],
    callback: BodyResponseCallback[Readable | SchemaGetJSONWebKeysResponse]
  ): Unit = js.native
  def getJwks(params: ParamsResourceProjectsLocationsClustersGetjwks, options: MethodOptions): GaxiosPromise[SchemaGetJSONWebKeysResponse] = js.native
  def getJwks(
    params: ParamsResourceProjectsLocationsClustersGetjwks,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetJSONWebKeysResponse]
  ): Unit = js.native
  /**
    * Gets the public component of the cluster signing keys in JSON Web Key format. This API is not yet intended for general use, and is not available for all clusters.
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
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await container.projects.locations.clusters.getJwks({
    *     // The cluster (project, location, cluster name) to get keys for. Specified in the format `projects/x/locations/x/clusters/x`.
    *     parent: 'projects/my-project/locations/my-location/clusters/my-cluster',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cacheHeader": {},
    *   //   "keys": []
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
  def getJwks(params: ParamsResourceProjectsLocationsClustersGetjwks, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getJwks(
    params: ParamsResourceProjectsLocationsClustersGetjwks,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClustersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsClustersList): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersList,
    callback: BodyResponseCallback[SchemaListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersList,
    options: BodyResponseCallback[Readable | SchemaListClustersResponse],
    callback: BodyResponseCallback[Readable | SchemaListClustersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsClustersList, options: MethodOptions): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersList,
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
    *   const res = await container.projects.locations.clusters.list({
    *     // The parent (project and location) where the clusters will be listed. Specified in the format `projects/x/locations/x`. Location "-" matches all zones and all regions.
    *     parent: 'projects/my-project/locations/my-location',
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
  def list(params: ParamsResourceProjectsLocationsClustersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var nodePools: ResourceProjectsLocationsClustersNodepools = js.native
  
  def setAddons(): GaxiosPromise[SchemaOperation] = js.native
  def setAddons(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setAddons(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAddons(params: ParamsResourceProjectsLocationsClustersSetaddons): GaxiosPromise[SchemaOperation] = js.native
  def setAddons(
    params: ParamsResourceProjectsLocationsClustersSetaddons,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setAddons(
    params: ParamsResourceProjectsLocationsClustersSetaddons,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setAddons(params: ParamsResourceProjectsLocationsClustersSetaddons, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAddons(
    params: ParamsResourceProjectsLocationsClustersSetaddons,
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
    *   const res = await container.projects.locations.clusters.setAddons({
    *     // The name (project, location, cluster) of the cluster to set addons. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def setAddons(params: ParamsResourceProjectsLocationsClustersSetaddons, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setAddons(
    params: ParamsResourceProjectsLocationsClustersSetaddons,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setLegacyAbac(): GaxiosPromise[SchemaOperation] = js.native
  def setLegacyAbac(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLegacyAbac(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLegacyAbac(params: ParamsResourceProjectsLocationsClustersSetlegacyabac): GaxiosPromise[SchemaOperation] = js.native
  def setLegacyAbac(
    params: ParamsResourceProjectsLocationsClustersSetlegacyabac,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLegacyAbac(
    params: ParamsResourceProjectsLocationsClustersSetlegacyabac,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setLegacyAbac(params: ParamsResourceProjectsLocationsClustersSetlegacyabac, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLegacyAbac(
    params: ParamsResourceProjectsLocationsClustersSetlegacyabac,
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
    *   const res = await container.projects.locations.clusters.setLegacyAbac({
    *     // The name (project, location, cluster name) of the cluster to set legacy abac. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def setLegacyAbac(params: ParamsResourceProjectsLocationsClustersSetlegacyabac, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setLegacyAbac(
    params: ParamsResourceProjectsLocationsClustersSetlegacyabac,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setLocations(): GaxiosPromise[SchemaOperation] = js.native
  def setLocations(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLocations(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLocations(params: ParamsResourceProjectsLocationsClustersSetlocations): GaxiosPromise[SchemaOperation] = js.native
  def setLocations(
    params: ParamsResourceProjectsLocationsClustersSetlocations,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLocations(
    params: ParamsResourceProjectsLocationsClustersSetlocations,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setLocations(params: ParamsResourceProjectsLocationsClustersSetlocations, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLocations(
    params: ParamsResourceProjectsLocationsClustersSetlocations,
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
    *   const res = await container.projects.locations.clusters.setLocations({
    *     // The name (project, location, cluster) of the cluster to set locations. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def setLocations(params: ParamsResourceProjectsLocationsClustersSetlocations, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setLocations(
    params: ParamsResourceProjectsLocationsClustersSetlocations,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setLogging(): GaxiosPromise[SchemaOperation] = js.native
  def setLogging(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLogging(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLogging(params: ParamsResourceProjectsLocationsClustersSetlogging): GaxiosPromise[SchemaOperation] = js.native
  def setLogging(
    params: ParamsResourceProjectsLocationsClustersSetlogging,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLogging(
    params: ParamsResourceProjectsLocationsClustersSetlogging,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setLogging(params: ParamsResourceProjectsLocationsClustersSetlogging, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLogging(
    params: ParamsResourceProjectsLocationsClustersSetlogging,
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
    *   const res = await container.projects.locations.clusters.setLogging({
    *     // The name (project, location, cluster) of the cluster to set logging. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def setLogging(params: ParamsResourceProjectsLocationsClustersSetlogging, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setLogging(
    params: ParamsResourceProjectsLocationsClustersSetlogging,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setMaintenancePolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMaintenancePolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(params: ParamsResourceProjectsLocationsClustersSetmaintenancepolicy): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsLocationsClustersSetmaintenancepolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsLocationsClustersSetmaintenancepolicy,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setMaintenancePolicy(params: ParamsResourceProjectsLocationsClustersSetmaintenancepolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsLocationsClustersSetmaintenancepolicy,
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
    *   const res = await container.projects.locations.clusters.setMaintenancePolicy({
    *     // The name (project, location, cluster name) of the cluster to set maintenance policy. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def setMaintenancePolicy(params: ParamsResourceProjectsLocationsClustersSetmaintenancepolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsLocationsClustersSetmaintenancepolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setMasterAuth(): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMasterAuth(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(params: ParamsResourceProjectsLocationsClustersSetmasterauth): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsLocationsClustersSetmasterauth,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsLocationsClustersSetmasterauth,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setMasterAuth(params: ParamsResourceProjectsLocationsClustersSetmasterauth, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsLocationsClustersSetmasterauth,
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
    *   const res = await container.projects.locations.clusters.setMasterAuth({
    *     // The name (project, location, cluster) of the cluster to set auth. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def setMasterAuth(params: ParamsResourceProjectsLocationsClustersSetmasterauth, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsLocationsClustersSetmasterauth,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setMonitoring(): GaxiosPromise[SchemaOperation] = js.native
  def setMonitoring(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMonitoring(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMonitoring(params: ParamsResourceProjectsLocationsClustersSetmonitoring): GaxiosPromise[SchemaOperation] = js.native
  def setMonitoring(
    params: ParamsResourceProjectsLocationsClustersSetmonitoring,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMonitoring(
    params: ParamsResourceProjectsLocationsClustersSetmonitoring,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setMonitoring(params: ParamsResourceProjectsLocationsClustersSetmonitoring, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMonitoring(
    params: ParamsResourceProjectsLocationsClustersSetmonitoring,
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
    *   const res = await container.projects.locations.clusters.setMonitoring({
    *     // The name (project, location, cluster) of the cluster to set monitoring. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def setMonitoring(params: ParamsResourceProjectsLocationsClustersSetmonitoring, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setMonitoring(
    params: ParamsResourceProjectsLocationsClustersSetmonitoring,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setNetworkPolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setNetworkPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(params: ParamsResourceProjectsLocationsClustersSetnetworkpolicy): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsLocationsClustersSetnetworkpolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsLocationsClustersSetnetworkpolicy,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setNetworkPolicy(params: ParamsResourceProjectsLocationsClustersSetnetworkpolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsLocationsClustersSetnetworkpolicy,
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
    *   const res = await container.projects.locations.clusters.setNetworkPolicy({
    *     // The name (project, location, cluster name) of the cluster to set networking policy. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def setNetworkPolicy(params: ParamsResourceProjectsLocationsClustersSetnetworkpolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsLocationsClustersSetnetworkpolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setResourceLabels(): GaxiosPromise[SchemaOperation] = js.native
  def setResourceLabels(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setResourceLabels(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setResourceLabels(params: ParamsResourceProjectsLocationsClustersSetresourcelabels): GaxiosPromise[SchemaOperation] = js.native
  def setResourceLabels(
    params: ParamsResourceProjectsLocationsClustersSetresourcelabels,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setResourceLabels(
    params: ParamsResourceProjectsLocationsClustersSetresourcelabels,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setResourceLabels(params: ParamsResourceProjectsLocationsClustersSetresourcelabels, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setResourceLabels(
    params: ParamsResourceProjectsLocationsClustersSetresourcelabels,
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
    *   const res = await container.projects.locations.clusters.setResourceLabels({
    *     // The name (project, location, cluster name) of the cluster to set labels. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def setResourceLabels(params: ParamsResourceProjectsLocationsClustersSetresourcelabels, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setResourceLabels(
    params: ParamsResourceProjectsLocationsClustersSetresourcelabels,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def startIpRotation(): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def startIpRotation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(params: ParamsResourceProjectsLocationsClustersStartiprotation): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(
    params: ParamsResourceProjectsLocationsClustersStartiprotation,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def startIpRotation(
    params: ParamsResourceProjectsLocationsClustersStartiprotation,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def startIpRotation(params: ParamsResourceProjectsLocationsClustersStartiprotation, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(
    params: ParamsResourceProjectsLocationsClustersStartiprotation,
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
    *   const res = await container.projects.locations.clusters.startIpRotation({
    *     // The name (project, location, cluster name) of the cluster to start IP rotation. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def startIpRotation(params: ParamsResourceProjectsLocationsClustersStartiprotation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def startIpRotation(
    params: ParamsResourceProjectsLocationsClustersStartiprotation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceProjectsLocationsClustersUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersUpdate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersUpdate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsLocationsClustersUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersUpdate,
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
    *   const res = await container.projects.locations.clusters.update({
    *     // The name (project, location, cluster) of the cluster to update. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def update(params: ParamsResourceProjectsLocationsClustersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateMaster(): GaxiosPromise[SchemaOperation] = js.native
  def updateMaster(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateMaster(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateMaster(params: ParamsResourceProjectsLocationsClustersUpdatemaster): GaxiosPromise[SchemaOperation] = js.native
  def updateMaster(
    params: ParamsResourceProjectsLocationsClustersUpdatemaster,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateMaster(
    params: ParamsResourceProjectsLocationsClustersUpdatemaster,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def updateMaster(params: ParamsResourceProjectsLocationsClustersUpdatemaster, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateMaster(
    params: ParamsResourceProjectsLocationsClustersUpdatemaster,
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
    *   const res = await container.projects.locations.clusters.updateMaster({
    *     // The name (project, location, cluster) of the cluster to update. Specified in the format `projects/x/locations/x/clusters/x`.
    *     name: 'projects/my-project/locations/my-location/clusters/my-cluster',
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
  def updateMaster(params: ParamsResourceProjectsLocationsClustersUpdatemaster, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateMaster(
    params: ParamsResourceProjectsLocationsClustersUpdatemaster,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var wellKnown: ResourceProjectsLocationsClustersWellKnown = js.native
}
