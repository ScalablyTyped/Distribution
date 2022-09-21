package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebase/v1beta1", "firebase_v1beta1.Resource$Projects$Iosapps")
@js.native
open class ResourceProjectsIosapps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsIosappsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsIosappsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceProjectsIosappsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsIosappsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsIosappsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Requests the creation of a new IosApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.iosApps.create({
    *     // The resource name of the parent FirebaseProject in which to create an IosApp, in the format: projects/PROJECT_IDENTIFIER/iosApps Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiKeyId": "my_apiKeyId",
    *       //   "appId": "my_appId",
    *       //   "appStoreId": "my_appStoreId",
    *       //   "bundleId": "my_bundleId",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "projectId": "my_projectId",
    *       //   "state": "my_state",
    *       //   "teamId": "my_teamId"
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
  def create(params: ParamsResourceProjectsIosappsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsIosappsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaIosApp] = js.native
  def get(callback: BodyResponseCallback[SchemaIosApp]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIosApp] = js.native
  def get(params: ParamsResourceProjectsIosappsGet): GaxiosPromise[SchemaIosApp] = js.native
  def get(params: ParamsResourceProjectsIosappsGet, callback: BodyResponseCallback[SchemaIosApp]): Unit = js.native
  def get(
    params: ParamsResourceProjectsIosappsGet,
    options: BodyResponseCallback[Readable | SchemaIosApp],
    callback: BodyResponseCallback[Readable | SchemaIosApp]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsIosappsGet, options: MethodOptions): GaxiosPromise[SchemaIosApp] = js.native
  def get(
    params: ParamsResourceProjectsIosappsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIosApp]
  ): Unit = js.native
  /**
    * Gets the specified IosApp.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.iosApps.get({
    *     // The resource name of the IosApp, in the format: projects/PROJECT_IDENTIFIER /iosApps/APP_ID Since an APP_ID is a unique identifier, the Unique Resource from Sub-Collection access pattern may be used here, in the format: projects/-/iosApps/APP_ID Refer to the `IosApp` [`name`](../projects.iosApps#IosApp.FIELDS.name) field for details about PROJECT_IDENTIFIER and APP_ID values.
    *     name: 'projects/my-project/iosApps/my-iosApp',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiKeyId": "my_apiKeyId",
    *   //   "appId": "my_appId",
    *   //   "appStoreId": "my_appStoreId",
    *   //   "bundleId": "my_bundleId",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "projectId": "my_projectId",
    *   //   "state": "my_state",
    *   //   "teamId": "my_teamId"
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
  def get(params: ParamsResourceProjectsIosappsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsIosappsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getConfig(): GaxiosPromise[SchemaIosAppConfig] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaIosAppConfig]): Unit = js.native
  def getConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIosAppConfig] = js.native
  def getConfig(params: ParamsResourceProjectsIosappsGetconfig): GaxiosPromise[SchemaIosAppConfig] = js.native
  def getConfig(params: ParamsResourceProjectsIosappsGetconfig, callback: BodyResponseCallback[SchemaIosAppConfig]): Unit = js.native
  def getConfig(
    params: ParamsResourceProjectsIosappsGetconfig,
    options: BodyResponseCallback[Readable | SchemaIosAppConfig],
    callback: BodyResponseCallback[Readable | SchemaIosAppConfig]
  ): Unit = js.native
  def getConfig(params: ParamsResourceProjectsIosappsGetconfig, options: MethodOptions): GaxiosPromise[SchemaIosAppConfig] = js.native
  def getConfig(
    params: ParamsResourceProjectsIosappsGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIosAppConfig]
  ): Unit = js.native
  /**
    * Gets the configuration artifact associated with the specified IosApp.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.iosApps.getConfig({
    *     // The resource name of the App configuration to download, in the format: projects/PROJECT_IDENTIFIER/iosApps/APP_ID/config Since an APP_ID is a unique identifier, the Unique Resource from Sub-Collection access pattern may be used here, in the format: projects/-/iosApps/APP_ID Refer to the `IosApp` [`name`](../projects.iosApps#IosApp.FIELDS.name) field for details about PROJECT_IDENTIFIER and APP_ID values.
    *     name: 'projects/my-project/iosApps/my-iosApp/config',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "configFileContents": "my_configFileContents",
    *   //   "configFilename": "my_configFilename"
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
  def getConfig(params: ParamsResourceProjectsIosappsGetconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getConfig(
    params: ParamsResourceProjectsIosappsGetconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListIosAppsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListIosAppsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListIosAppsResponse] = js.native
  def list(params: ParamsResourceProjectsIosappsList): GaxiosPromise[SchemaListIosAppsResponse] = js.native
  def list(
    params: ParamsResourceProjectsIosappsList,
    callback: BodyResponseCallback[SchemaListIosAppsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsIosappsList,
    options: BodyResponseCallback[Readable | SchemaListIosAppsResponse],
    callback: BodyResponseCallback[Readable | SchemaListIosAppsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsIosappsList, options: MethodOptions): GaxiosPromise[SchemaListIosAppsResponse] = js.native
  def list(
    params: ParamsResourceProjectsIosappsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListIosAppsResponse]
  ): Unit = js.native
  /**
    * Lists each IosApp associated with the specified FirebaseProject. The elements are returned in no particular order, but will be a consistent view of the Apps when additional requests are made with a `pageToken`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.iosApps.list({
    *     // The maximum number of Apps to return in the response. The server may return fewer than this at its discretion. If no value is specified (or too large a value is specified), the server will impose its own limit.
    *     pageSize: 'placeholder-value',
    *     // Token returned from a previous call to `ListIosApps` indicating where in the set of Apps to resume listing.
    *     pageToken: 'placeholder-value',
    *     // The resource name of the parent FirebaseProject for which to list each associated IosApp, in the format: projects/PROJECT_IDENTIFIER/iosApps Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     parent: 'projects/my-project',
    *     // Controls whether Apps in the DELETED state should be returned. Defaults to false.
    *     showDeleted: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apps": [],
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
  def list(params: ParamsResourceProjectsIosappsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsIosappsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaIosApp] = js.native
  def patch(callback: BodyResponseCallback[SchemaIosApp]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIosApp] = js.native
  def patch(params: ParamsResourceProjectsIosappsPatch): GaxiosPromise[SchemaIosApp] = js.native
  def patch(params: ParamsResourceProjectsIosappsPatch, callback: BodyResponseCallback[SchemaIosApp]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsIosappsPatch,
    options: BodyResponseCallback[Readable | SchemaIosApp],
    callback: BodyResponseCallback[Readable | SchemaIosApp]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsIosappsPatch, options: MethodOptions): GaxiosPromise[SchemaIosApp] = js.native
  def patch(
    params: ParamsResourceProjectsIosappsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIosApp]
  ): Unit = js.native
  /**
    * Updates the attributes of the specified IosApp.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.iosApps.patch({
    *     // The resource name of the IosApp, in the format: projects/PROJECT_IDENTIFIER /iosApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.iosApps#IosApp.FIELDS.app_id)).
    *     name: 'projects/my-project/iosApps/my-iosApp',
    *     // Specifies which fields to update. Note that the fields `name`, `appId`, `projectId`, `bundleId`, and `state` are all immutable
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiKeyId": "my_apiKeyId",
    *       //   "appId": "my_appId",
    *       //   "appStoreId": "my_appStoreId",
    *       //   "bundleId": "my_bundleId",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "projectId": "my_projectId",
    *       //   "state": "my_state",
    *       //   "teamId": "my_teamId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiKeyId": "my_apiKeyId",
    *   //   "appId": "my_appId",
    *   //   "appStoreId": "my_appStoreId",
    *   //   "bundleId": "my_bundleId",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "projectId": "my_projectId",
    *   //   "state": "my_state",
    *   //   "teamId": "my_teamId"
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
  def patch(params: ParamsResourceProjectsIosappsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsIosappsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def remove(): GaxiosPromise[SchemaOperation] = js.native
  def remove(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def remove(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def remove(params: ParamsResourceProjectsIosappsRemove): GaxiosPromise[SchemaOperation] = js.native
  def remove(params: ParamsResourceProjectsIosappsRemove, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def remove(
    params: ParamsResourceProjectsIosappsRemove,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def remove(params: ParamsResourceProjectsIosappsRemove, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def remove(
    params: ParamsResourceProjectsIosappsRemove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Removes the specified IosApp from the project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
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
    *   const res = await firebase.projects.iosApps.remove({
    *     // Required. The resource name of the IosApp, in the format: projects/ PROJECT_IDENTIFIER/iosApps/APP_ID Since an APP_ID is a unique identifier, the Unique Resource from Sub-Collection access pattern may be used here, in the format: projects/-/iosApps/APP_ID Refer to the IosApp [name](../projects.iosApps#IosApp.FIELDS.name) field for details about PROJECT_IDENTIFIER and APP_ID values.
    *     name: 'projects/my-project/iosApps/my-iosApp',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "allowMissing": false,
    *       //   "etag": "my_etag",
    *       //   "validateOnly": false
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
  def remove(params: ParamsResourceProjectsIosappsRemove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def remove(
    params: ParamsResourceProjectsIosappsRemove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
