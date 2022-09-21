package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/prod_tt_sasportal/v1alpha1", "prod_tt_sasportal_v1alpha1.Resource$Nodes$Deployments$Devices")
@js.native
open class ResourceNodesDeploymentsDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def create(callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def create(params: ParamsResourceNodesDeploymentsDevicesCreate): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def create(
    params: ParamsResourceNodesDeploymentsDevicesCreate,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  def create(
    params: ParamsResourceNodesDeploymentsDevicesCreate,
    options: BodyResponseCallback[Readable | SchemaSasPortalDevice],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDevice]
  ): Unit = js.native
  def create(params: ParamsResourceNodesDeploymentsDevicesCreate, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def create(
    params: ParamsResourceNodesDeploymentsDevicesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  /**
    * Creates a device under a node or customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/prod_tt_sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const prod_tt_sasportal = google.prod_tt_sasportal('v1alpha1');
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
    *   const res = await prod_tt_sasportal.nodes.deployments.devices.create({
    *     // Required. The name of the parent resource.
    *     parent: 'nodes/my-node/deployments/my-deployment',
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
  def create(params: ParamsResourceNodesDeploymentsDevicesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceNodesDeploymentsDevicesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def createSigned(): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def createSigned(callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def createSigned(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def createSigned(params: ParamsResourceNodesDeploymentsDevicesCreatesigned): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def createSigned(
    params: ParamsResourceNodesDeploymentsDevicesCreatesigned,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  def createSigned(
    params: ParamsResourceNodesDeploymentsDevicesCreatesigned,
    options: BodyResponseCallback[Readable | SchemaSasPortalDevice],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDevice]
  ): Unit = js.native
  def createSigned(params: ParamsResourceNodesDeploymentsDevicesCreatesigned, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def createSigned(
    params: ParamsResourceNodesDeploymentsDevicesCreatesigned,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  /**
    * Creates a signed device under a node or customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/prod_tt_sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const prod_tt_sasportal = google.prod_tt_sasportal('v1alpha1');
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
    *   const res = await prod_tt_sasportal.nodes.deployments.devices.createSigned({
    *     // Required. The name of the parent resource.
    *     parent: 'nodes/my-node/deployments/my-deployment',
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
  def createSigned(params: ParamsResourceNodesDeploymentsDevicesCreatesigned, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createSigned(
    params: ParamsResourceNodesDeploymentsDevicesCreatesigned,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSasPortalListDevicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSasPortalListDevicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalListDevicesResponse] = js.native
  def list(params: ParamsResourceNodesDeploymentsDevicesList): GaxiosPromise[SchemaSasPortalListDevicesResponse] = js.native
  def list(
    params: ParamsResourceNodesDeploymentsDevicesList,
    callback: BodyResponseCallback[SchemaSasPortalListDevicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceNodesDeploymentsDevicesList,
    options: BodyResponseCallback[Readable | SchemaSasPortalListDevicesResponse],
    callback: BodyResponseCallback[Readable | SchemaSasPortalListDevicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceNodesDeploymentsDevicesList, options: MethodOptions): GaxiosPromise[SchemaSasPortalListDevicesResponse] = js.native
  def list(
    params: ParamsResourceNodesDeploymentsDevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalListDevicesResponse]
  ): Unit = js.native
  /**
    * Lists devices under a node or customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/prod_tt_sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const prod_tt_sasportal = google.prod_tt_sasportal('v1alpha1');
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
    *   const res = await prod_tt_sasportal.nodes.deployments.devices.list({
    *     // The filter expression. The filter should have one of the following formats: "sn=123454" or "display_name=MyDevice". sn corresponds to serial number of the device. The filter is case insensitive.
    *     filter: 'placeholder-value',
    *     // The maximum number of devices to return in the response. If empty or zero, all devices will be listed. Must be in the range [0, 1000].
    *     pageSize: 'placeholder-value',
    *     // A pagination token returned from a previous call to ListDevices that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the parent resource.
    *     parent: 'nodes/my-node/deployments/my-deployment',
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
  def list(params: ParamsResourceNodesDeploymentsDevicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceNodesDeploymentsDevicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
