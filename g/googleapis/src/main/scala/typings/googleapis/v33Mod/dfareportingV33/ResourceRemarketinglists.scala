package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Remarketinglists")
@js.native
open class ResourceRemarketinglists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaRemarketingList] = js.native
  def get(callback: BodyResponseCallback[SchemaRemarketingList]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def get(params: ParamsResourceRemarketinglistsGet): GaxiosPromise[SchemaRemarketingList] = js.native
  def get(params: ParamsResourceRemarketinglistsGet, callback: BodyResponseCallback[SchemaRemarketingList]): Unit = js.native
  def get(
    params: ParamsResourceRemarketinglistsGet,
    options: BodyResponseCallback[Readable | SchemaRemarketingList],
    callback: BodyResponseCallback[Readable | SchemaRemarketingList]
  ): Unit = js.native
  def get(params: ParamsResourceRemarketinglistsGet, options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def get(
    params: ParamsResourceRemarketinglistsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  /**
    * Gets one remarketing list by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.remarketingLists.get({
    *     // Remarketing list ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lifeSpan": "my_lifeSpan",
    *   //   "listPopulationRule": {},
    *   //   "listSize": "my_listSize",
    *   //   "listSource": "my_listSource",
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId"
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
  def get(params: ParamsResourceRemarketinglistsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceRemarketinglistsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaRemarketingList] = js.native
  def insert(callback: BodyResponseCallback[SchemaRemarketingList]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def insert(params: ParamsResourceRemarketinglistsInsert): GaxiosPromise[SchemaRemarketingList] = js.native
  def insert(
    params: ParamsResourceRemarketinglistsInsert,
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  def insert(
    params: ParamsResourceRemarketinglistsInsert,
    options: BodyResponseCallback[Readable | SchemaRemarketingList],
    callback: BodyResponseCallback[Readable | SchemaRemarketingList]
  ): Unit = js.native
  def insert(params: ParamsResourceRemarketinglistsInsert, options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def insert(
    params: ParamsResourceRemarketinglistsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  /**
    * Inserts a new remarketing list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.remarketingLists.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "description": "my_description",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "lifeSpan": "my_lifeSpan",
    *       //   "listPopulationRule": {},
    *       //   "listSize": "my_listSize",
    *       //   "listSource": "my_listSource",
    *       //   "name": "my_name",
    *       //   "subaccountId": "my_subaccountId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lifeSpan": "my_lifeSpan",
    *   //   "listPopulationRule": {},
    *   //   "listSize": "my_listSize",
    *   //   "listSource": "my_listSource",
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId"
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
  def insert(params: ParamsResourceRemarketinglistsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceRemarketinglistsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaRemarketingListsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaRemarketingListsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingListsListResponse] = js.native
  def list(params: ParamsResourceRemarketinglistsList): GaxiosPromise[SchemaRemarketingListsListResponse] = js.native
  def list(
    params: ParamsResourceRemarketinglistsList,
    callback: BodyResponseCallback[SchemaRemarketingListsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceRemarketinglistsList,
    options: BodyResponseCallback[Readable | SchemaRemarketingListsListResponse],
    callback: BodyResponseCallback[Readable | SchemaRemarketingListsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceRemarketinglistsList, options: MethodOptions): GaxiosPromise[SchemaRemarketingListsListResponse] = js.native
  def list(
    params: ParamsResourceRemarketinglistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingListsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of remarketing lists, possibly filtered. This method supports paging.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.remarketingLists.list({
    *     // Select only active or only inactive remarketing lists.
    *     active: 'placeholder-value',
    *     // Select only remarketing lists owned by this advertiser.
    *     advertiserId: 'placeholder-value',
    *     // Select only remarketing lists that have this floodlight activity ID.
    *     floodlightActivityId: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "remarketing list*2015" will return objects with names like "remarketing list June 2015", "remarketing list April 2015", or simply "remarketing list 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "remarketing list" will match objects with name "my remarketing list", "remarketing list 2015", or simply "remarketing list".
    *     name: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "remarketingLists": []
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
  def list(params: ParamsResourceRemarketinglistsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceRemarketinglistsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaRemarketingList] = js.native
  def patch(callback: BodyResponseCallback[SchemaRemarketingList]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def patch(params: ParamsResourceRemarketinglistsPatch): GaxiosPromise[SchemaRemarketingList] = js.native
  def patch(params: ParamsResourceRemarketinglistsPatch, callback: BodyResponseCallback[SchemaRemarketingList]): Unit = js.native
  def patch(
    params: ParamsResourceRemarketinglistsPatch,
    options: BodyResponseCallback[Readable | SchemaRemarketingList],
    callback: BodyResponseCallback[Readable | SchemaRemarketingList]
  ): Unit = js.native
  def patch(params: ParamsResourceRemarketinglistsPatch, options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def patch(
    params: ParamsResourceRemarketinglistsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  /**
    * Updates an existing remarketing list. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.remarketingLists.patch({
    *     // RemarketingList ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "description": "my_description",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "lifeSpan": "my_lifeSpan",
    *       //   "listPopulationRule": {},
    *       //   "listSize": "my_listSize",
    *       //   "listSource": "my_listSource",
    *       //   "name": "my_name",
    *       //   "subaccountId": "my_subaccountId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lifeSpan": "my_lifeSpan",
    *   //   "listPopulationRule": {},
    *   //   "listSize": "my_listSize",
    *   //   "listSource": "my_listSource",
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId"
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
  def patch(params: ParamsResourceRemarketinglistsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceRemarketinglistsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaRemarketingList] = js.native
  def update(callback: BodyResponseCallback[SchemaRemarketingList]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def update(params: ParamsResourceRemarketinglistsUpdate): GaxiosPromise[SchemaRemarketingList] = js.native
  def update(
    params: ParamsResourceRemarketinglistsUpdate,
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  def update(
    params: ParamsResourceRemarketinglistsUpdate,
    options: BodyResponseCallback[Readable | SchemaRemarketingList],
    callback: BodyResponseCallback[Readable | SchemaRemarketingList]
  ): Unit = js.native
  def update(params: ParamsResourceRemarketinglistsUpdate, options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def update(
    params: ParamsResourceRemarketinglistsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  /**
    * Updates an existing remarketing list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.remarketingLists.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "description": "my_description",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "lifeSpan": "my_lifeSpan",
    *       //   "listPopulationRule": {},
    *       //   "listSize": "my_listSize",
    *       //   "listSource": "my_listSource",
    *       //   "name": "my_name",
    *       //   "subaccountId": "my_subaccountId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lifeSpan": "my_lifeSpan",
    *   //   "listPopulationRule": {},
    *   //   "listSize": "my_listSize",
    *   //   "listSource": "my_listSource",
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId"
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
  def update(params: ParamsResourceRemarketinglistsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceRemarketinglistsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
