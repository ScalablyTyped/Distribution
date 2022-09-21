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

@JSImport("googleapis/build/src/apis/firebaseappcheck/v1beta", "firebaseappcheck_v1beta.Resource$Projects$Apps$Recaptchaconfig")
@js.native
open class ResourceProjectsAppsRecaptchaconfig protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchGet(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaConfigsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaConfigsResponse]): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaConfigsResponse] = js.native
  def batchGet(params: ParamsResourceProjectsAppsRecaptchaconfigBatchget): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaConfigsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsRecaptchaconfigBatchget,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaConfigsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsRecaptchaconfigBatchget,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaConfigsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceProjectsAppsRecaptchaconfigBatchget, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaConfigsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsRecaptchaconfigBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaConfigsResponse]
  ): Unit = js.native
  /**
    * Atomically gets the RecaptchaConfigs for the specified list of apps. For security reasons, the `site_secret` field is never populated in the response.
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
    *   const res = await firebaseappcheck.projects.apps.recaptchaConfig.batchGet({
    *     // Required. The relative resource names of the RecaptchaConfigs to retrieve, in the format: ``` projects/{project_number\}/apps/{app_id\}/recaptchaConfig ``` A maximum of 100 objects can be retrieved in a batch.
    *     names: 'placeholder-value',
    *     // Required. The parent project name shared by all RecaptchaConfigs being retrieved, in the format ``` projects/{project_number\} ``` The parent collection in the `name` field of any resource being retrieved must match this field, or the entire batch fails.
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
  def batchGet(params: ParamsResourceProjectsAppsRecaptchaconfigBatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsRecaptchaconfigBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig] = js.native
  def get(params: ParamsResourceProjectsAppsRecaptchaconfigGet): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig] = js.native
  def get(
    params: ParamsResourceProjectsAppsRecaptchaconfigGet,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAppsRecaptchaconfigGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAppsRecaptchaconfigGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig] = js.native
  def get(
    params: ParamsResourceProjectsAppsRecaptchaconfigGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig]
  ): Unit = js.native
  /**
    * Gets the RecaptchaConfig for the specified app. For security reasons, the `site_secret` field is never populated in the response.
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
    *   const res = await firebaseappcheck.projects.apps.recaptchaConfig.get({
    *     // Required. The relative resource name of the RecaptchaConfig, in the format: ``` projects/{project_number\}/apps/{app_id\}/recaptchaConfig ```
    *     name: 'projects/my-project/apps/my-app/recaptchaConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "siteSecret": "my_siteSecret",
    *   //   "siteSecretSet": false,
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
  def get(params: ParamsResourceProjectsAppsRecaptchaconfigGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAppsRecaptchaconfigGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig] = js.native
  def patch(params: ParamsResourceProjectsAppsRecaptchaconfigPatch): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig] = js.native
  def patch(
    params: ParamsResourceProjectsAppsRecaptchaconfigPatch,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAppsRecaptchaconfigPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAppsRecaptchaconfigPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig] = js.native
  def patch(
    params: ParamsResourceProjectsAppsRecaptchaconfigPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig]
  ): Unit = js.native
  /**
    * Updates the RecaptchaConfig for the specified app. While this configuration is incomplete or invalid, the app will be unable to exchange reCAPTCHA tokens for App Check tokens. For security reasons, the `site_secret` field is never populated in the response.
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
    *   const res = await firebaseappcheck.projects.apps.recaptchaConfig.patch({
    *     // Required. The relative resource name of the reCAPTCHA v3 configuration object, in the format: ``` projects/{project_number\}/apps/{app_id\}/recaptchaConfig ```
    *     name: 'projects/my-project/apps/my-app/recaptchaConfig',
    *     // Required. A comma-separated list of names of fields in the RecaptchaConfig to update. Example: `site_secret`.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name",
    *       //   "siteSecret": "my_siteSecret",
    *       //   "siteSecretSet": false,
    *       //   "tokenTtl": "my_tokenTtl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "siteSecret": "my_siteSecret",
    *   //   "siteSecretSet": false,
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
  def patch(params: ParamsResourceProjectsAppsRecaptchaconfigPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAppsRecaptchaconfigPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
