package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebaseappcheck/v1", "firebaseappcheck_v1.Resource$Projects$Apps$Playintegrityconfig")
@js.native
open class ResourceProjectsAppsPlayintegrityconfig protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchGet(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse]): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse] = js.native
  def batchGet(params: ParamsResourceProjectsAppsPlayintegrityconfigBatchget): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsPlayintegrityconfigBatchget,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsPlayintegrityconfigBatchget,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceProjectsAppsPlayintegrityconfigBatchget, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsPlayintegrityconfigBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse]
  ): Unit = js.native
  /**
    * Atomically gets the PlayIntegrityConfigs for the specified list of apps.
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
    * const firebaseappcheck = google.firebaseappcheck('v1');
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
    *   const res = await firebaseappcheck.projects.apps.playIntegrityConfig.batchGet(
    *     {
    *       // Required. The relative resource names of the PlayIntegrityConfigs to retrieve, in the format ``` projects/{project_number\}/apps/{app_id\}/playIntegrityConfig ``` A maximum of 100 objects can be retrieved in a batch.
    *       names: 'placeholder-value',
    *       // Required. The parent project name shared by all PlayIntegrityConfigs being retrieved, in the format ``` projects/{project_number\} ``` The parent collection in the `name` field of any resource being retrieved must match this field, or the entire batch fails.
    *       parent: 'projects/my-project',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "configs": []
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
  def batchGet(params: ParamsResourceProjectsAppsPlayintegrityconfigBatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsPlayintegrityconfigBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig] = js.native
  def get(params: ParamsResourceProjectsAppsPlayintegrityconfigGet): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig] = js.native
  def get(
    params: ParamsResourceProjectsAppsPlayintegrityconfigGet,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAppsPlayintegrityconfigGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAppsPlayintegrityconfigGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig] = js.native
  def get(
    params: ParamsResourceProjectsAppsPlayintegrityconfigGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig]
  ): Unit = js.native
  /**
    * Gets the PlayIntegrityConfig for the specified app.
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
    * const firebaseappcheck = google.firebaseappcheck('v1');
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
    *   const res = await firebaseappcheck.projects.apps.playIntegrityConfig.get({
    *     // Required. The relative resource name of the PlayIntegrityConfig, in the format: ``` projects/{project_number\}/apps/{app_id\}/playIntegrityConfig ```
    *     name: 'projects/my-project/apps/my-app/playIntegrityConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "tokenTtl": "my_tokenTtl"
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
  def get(params: ParamsResourceProjectsAppsPlayintegrityconfigGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAppsPlayintegrityconfigGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig] = js.native
  def patch(params: ParamsResourceProjectsAppsPlayintegrityconfigPatch): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig] = js.native
  def patch(
    params: ParamsResourceProjectsAppsPlayintegrityconfigPatch,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAppsPlayintegrityconfigPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAppsPlayintegrityconfigPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig] = js.native
  def patch(
    params: ParamsResourceProjectsAppsPlayintegrityconfigPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig]
  ): Unit = js.native
  /**
    * Updates the PlayIntegrityConfig for the specified app. While this configuration is incomplete or invalid, the app will be unable to exchange Play Integrity tokens for App Check tokens.
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
    * const firebaseappcheck = google.firebaseappcheck('v1');
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
    *   const res = await firebaseappcheck.projects.apps.playIntegrityConfig.patch({
    *     // Required. The relative resource name of the Play Integrity configuration object, in the format: ``` projects/{project_number\}/apps/{app_id\}/playIntegrityConfig ```
    *     name: 'projects/my-project/apps/my-app/playIntegrityConfig',
    *     // Required. A comma-separated list of names of fields in the PlayIntegrityConfig Gets to update. Example: `token_ttl`.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name",
    *       //   "tokenTtl": "my_tokenTtl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "tokenTtl": "my_tokenTtl"
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
  def patch(params: ParamsResourceProjectsAppsPlayintegrityconfigPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAppsPlayintegrityconfigPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
