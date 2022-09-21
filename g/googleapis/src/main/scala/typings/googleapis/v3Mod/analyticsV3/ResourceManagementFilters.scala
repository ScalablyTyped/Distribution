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

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Filters")
@js.native
open class ResourceManagementFilters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaFilter] = js.native
  def delete(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def delete(params: ParamsResourceManagementFiltersDelete): GaxiosPromise[SchemaFilter] = js.native
  def delete(params: ParamsResourceManagementFiltersDelete, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def delete(
    params: ParamsResourceManagementFiltersDelete,
    options: BodyResponseCallback[Readable | SchemaFilter],
    callback: BodyResponseCallback[Readable | SchemaFilter]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementFiltersDelete, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def delete(
    params: ParamsResourceManagementFiltersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  /**
    * Delete a filter.
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
    *   const res = await analytics.management.filters.delete({
    *     // Account ID to delete the filter for.
    *     accountId: 'placeholder-value',
    *     // ID of the filter to be deleted.
    *     filterId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advancedDetails": {},
    *   //   "created": "my_created",
    *   //   "excludeDetails": {},
    *   //   "id": "my_id",
    *   //   "includeDetails": {},
    *   //   "kind": "my_kind",
    *   //   "lowercaseDetails": {},
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "searchAndReplaceDetails": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "uppercaseDetails": {}
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
  def delete(params: ParamsResourceManagementFiltersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceManagementFiltersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaFilter] = js.native
  def get(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def get(params: ParamsResourceManagementFiltersGet): GaxiosPromise[SchemaFilter] = js.native
  def get(params: ParamsResourceManagementFiltersGet, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def get(
    params: ParamsResourceManagementFiltersGet,
    options: BodyResponseCallback[Readable | SchemaFilter],
    callback: BodyResponseCallback[Readable | SchemaFilter]
  ): Unit = js.native
  def get(params: ParamsResourceManagementFiltersGet, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def get(
    params: ParamsResourceManagementFiltersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  /**
    * Returns filters to which the user has access.
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
    *   const res = await analytics.management.filters.get({
    *     // Account ID to retrieve filters for.
    *     accountId: 'placeholder-value',
    *     // Filter ID to retrieve filters for.
    *     filterId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advancedDetails": {},
    *   //   "created": "my_created",
    *   //   "excludeDetails": {},
    *   //   "id": "my_id",
    *   //   "includeDetails": {},
    *   //   "kind": "my_kind",
    *   //   "lowercaseDetails": {},
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "searchAndReplaceDetails": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "uppercaseDetails": {}
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
  def get(params: ParamsResourceManagementFiltersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagementFiltersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaFilter] = js.native
  def insert(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def insert(params: ParamsResourceManagementFiltersInsert): GaxiosPromise[SchemaFilter] = js.native
  def insert(params: ParamsResourceManagementFiltersInsert, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def insert(
    params: ParamsResourceManagementFiltersInsert,
    options: BodyResponseCallback[Readable | SchemaFilter],
    callback: BodyResponseCallback[Readable | SchemaFilter]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementFiltersInsert, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def insert(
    params: ParamsResourceManagementFiltersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  /**
    * Create a new filter.
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
    *   const res = await analytics.management.filters.insert({
    *     // Account ID to create filter for.
    *     accountId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advancedDetails": {},
    *       //   "created": "my_created",
    *       //   "excludeDetails": {},
    *       //   "id": "my_id",
    *       //   "includeDetails": {},
    *       //   "kind": "my_kind",
    *       //   "lowercaseDetails": {},
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "searchAndReplaceDetails": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "type": "my_type",
    *       //   "updated": "my_updated",
    *       //   "uppercaseDetails": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advancedDetails": {},
    *   //   "created": "my_created",
    *   //   "excludeDetails": {},
    *   //   "id": "my_id",
    *   //   "includeDetails": {},
    *   //   "kind": "my_kind",
    *   //   "lowercaseDetails": {},
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "searchAndReplaceDetails": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "uppercaseDetails": {}
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
  def insert(params: ParamsResourceManagementFiltersInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementFiltersInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaFilters] = js.native
  def list(callback: BodyResponseCallback[SchemaFilters]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFilters] = js.native
  def list(params: ParamsResourceManagementFiltersList): GaxiosPromise[SchemaFilters] = js.native
  def list(params: ParamsResourceManagementFiltersList, callback: BodyResponseCallback[SchemaFilters]): Unit = js.native
  def list(
    params: ParamsResourceManagementFiltersList,
    options: BodyResponseCallback[Readable | SchemaFilters],
    callback: BodyResponseCallback[Readable | SchemaFilters]
  ): Unit = js.native
  def list(params: ParamsResourceManagementFiltersList, options: MethodOptions): GaxiosPromise[SchemaFilters] = js.native
  def list(
    params: ParamsResourceManagementFiltersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilters]
  ): Unit = js.native
  /**
    * Lists all filters for an account
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
    *   const res = await analytics.management.filters.list({
    *     // Account ID to retrieve filters for.
    *     accountId: 'd+',
    *     // The maximum number of filters to include in this response.
    *     'max-results': 'placeholder-value',
    *     // An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
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
  def list(params: ParamsResourceManagementFiltersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementFiltersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaFilter] = js.native
  def patch(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def patch(params: ParamsResourceManagementFiltersPatch): GaxiosPromise[SchemaFilter] = js.native
  def patch(params: ParamsResourceManagementFiltersPatch, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def patch(
    params: ParamsResourceManagementFiltersPatch,
    options: BodyResponseCallback[Readable | SchemaFilter],
    callback: BodyResponseCallback[Readable | SchemaFilter]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementFiltersPatch, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def patch(
    params: ParamsResourceManagementFiltersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  /**
    * Updates an existing filter. This method supports patch semantics.
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
    *   const res = await analytics.management.filters.patch({
    *     // Account ID to which the filter belongs.
    *     accountId: 'placeholder-value',
    *     // ID of the filter to be updated.
    *     filterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advancedDetails": {},
    *       //   "created": "my_created",
    *       //   "excludeDetails": {},
    *       //   "id": "my_id",
    *       //   "includeDetails": {},
    *       //   "kind": "my_kind",
    *       //   "lowercaseDetails": {},
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "searchAndReplaceDetails": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "type": "my_type",
    *       //   "updated": "my_updated",
    *       //   "uppercaseDetails": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advancedDetails": {},
    *   //   "created": "my_created",
    *   //   "excludeDetails": {},
    *   //   "id": "my_id",
    *   //   "includeDetails": {},
    *   //   "kind": "my_kind",
    *   //   "lowercaseDetails": {},
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "searchAndReplaceDetails": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "uppercaseDetails": {}
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
  def patch(params: ParamsResourceManagementFiltersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceManagementFiltersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaFilter] = js.native
  def update(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def update(params: ParamsResourceManagementFiltersUpdate): GaxiosPromise[SchemaFilter] = js.native
  def update(params: ParamsResourceManagementFiltersUpdate, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def update(
    params: ParamsResourceManagementFiltersUpdate,
    options: BodyResponseCallback[Readable | SchemaFilter],
    callback: BodyResponseCallback[Readable | SchemaFilter]
  ): Unit = js.native
  def update(params: ParamsResourceManagementFiltersUpdate, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def update(
    params: ParamsResourceManagementFiltersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  /**
    * Updates an existing filter.
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
    *   const res = await analytics.management.filters.update({
    *     // Account ID to which the filter belongs.
    *     accountId: 'placeholder-value',
    *     // ID of the filter to be updated.
    *     filterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advancedDetails": {},
    *       //   "created": "my_created",
    *       //   "excludeDetails": {},
    *       //   "id": "my_id",
    *       //   "includeDetails": {},
    *       //   "kind": "my_kind",
    *       //   "lowercaseDetails": {},
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "searchAndReplaceDetails": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "type": "my_type",
    *       //   "updated": "my_updated",
    *       //   "uppercaseDetails": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advancedDetails": {},
    *   //   "created": "my_created",
    *   //   "excludeDetails": {},
    *   //   "id": "my_id",
    *   //   "includeDetails": {},
    *   //   "kind": "my_kind",
    *   //   "lowercaseDetails": {},
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "searchAndReplaceDetails": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "uppercaseDetails": {}
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
  def update(params: ParamsResourceManagementFiltersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagementFiltersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
