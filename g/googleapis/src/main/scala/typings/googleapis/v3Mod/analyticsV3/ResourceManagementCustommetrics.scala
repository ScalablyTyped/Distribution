package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Custommetrics")
@js.native
open class ResourceManagementCustommetrics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCustomMetric] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomMetric]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def get(params: ParamsResourceManagementCustommetricsGet): GaxiosPromise[SchemaCustomMetric] = js.native
  def get(
    params: ParamsResourceManagementCustommetricsGet,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementCustommetricsGet,
    options: BodyResponseCallback[Readable | SchemaCustomMetric],
    callback: BodyResponseCallback[Readable | SchemaCustomMetric]
  ): Unit = js.native
  def get(params: ParamsResourceManagementCustommetricsGet, options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def get(
    params: ParamsResourceManagementCustommetricsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  /**
    * Get a custom metric to which the user has access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.customMetrics.get({
    *     // Account ID for the custom metric to retrieve.
    *     accountId: 'placeholder-value',
    *     // The ID of the custom metric to retrieve.
    *     customMetricId: 'placeholder-value',
    *     // Web property ID for the custom metric to retrieve.
    *     webPropertyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "created": "my_created",
    *   //   "id": "my_id",
    *   //   "index": 0,
    *   //   "kind": "my_kind",
    *   //   "max_value": "my_max_value",
    *   //   "min_value": "my_min_value",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "scope": "my_scope",
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId"
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
  def get(params: ParamsResourceManagementCustommetricsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagementCustommetricsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCustomMetric] = js.native
  def insert(callback: BodyResponseCallback[SchemaCustomMetric]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def insert(params: ParamsResourceManagementCustommetricsInsert): GaxiosPromise[SchemaCustomMetric] = js.native
  def insert(
    params: ParamsResourceManagementCustommetricsInsert,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementCustommetricsInsert,
    options: BodyResponseCallback[Readable | SchemaCustomMetric],
    callback: BodyResponseCallback[Readable | SchemaCustomMetric]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementCustommetricsInsert, options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def insert(
    params: ParamsResourceManagementCustommetricsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  /**
    * Create a new custom metric.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.customMetrics.insert({
    *     // Account ID for the custom metric to create.
    *     accountId: 'placeholder-value',
    *     // Web property ID for the custom dimension to create.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "created": "my_created",
    *       //   "id": "my_id",
    *       //   "index": 0,
    *       //   "kind": "my_kind",
    *       //   "max_value": "my_max_value",
    *       //   "min_value": "my_min_value",
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "scope": "my_scope",
    *       //   "selfLink": "my_selfLink",
    *       //   "type": "my_type",
    *       //   "updated": "my_updated",
    *       //   "webPropertyId": "my_webPropertyId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "created": "my_created",
    *   //   "id": "my_id",
    *   //   "index": 0,
    *   //   "kind": "my_kind",
    *   //   "max_value": "my_max_value",
    *   //   "min_value": "my_min_value",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "scope": "my_scope",
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId"
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
  def insert(params: ParamsResourceManagementCustommetricsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementCustommetricsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCustomMetrics] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomMetrics]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomMetrics] = js.native
  def list(params: ParamsResourceManagementCustommetricsList): GaxiosPromise[SchemaCustomMetrics] = js.native
  def list(
    params: ParamsResourceManagementCustommetricsList,
    callback: BodyResponseCallback[SchemaCustomMetrics]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementCustommetricsList,
    options: BodyResponseCallback[Readable | SchemaCustomMetrics],
    callback: BodyResponseCallback[Readable | SchemaCustomMetrics]
  ): Unit = js.native
  def list(params: ParamsResourceManagementCustommetricsList, options: MethodOptions): GaxiosPromise[SchemaCustomMetrics] = js.native
  def list(
    params: ParamsResourceManagementCustommetricsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomMetrics]
  ): Unit = js.native
  /**
    * Lists custom metrics to which the user has access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.customMetrics.list({
    *     // Account ID for the custom metrics to retrieve.
    *     accountId: 'placeholder-value',
    *     // The maximum number of custom metrics to include in this response.
    *     'max-results': 'placeholder-value',
    *     // An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *     // Web property ID for the custom metrics to retrieve.
    *     webPropertyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "itemsPerPage": 0,
    *   //   "kind": "my_kind",
    *   //   "nextLink": "my_nextLink",
    *   //   "previousLink": "my_previousLink",
    *   //   "startIndex": 0,
    *   //   "totalResults": 0,
    *   //   "username": "my_username"
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
  def list(params: ParamsResourceManagementCustommetricsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementCustommetricsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCustomMetric] = js.native
  def patch(callback: BodyResponseCallback[SchemaCustomMetric]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def patch(params: ParamsResourceManagementCustommetricsPatch): GaxiosPromise[SchemaCustomMetric] = js.native
  def patch(
    params: ParamsResourceManagementCustommetricsPatch,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagementCustommetricsPatch,
    options: BodyResponseCallback[Readable | SchemaCustomMetric],
    callback: BodyResponseCallback[Readable | SchemaCustomMetric]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementCustommetricsPatch, options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def patch(
    params: ParamsResourceManagementCustommetricsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  /**
    * Updates an existing custom metric. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.customMetrics.patch({
    *     // Account ID for the custom metric to update.
    *     accountId: 'placeholder-value',
    *     // Custom metric ID for the custom metric to update.
    *     customMetricId: 'placeholder-value',
    *     // Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set.
    *     ignoreCustomDataSourceLinks: 'placeholder-value',
    *     // Web property ID for the custom metric to update.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "created": "my_created",
    *       //   "id": "my_id",
    *       //   "index": 0,
    *       //   "kind": "my_kind",
    *       //   "max_value": "my_max_value",
    *       //   "min_value": "my_min_value",
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "scope": "my_scope",
    *       //   "selfLink": "my_selfLink",
    *       //   "type": "my_type",
    *       //   "updated": "my_updated",
    *       //   "webPropertyId": "my_webPropertyId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "created": "my_created",
    *   //   "id": "my_id",
    *   //   "index": 0,
    *   //   "kind": "my_kind",
    *   //   "max_value": "my_max_value",
    *   //   "min_value": "my_min_value",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "scope": "my_scope",
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId"
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
  def patch(params: ParamsResourceManagementCustommetricsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceManagementCustommetricsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCustomMetric] = js.native
  def update(callback: BodyResponseCallback[SchemaCustomMetric]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def update(params: ParamsResourceManagementCustommetricsUpdate): GaxiosPromise[SchemaCustomMetric] = js.native
  def update(
    params: ParamsResourceManagementCustommetricsUpdate,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementCustommetricsUpdate,
    options: BodyResponseCallback[Readable | SchemaCustomMetric],
    callback: BodyResponseCallback[Readable | SchemaCustomMetric]
  ): Unit = js.native
  def update(params: ParamsResourceManagementCustommetricsUpdate, options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def update(
    params: ParamsResourceManagementCustommetricsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  /**
    * Updates an existing custom metric.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.customMetrics.update({
    *     // Account ID for the custom metric to update.
    *     accountId: 'placeholder-value',
    *     // Custom metric ID for the custom metric to update.
    *     customMetricId: 'placeholder-value',
    *     // Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set.
    *     ignoreCustomDataSourceLinks: 'placeholder-value',
    *     // Web property ID for the custom metric to update.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "created": "my_created",
    *       //   "id": "my_id",
    *       //   "index": 0,
    *       //   "kind": "my_kind",
    *       //   "max_value": "my_max_value",
    *       //   "min_value": "my_min_value",
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "scope": "my_scope",
    *       //   "selfLink": "my_selfLink",
    *       //   "type": "my_type",
    *       //   "updated": "my_updated",
    *       //   "webPropertyId": "my_webPropertyId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "created": "my_created",
    *   //   "id": "my_id",
    *   //   "index": 0,
    *   //   "kind": "my_kind",
    *   //   "max_value": "my_max_value",
    *   //   "min_value": "my_min_value",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "scope": "my_scope",
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId"
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
  def update(params: ParamsResourceManagementCustommetricsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagementCustommetricsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
