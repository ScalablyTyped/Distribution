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

@JSImport("googleapis/build/src/apis/firebaseappcheck/v1", "firebaseappcheck_v1.Resource$Projects$Apps$Appattestconfig")
@js.native
open class ResourceProjectsAppsAppattestconfig protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchGet(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse]): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse] = js.native
  def batchGet(params: ParamsResourceProjectsAppsAppattestconfigBatchget): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsAppattestconfigBatchget,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsAppattestconfigBatchget,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceProjectsAppsAppattestconfigBatchget, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsAppattestconfigBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse]
  ): Unit = js.native
  /**
    * Atomically gets the AppAttestConfigs for the specified list of apps.
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
    *   const res = await firebaseappcheck.projects.apps.appAttestConfig.batchGet({
    *     // Required. The relative resource names of the AppAttestConfigs to retrieve, in the format ``` projects/{project_number\}/apps/{app_id\}/appAttestConfig ``` A maximum of 100 objects can be retrieved in a batch.
    *     names: 'placeholder-value',
    *     // Required. The parent project name shared by all AppAttestConfigs being retrieved, in the format ``` projects/{project_number\} ``` The parent collection in the `name` field of any resource being retrieved must match this field, or the entire batch fails.
    *     parent: 'projects/my-project',
    *   });
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
  def batchGet(params: ParamsResourceProjectsAppsAppattestconfigBatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsAppattestconfigBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppAttestConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppAttestConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppAttestConfig] = js.native
  def get(params: ParamsResourceProjectsAppsAppattestconfigGet): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppAttestConfig] = js.native
  def get(
    params: ParamsResourceProjectsAppsAppattestconfigGet,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppAttestConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAppsAppattestconfigGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppAttestConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppAttestConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAppsAppattestconfigGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppAttestConfig] = js.native
  def get(
    params: ParamsResourceProjectsAppsAppattestconfigGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppAttestConfig]
  ): Unit = js.native
  /**
    * Gets the AppAttestConfig for the specified app.
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
    *   const res = await firebaseappcheck.projects.apps.appAttestConfig.get({
    *     // Required. The relative resource name of the AppAttestConfig, in the format: ``` projects/{project_number\}/apps/{app_id\}/appAttestConfig ```
    *     name: 'projects/my-project/apps/my-app/appAttestConfig',
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
  def get(params: ParamsResourceProjectsAppsAppattestconfigGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAppsAppattestconfigGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppAttestConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppAttestConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppAttestConfig] = js.native
  def patch(params: ParamsResourceProjectsAppsAppattestconfigPatch): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppAttestConfig] = js.native
  def patch(
    params: ParamsResourceProjectsAppsAppattestconfigPatch,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppAttestConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAppsAppattestconfigPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppAttestConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppAttestConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAppsAppattestconfigPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppAttestConfig] = js.native
  def patch(
    params: ParamsResourceProjectsAppsAppattestconfigPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppAttestConfig]
  ): Unit = js.native
  /**
    * Updates the AppAttestConfig for the specified app. While this configuration is incomplete or invalid, the app will be unable to exchange AppAttest tokens for App Check tokens.
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
    *   const res = await firebaseappcheck.projects.apps.appAttestConfig.patch({
    *     // Required. The relative resource name of the App Attest configuration object, in the format: ``` projects/{project_number\}/apps/{app_id\}/appAttestConfig ```
    *     name: 'projects/my-project/apps/my-app/appAttestConfig',
    *     // Required. A comma-separated list of names of fields in the AppAttestConfig Gets to update. Example: `token_ttl`.
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
  def patch(params: ParamsResourceProjectsAppsAppattestconfigPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAppsAppattestconfigPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
