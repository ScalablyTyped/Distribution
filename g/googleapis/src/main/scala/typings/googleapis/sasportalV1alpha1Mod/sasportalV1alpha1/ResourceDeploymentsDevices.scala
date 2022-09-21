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

@JSImport("googleapis/build/src/apis/sasportal/v1alpha1", "sasportal_v1alpha1.Resource$Deployments$Devices")
@js.native
open class ResourceDeploymentsDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaSasPortalEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(params: ParamsResourceDeploymentsDevicesDelete): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(
    params: ParamsResourceDeploymentsDevicesDelete,
    callback: BodyResponseCallback[SchemaSasPortalEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceDeploymentsDevicesDelete,
    options: BodyResponseCallback[Readable | SchemaSasPortalEmpty],
    callback: BodyResponseCallback[Readable | SchemaSasPortalEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceDeploymentsDevicesDelete, options: MethodOptions): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(
    params: ParamsResourceDeploymentsDevicesDelete,
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
    *   const res = await sasportal.deployments.devices.delete({
    *     // Required. The name of the device.
    *     name: 'deployments/my-deployment/devices/my-device',
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
  def delete(params: ParamsResourceDeploymentsDevicesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceDeploymentsDevicesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def get(params: ParamsResourceDeploymentsDevicesGet): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def get(params: ParamsResourceDeploymentsDevicesGet, callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def get(
    params: ParamsResourceDeploymentsDevicesGet,
    options: BodyResponseCallback[Readable | SchemaSasPortalDevice],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDevice]
  ): Unit = js.native
  def get(params: ParamsResourceDeploymentsDevicesGet, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def get(
    params: ParamsResourceDeploymentsDevicesGet,
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
    *   const res = await sasportal.deployments.devices.get({
    *     // Required. The name of the device.
    *     name: 'deployments/my-deployment/devices/my-device',
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
  def get(params: ParamsResourceDeploymentsDevicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDeploymentsDevicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def move(): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(callback: BodyResponseCallback[SchemaSasPortalOperation]): Unit = js.native
  def move(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(params: ParamsResourceDeploymentsDevicesMove): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(
    params: ParamsResourceDeploymentsDevicesMove,
    callback: BodyResponseCallback[SchemaSasPortalOperation]
  ): Unit = js.native
  def move(
    params: ParamsResourceDeploymentsDevicesMove,
    options: BodyResponseCallback[Readable | SchemaSasPortalOperation],
    callback: BodyResponseCallback[Readable | SchemaSasPortalOperation]
  ): Unit = js.native
  def move(params: ParamsResourceDeploymentsDevicesMove, options: MethodOptions): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(
    params: ParamsResourceDeploymentsDevicesMove,
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
    *   const res = await sasportal.deployments.devices.move({
    *     // Required. The name of the device to move.
    *     name: 'deployments/my-deployment/devices/my-device',
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
  def move(params: ParamsResourceDeploymentsDevicesMove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def move(
    params: ParamsResourceDeploymentsDevicesMove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def patch(callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def patch(params: ParamsResourceDeploymentsDevicesPatch): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def patch(
    params: ParamsResourceDeploymentsDevicesPatch,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  def patch(
    params: ParamsResourceDeploymentsDevicesPatch,
    options: BodyResponseCallback[Readable | SchemaSasPortalDevice],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDevice]
  ): Unit = js.native
  def patch(params: ParamsResourceDeploymentsDevicesPatch, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def patch(
    params: ParamsResourceDeploymentsDevicesPatch,
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
    *   const res = await sasportal.deployments.devices.patch({
    *     // Output only. The resource path name.
    *     name: 'deployments/my-deployment/devices/my-device',
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
  def patch(params: ParamsResourceDeploymentsDevicesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceDeploymentsDevicesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def signDevice(): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def signDevice(callback: BodyResponseCallback[SchemaSasPortalEmpty]): Unit = js.native
  def signDevice(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def signDevice(params: ParamsResourceDeploymentsDevicesSigndevice): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def signDevice(
    params: ParamsResourceDeploymentsDevicesSigndevice,
    callback: BodyResponseCallback[SchemaSasPortalEmpty]
  ): Unit = js.native
  def signDevice(
    params: ParamsResourceDeploymentsDevicesSigndevice,
    options: BodyResponseCallback[Readable | SchemaSasPortalEmpty],
    callback: BodyResponseCallback[Readable | SchemaSasPortalEmpty]
  ): Unit = js.native
  def signDevice(params: ParamsResourceDeploymentsDevicesSigndevice, options: MethodOptions): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def signDevice(
    params: ParamsResourceDeploymentsDevicesSigndevice,
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
    *   const res = await sasportal.deployments.devices.signDevice({
    *     // Output only. The resource path name.
    *     name: 'deployments/my-deployment/devices/my-device',
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
  def signDevice(params: ParamsResourceDeploymentsDevicesSigndevice, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def signDevice(
    params: ParamsResourceDeploymentsDevicesSigndevice,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateSigned(): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def updateSigned(callback: BodyResponseCallback[SchemaSasPortalDevice]): Unit = js.native
  def updateSigned(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def updateSigned(params: ParamsResourceDeploymentsDevicesUpdatesigned): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def updateSigned(
    params: ParamsResourceDeploymentsDevicesUpdatesigned,
    callback: BodyResponseCallback[SchemaSasPortalDevice]
  ): Unit = js.native
  def updateSigned(
    params: ParamsResourceDeploymentsDevicesUpdatesigned,
    options: BodyResponseCallback[Readable | SchemaSasPortalDevice],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDevice]
  ): Unit = js.native
  def updateSigned(params: ParamsResourceDeploymentsDevicesUpdatesigned, options: MethodOptions): GaxiosPromise[SchemaSasPortalDevice] = js.native
  def updateSigned(
    params: ParamsResourceDeploymentsDevicesUpdatesigned,
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
    *   const res = await sasportal.deployments.devices.updateSigned({
    *     // Required. The name of the device to update.
    *     name: 'deployments/my-deployment/devices/my-device',
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
  def updateSigned(params: ParamsResourceDeploymentsDevicesUpdatesigned, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateSigned(
    params: ParamsResourceDeploymentsDevicesUpdatesigned,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
