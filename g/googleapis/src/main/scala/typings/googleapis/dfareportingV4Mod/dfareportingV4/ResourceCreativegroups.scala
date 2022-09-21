package typings.googleapis.dfareportingV4Mod.dfareportingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Creativegroups")
@js.native
open class ResourceCreativegroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCreativeGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def get(params: ParamsResourceCreativegroupsGet): GaxiosPromise[SchemaCreativeGroup] = js.native
  def get(params: ParamsResourceCreativegroupsGet, callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def get(
    params: ParamsResourceCreativegroupsGet,
    options: BodyResponseCallback[Readable | SchemaCreativeGroup],
    callback: BodyResponseCallback[Readable | SchemaCreativeGroup]
  ): Unit = js.native
  def get(params: ParamsResourceCreativegroupsGet, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def get(
    params: ParamsResourceCreativegroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeGroup]
  ): Unit = js.native
  /**
    * Gets one creative group by ID.
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
    * const dfareporting = google.dfareporting('v4');
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
    *   const res = await dfareporting.creativeGroups.get({
    *     // Creative group ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "groupNumber": 0,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def get(params: ParamsResourceCreativegroupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCreativegroupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCreativeGroup] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def insert(params: ParamsResourceCreativegroupsInsert): GaxiosPromise[SchemaCreativeGroup] = js.native
  def insert(params: ParamsResourceCreativegroupsInsert, callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def insert(
    params: ParamsResourceCreativegroupsInsert,
    options: BodyResponseCallback[Readable | SchemaCreativeGroup],
    callback: BodyResponseCallback[Readable | SchemaCreativeGroup]
  ): Unit = js.native
  def insert(params: ParamsResourceCreativegroupsInsert, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def insert(
    params: ParamsResourceCreativegroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeGroup]
  ): Unit = js.native
  /**
    * Inserts a new creative group.
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
    * const dfareporting = google.dfareporting('v4');
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
    *   const res = await dfareporting.creativeGroups.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "groupNumber": 0,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
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
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "groupNumber": 0,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def insert(params: ParamsResourceCreativegroupsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCreativegroupsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCreativeGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCreativeGroupsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeGroupsListResponse] = js.native
  def list(params: ParamsResourceCreativegroupsList): GaxiosPromise[SchemaCreativeGroupsListResponse] = js.native
  def list(
    params: ParamsResourceCreativegroupsList,
    callback: BodyResponseCallback[SchemaCreativeGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCreativegroupsList,
    options: BodyResponseCallback[Readable | SchemaCreativeGroupsListResponse],
    callback: BodyResponseCallback[Readable | SchemaCreativeGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCreativegroupsList, options: MethodOptions): GaxiosPromise[SchemaCreativeGroupsListResponse] = js.native
  def list(
    params: ParamsResourceCreativegroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeGroupsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of creative groups, possibly filtered. This method supports paging.
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
    * const dfareporting = google.dfareporting('v4');
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
    *   const res = await dfareporting.creativeGroups.list({
    *     // Select only creative groups that belong to these advertisers.
    *     advertiserIds: 'placeholder-value',
    *     // Select only creative groups that belong to this subgroup.
    *     groupNumber: 'placeholder-value',
    *     // Select only creative groups with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for creative groups by name or ID. Wildcards (*) are allowed. For example, "creativegroup*2015" will return creative groups with names like "creativegroup June 2015", "creativegroup April 2015", or simply "creativegroup 2015". Most of the searches also add wild-cards implicitly at the start and the end of the search string. For example, a search string of "creativegroup" will match creative groups with the name "my creativegroup", "creativegroup 2015", or simply "creativegroup".
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creativeGroups": [],
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceCreativegroupsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCreativegroupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCreativeGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def patch(params: ParamsResourceCreativegroupsPatch): GaxiosPromise[SchemaCreativeGroup] = js.native
  def patch(params: ParamsResourceCreativegroupsPatch, callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def patch(
    params: ParamsResourceCreativegroupsPatch,
    options: BodyResponseCallback[Readable | SchemaCreativeGroup],
    callback: BodyResponseCallback[Readable | SchemaCreativeGroup]
  ): Unit = js.native
  def patch(params: ParamsResourceCreativegroupsPatch, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def patch(
    params: ParamsResourceCreativegroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeGroup]
  ): Unit = js.native
  /**
    * Updates an existing creative group. This method supports patch semantics.
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
    * const dfareporting = google.dfareporting('v4');
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
    *   const res = await dfareporting.creativeGroups.patch({
    *     // CreativeGroup ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "groupNumber": 0,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
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
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "groupNumber": 0,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def patch(params: ParamsResourceCreativegroupsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCreativegroupsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCreativeGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def update(params: ParamsResourceCreativegroupsUpdate): GaxiosPromise[SchemaCreativeGroup] = js.native
  def update(params: ParamsResourceCreativegroupsUpdate, callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def update(
    params: ParamsResourceCreativegroupsUpdate,
    options: BodyResponseCallback[Readable | SchemaCreativeGroup],
    callback: BodyResponseCallback[Readable | SchemaCreativeGroup]
  ): Unit = js.native
  def update(params: ParamsResourceCreativegroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def update(
    params: ParamsResourceCreativegroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeGroup]
  ): Unit = js.native
  /**
    * Updates an existing creative group.
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
    * const dfareporting = google.dfareporting('v4');
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
    *   const res = await dfareporting.creativeGroups.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "groupNumber": 0,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
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
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "groupNumber": 0,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def update(params: ParamsResourceCreativegroupsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceCreativegroupsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
