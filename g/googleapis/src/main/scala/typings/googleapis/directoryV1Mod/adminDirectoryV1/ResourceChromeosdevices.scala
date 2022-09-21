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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Chromeosdevices")
@js.native
open class ResourceChromeosdevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def action(): GaxiosPromise[Unit] = js.native
  def action(callback: BodyResponseCallback[Unit]): Unit = js.native
  def action(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def action(params: ParamsResourceChromeosdevicesAction): GaxiosPromise[Unit] = js.native
  def action(params: ParamsResourceChromeosdevicesAction, callback: BodyResponseCallback[Unit]): Unit = js.native
  def action(
    params: ParamsResourceChromeosdevicesAction,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def action(params: ParamsResourceChromeosdevicesAction, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def action(
    params: ParamsResourceChromeosdevicesAction,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Takes an action that affects a Chrome OS Device. This includes deprovisioning, disabling, and re-enabling devices. *Warning:* * Deprovisioning a device will stop device policy syncing and remove device-level printers. After a device is deprovisioned, it must be wiped before it can be re-enrolled. * Lost or stolen devices should use the disable action. * Re-enabling a disabled device will consume a device license. If you do not have sufficient licenses available when completing the re-enable action, you will receive an error. For more information about deprovisioning and disabling devices, visit the [help center](https://support.google.com/chrome/a/answer/3523633).
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
    *   const res = await directory.chromeosdevices.action({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // The unique ID of the device. The `resourceId`s are returned in the response from the [chromeosdevices.list](/admin-sdk/directory/v1/reference/chromeosdevices/list) method.
    *     resourceId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": "my_action",
    *       //   "deprovisionReason": "my_deprovisionReason"
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
  def action(params: ParamsResourceChromeosdevicesAction, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def action(
    params: ParamsResourceChromeosdevicesAction,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaChromeOsDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def get(params: ParamsResourceChromeosdevicesGet): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def get(params: ParamsResourceChromeosdevicesGet, callback: BodyResponseCallback[SchemaChromeOsDevice]): Unit = js.native
  def get(
    params: ParamsResourceChromeosdevicesGet,
    options: BodyResponseCallback[Readable | SchemaChromeOsDevice],
    callback: BodyResponseCallback[Readable | SchemaChromeOsDevice]
  ): Unit = js.native
  def get(params: ParamsResourceChromeosdevicesGet, options: MethodOptions): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def get(
    params: ParamsResourceChromeosdevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChromeOsDevice]
  ): Unit = js.native
  /**
    * Retrieves a Chrome OS device's properties.
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
    *   const res = await directory.chromeosdevices.get({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // The unique ID of the device. The `deviceId`s are returned in the response from the [chromeosdevices.list](/admin-sdk/directory/v1/reference/chromeosdevices/list) method.
    *     deviceId: 'placeholder-value',
    *     // Determines whether the response contains the full list of properties or only a subset.
    *     projection: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeTimeRanges": [],
    *   //   "annotatedAssetId": "my_annotatedAssetId",
    *   //   "annotatedLocation": "my_annotatedLocation",
    *   //   "annotatedUser": "my_annotatedUser",
    *   //   "autoUpdateExpiration": "my_autoUpdateExpiration",
    *   //   "bootMode": "my_bootMode",
    *   //   "cpuInfo": [],
    *   //   "cpuStatusReports": [],
    *   //   "deviceFiles": [],
    *   //   "deviceId": "my_deviceId",
    *   //   "diskVolumeReports": [],
    *   //   "dockMacAddress": "my_dockMacAddress",
    *   //   "etag": "my_etag",
    *   //   "ethernetMacAddress": "my_ethernetMacAddress",
    *   //   "ethernetMacAddress0": "my_ethernetMacAddress0",
    *   //   "firmwareVersion": "my_firmwareVersion",
    *   //   "firstEnrollmentTime": "my_firstEnrollmentTime",
    *   //   "kind": "my_kind",
    *   //   "lastEnrollmentTime": "my_lastEnrollmentTime",
    *   //   "lastKnownNetwork": [],
    *   //   "lastSync": "my_lastSync",
    *   //   "macAddress": "my_macAddress",
    *   //   "manufactureDate": "my_manufactureDate",
    *   //   "meid": "my_meid",
    *   //   "model": "my_model",
    *   //   "notes": "my_notes",
    *   //   "orderNumber": "my_orderNumber",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "orgUnitPath": "my_orgUnitPath",
    *   //   "osUpdateStatus": {},
    *   //   "osVersion": "my_osVersion",
    *   //   "platformVersion": "my_platformVersion",
    *   //   "recentUsers": [],
    *   //   "screenshotFiles": [],
    *   //   "serialNumber": "my_serialNumber",
    *   //   "status": "my_status",
    *   //   "supportEndDate": "my_supportEndDate",
    *   //   "systemRamFreeReports": [],
    *   //   "systemRamTotal": "my_systemRamTotal",
    *   //   "tpmVersionInfo": {},
    *   //   "willAutoRenew": false
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
  def get(params: ParamsResourceChromeosdevicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceChromeosdevicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaChromeOsDevices] = js.native
  def list(callback: BodyResponseCallback[SchemaChromeOsDevices]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChromeOsDevices] = js.native
  def list(params: ParamsResourceChromeosdevicesList): GaxiosPromise[SchemaChromeOsDevices] = js.native
  def list(params: ParamsResourceChromeosdevicesList, callback: BodyResponseCallback[SchemaChromeOsDevices]): Unit = js.native
  def list(
    params: ParamsResourceChromeosdevicesList,
    options: BodyResponseCallback[Readable | SchemaChromeOsDevices],
    callback: BodyResponseCallback[Readable | SchemaChromeOsDevices]
  ): Unit = js.native
  def list(params: ParamsResourceChromeosdevicesList, options: MethodOptions): GaxiosPromise[SchemaChromeOsDevices] = js.native
  def list(
    params: ParamsResourceChromeosdevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChromeOsDevices]
  ): Unit = js.native
  /**
    * Retrieves a paginated list of Chrome OS devices within an account.
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
    *   const res = await directory.chromeosdevices.list({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // Return devices from all child orgunits, as well as the specified org unit. If this is set to true 'orgUnitPath' must be provided.
    *     includeChildOrgunits: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Device property to use for sorting results.
    *     orderBy: 'placeholder-value',
    *     // The full path of the organizational unit (minus the leading `/`) or its unique ID.
    *     orgUnitPath: 'placeholder-value',
    *     // The `pageToken` query parameter is used to request the next page of query results. The follow-on request's `pageToken` query parameter is the `nextPageToken` from your previous response.
    *     pageToken: 'placeholder-value',
    *     // Restrict information returned to a set of selected fields.
    *     projection: 'placeholder-value',
    *     // Search string in the format given at https://developers.google.com/admin-sdk/directory/v1/list-query-operators
    *     query: 'placeholder-value',
    *     // Whether to return results in ascending or descending order. Must be used with the `orderBy` parameter.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "chromeosdevices": [],
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceChromeosdevicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceChromeosdevicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def moveDevicesToOu(): GaxiosPromise[Unit] = js.native
  def moveDevicesToOu(callback: BodyResponseCallback[Unit]): Unit = js.native
  def moveDevicesToOu(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def moveDevicesToOu(params: ParamsResourceChromeosdevicesMovedevicestoou): GaxiosPromise[Unit] = js.native
  def moveDevicesToOu(params: ParamsResourceChromeosdevicesMovedevicestoou, callback: BodyResponseCallback[Unit]): Unit = js.native
  def moveDevicesToOu(
    params: ParamsResourceChromeosdevicesMovedevicestoou,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def moveDevicesToOu(params: ParamsResourceChromeosdevicesMovedevicestoou, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def moveDevicesToOu(
    params: ParamsResourceChromeosdevicesMovedevicestoou,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Moves or inserts multiple Chrome OS devices to an organizational unit. You can move up to 50 devices at once.
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
    *   const res = await directory.chromeosdevices.moveDevicesToOu({
    *     // Immutable. ID of the Google Workspace account
    *     customerId: 'placeholder-value',
    *     // Full path of the target organizational unit or its ID
    *     orgUnitPath: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deviceIds": []
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
  def moveDevicesToOu(params: ParamsResourceChromeosdevicesMovedevicestoou, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def moveDevicesToOu(
    params: ParamsResourceChromeosdevicesMovedevicestoou,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def patch(callback: BodyResponseCallback[SchemaChromeOsDevice]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def patch(params: ParamsResourceChromeosdevicesPatch): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def patch(params: ParamsResourceChromeosdevicesPatch, callback: BodyResponseCallback[SchemaChromeOsDevice]): Unit = js.native
  def patch(
    params: ParamsResourceChromeosdevicesPatch,
    options: BodyResponseCallback[Readable | SchemaChromeOsDevice],
    callback: BodyResponseCallback[Readable | SchemaChromeOsDevice]
  ): Unit = js.native
  def patch(params: ParamsResourceChromeosdevicesPatch, options: MethodOptions): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def patch(
    params: ParamsResourceChromeosdevicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChromeOsDevice]
  ): Unit = js.native
  /**
    * Updates a device's updatable properties, such as `annotatedUser`, `annotatedLocation`, `notes`, `orgUnitPath`, or `annotatedAssetId`. This method supports [patch semantics](/admin-sdk/directory/v1/guides/performance#patch).
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
    *   const res = await directory.chromeosdevices.patch({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // The unique ID of the device. The `deviceId`s are returned in the response from the [chromeosdevices.list](/admin-sdk/v1/reference/chromeosdevices/list) method.
    *     deviceId: 'placeholder-value',
    *     // Restrict information returned to a set of selected fields.
    *     projection: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activeTimeRanges": [],
    *       //   "annotatedAssetId": "my_annotatedAssetId",
    *       //   "annotatedLocation": "my_annotatedLocation",
    *       //   "annotatedUser": "my_annotatedUser",
    *       //   "autoUpdateExpiration": "my_autoUpdateExpiration",
    *       //   "bootMode": "my_bootMode",
    *       //   "cpuInfo": [],
    *       //   "cpuStatusReports": [],
    *       //   "deviceFiles": [],
    *       //   "deviceId": "my_deviceId",
    *       //   "diskVolumeReports": [],
    *       //   "dockMacAddress": "my_dockMacAddress",
    *       //   "etag": "my_etag",
    *       //   "ethernetMacAddress": "my_ethernetMacAddress",
    *       //   "ethernetMacAddress0": "my_ethernetMacAddress0",
    *       //   "firmwareVersion": "my_firmwareVersion",
    *       //   "firstEnrollmentTime": "my_firstEnrollmentTime",
    *       //   "kind": "my_kind",
    *       //   "lastEnrollmentTime": "my_lastEnrollmentTime",
    *       //   "lastKnownNetwork": [],
    *       //   "lastSync": "my_lastSync",
    *       //   "macAddress": "my_macAddress",
    *       //   "manufactureDate": "my_manufactureDate",
    *       //   "meid": "my_meid",
    *       //   "model": "my_model",
    *       //   "notes": "my_notes",
    *       //   "orderNumber": "my_orderNumber",
    *       //   "orgUnitId": "my_orgUnitId",
    *       //   "orgUnitPath": "my_orgUnitPath",
    *       //   "osUpdateStatus": {},
    *       //   "osVersion": "my_osVersion",
    *       //   "platformVersion": "my_platformVersion",
    *       //   "recentUsers": [],
    *       //   "screenshotFiles": [],
    *       //   "serialNumber": "my_serialNumber",
    *       //   "status": "my_status",
    *       //   "supportEndDate": "my_supportEndDate",
    *       //   "systemRamFreeReports": [],
    *       //   "systemRamTotal": "my_systemRamTotal",
    *       //   "tpmVersionInfo": {},
    *       //   "willAutoRenew": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeTimeRanges": [],
    *   //   "annotatedAssetId": "my_annotatedAssetId",
    *   //   "annotatedLocation": "my_annotatedLocation",
    *   //   "annotatedUser": "my_annotatedUser",
    *   //   "autoUpdateExpiration": "my_autoUpdateExpiration",
    *   //   "bootMode": "my_bootMode",
    *   //   "cpuInfo": [],
    *   //   "cpuStatusReports": [],
    *   //   "deviceFiles": [],
    *   //   "deviceId": "my_deviceId",
    *   //   "diskVolumeReports": [],
    *   //   "dockMacAddress": "my_dockMacAddress",
    *   //   "etag": "my_etag",
    *   //   "ethernetMacAddress": "my_ethernetMacAddress",
    *   //   "ethernetMacAddress0": "my_ethernetMacAddress0",
    *   //   "firmwareVersion": "my_firmwareVersion",
    *   //   "firstEnrollmentTime": "my_firstEnrollmentTime",
    *   //   "kind": "my_kind",
    *   //   "lastEnrollmentTime": "my_lastEnrollmentTime",
    *   //   "lastKnownNetwork": [],
    *   //   "lastSync": "my_lastSync",
    *   //   "macAddress": "my_macAddress",
    *   //   "manufactureDate": "my_manufactureDate",
    *   //   "meid": "my_meid",
    *   //   "model": "my_model",
    *   //   "notes": "my_notes",
    *   //   "orderNumber": "my_orderNumber",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "orgUnitPath": "my_orgUnitPath",
    *   //   "osUpdateStatus": {},
    *   //   "osVersion": "my_osVersion",
    *   //   "platformVersion": "my_platformVersion",
    *   //   "recentUsers": [],
    *   //   "screenshotFiles": [],
    *   //   "serialNumber": "my_serialNumber",
    *   //   "status": "my_status",
    *   //   "supportEndDate": "my_supportEndDate",
    *   //   "systemRamFreeReports": [],
    *   //   "systemRamTotal": "my_systemRamTotal",
    *   //   "tpmVersionInfo": {},
    *   //   "willAutoRenew": false
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
  def patch(params: ParamsResourceChromeosdevicesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceChromeosdevicesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def update(callback: BodyResponseCallback[SchemaChromeOsDevice]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def update(params: ParamsResourceChromeosdevicesUpdate): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def update(params: ParamsResourceChromeosdevicesUpdate, callback: BodyResponseCallback[SchemaChromeOsDevice]): Unit = js.native
  def update(
    params: ParamsResourceChromeosdevicesUpdate,
    options: BodyResponseCallback[Readable | SchemaChromeOsDevice],
    callback: BodyResponseCallback[Readable | SchemaChromeOsDevice]
  ): Unit = js.native
  def update(params: ParamsResourceChromeosdevicesUpdate, options: MethodOptions): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def update(
    params: ParamsResourceChromeosdevicesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChromeOsDevice]
  ): Unit = js.native
  /**
    * Updates a device's updatable properties, such as `annotatedUser`, `annotatedLocation`, `notes`, `orgUnitPath`, or `annotatedAssetId`.
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
    *   const res = await directory.chromeosdevices.update({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // The unique ID of the device. The `deviceId`s are returned in the response from the [chromeosdevices.list](/admin-sdk/v1/reference/chromeosdevices/list) method.
    *     deviceId: 'placeholder-value',
    *     // Restrict information returned to a set of selected fields.
    *     projection: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activeTimeRanges": [],
    *       //   "annotatedAssetId": "my_annotatedAssetId",
    *       //   "annotatedLocation": "my_annotatedLocation",
    *       //   "annotatedUser": "my_annotatedUser",
    *       //   "autoUpdateExpiration": "my_autoUpdateExpiration",
    *       //   "bootMode": "my_bootMode",
    *       //   "cpuInfo": [],
    *       //   "cpuStatusReports": [],
    *       //   "deviceFiles": [],
    *       //   "deviceId": "my_deviceId",
    *       //   "diskVolumeReports": [],
    *       //   "dockMacAddress": "my_dockMacAddress",
    *       //   "etag": "my_etag",
    *       //   "ethernetMacAddress": "my_ethernetMacAddress",
    *       //   "ethernetMacAddress0": "my_ethernetMacAddress0",
    *       //   "firmwareVersion": "my_firmwareVersion",
    *       //   "firstEnrollmentTime": "my_firstEnrollmentTime",
    *       //   "kind": "my_kind",
    *       //   "lastEnrollmentTime": "my_lastEnrollmentTime",
    *       //   "lastKnownNetwork": [],
    *       //   "lastSync": "my_lastSync",
    *       //   "macAddress": "my_macAddress",
    *       //   "manufactureDate": "my_manufactureDate",
    *       //   "meid": "my_meid",
    *       //   "model": "my_model",
    *       //   "notes": "my_notes",
    *       //   "orderNumber": "my_orderNumber",
    *       //   "orgUnitId": "my_orgUnitId",
    *       //   "orgUnitPath": "my_orgUnitPath",
    *       //   "osUpdateStatus": {},
    *       //   "osVersion": "my_osVersion",
    *       //   "platformVersion": "my_platformVersion",
    *       //   "recentUsers": [],
    *       //   "screenshotFiles": [],
    *       //   "serialNumber": "my_serialNumber",
    *       //   "status": "my_status",
    *       //   "supportEndDate": "my_supportEndDate",
    *       //   "systemRamFreeReports": [],
    *       //   "systemRamTotal": "my_systemRamTotal",
    *       //   "tpmVersionInfo": {},
    *       //   "willAutoRenew": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeTimeRanges": [],
    *   //   "annotatedAssetId": "my_annotatedAssetId",
    *   //   "annotatedLocation": "my_annotatedLocation",
    *   //   "annotatedUser": "my_annotatedUser",
    *   //   "autoUpdateExpiration": "my_autoUpdateExpiration",
    *   //   "bootMode": "my_bootMode",
    *   //   "cpuInfo": [],
    *   //   "cpuStatusReports": [],
    *   //   "deviceFiles": [],
    *   //   "deviceId": "my_deviceId",
    *   //   "diskVolumeReports": [],
    *   //   "dockMacAddress": "my_dockMacAddress",
    *   //   "etag": "my_etag",
    *   //   "ethernetMacAddress": "my_ethernetMacAddress",
    *   //   "ethernetMacAddress0": "my_ethernetMacAddress0",
    *   //   "firmwareVersion": "my_firmwareVersion",
    *   //   "firstEnrollmentTime": "my_firstEnrollmentTime",
    *   //   "kind": "my_kind",
    *   //   "lastEnrollmentTime": "my_lastEnrollmentTime",
    *   //   "lastKnownNetwork": [],
    *   //   "lastSync": "my_lastSync",
    *   //   "macAddress": "my_macAddress",
    *   //   "manufactureDate": "my_manufactureDate",
    *   //   "meid": "my_meid",
    *   //   "model": "my_model",
    *   //   "notes": "my_notes",
    *   //   "orderNumber": "my_orderNumber",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "orgUnitPath": "my_orgUnitPath",
    *   //   "osUpdateStatus": {},
    *   //   "osVersion": "my_osVersion",
    *   //   "platformVersion": "my_platformVersion",
    *   //   "recentUsers": [],
    *   //   "screenshotFiles": [],
    *   //   "serialNumber": "my_serialNumber",
    *   //   "status": "my_status",
    *   //   "supportEndDate": "my_supportEndDate",
    *   //   "systemRamFreeReports": [],
    *   //   "systemRamTotal": "my_systemRamTotal",
    *   //   "tpmVersionInfo": {},
    *   //   "willAutoRenew": false
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
  def update(params: ParamsResourceChromeosdevicesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceChromeosdevicesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
