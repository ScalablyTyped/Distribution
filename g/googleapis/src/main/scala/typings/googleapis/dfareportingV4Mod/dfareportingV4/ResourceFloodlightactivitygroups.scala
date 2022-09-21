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

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Floodlightactivitygroups")
@js.native
open class ResourceFloodlightactivitygroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaFloodlightActivityGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def get(params: ParamsResourceFloodlightactivitygroupsGet): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def get(
    params: ParamsResourceFloodlightactivitygroupsGet,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def get(
    params: ParamsResourceFloodlightactivitygroupsGet,
    options: BodyResponseCallback[Readable | SchemaFloodlightActivityGroup],
    callback: BodyResponseCallback[Readable | SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def get(params: ParamsResourceFloodlightactivitygroupsGet, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def get(
    params: ParamsResourceFloodlightactivitygroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  /**
    * Gets one floodlight activity group by ID.
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
    *   const res = await dfareporting.floodlightActivityGroups.get({
    *     // Floodlight activity Group ID.
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
    *   //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *   //   "floodlightConfigurationIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagString": "my_tagString",
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceFloodlightactivitygroupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFloodlightactivitygroupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def insert(callback: BodyResponseCallback[SchemaFloodlightActivityGroup]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def insert(params: ParamsResourceFloodlightactivitygroupsInsert): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def insert(
    params: ParamsResourceFloodlightactivitygroupsInsert,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def insert(
    params: ParamsResourceFloodlightactivitygroupsInsert,
    options: BodyResponseCallback[Readable | SchemaFloodlightActivityGroup],
    callback: BodyResponseCallback[Readable | SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def insert(params: ParamsResourceFloodlightactivitygroupsInsert, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def insert(
    params: ParamsResourceFloodlightactivitygroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  /**
    * Inserts a new floodlight activity group.
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
    *   const res = await dfareporting.floodlightActivityGroups.insert({
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
    *       //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *       //   "floodlightConfigurationIdDimensionValue": {},
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "tagString": "my_tagString",
    *       //   "type": "my_type"
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
    *   //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *   //   "floodlightConfigurationIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagString": "my_tagString",
    *   //   "type": "my_type"
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
  def insert(params: ParamsResourceFloodlightactivitygroupsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceFloodlightactivitygroupsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaFloodlightActivityGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaFloodlightActivityGroupsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroupsListResponse] = js.native
  def list(params: ParamsResourceFloodlightactivitygroupsList): GaxiosPromise[SchemaFloodlightActivityGroupsListResponse] = js.native
  def list(
    params: ParamsResourceFloodlightactivitygroupsList,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFloodlightactivitygroupsList,
    options: BodyResponseCallback[Readable | SchemaFloodlightActivityGroupsListResponse],
    callback: BodyResponseCallback[Readable | SchemaFloodlightActivityGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFloodlightactivitygroupsList, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroupsListResponse] = js.native
  def list(
    params: ParamsResourceFloodlightactivitygroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroupsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging.
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
    *   const res = await dfareporting.floodlightActivityGroups.list({
    *     // Select only floodlight activity groups with the specified advertiser ID. Must specify either advertiserId or floodlightConfigurationId for a non-empty result.
    *     advertiserId: 'placeholder-value',
    *     // Select only floodlight activity groups with the specified floodlight configuration ID. Must specify either advertiserId, or floodlightConfigurationId for a non-empty result.
    *     floodlightConfigurationId: 'placeholder-value',
    *     // Select only floodlight activity groups with the specified IDs. Must specify either advertiserId or floodlightConfigurationId for a non-empty result.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "floodlightactivitygroup*2015" will return objects with names like "floodlightactivitygroup June 2015", "floodlightactivitygroup April 2015", or simply "floodlightactivitygroup 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "floodlightactivitygroup" will match objects with name "my floodlightactivitygroup activity", "floodlightactivitygroup 2015", or simply "floodlightactivitygroup".
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *     // Select only floodlight activity groups with the specified floodlight activity group type.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "floodlightActivityGroups": [],
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
  def list(params: ParamsResourceFloodlightactivitygroupsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFloodlightactivitygroupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaFloodlightActivityGroup]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def patch(params: ParamsResourceFloodlightactivitygroupsPatch): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def patch(
    params: ParamsResourceFloodlightactivitygroupsPatch,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def patch(
    params: ParamsResourceFloodlightactivitygroupsPatch,
    options: BodyResponseCallback[Readable | SchemaFloodlightActivityGroup],
    callback: BodyResponseCallback[Readable | SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def patch(params: ParamsResourceFloodlightactivitygroupsPatch, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def patch(
    params: ParamsResourceFloodlightactivitygroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  /**
    * Updates an existing floodlight activity group. This method supports patch semantics.
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
    *   const res = await dfareporting.floodlightActivityGroups.patch({
    *     // FloodlightActivityGroup ID.
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
    *       //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *       //   "floodlightConfigurationIdDimensionValue": {},
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "tagString": "my_tagString",
    *       //   "type": "my_type"
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
    *   //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *   //   "floodlightConfigurationIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagString": "my_tagString",
    *   //   "type": "my_type"
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
  def patch(params: ParamsResourceFloodlightactivitygroupsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceFloodlightactivitygroupsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaFloodlightActivityGroup]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def update(params: ParamsResourceFloodlightactivitygroupsUpdate): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def update(
    params: ParamsResourceFloodlightactivitygroupsUpdate,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def update(
    params: ParamsResourceFloodlightactivitygroupsUpdate,
    options: BodyResponseCallback[Readable | SchemaFloodlightActivityGroup],
    callback: BodyResponseCallback[Readable | SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def update(params: ParamsResourceFloodlightactivitygroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def update(
    params: ParamsResourceFloodlightactivitygroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  /**
    * Updates an existing floodlight activity group.
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
    *   const res = await dfareporting.floodlightActivityGroups.update({
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
    *       //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *       //   "floodlightConfigurationIdDimensionValue": {},
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "tagString": "my_tagString",
    *       //   "type": "my_type"
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
    *   //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *   //   "floodlightConfigurationIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagString": "my_tagString",
    *   //   "type": "my_type"
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
  def update(params: ParamsResourceFloodlightactivitygroupsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceFloodlightactivitygroupsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
