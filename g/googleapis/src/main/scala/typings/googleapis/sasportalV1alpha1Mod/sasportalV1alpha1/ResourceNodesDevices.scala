package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sasportal/v1alpha1", "sasportal_v1alpha1.Resource$Nodes$Devices")
@js.native
open class ResourceNodesDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def create(callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def create(params: ParamsResourceNodesDevicesCreate): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def create(params: ParamsResourceNodesDevicesCreate, callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def create(
    params: ParamsResourceNodesDevicesCreate,
    options: BodyResponseCallback[Readable | SchemaSasPortalDevice],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDevice]
  ): Unit = js.native
  def create(params: ParamsResourceNodesDevicesCreate, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def create(
    params: ParamsResourceNodesDevicesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  /**
    * Creates a device under a node or customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.nodes.devices.create({
    *     // Required. The name of the parent resource.
    *     parent: 'nodes/my-node',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activeConfig": {},
    *       //   "currentChannels": [],
    *       //   "deviceMetadata": {},
    *       //   "displayName": "my_displayName",
    *       //   "fccId": "my_fccId",
    *       //   "grantRangeAllowlists": [],
    *       //   "grants": [],
    *       //   "name": "my_name",
    *       //   "preloadedConfig": {},
    *       //   "serialNumber": "my_serialNumber",
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeConfig": {},
    *   //   "currentChannels": [],
    *   //   "deviceMetadata": {},
    *   //   "displayName": "my_displayName",
    *   //   "fccId": "my_fccId",
    *   //   "grantRangeAllowlists": [],
    *   //   "grants": [],
    *   //   "name": "my_name",
    *   //   "preloadedConfig": {},
    *   //   "serialNumber": "my_serialNumber",
    *   //   "state": "my_state"
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
  def create(params: ParamsResourceNodesDevicesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceNodesDevicesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def createSigned(): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def createSigned(callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def createSigned(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def createSigned(params: ParamsResourceNodesDevicesCreatesigned): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def createSigned(
    params: ParamsResourceNodesDevicesCreatesigned,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  def createSigned(
    params: ParamsResourceNodesDevicesCreatesigned,
    options: BodyResponseCallback[Readable | SchemaSasPortalDevice],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDevice]
  ): Unit = js.native
  def createSigned(params: ParamsResourceNodesDevicesCreatesigned, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def createSigned(
    params: ParamsResourceNodesDevicesCreatesigned,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  /**
    * Creates a signed device under a node or customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.nodes.devices.createSigned({
    *     // Required. The name of the parent resource.
    *     parent: 'nodes/my-node',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "encodedDevice": "my_encodedDevice",
    *       //   "installerId": "my_installerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeConfig": {},
    *   //   "currentChannels": [],
    *   //   "deviceMetadata": {},
    *   //   "displayName": "my_displayName",
    *   //   "fccId": "my_fccId",
    *   //   "grantRangeAllowlists": [],
    *   //   "grants": [],
    *   //   "name": "my_name",
    *   //   "preloadedConfig": {},
    *   //   "serialNumber": "my_serialNumber",
    *   //   "state": "my_state"
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
  def createSigned(params: ParamsResourceNodesDevicesCreatesigned, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createSigned(
    params: ParamsResourceNodesDevicesCreatesigned,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaSasPortalEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(params: ParamsResourceNodesDevicesDelete): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(params: ParamsResourceNodesDevicesDelete, callback: BodyResponseCallback[SchemaSasPortalEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceNodesDevicesDelete,
    options: BodyResponseCallback[Readable | SchemaSasPortalEmpty],
    callback: BodyResponseCallback[Readable | SchemaSasPortalEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceNodesDevicesDelete, options: MethodOptions): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(
    params: ParamsResourceNodesDevicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalEmpty]
  ): Unit = js.native
  /**
    * Deletes a device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.nodes.devices.delete({
    *     // Required. The name of the device.
    *     name: 'nodes/my-node/devices/my-device',
    *   });
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
  def delete(params: ParamsResourceNodesDevicesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceNodesDevicesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def get(params: ParamsResourceNodesDevicesGet): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def get(params: ParamsResourceNodesDevicesGet, callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def get(
    params: ParamsResourceNodesDevicesGet,
    options: BodyResponseCallback[Readable | SchemaSasPortalDevice],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDevice]
  ): Unit = js.native
  def get(params: ParamsResourceNodesDevicesGet, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def get(
    params: ParamsResourceNodesDevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  /**
    * Gets details about a device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.nodes.devices.get({
    *     // Required. The name of the device.
    *     name: 'nodes/my-node/devices/my-device',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeConfig": {},
    *   //   "currentChannels": [],
    *   //   "deviceMetadata": {},
    *   //   "displayName": "my_displayName",
    *   //   "fccId": "my_fccId",
    *   //   "grantRangeAllowlists": [],
    *   //   "grants": [],
    *   //   "name": "my_name",
    *   //   "preloadedConfig": {},
    *   //   "serialNumber": "my_serialNumber",
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceNodesDevicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceNodesDevicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSasPortalListDevicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSasPortalListDevicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalListDevicesResponse] = js.native
  def list(params: ParamsResourceNodesDevicesList): GaxiosPromise[SchemaSasPortalListDevicesResponse] = js.native
  def list(
    params: ParamsResourceNodesDevicesList,
    callback: BodyResponseCallback[SchemaSasPortalListDevicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceNodesDevicesList,
    options: BodyResponseCallback[Readable | SchemaSasPortalListDevicesResponse],
    callback: BodyResponseCallback[Readable | SchemaSasPortalListDevicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceNodesDevicesList, options: MethodOptions): GaxiosPromise[SchemaSasPortalListDevicesResponse] = js.native
  def list(
    params: ParamsResourceNodesDevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalListDevicesResponse]
  ): Unit = js.native
  /**
    * Lists devices under a node or customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.nodes.devices.list({
    *     // The filter expression. The filter should have one of the following formats: "sn=123454" or "display_name=MyDevice". sn corresponds to serial number of the device. The filter is case insensitive.
    *     filter: 'placeholder-value',
    *     // The maximum number of devices to return in the response. If empty or zero, all devices will be listed. Must be in the range [0, 1000].
    *     pageSize: 'placeholder-value',
    *     // A pagination token returned from a previous call to ListDevices that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the parent resource.
    *     parent: 'nodes/my-node',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "devices": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceNodesDevicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceNodesDevicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def move(): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(callback: BodyResponseCallback[SchemaSasPortalOperation]): Unit = js.native
  def move(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(params: ParamsResourceNodesDevicesMove): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(params: ParamsResourceNodesDevicesMove, callback: BodyResponseCallback[SchemaSasPortalOperation]): Unit = js.native
  def move(
    params: ParamsResourceNodesDevicesMove,
    options: BodyResponseCallback[Readable | SchemaSasPortalOperation],
    callback: BodyResponseCallback[Readable | SchemaSasPortalOperation]
  ): Unit = js.native
  def move(params: ParamsResourceNodesDevicesMove, options: MethodOptions): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(
    params: ParamsResourceNodesDevicesMove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalOperation]
  ): Unit = js.native
  /**
    * Moves a device under another node or customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.nodes.devices.move({
    *     // Required. The name of the device to move.
    *     name: 'nodes/my-node/devices/my-device',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "destination": "my_destination"
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
  def move(params: ParamsResourceNodesDevicesMove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def move(
    params: ParamsResourceNodesDevicesMove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def patch(callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def patch(params: ParamsResourceNodesDevicesPatch): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def patch(params: ParamsResourceNodesDevicesPatch, callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def patch(
    params: ParamsResourceNodesDevicesPatch,
    options: BodyResponseCallback[Readable | SchemaSasPortalDevice],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDevice]
  ): Unit = js.native
  def patch(params: ParamsResourceNodesDevicesPatch, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def patch(
    params: ParamsResourceNodesDevicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  /**
    * Updates a device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.nodes.devices.patch({
    *     // Output only. The resource path name.
    *     name: 'nodes/my-node/devices/my-device',
    *     // Fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activeConfig": {},
    *       //   "currentChannels": [],
    *       //   "deviceMetadata": {},
    *       //   "displayName": "my_displayName",
    *       //   "fccId": "my_fccId",
    *       //   "grantRangeAllowlists": [],
    *       //   "grants": [],
    *       //   "name": "my_name",
    *       //   "preloadedConfig": {},
    *       //   "serialNumber": "my_serialNumber",
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeConfig": {},
    *   //   "currentChannels": [],
    *   //   "deviceMetadata": {},
    *   //   "displayName": "my_displayName",
    *   //   "fccId": "my_fccId",
    *   //   "grantRangeAllowlists": [],
    *   //   "grants": [],
    *   //   "name": "my_name",
    *   //   "preloadedConfig": {},
    *   //   "serialNumber": "my_serialNumber",
    *   //   "state": "my_state"
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
  def patch(params: ParamsResourceNodesDevicesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceNodesDevicesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def signDevice(): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def signDevice(callback: BodyResponseCallback[SchemaSasPortalEmpty]): Unit = js.native
  def signDevice(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def signDevice(params: ParamsResourceNodesDevicesSigndevice): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def signDevice(params: ParamsResourceNodesDevicesSigndevice, callback: BodyResponseCallback[SchemaSasPortalEmpty]): Unit = js.native
  def signDevice(
    params: ParamsResourceNodesDevicesSigndevice,
    options: BodyResponseCallback[Readable | SchemaSasPortalEmpty],
    callback: BodyResponseCallback[Readable | SchemaSasPortalEmpty]
  ): Unit = js.native
  def signDevice(params: ParamsResourceNodesDevicesSigndevice, options: MethodOptions): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def signDevice(
    params: ParamsResourceNodesDevicesSigndevice,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalEmpty]
  ): Unit = js.native
  /**
    * Signs a device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.nodes.devices.signDevice({
    *     // Output only. The resource path name.
    *     name: 'nodes/my-node/devices/my-device',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "device": {}
    *       // }
    *     },
    *   });
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
  def signDevice(params: ParamsResourceNodesDevicesSigndevice, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def signDevice(
    params: ParamsResourceNodesDevicesSigndevice,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateSigned(): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def updateSigned(callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def updateSigned(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def updateSigned(params: ParamsResourceNodesDevicesUpdatesigned): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def updateSigned(
    params: ParamsResourceNodesDevicesUpdatesigned,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  def updateSigned(
    params: ParamsResourceNodesDevicesUpdatesigned,
    options: BodyResponseCallback[Readable | SchemaSasPortalDevice],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDevice]
  ): Unit = js.native
  def updateSigned(params: ParamsResourceNodesDevicesUpdatesigned, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def updateSigned(
    params: ParamsResourceNodesDevicesUpdatesigned,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  /**
    * Updates a signed device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.nodes.devices.updateSigned({
    *     // Required. The name of the device to update.
    *     name: 'nodes/my-node/devices/my-device',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "encodedDevice": "my_encodedDevice",
    *       //   "installerId": "my_installerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeConfig": {},
    *   //   "currentChannels": [],
    *   //   "deviceMetadata": {},
    *   //   "displayName": "my_displayName",
    *   //   "fccId": "my_fccId",
    *   //   "grantRangeAllowlists": [],
    *   //   "grants": [],
    *   //   "name": "my_name",
    *   //   "preloadedConfig": {},
    *   //   "serialNumber": "my_serialNumber",
    *   //   "state": "my_state"
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
  def updateSigned(params: ParamsResourceNodesDevicesUpdatesigned, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateSigned(
    params: ParamsResourceNodesDevicesUpdatesigned,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
