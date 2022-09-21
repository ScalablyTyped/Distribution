package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tpu/v2alpha1", "tpu_v2alpha1.Resource$Projects$Locations$Nodes")
@js.native
open class ResourceProjectsLocationsNodes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsNodesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsNodesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsNodesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsNodesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsNodesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a node.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tpu.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tpu = google.tpu('v2alpha1');
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
    *   const res = await tpu.projects.locations.nodes.create({
    *     // The unqualified resource name.
    *     nodeId: 'placeholder-value',
    *     // Required. The parent resource name.
    *     parent: 'projects/my-project/locations/my-location',
    *     // Idempotent request UUID.
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acceleratorType": "my_acceleratorType",
    *       //   "apiVersion": "my_apiVersion",
    *       //   "cidrBlock": "my_cidrBlock",
    *       //   "createTime": "my_createTime",
    *       //   "dataDisks": [],
    *       //   "description": "my_description",
    *       //   "health": "my_health",
    *       //   "healthDescription": "my_healthDescription",
    *       //   "id": "my_id",
    *       //   "labels": {},
    *       //   "metadata": {},
    *       //   "name": "my_name",
    *       //   "networkConfig": {},
    *       //   "networkEndpoints": [],
    *       //   "runtimeVersion": "my_runtimeVersion",
    *       //   "schedulingConfig": {},
    *       //   "serviceAccount": {},
    *       //   "state": "my_state",
    *       //   "symptoms": [],
    *       //   "tags": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def create(params: ParamsResourceProjectsLocationsNodesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsNodesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsNodesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsNodesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsNodesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsNodesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsNodesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a node.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tpu.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tpu = google.tpu('v2alpha1');
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
    *   const res = await tpu.projects.locations.nodes.delete({
    *     // Required. The resource name.
    *     name: 'projects/my-project/locations/my-location/nodes/my-node',
    *     // Idempotent request UUID.
    *     requestId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def delete(params: ParamsResourceProjectsLocationsNodesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsNodesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaNode] = js.native
  def get(callback: BodyResponseCallback[SchemaNode]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNode] = js.native
  def get(params: ParamsResourceProjectsLocationsNodesGet): GaxiosPromise[SchemaNode] = js.native
  def get(params: ParamsResourceProjectsLocationsNodesGet, callback: BodyResponseCallback[SchemaNode]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsNodesGet,
    options: BodyResponseCallback[Readable | SchemaNode],
    callback: BodyResponseCallback[Readable | SchemaNode]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsNodesGet, options: MethodOptions): GaxiosPromise[SchemaNode] = js.native
  def get(
    params: ParamsResourceProjectsLocationsNodesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNode]
  ): Unit = js.native
  /**
    * Gets the details of a node.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tpu.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tpu = google.tpu('v2alpha1');
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
    *   const res = await tpu.projects.locations.nodes.get({
    *     // Required. The resource name.
    *     name: 'projects/my-project/locations/my-location/nodes/my-node',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acceleratorType": "my_acceleratorType",
    *   //   "apiVersion": "my_apiVersion",
    *   //   "cidrBlock": "my_cidrBlock",
    *   //   "createTime": "my_createTime",
    *   //   "dataDisks": [],
    *   //   "description": "my_description",
    *   //   "health": "my_health",
    *   //   "healthDescription": "my_healthDescription",
    *   //   "id": "my_id",
    *   //   "labels": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "networkConfig": {},
    *   //   "networkEndpoints": [],
    *   //   "runtimeVersion": "my_runtimeVersion",
    *   //   "schedulingConfig": {},
    *   //   "serviceAccount": {},
    *   //   "state": "my_state",
    *   //   "symptoms": [],
    *   //   "tags": []
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
  def get(params: ParamsResourceProjectsLocationsNodesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsNodesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getGuestAttributes(): GaxiosPromise[SchemaGetGuestAttributesResponse] = js.native
  def getGuestAttributes(callback: BodyResponseCallback[SchemaGetGuestAttributesResponse]): Unit = js.native
  def getGuestAttributes(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetGuestAttributesResponse] = js.native
  def getGuestAttributes(params: ParamsResourceProjectsLocationsNodesGetguestattributes): GaxiosPromise[SchemaGetGuestAttributesResponse] = js.native
  def getGuestAttributes(
    params: ParamsResourceProjectsLocationsNodesGetguestattributes,
    callback: BodyResponseCallback[SchemaGetGuestAttributesResponse]
  ): Unit = js.native
  def getGuestAttributes(
    params: ParamsResourceProjectsLocationsNodesGetguestattributes,
    options: BodyResponseCallback[Readable | SchemaGetGuestAttributesResponse],
    callback: BodyResponseCallback[Readable | SchemaGetGuestAttributesResponse]
  ): Unit = js.native
  def getGuestAttributes(params: ParamsResourceProjectsLocationsNodesGetguestattributes, options: MethodOptions): GaxiosPromise[SchemaGetGuestAttributesResponse] = js.native
  def getGuestAttributes(
    params: ParamsResourceProjectsLocationsNodesGetguestattributes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetGuestAttributesResponse]
  ): Unit = js.native
  /**
    * Retrieves the guest attributes for the node.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tpu.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tpu = google.tpu('v2alpha1');
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
    *   const res = await tpu.projects.locations.nodes.getGuestAttributes({
    *     // Required. The resource name.
    *     name: 'projects/my-project/locations/my-location/nodes/my-node',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "queryPath": "my_queryPath",
    *       //   "workerIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "guestAttributes": []
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
  def getGuestAttributes(params: ParamsResourceProjectsLocationsNodesGetguestattributes, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getGuestAttributes(
    params: ParamsResourceProjectsLocationsNodesGetguestattributes,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListNodesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNodesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNodesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsNodesList): GaxiosPromise[SchemaListNodesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNodesList,
    callback: BodyResponseCallback[SchemaListNodesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsNodesList,
    options: BodyResponseCallback[Readable | SchemaListNodesResponse],
    callback: BodyResponseCallback[Readable | SchemaListNodesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsNodesList, options: MethodOptions): GaxiosPromise[SchemaListNodesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNodesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNodesResponse]
  ): Unit = js.native
  /**
    * Lists nodes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tpu.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tpu = google.tpu('v2alpha1');
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
    *   const res = await tpu.projects.locations.nodes.list({
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "nodes": [],
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsNodesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNodesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsNodesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsNodesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNodesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsNodesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNodesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the configurations of a node.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tpu.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tpu = google.tpu('v2alpha1');
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
    *   const res = await tpu.projects.locations.nodes.patch({
    *     // Output only. Immutable. The name of the TPU.
    *     name: 'projects/my-project/locations/my-location/nodes/my-node',
    *     // Required. Mask of fields from Node to update. Supported fields: [description, tags, labels, metadata, network_config.enable_external_ips].
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acceleratorType": "my_acceleratorType",
    *       //   "apiVersion": "my_apiVersion",
    *       //   "cidrBlock": "my_cidrBlock",
    *       //   "createTime": "my_createTime",
    *       //   "dataDisks": [],
    *       //   "description": "my_description",
    *       //   "health": "my_health",
    *       //   "healthDescription": "my_healthDescription",
    *       //   "id": "my_id",
    *       //   "labels": {},
    *       //   "metadata": {},
    *       //   "name": "my_name",
    *       //   "networkConfig": {},
    *       //   "networkEndpoints": [],
    *       //   "runtimeVersion": "my_runtimeVersion",
    *       //   "schedulingConfig": {},
    *       //   "serviceAccount": {},
    *       //   "state": "my_state",
    *       //   "symptoms": [],
    *       //   "tags": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def patch(params: ParamsResourceProjectsLocationsNodesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNodesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def simulateMaintenanceEvent(): GaxiosPromise[SchemaOperation] = js.native
  def simulateMaintenanceEvent(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def simulateMaintenanceEvent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def simulateMaintenanceEvent(params: ParamsResourceProjectsLocationsNodesSimulatemaintenanceevent): GaxiosPromise[SchemaOperation] = js.native
  def simulateMaintenanceEvent(
    params: ParamsResourceProjectsLocationsNodesSimulatemaintenanceevent,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def simulateMaintenanceEvent(
    params: ParamsResourceProjectsLocationsNodesSimulatemaintenanceevent,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def simulateMaintenanceEvent(params: ParamsResourceProjectsLocationsNodesSimulatemaintenanceevent, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def simulateMaintenanceEvent(
    params: ParamsResourceProjectsLocationsNodesSimulatemaintenanceevent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Simulates a maintenance event.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tpu.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tpu = google.tpu('v2alpha1');
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
    *   const res = await tpu.projects.locations.nodes.simulateMaintenanceEvent({
    *     // Required. The resource name.
    *     name: 'projects/my-project/locations/my-location/nodes/my-node',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "workerIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def simulateMaintenanceEvent(params: ParamsResourceProjectsLocationsNodesSimulatemaintenanceevent, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def simulateMaintenanceEvent(
    params: ParamsResourceProjectsLocationsNodesSimulatemaintenanceevent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def start(): GaxiosPromise[SchemaOperation] = js.native
  def start(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceProjectsLocationsNodesStart): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceProjectsLocationsNodesStart, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(
    params: ParamsResourceProjectsLocationsNodesStart,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def start(params: ParamsResourceProjectsLocationsNodesStart, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(
    params: ParamsResourceProjectsLocationsNodesStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Starts a node.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tpu.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tpu = google.tpu('v2alpha1');
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
    *   const res = await tpu.projects.locations.nodes.start({
    *     // The resource name.
    *     name: 'projects/my-project/locations/my-location/nodes/my-node',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def start(params: ParamsResourceProjectsLocationsNodesStart, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def start(
    params: ParamsResourceProjectsLocationsNodesStart,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def stop(): GaxiosPromise[SchemaOperation] = js.native
  def stop(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stop(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stop(params: ParamsResourceProjectsLocationsNodesStop): GaxiosPromise[SchemaOperation] = js.native
  def stop(params: ParamsResourceProjectsLocationsNodesStop, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stop(
    params: ParamsResourceProjectsLocationsNodesStop,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def stop(params: ParamsResourceProjectsLocationsNodesStop, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsNodesStop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Stops a node. This operation is only available with single TPU nodes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tpu.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tpu = google.tpu('v2alpha1');
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
    *   const res = await tpu.projects.locations.nodes.stop({
    *     // The resource name.
    *     name: 'projects/my-project/locations/my-location/nodes/my-node',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def stop(params: ParamsResourceProjectsLocationsNodesStop, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsNodesStop,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
