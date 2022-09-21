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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Customer$Devices$Chromeos")
@js.native
open class ResourceCustomerDevicesChromeos protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var commands: ResourceCustomerDevicesChromeosCommands = js.native
  
  var context: APIRequestContext = js.native
  
  def issueCommand(): GaxiosPromise[SchemaDirectoryChromeosdevicesIssueCommandResponse] = js.native
  def issueCommand(callback: BodyResponseCallback[SchemaDirectoryChromeosdevicesIssueCommandResponse]): Unit = js.native
  def issueCommand(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDirectoryChromeosdevicesIssueCommandResponse] = js.native
  def issueCommand(params: ParamsResourceCustomerDevicesChromeosIssuecommand): GaxiosPromise[SchemaDirectoryChromeosdevicesIssueCommandResponse] = js.native
  def issueCommand(
    params: ParamsResourceCustomerDevicesChromeosIssuecommand,
    callback: BodyResponseCallback[SchemaDirectoryChromeosdevicesIssueCommandResponse]
  ): Unit = js.native
  def issueCommand(
    params: ParamsResourceCustomerDevicesChromeosIssuecommand,
    options: BodyResponseCallback[Readable | SchemaDirectoryChromeosdevicesIssueCommandResponse],
    callback: BodyResponseCallback[Readable | SchemaDirectoryChromeosdevicesIssueCommandResponse]
  ): Unit = js.native
  def issueCommand(params: ParamsResourceCustomerDevicesChromeosIssuecommand, options: MethodOptions): GaxiosPromise[SchemaDirectoryChromeosdevicesIssueCommandResponse] = js.native
  def issueCommand(
    params: ParamsResourceCustomerDevicesChromeosIssuecommand,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectoryChromeosdevicesIssueCommandResponse]
  ): Unit = js.native
  /**
    * Issues a command for the device to execute.
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.device.chromeos'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admin.customer.devices.chromeos.issueCommand({
    *     // Immutable. ID of the Google Workspace account.
    *     customerId: 'placeholder-value',
    *     // Immutable. ID of Chrome OS Device.
    *     deviceId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "commandType": "my_commandType",
    *       //   "payload": "my_payload"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commandId": "my_commandId"
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
  def issueCommand(params: ParamsResourceCustomerDevicesChromeosIssuecommand, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def issueCommand(
    params: ParamsResourceCustomerDevicesChromeosIssuecommand,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
