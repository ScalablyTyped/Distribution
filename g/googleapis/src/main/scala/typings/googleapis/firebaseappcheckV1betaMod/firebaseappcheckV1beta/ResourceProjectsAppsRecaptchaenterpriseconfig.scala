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

@JSImport("googleapis/build/src/apis/firebaseappcheck/v1beta", "firebaseappcheck_v1beta.Resource$Projects$Apps$Recaptchaenterpriseconfig")
@js.native
open class ResourceProjectsAppsRecaptchaenterpriseconfig protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchGet(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaEnterpriseConfigsResponse] = js.native
  def batchGet(
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaEnterpriseConfigsResponse]
  ): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaEnterpriseConfigsResponse] = js.native
  def batchGet(params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigBatchget): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaEnterpriseConfigsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigBatchget,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaEnterpriseConfigsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigBatchget,
    options: BodyResponseCallback[
      Readable | SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaEnterpriseConfigsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaEnterpriseConfigsResponse
    ]
  ): Unit = js.native
  def batchGet(params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigBatchget, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaEnterpriseConfigsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaBatchGetRecaptchaEnterpriseConfigsResponse]
  ): Unit = js.native
  /**
    * Atomically gets the RecaptchaEnterpriseConfigs for the specified list of apps.
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
    *   const res =
    *     await firebaseappcheck.projects.apps.recaptchaEnterpriseConfig.batchGet({
    *       // Required. The relative resource names of the RecaptchaEnterpriseConfigs to retrieve, in the format: ``` projects/{project_number\}/apps/{app_id\}/recaptchaEnterpriseConfig ``` A maximum of 100 objects can be retrieved in a batch.
    *       names: 'placeholder-value',
    *       // Required. The parent project name shared by all RecaptchaEnterpriseConfigs being retrieved, in the format ``` projects/{project_number\} ``` The parent collection in the `name` field of any resource being retrieved must match this field, or the entire batch fails.
    *       parent: 'projects/my-project',
    *     });
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
  def batchGet(params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigBatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig] = js.native
  def get(params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigGet): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig] = js.native
  def get(
    params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigGet,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig] = js.native
  def get(
    params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig]
  ): Unit = js.native
  /**
    * Gets the RecaptchaEnterpriseConfig for the specified app.
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
    *   const res =
    *     await firebaseappcheck.projects.apps.recaptchaEnterpriseConfig.get({
    *       // Required. The relative resource name of the RecaptchaEnterpriseConfig, in the format: ``` projects/{project_number\}/apps/{app_id\}/recaptchaEnterpriseConfig ```
    *       name: 'projects/my-project/apps/my-app/recaptchaEnterpriseConfig',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "siteKey": "my_siteKey",
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
  def get(params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig] = js.native
  def patch(params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigPatch): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig] = js.native
  def patch(
    params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigPatch,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig] = js.native
  def patch(
    params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig]
  ): Unit = js.native
  /**
    * Updates the RecaptchaEnterpriseConfig for the specified app. While this configuration is incomplete or invalid, the app will be unable to exchange reCAPTCHA Enterprise tokens for App Check tokens.
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
    *   const res =
    *     await firebaseappcheck.projects.apps.recaptchaEnterpriseConfig.patch({
    *       // Required. The relative resource name of the reCAPTCHA Enterprise configuration object, in the format: ``` projects/{project_number\}/apps/{app_id\}/recaptchaEnterpriseConfig ```
    *       name: 'projects/my-project/apps/my-app/recaptchaEnterpriseConfig',
    *       // Required. A comma-separated list of names of fields in the RecaptchaEnterpriseConfig to update. Example: `site_key`.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "name": "my_name",
    *         //   "siteKey": "my_siteKey",
    *         //   "tokenTtl": "my_tokenTtl"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "siteKey": "my_siteKey",
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
  def patch(params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAppsRecaptchaenterpriseconfigPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
