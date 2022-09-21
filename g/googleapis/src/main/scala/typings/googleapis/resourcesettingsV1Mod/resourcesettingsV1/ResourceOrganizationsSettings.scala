package typings.googleapis.resourcesettingsV1Mod.resourcesettingsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/resourcesettings/v1", "resourcesettings_v1.Resource$Organizations$Settings")
@js.native
open class ResourceOrganizationsSettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudResourcesettingsV1Setting] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudResourcesettingsV1Setting]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudResourcesettingsV1Setting] = js.native
  def get(params: ParamsResourceOrganizationsSettingsGet): GaxiosPromise[SchemaGoogleCloudResourcesettingsV1Setting] = js.native
  def get(
    params: ParamsResourceOrganizationsSettingsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudResourcesettingsV1Setting]
  ): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsSettingsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudResourcesettingsV1Setting],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudResourcesettingsV1Setting]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsSettingsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudResourcesettingsV1Setting] = js.native
  def get(
    params: ParamsResourceOrganizationsSettingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudResourcesettingsV1Setting]
  ): Unit = js.native
  /**
    * Returns a specified setting. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/resourcesettings.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const resourcesettings = google.resourcesettings('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await resourcesettings.organizations.settings.get({
    *     // Required. The name of the setting to get. See Setting for naming requirements.
    *     name: 'organizations/my-organization/settings/my-setting',
    *     // The SettingView for this request.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "effectiveValue": {},
    *   //   "etag": "my_etag",
    *   //   "localValue": {},
    *   //   "metadata": {},
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceOrganizationsSettingsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrganizationsSettingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudResourcesettingsV1ListSettingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudResourcesettingsV1ListSettingsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudResourcesettingsV1ListSettingsResponse] = js.native
  def list(params: ParamsResourceOrganizationsSettingsList): GaxiosPromise[SchemaGoogleCloudResourcesettingsV1ListSettingsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsSettingsList,
    callback: BodyResponseCallback[SchemaGoogleCloudResourcesettingsV1ListSettingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsSettingsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudResourcesettingsV1ListSettingsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudResourcesettingsV1ListSettingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsSettingsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudResourcesettingsV1ListSettingsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsSettingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudResourcesettingsV1ListSettingsResponse]
  ): Unit = js.native
  /**
    * Lists all the settings that are available on the Cloud resource `parent`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/resourcesettings.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const resourcesettings = google.resourcesettings('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await resourcesettings.organizations.settings.list({
    *     // Unused. The size of the page to be returned.
    *     pageSize: 'placeholder-value',
    *     // Unused. A page token used to retrieve the next page.
    *     pageToken: 'placeholder-value',
    *     // Required. The project, folder, or organization that is the parent resource for this setting. Must be in one of the following forms: * `projects/{project_number\}` * `projects/{project_id\}` * `folders/{folder_id\}` * `organizations/{organization_id\}`
    *     parent: 'organizations/my-organization',
    *     // The SettingView for this request.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "settings": []
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
  def list(params: ParamsResourceOrganizationsSettingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsSettingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudResourcesettingsV1Setting] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudResourcesettingsV1Setting]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudResourcesettingsV1Setting] = js.native
  def patch(params: ParamsResourceOrganizationsSettingsPatch): GaxiosPromise[SchemaGoogleCloudResourcesettingsV1Setting] = js.native
  def patch(
    params: ParamsResourceOrganizationsSettingsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudResourcesettingsV1Setting]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsSettingsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudResourcesettingsV1Setting],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudResourcesettingsV1Setting]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsSettingsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudResourcesettingsV1Setting] = js.native
  def patch(
    params: ParamsResourceOrganizationsSettingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudResourcesettingsV1Setting]
  ): Unit = js.native
  /**
    * Updates a specified setting. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.FAILED_PRECONDITION` if the setting is flagged as read only. Returns a `google.rpc.Status` with `google.rpc.Code.ABORTED` if the etag supplied in the request does not match the persisted etag of the setting value. On success, the response will contain only `name`, `local_value` and `etag`. The `metadata` and `effective_value` cannot be updated through this API. Note: the supplied setting will perform a full overwrite of the `local_value` field.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/resourcesettings.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const resourcesettings = google.resourcesettings('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await resourcesettings.organizations.settings.patch({
    *     // The resource name of the setting. Must be in one of the following forms: * `projects/{project_number\}/settings/{setting_name\}` * `folders/{folder_id\}/settings/{setting_name\}` * `organizations/{organization_id\}/settings/{setting_name\}` For example, "/projects/123/settings/gcp-enableMyFeature"
    *     name: 'organizations/my-organization/settings/my-setting',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "effectiveValue": {},
    *       //   "etag": "my_etag",
    *       //   "localValue": {},
    *       //   "metadata": {},
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "effectiveValue": {},
    *   //   "etag": "my_etag",
    *   //   "localValue": {},
    *   //   "metadata": {},
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourceOrganizationsSettingsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceOrganizationsSettingsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
