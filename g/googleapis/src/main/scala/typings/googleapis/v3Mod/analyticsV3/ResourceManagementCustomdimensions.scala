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

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Customdimensions")
@js.native
open class ResourceManagementCustomdimensions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCustomDimension] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomDimension]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomDimension] = js.native
  def get(params: ParamsResourceManagementCustomdimensionsGet): GaxiosPromise[SchemaCustomDimension] = js.native
  def get(
    params: ParamsResourceManagementCustomdimensionsGet,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementCustomdimensionsGet,
    options: BodyResponseCallback[Readable | SchemaCustomDimension],
    callback: BodyResponseCallback[Readable | SchemaCustomDimension]
  ): Unit = js.native
  def get(params: ParamsResourceManagementCustomdimensionsGet, options: MethodOptions): GaxiosPromise[SchemaCustomDimension] = js.native
  def get(
    params: ParamsResourceManagementCustomdimensionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  /**
    * Get a custom dimension to which the user has access.
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
    *   const res = await analytics.management.customDimensions.get({
    *     // Account ID for the custom dimension to retrieve.
    *     accountId: 'placeholder-value',
    *     // The ID of the custom dimension to retrieve.
    *     customDimensionId: 'placeholder-value',
    *     // Web property ID for the custom dimension to retrieve.
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
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "scope": "my_scope",
    *   //   "selfLink": "my_selfLink",
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
  def get(params: ParamsResourceManagementCustomdimensionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagementCustomdimensionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCustomDimension] = js.native
  def insert(callback: BodyResponseCallback[SchemaCustomDimension]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomDimension] = js.native
  def insert(params: ParamsResourceManagementCustomdimensionsInsert): GaxiosPromise[SchemaCustomDimension] = js.native
  def insert(
    params: ParamsResourceManagementCustomdimensionsInsert,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementCustomdimensionsInsert,
    options: BodyResponseCallback[Readable | SchemaCustomDimension],
    callback: BodyResponseCallback[Readable | SchemaCustomDimension]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementCustomdimensionsInsert, options: MethodOptions): GaxiosPromise[SchemaCustomDimension] = js.native
  def insert(
    params: ParamsResourceManagementCustomdimensionsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  /**
    * Create a new custom dimension.
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
    *   const res = await analytics.management.customDimensions.insert({
    *     // Account ID for the custom dimension to create.
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
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "scope": "my_scope",
    *       //   "selfLink": "my_selfLink",
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
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "scope": "my_scope",
    *   //   "selfLink": "my_selfLink",
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
  def insert(params: ParamsResourceManagementCustomdimensionsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementCustomdimensionsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCustomDimensions] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomDimensions]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomDimensions] = js.native
  def list(params: ParamsResourceManagementCustomdimensionsList): GaxiosPromise[SchemaCustomDimensions] = js.native
  def list(
    params: ParamsResourceManagementCustomdimensionsList,
    callback: BodyResponseCallback[SchemaCustomDimensions]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementCustomdimensionsList,
    options: BodyResponseCallback[Readable | SchemaCustomDimensions],
    callback: BodyResponseCallback[Readable | SchemaCustomDimensions]
  ): Unit = js.native
  def list(params: ParamsResourceManagementCustomdimensionsList, options: MethodOptions): GaxiosPromise[SchemaCustomDimensions] = js.native
  def list(
    params: ParamsResourceManagementCustomdimensionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomDimensions]
  ): Unit = js.native
  /**
    * Lists custom dimensions to which the user has access.
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
    *   const res = await analytics.management.customDimensions.list({
    *     // Account ID for the custom dimensions to retrieve.
    *     accountId: 'placeholder-value',
    *     // The maximum number of custom dimensions to include in this response.
    *     'max-results': 'placeholder-value',
    *     // An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *     // Web property ID for the custom dimensions to retrieve.
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
  def list(params: ParamsResourceManagementCustomdimensionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementCustomdimensionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCustomDimension] = js.native
  def patch(callback: BodyResponseCallback[SchemaCustomDimension]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomDimension] = js.native
  def patch(params: ParamsResourceManagementCustomdimensionsPatch): GaxiosPromise[SchemaCustomDimension] = js.native
  def patch(
    params: ParamsResourceManagementCustomdimensionsPatch,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagementCustomdimensionsPatch,
    options: BodyResponseCallback[Readable | SchemaCustomDimension],
    callback: BodyResponseCallback[Readable | SchemaCustomDimension]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementCustomdimensionsPatch, options: MethodOptions): GaxiosPromise[SchemaCustomDimension] = js.native
  def patch(
    params: ParamsResourceManagementCustomdimensionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  /**
    * Updates an existing custom dimension. This method supports patch semantics.
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
    *   const res = await analytics.management.customDimensions.patch({
    *     // Account ID for the custom dimension to update.
    *     accountId: 'placeholder-value',
    *     // Custom dimension ID for the custom dimension to update.
    *     customDimensionId: 'placeholder-value',
    *     // Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set.
    *     ignoreCustomDataSourceLinks: 'placeholder-value',
    *     // Web property ID for the custom dimension to update.
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
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "scope": "my_scope",
    *       //   "selfLink": "my_selfLink",
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
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "scope": "my_scope",
    *   //   "selfLink": "my_selfLink",
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
  def patch(params: ParamsResourceManagementCustomdimensionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceManagementCustomdimensionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCustomDimension] = js.native
  def update(callback: BodyResponseCallback[SchemaCustomDimension]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomDimension] = js.native
  def update(params: ParamsResourceManagementCustomdimensionsUpdate): GaxiosPromise[SchemaCustomDimension] = js.native
  def update(
    params: ParamsResourceManagementCustomdimensionsUpdate,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementCustomdimensionsUpdate,
    options: BodyResponseCallback[Readable | SchemaCustomDimension],
    callback: BodyResponseCallback[Readable | SchemaCustomDimension]
  ): Unit = js.native
  def update(params: ParamsResourceManagementCustomdimensionsUpdate, options: MethodOptions): GaxiosPromise[SchemaCustomDimension] = js.native
  def update(
    params: ParamsResourceManagementCustomdimensionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  /**
    * Updates an existing custom dimension.
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
    *   const res = await analytics.management.customDimensions.update({
    *     // Account ID for the custom dimension to update.
    *     accountId: 'placeholder-value',
    *     // Custom dimension ID for the custom dimension to update.
    *     customDimensionId: 'placeholder-value',
    *     // Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set.
    *     ignoreCustomDataSourceLinks: 'placeholder-value',
    *     // Web property ID for the custom dimension to update.
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
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "scope": "my_scope",
    *       //   "selfLink": "my_selfLink",
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
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "scope": "my_scope",
    *   //   "selfLink": "my_selfLink",
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
  def update(params: ParamsResourceManagementCustomdimensionsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagementCustomdimensionsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
