package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebaseappcheck/v1beta", "firebaseappcheck_v1beta.Resource$Projects$Apps$Debugtokens")
@js.native
open class ResourceProjectsAppsDebugtokens protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaDebugToken]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.native
  def create(params: ParamsResourceProjectsAppsDebugtokensCreate): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.native
  def create(
    params: ParamsResourceProjectsAppsDebugtokensCreate,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaDebugToken]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAppsDebugtokensCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaDebugToken],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaDebugToken]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAppsDebugtokensCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.native
  def create(
    params: ParamsResourceProjectsAppsDebugtokensCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaDebugToken]
  ): Unit = js.native
  /**
    * Creates a new DebugToken for the specified app. For security reasons, after the creation operation completes, the `token` field cannot be updated or retrieved, but you can revoke the debug token using DeleteDebugToken. Each app can have a maximum of 20 debug tokens.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1beta');
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
    *   const res = await firebaseappcheck.projects.apps.debugTokens.create({
    *     // Required. The relative resource name of the parent app in which the specified DebugToken will be created, in the format: ``` projects/{project_number\}/apps/{app_id\} ```
    *     parent: 'projects/my-project/apps/my-app',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "token": "my_token"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "token": "my_token"
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
  def create(params: ParamsResourceProjectsAppsDebugtokensCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsAppsDebugtokensCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsAppsDebugtokensDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAppsDebugtokensDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAppsDebugtokensDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAppsDebugtokensDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAppsDebugtokensDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified DebugToken. A deleted debug token cannot be used to exchange for an App Check token. Use this method when you suspect the secret `token` has been compromised or when you no longer need the debug token.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1beta');
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
    *   const res = await firebaseappcheck.projects.apps.debugTokens.delete({
    *     // Required. The relative resource name of the DebugToken to delete, in the format: ``` projects/{project_number\}/apps/{app_id\}/debugTokens/{debug_token_id\} ```
    *     name: 'projects/my-project/apps/my-app/debugTokens/my-debugToken',
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
  def delete(params: ParamsResourceProjectsAppsDebugtokensDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsAppsDebugtokensDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaDebugToken]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.native
  def get(params: ParamsResourceProjectsAppsDebugtokensGet): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.native
  def get(
    params: ParamsResourceProjectsAppsDebugtokensGet,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaDebugToken]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAppsDebugtokensGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaDebugToken],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaDebugToken]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAppsDebugtokensGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.native
  def get(
    params: ParamsResourceProjectsAppsDebugtokensGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaDebugToken]
  ): Unit = js.native
  /**
    * Gets the specified DebugToken. For security reasons, the `token` field is never populated in the response.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1beta');
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
    *   const res = await firebaseappcheck.projects.apps.debugTokens.get({
    *     // Required. The relative resource name of the debug token, in the format: ``` projects/{project_number\}/apps/{app_id\}/debugTokens/{debug_token_id\} ```
    *     name: 'projects/my-project/apps/my-app/debugTokens/my-debugToken',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "token": "my_token"
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
  def get(params: ParamsResourceProjectsAppsDebugtokensGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAppsDebugtokensGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse] = js.native
  def list(params: ParamsResourceProjectsAppsDebugtokensList): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse] = js.native
  def list(
    params: ParamsResourceProjectsAppsDebugtokensList,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAppsDebugtokensList,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAppsDebugtokensList, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse] = js.native
  def list(
    params: ParamsResourceProjectsAppsDebugtokensList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse]
  ): Unit = js.native
  /**
    * Lists all DebugTokens for the specified app. For security reasons, the `token` field is never populated in the response.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1beta');
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
    *   const res = await firebaseappcheck.projects.apps.debugTokens.list({
    *     // The maximum number of DebugTokens to return in the response. Note that an app can have at most 20 debug tokens. The server may return fewer than this at its own discretion. If no value is specified (or too large a value is specified), the server will impose its own limit.
    *     pageSize: 'placeholder-value',
    *     // Token returned from a previous call to ListDebugTokens indicating where in the set of DebugTokens to resume listing. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to ListDebugTokens must match the call that provided the page token; if they do not match, the result is undefined.
    *     pageToken: 'placeholder-value',
    *     // Required. The relative resource name of the parent app for which to list each associated DebugToken, in the format: ``` projects/{project_number\}/apps/{app_id\} ```
    *     parent: 'projects/my-project/apps/my-app',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "debugTokens": [],
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
  def list(params: ParamsResourceProjectsAppsDebugtokensList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAppsDebugtokensList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaDebugToken]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.native
  def patch(params: ParamsResourceProjectsAppsDebugtokensPatch): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.native
  def patch(
    params: ParamsResourceProjectsAppsDebugtokensPatch,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaDebugToken]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAppsDebugtokensPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaDebugToken],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaDebugToken]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAppsDebugtokensPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.native
  def patch(
    params: ParamsResourceProjectsAppsDebugtokensPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaDebugToken]
  ): Unit = js.native
  /**
    * Updates the specified DebugToken. For security reasons, the `token` field cannot be updated, nor will it be populated in the response, but you can revoke the debug token using DeleteDebugToken.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1beta');
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
    *   const res = await firebaseappcheck.projects.apps.debugTokens.patch({
    *     // Required. The relative resource name of the debug token, in the format: ``` projects/{project_number\}/apps/{app_id\}/debugTokens/{debug_token_id\} ```
    *     name: 'projects/my-project/apps/my-app/debugTokens/my-debugToken',
    *     // Required. A comma-separated list of names of fields in the DebugToken to update. Example: `display_name`.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "token": "my_token"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "token": "my_token"
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
  def patch(params: ParamsResourceProjectsAppsDebugtokensPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAppsDebugtokensPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
