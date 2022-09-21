package typings.googleapis.dialogflowV3Mod.dialogflowV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v3", "dialogflow_v3.Resource$Projects$Locations$Securitysettings")
@js.native
open class ResourceProjectsLocationsSecuritysettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SecuritySettings]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def create(params: ParamsResourceProjectsLocationsSecuritysettingsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSecuritysettingsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SecuritySettings]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsSecuritysettingsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3SecuritySettings],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3SecuritySettings]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsSecuritysettingsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSecuritysettingsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SecuritySettings]
  ): Unit = js.native
  /**
    * Create security settings in the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.locations.securitySettings.create({
    *     // Required. The location to create an SecuritySettings for. Format: `projects//locations/`.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "audioExportSettings": {},
    *       //   "deidentifyTemplate": "my_deidentifyTemplate",
    *       //   "displayName": "my_displayName",
    *       //   "insightsExportSettings": {},
    *       //   "inspectTemplate": "my_inspectTemplate",
    *       //   "name": "my_name",
    *       //   "purgeDataTypes": [],
    *       //   "redactionScope": "my_redactionScope",
    *       //   "redactionStrategy": "my_redactionStrategy",
    *       //   "retentionWindowDays": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "audioExportSettings": {},
    *   //   "deidentifyTemplate": "my_deidentifyTemplate",
    *   //   "displayName": "my_displayName",
    *   //   "insightsExportSettings": {},
    *   //   "inspectTemplate": "my_inspectTemplate",
    *   //   "name": "my_name",
    *   //   "purgeDataTypes": [],
    *   //   "redactionScope": "my_redactionScope",
    *   //   "redactionStrategy": "my_redactionStrategy",
    *   //   "retentionWindowDays": 0
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
  def create(params: ParamsResourceProjectsLocationsSecuritysettingsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSecuritysettingsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsSecuritysettingsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSecuritysettingsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSecuritysettingsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsSecuritysettingsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSecuritysettingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified SecuritySettings.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.locations.securitySettings.delete({
    *     // Required. The name of the SecuritySettings to delete. Format: `projects//locations//securitySettings/`.
    *     name: 'projects/my-project/locations/my-location/securitySettings/my-securitySetting',
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
  def delete(params: ParamsResourceProjectsLocationsSecuritysettingsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSecuritysettingsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SecuritySettings]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def get(params: ParamsResourceProjectsLocationsSecuritysettingsGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSecuritysettingsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SecuritySettings]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsSecuritysettingsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3SecuritySettings],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3SecuritySettings]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsSecuritysettingsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSecuritysettingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SecuritySettings]
  ): Unit = js.native
  /**
    * Retrieves the specified SecuritySettings. The returned settings may be stale by up to 1 minute.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.locations.securitySettings.get({
    *     // Required. Resource name of the settings. Format: `projects//locations//securitySettings/`.
    *     name: 'projects/my-project/locations/my-location/securitySettings/my-securitySetting',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "audioExportSettings": {},
    *   //   "deidentifyTemplate": "my_deidentifyTemplate",
    *   //   "displayName": "my_displayName",
    *   //   "insightsExportSettings": {},
    *   //   "inspectTemplate": "my_inspectTemplate",
    *   //   "name": "my_name",
    *   //   "purgeDataTypes": [],
    *   //   "redactionScope": "my_redactionScope",
    *   //   "redactionStrategy": "my_redactionStrategy",
    *   //   "retentionWindowDays": 0
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
  def get(params: ParamsResourceProjectsLocationsSecuritysettingsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSecuritysettingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsSecuritysettingsList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSecuritysettingsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsSecuritysettingsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsSecuritysettingsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSecuritysettingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all security settings in the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.locations.securitySettings.list({
    *     // The maximum number of items to return in a single page. By default 20 and at most 100.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The location to list all security settings for. Format: `projects//locations/`.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "securitySettings": []
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
  def list(params: ParamsResourceProjectsLocationsSecuritysettingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSecuritysettingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SecuritySettings]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def patch(params: ParamsResourceProjectsLocationsSecuritysettingsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsSecuritysettingsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SecuritySettings]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsSecuritysettingsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3SecuritySettings],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3SecuritySettings]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsSecuritysettingsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsSecuritysettingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SecuritySettings]
  ): Unit = js.native
  /**
    * Updates the specified SecuritySettings.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.locations.securitySettings.patch({
    *     // Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name automatically. Format: `projects//locations//securitySettings/`.
    *     name: 'projects/my-project/locations/my-location/securitySettings/my-securitySetting',
    *     // Required. The mask to control which fields get updated. If the mask is not present, all fields will be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "audioExportSettings": {},
    *       //   "deidentifyTemplate": "my_deidentifyTemplate",
    *       //   "displayName": "my_displayName",
    *       //   "insightsExportSettings": {},
    *       //   "inspectTemplate": "my_inspectTemplate",
    *       //   "name": "my_name",
    *       //   "purgeDataTypes": [],
    *       //   "redactionScope": "my_redactionScope",
    *       //   "redactionStrategy": "my_redactionStrategy",
    *       //   "retentionWindowDays": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "audioExportSettings": {},
    *   //   "deidentifyTemplate": "my_deidentifyTemplate",
    *   //   "displayName": "my_displayName",
    *   //   "insightsExportSettings": {},
    *   //   "inspectTemplate": "my_inspectTemplate",
    *   //   "name": "my_name",
    *   //   "purgeDataTypes": [],
    *   //   "redactionScope": "my_redactionScope",
    *   //   "redactionStrategy": "my_redactionStrategy",
    *   //   "retentionWindowDays": 0
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
  def patch(params: ParamsResourceProjectsLocationsSecuritysettingsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsSecuritysettingsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
