package typings.googleapis.loggingV2Mod.loggingV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Folders")
@js.native
open class ResourceFolders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var exclusions: ResourceFoldersExclusions = js.native
  
  def getCmekSettings(): GaxiosPromise[SchemaCmekSettings] = js.native
  def getCmekSettings(callback: BodyResponseCallback[SchemaCmekSettings]): Unit = js.native
  def getCmekSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCmekSettings] = js.native
  def getCmekSettings(params: ParamsResourceFoldersGetcmeksettings): GaxiosPromise[SchemaCmekSettings] = js.native
  def getCmekSettings(params: ParamsResourceFoldersGetcmeksettings, callback: BodyResponseCallback[SchemaCmekSettings]): Unit = js.native
  def getCmekSettings(
    params: ParamsResourceFoldersGetcmeksettings,
    options: BodyResponseCallback[Readable | SchemaCmekSettings],
    callback: BodyResponseCallback[Readable | SchemaCmekSettings]
  ): Unit = js.native
  def getCmekSettings(params: ParamsResourceFoldersGetcmeksettings, options: MethodOptions): GaxiosPromise[SchemaCmekSettings] = js.native
  def getCmekSettings(
    params: ParamsResourceFoldersGetcmeksettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCmekSettings]
  ): Unit = js.native
  /**
    * Gets the Logging CMEK settings for the given resource.Note: CMEK for the Log Router can be configured for Google Cloud projects, folders, organizations and billing accounts. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.See Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/logging.admin',
    *       'https://www.googleapis.com/auth/logging.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.folders.getCmekSettings({
    *     // Required. The resource for which to retrieve CMEK settings. "projects/[PROJECT_ID]/cmekSettings" "organizations/[ORGANIZATION_ID]/cmekSettings" "billingAccounts/[BILLING_ACCOUNT_ID]/cmekSettings" "folders/[FOLDER_ID]/cmekSettings" For example:"organizations/12345/cmekSettings"Note: CMEK for the Log Router can be configured for Google Cloud projects, folders, organizations and billing accounts. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.
    *     name: 'folders/my-folder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "kmsKeyVersionName": "my_kmsKeyVersionName",
    *   //   "name": "my_name",
    *   //   "serviceAccountId": "my_serviceAccountId"
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
  def getCmekSettings(params: ParamsResourceFoldersGetcmeksettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getCmekSettings(
    params: ParamsResourceFoldersGetcmeksettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSettings(): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def getSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(params: ParamsResourceFoldersGetsettings): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(params: ParamsResourceFoldersGetsettings, callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def getSettings(
    params: ParamsResourceFoldersGetsettings,
    options: BodyResponseCallback[Readable | SchemaSettings],
    callback: BodyResponseCallback[Readable | SchemaSettings]
  ): Unit = js.native
  def getSettings(params: ParamsResourceFoldersGetsettings, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(
    params: ParamsResourceFoldersGetsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSettings]
  ): Unit = js.native
  /**
    * Gets the Log Router settings for the given resource.Note: Settings for the Log Router can be get for Google Cloud projects, folders, organizations and billing accounts. Currently it can only be configured for organizations. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.See Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/logging.admin',
    *       'https://www.googleapis.com/auth/logging.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.folders.getSettings({
    *     // Required. The resource for which to retrieve settings. "projects/[PROJECT_ID]/settings" "organizations/[ORGANIZATION_ID]/settings" "billingAccounts/[BILLING_ACCOUNT_ID]/settings" "folders/[FOLDER_ID]/settings" For example:"organizations/12345/settings"Note: Settings for the Log Router can be get for Google Cloud projects, folders, organizations and billing accounts. Currently it can only be configured for organizations. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.
    *     name: 'folders/my-folder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "disableDefaultSink": false,
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "kmsServiceAccountId": "my_kmsServiceAccountId",
    *   //   "name": "my_name",
    *   //   "storageLocation": "my_storageLocation"
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
  def getSettings(params: ParamsResourceFoldersGetsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSettings(
    params: ParamsResourceFoldersGetsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var locations: ResourceFoldersLocations = js.native
  
  var logs: ResourceFoldersLogs = js.native
  
  var sinks: ResourceFoldersSinks = js.native
  
  def updateSettings(): GaxiosPromise[SchemaSettings] = js.native
  def updateSettings(callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def updateSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def updateSettings(params: ParamsResourceFoldersUpdatesettings): GaxiosPromise[SchemaSettings] = js.native
  def updateSettings(params: ParamsResourceFoldersUpdatesettings, callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def updateSettings(
    params: ParamsResourceFoldersUpdatesettings,
    options: BodyResponseCallback[Readable | SchemaSettings],
    callback: BodyResponseCallback[Readable | SchemaSettings]
  ): Unit = js.native
  def updateSettings(params: ParamsResourceFoldersUpdatesettings, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def updateSettings(
    params: ParamsResourceFoldersUpdatesettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSettings]
  ): Unit = js.native
  /**
    * Updates the Log Router settings for the given resource.Note: Settings for the Log Router can currently only be configured for Google Cloud organizations. Once configured, it applies to all projects and folders in the Google Cloud organization.UpdateSettings will fail if 1) kms_key_name is invalid, or 2) the associated service account does not have the required roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the key, or 3) access to the key is disabled. 4) location_id is not supported by Logging. 5) location_id violate OrgPolicy.See Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.folders.updateSettings({
    *     // Required. The resource name for the settings to update. "organizations/[ORGANIZATION_ID]/settings" For example:"organizations/12345/settings"Note: Settings for the Log Router can currently only be configured for Google Cloud organizations. Once configured, it applies to all projects and folders in the Google Cloud organization.
    *     name: 'folders/my-folder',
    *     // Optional. Field mask identifying which fields from settings should be updated. A field will be overwritten if and only if it is in the update mask. Output only fields cannot be updated.See FieldMask for more information.For example: "updateMask=kmsKeyName"
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disableDefaultSink": false,
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "kmsServiceAccountId": "my_kmsServiceAccountId",
    *       //   "name": "my_name",
    *       //   "storageLocation": "my_storageLocation"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "disableDefaultSink": false,
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "kmsServiceAccountId": "my_kmsServiceAccountId",
    *   //   "name": "my_name",
    *   //   "storageLocation": "my_storageLocation"
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
  def updateSettings(params: ParamsResourceFoldersUpdatesettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateSettings(
    params: ParamsResourceFoldersUpdatesettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
