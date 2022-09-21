package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Customer$Devices$Chromeos$Commands")
@js.native
open class ResourceCustomerDevicesChromeosCommands protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDirectoryChromeosdevicesCommand] = js.native
  def get(callback: BodyResponseCallback[SchemaDirectoryChromeosdevicesCommand]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDirectoryChromeosdevicesCommand] = js.native
  def get(params: ParamsResourceCustomerDevicesChromeosCommandsGet): GaxiosPromise[SchemaDirectoryChromeosdevicesCommand] = js.native
  def get(
    params: ParamsResourceCustomerDevicesChromeosCommandsGet,
    callback: BodyResponseCallback[SchemaDirectoryChromeosdevicesCommand]
  ): Unit = js.native
  def get(
    params: ParamsResourceCustomerDevicesChromeosCommandsGet,
    options: BodyResponseCallback[Readable | SchemaDirectoryChromeosdevicesCommand],
    callback: BodyResponseCallback[Readable | SchemaDirectoryChromeosdevicesCommand]
  ): Unit = js.native
  def get(params: ParamsResourceCustomerDevicesChromeosCommandsGet, options: MethodOptions): GaxiosPromise[SchemaDirectoryChromeosdevicesCommand] = js.native
  def get(
    params: ParamsResourceCustomerDevicesChromeosCommandsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectoryChromeosdevicesCommand]
  ): Unit = js.native
  /**
    * Gets command data a specific command issued to the device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.device.chromeos',
    *       'https://www.googleapis.com/auth/admin.directory.device.chromeos.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admin.customer.devices.chromeos.commands.get({
    *     // Immutable. ID of Chrome OS Device Command.
    *     commandId: 'placeholder-value',
    *     // Immutable. ID of the Google Workspace account.
    *     customerId: 'placeholder-value',
    *     // Immutable. ID of Chrome OS Device.
    *     deviceId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commandExpireTime": "my_commandExpireTime",
    *   //   "commandId": "my_commandId",
    *   //   "commandResult": {},
    *   //   "issueTime": "my_issueTime",
    *   //   "payload": "my_payload",
    *   //   "state": "my_state",
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
  def get(params: ParamsResourceCustomerDevicesChromeosCommandsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomerDevicesChromeosCommandsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
