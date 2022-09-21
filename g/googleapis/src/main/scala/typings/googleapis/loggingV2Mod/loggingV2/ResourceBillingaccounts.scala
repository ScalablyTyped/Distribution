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

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Billingaccounts")
@js.native
open class ResourceBillingaccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var exclusions: ResourceBillingaccountsExclusions = js.native
  
  def getCmekSettings(): GaxiosPromise[SchemaCmekSettings] = js.native
  def getCmekSettings(callback: BodyResponseCallback[SchemaCmekSettings]): Unit = js.native
  def getCmekSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCmekSettings] = js.native
  def getCmekSettings(params: ParamsResourceBillingaccountsGetcmeksettings): GaxiosPromise[SchemaCmekSettings] = js.native
  def getCmekSettings(
    params: ParamsResourceBillingaccountsGetcmeksettings,
    callback: BodyResponseCallback[SchemaCmekSettings]
  ): Unit = js.native
  def getCmekSettings(
    params: ParamsResourceBillingaccountsGetcmeksettings,
    options: BodyResponseCallback[Readable | SchemaCmekSettings],
    callback: BodyResponseCallback[Readable | SchemaCmekSettings]
  ): Unit = js.native
  def getCmekSettings(params: ParamsResourceBillingaccountsGetcmeksettings, options: MethodOptions): GaxiosPromise[SchemaCmekSettings] = js.native
  def getCmekSettings(
    params: ParamsResourceBillingaccountsGetcmeksettings,
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
    *   const res = await logging.billingAccounts.getCmekSettings({
    *     // Required. The resource for which to retrieve CMEK settings. "projects/[PROJECT_ID]/cmekSettings" "organizations/[ORGANIZATION_ID]/cmekSettings" "billingAccounts/[BILLING_ACCOUNT_ID]/cmekSettings" "folders/[FOLDER_ID]/cmekSettings" For example:"organizations/12345/cmekSettings"Note: CMEK for the Log Router can be configured for Google Cloud projects, folders, organizations and billing accounts. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.
    *     name: 'billingAccounts/my-billingAccount',
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
  def getCmekSettings(params: ParamsResourceBillingaccountsGetcmeksettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getCmekSettings(
    params: ParamsResourceBillingaccountsGetcmeksettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSettings(): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def getSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(params: ParamsResourceBillingaccountsGetsettings): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(params: ParamsResourceBillingaccountsGetsettings, callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def getSettings(
    params: ParamsResourceBillingaccountsGetsettings,
    options: BodyResponseCallback[Readable | SchemaSettings],
    callback: BodyResponseCallback[Readable | SchemaSettings]
  ): Unit = js.native
  def getSettings(params: ParamsResourceBillingaccountsGetsettings, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(
    params: ParamsResourceBillingaccountsGetsettings,
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
    *   const res = await logging.billingAccounts.getSettings({
    *     // Required. The resource for which to retrieve settings. "projects/[PROJECT_ID]/settings" "organizations/[ORGANIZATION_ID]/settings" "billingAccounts/[BILLING_ACCOUNT_ID]/settings" "folders/[FOLDER_ID]/settings" For example:"organizations/12345/settings"Note: Settings for the Log Router can be get for Google Cloud projects, folders, organizations and billing accounts. Currently it can only be configured for organizations. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.
    *     name: 'billingAccounts/my-billingAccount',
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
  def getSettings(params: ParamsResourceBillingaccountsGetsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSettings(
    params: ParamsResourceBillingaccountsGetsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var locations: ResourceBillingaccountsLocations = js.native
  
  var logs: ResourceBillingaccountsLogs = js.native
  
  var sinks: ResourceBillingaccountsSinks = js.native
}
