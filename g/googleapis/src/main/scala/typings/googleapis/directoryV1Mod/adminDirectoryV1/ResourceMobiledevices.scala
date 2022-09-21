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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Mobiledevices")
@js.native
open class ResourceMobiledevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def action(): GaxiosPromise[Unit] = js.native
  def action(callback: BodyResponseCallback[Unit]): Unit = js.native
  def action(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def action(params: ParamsResourceMobiledevicesAction): GaxiosPromise[Unit] = js.native
  def action(params: ParamsResourceMobiledevicesAction, callback: BodyResponseCallback[Unit]): Unit = js.native
  def action(
    params: ParamsResourceMobiledevicesAction,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def action(params: ParamsResourceMobiledevicesAction, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def action(
    params: ParamsResourceMobiledevicesAction,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Takes an action that affects a mobile device. For example, remotely wiping a device.
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
    *       'https://www.googleapis.com/auth/admin.directory.device.mobile',
    *       'https://www.googleapis.com/auth/admin.directory.device.mobile.action',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.mobiledevices.action({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // The unique ID the API service uses to identify the mobile device.
    *     resourceId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": "my_action"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
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
  def action(params: ParamsResourceMobiledevicesAction, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def action(
    params: ParamsResourceMobiledevicesAction,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceMobiledevicesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceMobiledevicesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceMobiledevicesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceMobiledevicesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceMobiledevicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Removes a mobile device.
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.device.mobile'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.mobiledevices.delete({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // The unique ID the API service uses to identify the mobile device.
    *     resourceId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceMobiledevicesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceMobiledevicesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaMobileDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaMobileDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMobileDevice] = js.native
  def get(params: ParamsResourceMobiledevicesGet): GaxiosPromise[SchemaMobileDevice] = js.native
  def get(params: ParamsResourceMobiledevicesGet, callback: BodyResponseCallback[SchemaMobileDevice]): Unit = js.native
  def get(
    params: ParamsResourceMobiledevicesGet,
    options: BodyResponseCallback[Readable | SchemaMobileDevice],
    callback: BodyResponseCallback[Readable | SchemaMobileDevice]
  ): Unit = js.native
  def get(params: ParamsResourceMobiledevicesGet, options: MethodOptions): GaxiosPromise[SchemaMobileDevice] = js.native
  def get(
    params: ParamsResourceMobiledevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMobileDevice]
  ): Unit = js.native
  /**
    * Retrieves a mobile device's properties.
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
    *       'https://www.googleapis.com/auth/admin.directory.device.mobile',
    *       'https://www.googleapis.com/auth/admin.directory.device.mobile.action',
    *       'https://www.googleapis.com/auth/admin.directory.device.mobile.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.mobiledevices.get({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // Restrict information returned to a set of selected fields.
    *     projection: 'placeholder-value',
    *     // The unique ID the API service uses to identify the mobile device.
    *     resourceId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adbStatus": false,
    *   //   "applications": [],
    *   //   "basebandVersion": "my_basebandVersion",
    *   //   "bootloaderVersion": "my_bootloaderVersion",
    *   //   "brand": "my_brand",
    *   //   "buildNumber": "my_buildNumber",
    *   //   "defaultLanguage": "my_defaultLanguage",
    *   //   "developerOptionsStatus": false,
    *   //   "deviceCompromisedStatus": "my_deviceCompromisedStatus",
    *   //   "deviceId": "my_deviceId",
    *   //   "devicePasswordStatus": "my_devicePasswordStatus",
    *   //   "email": [],
    *   //   "encryptionStatus": "my_encryptionStatus",
    *   //   "etag": "my_etag",
    *   //   "firstSync": "my_firstSync",
    *   //   "hardware": "my_hardware",
    *   //   "hardwareId": "my_hardwareId",
    *   //   "imei": "my_imei",
    *   //   "kernelVersion": "my_kernelVersion",
    *   //   "kind": "my_kind",
    *   //   "lastSync": "my_lastSync",
    *   //   "managedAccountIsOnOwnerProfile": false,
    *   //   "manufacturer": "my_manufacturer",
    *   //   "meid": "my_meid",
    *   //   "model": "my_model",
    *   //   "name": [],
    *   //   "networkOperator": "my_networkOperator",
    *   //   "os": "my_os",
    *   //   "otherAccountsInfo": [],
    *   //   "privilege": "my_privilege",
    *   //   "releaseVersion": "my_releaseVersion",
    *   //   "resourceId": "my_resourceId",
    *   //   "securityPatchLevel": "my_securityPatchLevel",
    *   //   "serialNumber": "my_serialNumber",
    *   //   "status": "my_status",
    *   //   "supportsWorkProfile": false,
    *   //   "type": "my_type",
    *   //   "unknownSourcesStatus": false,
    *   //   "userAgent": "my_userAgent",
    *   //   "wifiMacAddress": "my_wifiMacAddress"
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
  def get(params: ParamsResourceMobiledevicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceMobiledevicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaMobileDevices] = js.native
  def list(callback: BodyResponseCallback[SchemaMobileDevices]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMobileDevices] = js.native
  def list(params: ParamsResourceMobiledevicesList): GaxiosPromise[SchemaMobileDevices] = js.native
  def list(params: ParamsResourceMobiledevicesList, callback: BodyResponseCallback[SchemaMobileDevices]): Unit = js.native
  def list(
    params: ParamsResourceMobiledevicesList,
    options: BodyResponseCallback[Readable | SchemaMobileDevices],
    callback: BodyResponseCallback[Readable | SchemaMobileDevices]
  ): Unit = js.native
  def list(params: ParamsResourceMobiledevicesList, options: MethodOptions): GaxiosPromise[SchemaMobileDevices] = js.native
  def list(
    params: ParamsResourceMobiledevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMobileDevices]
  ): Unit = js.native
  /**
    * Retrieves a paginated list of all user-owned mobile devices for an account. To retrieve a list that includes company-owned devices, use the Cloud Identity [Devices API](https://cloud.google.com/identity/docs/concepts/overview-devices) instead.
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
    *       'https://www.googleapis.com/auth/admin.directory.device.mobile',
    *       'https://www.googleapis.com/auth/admin.directory.device.mobile.action',
    *       'https://www.googleapis.com/auth/admin.directory.device.mobile.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.mobiledevices.list({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // Maximum number of results to return. Max allowed value is 100.
    *     maxResults: 'placeholder-value',
    *     // Device property to use for sorting results.
    *     orderBy: 'placeholder-value',
    *     // Token to specify next page in the list
    *     pageToken: 'placeholder-value',
    *     // Restrict information returned to a set of selected fields.
    *     projection: 'placeholder-value',
    *     // Search string in the format given at https://developers.google.com/admin-sdk/directory/v1/search-operators
    *     query: 'placeholder-value',
    *     // Whether to return results in ascending or descending order. Must be used with the `orderBy` parameter.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "mobiledevices": [],
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
  def list(params: ParamsResourceMobiledevicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMobiledevicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
