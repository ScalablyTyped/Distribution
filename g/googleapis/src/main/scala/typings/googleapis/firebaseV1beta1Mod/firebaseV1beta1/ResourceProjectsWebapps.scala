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

@JSImport("googleapis/build/src/apis/firebase/v1beta1", "firebase_v1beta1.Resource$Projects$Webapps")
@js.native
open class ResourceProjectsWebapps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsWebappsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsWebappsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceProjectsWebappsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsWebappsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsWebappsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Requests the creation of a new WebApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
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
    *   const res = await firebase.projects.webApps.create({
    *     // The resource name of the parent FirebaseProject in which to create a WebApp, in the format: projects/PROJECT_IDENTIFIER/webApps Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiKeyId": "my_apiKeyId",
    *       //   "appId": "my_appId",
    *       //   "appUrls": [],
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "projectId": "my_projectId",
    *       //   "state": "my_state",
    *       //   "webId": "my_webId"
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
  def create(params: ParamsResourceProjectsWebappsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsWebappsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaWebApp] = js.native
  def get(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def get(params: ParamsResourceProjectsWebappsGet): GaxiosPromise[SchemaWebApp] = js.native
  def get(params: ParamsResourceProjectsWebappsGet, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def get(
    params: ParamsResourceProjectsWebappsGet,
    options: BodyResponseCallback[Readable | SchemaWebApp],
    callback: BodyResponseCallback[Readable | SchemaWebApp]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsWebappsGet, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def get(
    params: ParamsResourceProjectsWebappsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  /**
    * Gets the specified WebApp.
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
    *   const res = await firebase.projects.webApps.get({
    *     // The resource name of the WebApp, in the format: projects/PROJECT_IDENTIFIER /webApps/APP_ID Since an APP_ID is a unique identifier, the Unique Resource from Sub-Collection access pattern may be used here, in the format: projects/-/webApps/APP_ID Refer to the `WebApp` [`name`](../projects.webApps#WebApp.FIELDS.name) field for details about PROJECT_IDENTIFIER and APP_ID values.
    *     name: 'projects/my-project/webApps/my-webApp',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiKeyId": "my_apiKeyId",
    *   //   "appId": "my_appId",
    *   //   "appUrls": [],
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "projectId": "my_projectId",
    *   //   "state": "my_state",
    *   //   "webId": "my_webId"
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
  def get(params: ParamsResourceProjectsWebappsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsWebappsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getConfig(): GaxiosPromise[SchemaWebAppConfig] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaWebAppConfig]): Unit = js.native
  def getConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebAppConfig] = js.native
  def getConfig(params: ParamsResourceProjectsWebappsGetconfig): GaxiosPromise[SchemaWebAppConfig] = js.native
  def getConfig(params: ParamsResourceProjectsWebappsGetconfig, callback: BodyResponseCallback[SchemaWebAppConfig]): Unit = js.native
  def getConfig(
    params: ParamsResourceProjectsWebappsGetconfig,
    options: BodyResponseCallback[Readable | SchemaWebAppConfig],
    callback: BodyResponseCallback[Readable | SchemaWebAppConfig]
  ): Unit = js.native
  def getConfig(params: ParamsResourceProjectsWebappsGetconfig, options: MethodOptions): GaxiosPromise[SchemaWebAppConfig] = js.native
  def getConfig(
    params: ParamsResourceProjectsWebappsGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebAppConfig]
  ): Unit = js.native
  /**
    * Gets the configuration artifact associated with the specified WebApp.
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
    *   const res = await firebase.projects.webApps.getConfig({
    *     // The resource name of the WebApp configuration to download, in the format: projects/PROJECT_IDENTIFIER/webApps/APP_ID/config Since an APP_ID is a unique identifier, the Unique Resource from Sub-Collection access pattern may be used here, in the format: projects/-/webApps/APP_ID Refer to the `WebApp` [`name`](../projects.webApps#WebApp.FIELDS.name) field for details about PROJECT_IDENTIFIER and APP_ID values.
    *     name: 'projects/my-project/webApps/my-webApp/config',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiKey": "my_apiKey",
    *   //   "appId": "my_appId",
    *   //   "authDomain": "my_authDomain",
    *   //   "databaseURL": "my_databaseURL",
    *   //   "locationId": "my_locationId",
    *   //   "measurementId": "my_measurementId",
    *   //   "messagingSenderId": "my_messagingSenderId",
    *   //   "projectId": "my_projectId",
    *   //   "storageBucket": "my_storageBucket"
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
  def getConfig(params: ParamsResourceProjectsWebappsGetconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getConfig(
    params: ParamsResourceProjectsWebappsGetconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListWebAppsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWebAppsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListWebAppsResponse] = js.native
  def list(params: ParamsResourceProjectsWebappsList): GaxiosPromise[SchemaListWebAppsResponse] = js.native
  def list(
    params: ParamsResourceProjectsWebappsList,
    callback: BodyResponseCallback[SchemaListWebAppsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsWebappsList,
    options: BodyResponseCallback[Readable | SchemaListWebAppsResponse],
    callback: BodyResponseCallback[Readable | SchemaListWebAppsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsWebappsList, options: MethodOptions): GaxiosPromise[SchemaListWebAppsResponse] = js.native
  def list(
    params: ParamsResourceProjectsWebappsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWebAppsResponse]
  ): Unit = js.native
  /**
    * Lists each WebApp associated with the specified FirebaseProject. The elements are returned in no particular order, but will be a consistent view of the Apps when additional requests are made with a `pageToken`.
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
    *   const res = await firebase.projects.webApps.list({
    *     // The maximum number of Apps to return in the response. The server may return fewer than this value at its discretion. If no value is specified (or too large a value is specified), then the server will impose its own limit.
    *     pageSize: 'placeholder-value',
    *     // Token returned from a previous call to `ListWebApps` indicating where in the set of Apps to resume listing.
    *     pageToken: 'placeholder-value',
    *     // The resource name of the parent FirebaseProject for which to list each associated WebApp, in the format: projects/PROJECT_IDENTIFIER/webApps Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
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
  def list(params: ParamsResourceProjectsWebappsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsWebappsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaWebApp] = js.native
  def patch(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def patch(params: ParamsResourceProjectsWebappsPatch): GaxiosPromise[SchemaWebApp] = js.native
  def patch(params: ParamsResourceProjectsWebappsPatch, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsWebappsPatch,
    options: BodyResponseCallback[Readable | SchemaWebApp],
    callback: BodyResponseCallback[Readable | SchemaWebApp]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsWebappsPatch, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def patch(
    params: ParamsResourceProjectsWebappsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  /**
    * Updates the attributes of the specified WebApp.
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
    *   const res = await firebase.projects.webApps.patch({
    *     // The resource name of the WebApp, in the format: projects/PROJECT_IDENTIFIER /webApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.webApps#WebApp.FIELDS.app_id)).
    *     name: 'projects/my-project/webApps/my-webApp',
    *     // Specifies which fields to update. Note that the fields `name`, `appId`, `projectId` and `state` are all immutable
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiKeyId": "my_apiKeyId",
    *       //   "appId": "my_appId",
    *       //   "appUrls": [],
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "projectId": "my_projectId",
    *       //   "state": "my_state",
    *       //   "webId": "my_webId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiKeyId": "my_apiKeyId",
    *   //   "appId": "my_appId",
    *   //   "appUrls": [],
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "projectId": "my_projectId",
    *   //   "state": "my_state",
    *   //   "webId": "my_webId"
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
  def patch(params: ParamsResourceProjectsWebappsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsWebappsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def remove(): GaxiosPromise[SchemaOperation] = js.native
  def remove(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def remove(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def remove(params: ParamsResourceProjectsWebappsRemove): GaxiosPromise[SchemaOperation] = js.native
  def remove(params: ParamsResourceProjectsWebappsRemove, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def remove(
    params: ParamsResourceProjectsWebappsRemove,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def remove(params: ParamsResourceProjectsWebappsRemove, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def remove(
    params: ParamsResourceProjectsWebappsRemove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Removes the specified WebApp from the project.
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
    *   const res = await firebase.projects.webApps.remove({
    *     // Required. The resource name of the WebApp, in the format: projects/ PROJECT_IDENTIFIER/webApps/APP_ID Since an APP_ID is a unique identifier, the Unique Resource from Sub-Collection access pattern may be used here, in the format: projects/-/webApps/APP_ID Refer to the WebApp [name](../projects.webApps#WebApp.FIELDS.name) field for details about PROJECT_IDENTIFIER and APP_ID values.
    *     name: 'projects/my-project/webApps/my-webApp',
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
  def remove(params: ParamsResourceProjectsWebappsRemove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def remove(
    params: ParamsResourceProjectsWebappsRemove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
