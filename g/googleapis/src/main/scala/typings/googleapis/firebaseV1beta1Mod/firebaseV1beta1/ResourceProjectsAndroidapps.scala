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

@JSImport("googleapis/build/src/apis/firebase/v1beta1", "firebase_v1beta1.Resource$Projects$Androidapps")
@js.native
open class ResourceProjectsAndroidapps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsAndroidappsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsAndroidappsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceProjectsAndroidappsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAndroidappsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsAndroidappsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Requests the creation of a new AndroidApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
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
    *   const res = await firebase.projects.androidApps.create({
    *     // The resource name of the parent FirebaseProject in which to create an AndroidApp, in the format: projects/PROJECT_IDENTIFIER/androidApps Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiKeyId": "my_apiKeyId",
    *       //   "appId": "my_appId",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "packageName": "my_packageName",
    *       //   "projectId": "my_projectId",
    *       //   "state": "my_state"
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
  def create(params: ParamsResourceProjectsAndroidappsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsAndroidappsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAndroidApp] = js.native
  def get(callback: BodyResponseCallback[SchemaAndroidApp]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAndroidApp] = js.native
  def get(params: ParamsResourceProjectsAndroidappsGet): GaxiosPromise[SchemaAndroidApp] = js.native
  def get(params: ParamsResourceProjectsAndroidappsGet, callback: BodyResponseCallback[SchemaAndroidApp]): Unit = js.native
  def get(
    params: ParamsResourceProjectsAndroidappsGet,
    options: BodyResponseCallback[Readable | SchemaAndroidApp],
    callback: BodyResponseCallback[Readable | SchemaAndroidApp]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAndroidappsGet, options: MethodOptions): GaxiosPromise[SchemaAndroidApp] = js.native
  def get(
    params: ParamsResourceProjectsAndroidappsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAndroidApp]
  ): Unit = js.native
  /**
    * Gets the specified AndroidApp.
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
    *   const res = await firebase.projects.androidApps.get({
    *     // The resource name of the AndroidApp, in the format: projects/ PROJECT_IDENTIFIER/androidApps/APP_ID Since an APP_ID is a unique identifier, the Unique Resource from Sub-Collection access pattern may be used here, in the format: projects/-/androidApps/APP_ID Refer to the `AndroidApp` [`name`](../projects.androidApps#AndroidApp.FIELDS.name) field for details about PROJECT_IDENTIFIER and APP_ID values.
    *     name: 'projects/my-project/androidApps/my-androidApp',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiKeyId": "my_apiKeyId",
    *   //   "appId": "my_appId",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "packageName": "my_packageName",
    *   //   "projectId": "my_projectId",
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceProjectsAndroidappsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAndroidappsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getConfig(): GaxiosPromise[SchemaAndroidAppConfig] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaAndroidAppConfig]): Unit = js.native
  def getConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAndroidAppConfig] = js.native
  def getConfig(params: ParamsResourceProjectsAndroidappsGetconfig): GaxiosPromise[SchemaAndroidAppConfig] = js.native
  def getConfig(
    params: ParamsResourceProjectsAndroidappsGetconfig,
    callback: BodyResponseCallback[SchemaAndroidAppConfig]
  ): Unit = js.native
  def getConfig(
    params: ParamsResourceProjectsAndroidappsGetconfig,
    options: BodyResponseCallback[Readable | SchemaAndroidAppConfig],
    callback: BodyResponseCallback[Readable | SchemaAndroidAppConfig]
  ): Unit = js.native
  def getConfig(params: ParamsResourceProjectsAndroidappsGetconfig, options: MethodOptions): GaxiosPromise[SchemaAndroidAppConfig] = js.native
  def getConfig(
    params: ParamsResourceProjectsAndroidappsGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAndroidAppConfig]
  ): Unit = js.native
  /**
    * Gets the configuration artifact associated with the specified AndroidApp.
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
    *   const res = await firebase.projects.androidApps.getConfig({
    *     // The resource name of the AndroidApp configuration to download, in the format: projects/PROJECT_IDENTIFIER/androidApps/APP_ID/config Since an APP_ID is a unique identifier, the Unique Resource from Sub-Collection access pattern may be used here, in the format: projects/-/androidApps/APP_ID Refer to the `AndroidApp` [`name`](../projects.androidApps#AndroidApp.FIELDS.name) field for details about PROJECT_IDENTIFIER and APP_ID values.
    *     name: 'projects/my-project/androidApps/my-androidApp/config',
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
  def getConfig(params: ParamsResourceProjectsAndroidappsGetconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getConfig(
    params: ParamsResourceProjectsAndroidappsGetconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAndroidAppsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAndroidAppsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAndroidAppsResponse] = js.native
  def list(params: ParamsResourceProjectsAndroidappsList): GaxiosPromise[SchemaListAndroidAppsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAndroidappsList,
    callback: BodyResponseCallback[SchemaListAndroidAppsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAndroidappsList,
    options: BodyResponseCallback[Readable | SchemaListAndroidAppsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAndroidAppsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAndroidappsList, options: MethodOptions): GaxiosPromise[SchemaListAndroidAppsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAndroidappsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAndroidAppsResponse]
  ): Unit = js.native
  /**
    * Lists each AndroidApp associated with the specified FirebaseProject. The elements are returned in no particular order, but will be a consistent view of the Apps when additional requests are made with a `pageToken`.
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
    *   const res = await firebase.projects.androidApps.list({
    *     // The maximum number of Apps to return in the response. The server may return fewer than this at its discretion. If no value is specified (or too large a value is specified), then the server will impose its own limit.
    *     pageSize: 'placeholder-value',
    *     // Token returned from a previous call to `ListAndroidApps` indicating where in the set of Apps to resume listing.
    *     pageToken: 'placeholder-value',
    *     // The resource name of the parent FirebaseProject for which to list each associated AndroidApp, in the format: projects/PROJECT_IDENTIFIER /androidApps Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
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
  def list(params: ParamsResourceProjectsAndroidappsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAndroidappsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAndroidApp] = js.native
  def patch(callback: BodyResponseCallback[SchemaAndroidApp]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAndroidApp] = js.native
  def patch(params: ParamsResourceProjectsAndroidappsPatch): GaxiosPromise[SchemaAndroidApp] = js.native
  def patch(params: ParamsResourceProjectsAndroidappsPatch, callback: BodyResponseCallback[SchemaAndroidApp]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAndroidappsPatch,
    options: BodyResponseCallback[Readable | SchemaAndroidApp],
    callback: BodyResponseCallback[Readable | SchemaAndroidApp]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAndroidappsPatch, options: MethodOptions): GaxiosPromise[SchemaAndroidApp] = js.native
  def patch(
    params: ParamsResourceProjectsAndroidappsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAndroidApp]
  ): Unit = js.native
  /**
    * Updates the attributes of the specified AndroidApp.
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
    *   const res = await firebase.projects.androidApps.patch({
    *     // The resource name of the AndroidApp, in the format: projects/ PROJECT_IDENTIFIER/androidApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)).
    *     name: 'projects/my-project/androidApps/my-androidApp',
    *     // Specifies which fields to update. Note that the fields `name`, `app_id`, `project_id`, `package_name`, and `state` are all immutable.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiKeyId": "my_apiKeyId",
    *       //   "appId": "my_appId",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "packageName": "my_packageName",
    *       //   "projectId": "my_projectId",
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiKeyId": "my_apiKeyId",
    *   //   "appId": "my_appId",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "packageName": "my_packageName",
    *   //   "projectId": "my_projectId",
    *   //   "state": "my_state"
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
  def patch(params: ParamsResourceProjectsAndroidappsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAndroidappsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def remove(): GaxiosPromise[SchemaOperation] = js.native
  def remove(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def remove(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def remove(params: ParamsResourceProjectsAndroidappsRemove): GaxiosPromise[SchemaOperation] = js.native
  def remove(params: ParamsResourceProjectsAndroidappsRemove, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def remove(
    params: ParamsResourceProjectsAndroidappsRemove,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def remove(params: ParamsResourceProjectsAndroidappsRemove, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def remove(
    params: ParamsResourceProjectsAndroidappsRemove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Removes the specified AndroidApp from the project.
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
    *   const res = await firebase.projects.androidApps.remove({
    *     // Required. The resource name of the AndroidApp, in the format: projects/ PROJECT_IDENTIFIER/androidApps/APP_ID Since an APP_ID is a unique identifier, the Unique Resource from Sub-Collection access pattern may be used here, in the format: projects/-/androidApps/APP_ID Refer to the AndroidApp [name](../projects.androidApps#AndroidApp.FIELDS.name) field for details about PROJECT_IDENTIFIER and APP_ID values.
    *     name: 'projects/my-project/androidApps/my-androidApp',
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
  def remove(params: ParamsResourceProjectsAndroidappsRemove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def remove(
    params: ParamsResourceProjectsAndroidappsRemove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var sha: ResourceProjectsAndroidappsSha = js.native
}
