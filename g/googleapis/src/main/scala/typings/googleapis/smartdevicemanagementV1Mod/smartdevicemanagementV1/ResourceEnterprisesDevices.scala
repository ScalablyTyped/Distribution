package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/smartdevicemanagement/v1", "smartdevicemanagement_v1.Resource$Enterprises$Devices")
@js.native
open class ResourceEnterprisesDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def executeCommand(): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse] = js.native
  def executeCommand(callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse]): Unit = js.native
  def executeCommand(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse] = js.native
  def executeCommand(params: ParamsResourceEnterprisesDevicesExecutecommand): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse] = js.native
  def executeCommand(
    params: ParamsResourceEnterprisesDevicesExecutecommand,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse]
  ): Unit = js.native
  def executeCommand(
    params: ParamsResourceEnterprisesDevicesExecutecommand,
    options: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse]
  ): Unit = js.native
  def executeCommand(params: ParamsResourceEnterprisesDevicesExecutecommand, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse] = js.native
  def executeCommand(
    params: ParamsResourceEnterprisesDevicesExecutecommand,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse]
  ): Unit = js.native
  /**
    * Executes a command to device managed by the enterprise.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/smartdevicemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const smartdevicemanagement = google.smartdevicemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sdm.service',
    *       'https://www.googleapis.com/auth/sdm.thermostat.service',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await smartdevicemanagement.enterprises.devices.executeCommand({
    *     // The name of the device requested. For example: "enterprises/XYZ/devices/123"
    *     name: 'enterprises/my-enterprise/devices/my-device',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "command": "my_command",
    *       //   "params": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "results": {}
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
  def executeCommand(params: ParamsResourceEnterprisesDevicesExecutecommand, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def executeCommand(
    params: ParamsResourceEnterprisesDevicesExecutecommand,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1Device] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1Device]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1Device] = js.native
  def get(params: ParamsResourceEnterprisesDevicesGet): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1Device] = js.native
  def get(
    params: ParamsResourceEnterprisesDevicesGet,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1Device]
  ): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesDevicesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1Device],
    callback: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1Device]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesDevicesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1Device] = js.native
  def get(
    params: ParamsResourceEnterprisesDevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1Device]
  ): Unit = js.native
  /**
    * Gets a device managed by the enterprise.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/smartdevicemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const smartdevicemanagement = google.smartdevicemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sdm.service',
    *       'https://www.googleapis.com/auth/sdm.thermostat.service',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await smartdevicemanagement.enterprises.devices.get({
    *     // The name of the device requested. For example: "enterprises/XYZ/devices/123"
    *     name: 'enterprises/my-enterprise/devices/my-device',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "parentRelations": [],
    *   //   "traits": {},
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceEnterprisesDevicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEnterprisesDevicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse] = js.native
  def list(params: ParamsResourceEnterprisesDevicesList): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesDevicesList,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEnterprisesDevicesList,
    options: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesDevicesList, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesDevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse]
  ): Unit = js.native
  /**
    * Lists devices managed by the enterprise.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/smartdevicemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const smartdevicemanagement = google.smartdevicemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sdm.service',
    *       'https://www.googleapis.com/auth/sdm.thermostat.service',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await smartdevicemanagement.enterprises.devices.list({
    *     // Optional filter to list devices. Filters can be done on: Device custom name (substring match): 'customName=wing'
    *     filter: 'placeholder-value',
    *     // Optional requested page size. Server may return fewer devices than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // Optional token of the page to retrieve.
    *     pageToken: 'placeholder-value',
    *     // The parent enterprise to list devices under. E.g. "enterprises/XYZ".
    *     parent: 'enterprises/my-enterprise',
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
  def list(params: ParamsResourceEnterprisesDevicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEnterprisesDevicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
