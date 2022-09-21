package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/recaptchaenterprise/v1", "recaptchaenterprise_v1.Resource$Projects$Keys")
@js.native
open class ResourceProjectsKeys protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Key]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def create(params: ParamsResourceProjectsKeysCreate): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def create(
    params: ParamsResourceProjectsKeysCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Key]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsKeysCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1Key],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1Key]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsKeysCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def create(
    params: ParamsResourceProjectsKeysCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Key]
  ): Unit = js.native
  /**
    * Creates a new reCAPTCHA Enterprise key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recaptchaenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recaptchaenterprise = google.recaptchaenterprise('v1');
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
    *   const res = await recaptchaenterprise.projects.keys.create({
    *     // Required. The name of the project in which the key will be created, in the format "projects/{project\}".
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "androidSettings": {},
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "iosSettings": {},
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "testingOptions": {},
    *       //   "wafSettings": {},
    *       //   "webSettings": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "androidSettings": {},
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "iosSettings": {},
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "testingOptions": {},
    *   //   "wafSettings": {},
    *   //   "webSettings": {}
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
  def create(params: ParamsResourceProjectsKeysCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsKeysCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsKeysDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsKeysDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsKeysDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsKeysDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsKeysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recaptchaenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recaptchaenterprise = google.recaptchaenterprise('v1');
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
    *   const res = await recaptchaenterprise.projects.keys.delete({
    *     // Required. The name of the key to be deleted, in the format "projects/{project\}/keys/{key\}".
    *     name: 'projects/my-project/keys/my-key',
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
  def delete(params: ParamsResourceProjectsKeysDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsKeysDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Key]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def get(params: ParamsResourceProjectsKeysGet): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def get(
    params: ParamsResourceProjectsKeysGet,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Key]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsKeysGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1Key],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1Key]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsKeysGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def get(
    params: ParamsResourceProjectsKeysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Key]
  ): Unit = js.native
  /**
    * Returns the specified key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recaptchaenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recaptchaenterprise = google.recaptchaenterprise('v1');
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
    *   const res = await recaptchaenterprise.projects.keys.get({
    *     // Required. The name of the requested key, in the format "projects/{project\}/keys/{key\}".
    *     name: 'projects/my-project/keys/my-key',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "androidSettings": {},
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "iosSettings": {},
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "testingOptions": {},
    *   //   "wafSettings": {},
    *   //   "webSettings": {}
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
  def get(params: ParamsResourceProjectsKeysGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsKeysGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getMetrics(): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Metrics] = js.native
  def getMetrics(callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Metrics]): Unit = js.native
  def getMetrics(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Metrics] = js.native
  def getMetrics(params: ParamsResourceProjectsKeysGetmetrics): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Metrics] = js.native
  def getMetrics(
    params: ParamsResourceProjectsKeysGetmetrics,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Metrics]
  ): Unit = js.native
  def getMetrics(
    params: ParamsResourceProjectsKeysGetmetrics,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1Metrics],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1Metrics]
  ): Unit = js.native
  def getMetrics(params: ParamsResourceProjectsKeysGetmetrics, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Metrics] = js.native
  def getMetrics(
    params: ParamsResourceProjectsKeysGetmetrics,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Metrics]
  ): Unit = js.native
  /**
    * Get some aggregated metrics for a Key. This data can be used to build dashboards.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recaptchaenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recaptchaenterprise = google.recaptchaenterprise('v1');
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
    *   const res = await recaptchaenterprise.projects.keys.getMetrics({
    *     // Required. The name of the requested metrics, in the format "projects/{project\}/keys/{key\}/metrics".
    *     name: 'projects/my-project/keys/my-key/metrics',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "challengeMetrics": [],
    *   //   "name": "my_name",
    *   //   "scoreMetrics": [],
    *   //   "startTime": "my_startTime"
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
  def getMetrics(params: ParamsResourceProjectsKeysGetmetrics, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getMetrics(
    params: ParamsResourceProjectsKeysGetmetrics,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse] = js.native
  def list(params: ParamsResourceProjectsKeysList): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse] = js.native
  def list(
    params: ParamsResourceProjectsKeysList,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsKeysList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsKeysList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse] = js.native
  def list(
    params: ParamsResourceProjectsKeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse]
  ): Unit = js.native
  /**
    * Returns the list of all keys that belong to a project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recaptchaenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recaptchaenterprise = google.recaptchaenterprise('v1');
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
    *   const res = await recaptchaenterprise.projects.keys.list({
    *     // Optional. The maximum number of keys to return. Default is 10. Max limit is 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. The next_page_token value returned from a previous. ListKeysRequest, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the project that contains the keys that will be listed, in the format "projects/{project\}".
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "keys": [],
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
  def list(params: ParamsResourceProjectsKeysList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsKeysList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def migrate(): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def migrate(callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Key]): Unit = js.native
  def migrate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def migrate(params: ParamsResourceProjectsKeysMigrate): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def migrate(
    params: ParamsResourceProjectsKeysMigrate,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Key]
  ): Unit = js.native
  def migrate(
    params: ParamsResourceProjectsKeysMigrate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1Key],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1Key]
  ): Unit = js.native
  def migrate(params: ParamsResourceProjectsKeysMigrate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def migrate(
    params: ParamsResourceProjectsKeysMigrate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Key]
  ): Unit = js.native
  /**
    * Migrates an existing key from reCAPTCHA to reCAPTCHA Enterprise. Once a key is migrated, it can be used from either product. SiteVerify requests are billed as CreateAssessment calls. You must be authenticated as one of the current owners of the reCAPTCHA Site Key, and your user must have the reCAPTCHA Enterprise Admin IAM role in the destination project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recaptchaenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recaptchaenterprise = google.recaptchaenterprise('v1');
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
    *   const res = await recaptchaenterprise.projects.keys.migrate({
    *     // Required. The name of the key to be migrated, in the format "projects/{project\}/keys/{key\}".
    *     name: 'projects/my-project/keys/my-key',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "androidSettings": {},
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "iosSettings": {},
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "testingOptions": {},
    *   //   "wafSettings": {},
    *   //   "webSettings": {}
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
  def migrate(params: ParamsResourceProjectsKeysMigrate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def migrate(
    params: ParamsResourceProjectsKeysMigrate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Key]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def patch(params: ParamsResourceProjectsKeysPatch): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def patch(
    params: ParamsResourceProjectsKeysPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Key]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsKeysPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1Key],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1Key]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsKeysPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Key] = js.native
  def patch(
    params: ParamsResourceProjectsKeysPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Key]
  ): Unit = js.native
  /**
    * Updates the specified key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recaptchaenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recaptchaenterprise = google.recaptchaenterprise('v1');
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
    *   const res = await recaptchaenterprise.projects.keys.patch({
    *     // The resource name for the Key in the format "projects/{project\}/keys/{key\}".
    *     name: 'projects/my-project/keys/my-key',
    *     // Optional. The mask to control which fields of the key get updated. If the mask is not present, all fields will be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "androidSettings": {},
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "iosSettings": {},
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "testingOptions": {},
    *       //   "wafSettings": {},
    *       //   "webSettings": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "androidSettings": {},
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "iosSettings": {},
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "testingOptions": {},
    *   //   "wafSettings": {},
    *   //   "webSettings": {}
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
  def patch(params: ParamsResourceProjectsKeysPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsKeysPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def retrieveLegacySecretKey(): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse] = js.native
  def retrieveLegacySecretKey(
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse]
  ): Unit = js.native
  def retrieveLegacySecretKey(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse] = js.native
  def retrieveLegacySecretKey(params: ParamsResourceProjectsKeysRetrievelegacysecretkey): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse] = js.native
  def retrieveLegacySecretKey(
    params: ParamsResourceProjectsKeysRetrievelegacysecretkey,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse]
  ): Unit = js.native
  def retrieveLegacySecretKey(
    params: ParamsResourceProjectsKeysRetrievelegacysecretkey,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse]
  ): Unit = js.native
  def retrieveLegacySecretKey(params: ParamsResourceProjectsKeysRetrievelegacysecretkey, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse] = js.native
  def retrieveLegacySecretKey(
    params: ParamsResourceProjectsKeysRetrievelegacysecretkey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse]
  ): Unit = js.native
  /**
    * Returns the secret key related to the specified public key. You must use the legacy secret key only in a 3rd party integration with legacy reCAPTCHA.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recaptchaenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recaptchaenterprise = google.recaptchaenterprise('v1');
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
    *   const res = await recaptchaenterprise.projects.keys.retrieveLegacySecretKey({
    *     // Required. The public key name linked to the requested secret key in the format "projects/{project\}/keys/{key\}".
    *     key: 'projects/my-project/keys/my-key',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "legacySecretKey": "my_legacySecretKey"
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
  def retrieveLegacySecretKey(params: ParamsResourceProjectsKeysRetrievelegacysecretkey, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def retrieveLegacySecretKey(
    params: ParamsResourceProjectsKeysRetrievelegacysecretkey,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
