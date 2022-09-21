package typings.googleapis.v35Mod.dfareportingV35

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Placementgroups")
@js.native
open class ResourcePlacementgroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPlacementGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementGroup] = js.native
  def get(params: ParamsResourcePlacementgroupsGet): GaxiosPromise[SchemaPlacementGroup] = js.native
  def get(params: ParamsResourcePlacementgroupsGet, callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def get(
    params: ParamsResourcePlacementgroupsGet,
    options: BodyResponseCallback[Readable | SchemaPlacementGroup],
    callback: BodyResponseCallback[Readable | SchemaPlacementGroup]
  ): Unit = js.native
  def get(params: ParamsResourcePlacementgroupsGet, options: MethodOptions): GaxiosPromise[SchemaPlacementGroup] = js.native
  def get(
    params: ParamsResourcePlacementgroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementGroup]
  ): Unit = js.native
  /**
    * Gets one placement group by ID.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.placementGroups.get({
    *     // Placement group ID.
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
    *   //   "archived": false,
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "childPlacementIds": [],
    *   //   "comment": "my_comment",
    *   //   "contentCategoryId": "my_contentCategoryId",
    *   //   "createInfo": {},
    *   //   "directorySiteId": "my_directorySiteId",
    *   //   "directorySiteIdDimensionValue": {},
    *   //   "externalId": "my_externalId",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "name": "my_name",
    *   //   "placementGroupType": "my_placementGroupType",
    *   //   "placementStrategyId": "my_placementStrategyId",
    *   //   "pricingSchedule": {},
    *   //   "primaryPlacementId": "my_primaryPlacementId",
    *   //   "primaryPlacementIdDimensionValue": {},
    *   //   "siteId": "my_siteId",
    *   //   "siteIdDimensionValue": {},
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
  def get(params: ParamsResourcePlacementgroupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePlacementgroupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaPlacementGroup] = js.native
  def insert(callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementGroup] = js.native
  def insert(params: ParamsResourcePlacementgroupsInsert): GaxiosPromise[SchemaPlacementGroup] = js.native
  def insert(params: ParamsResourcePlacementgroupsInsert, callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def insert(
    params: ParamsResourcePlacementgroupsInsert,
    options: BodyResponseCallback[Readable | SchemaPlacementGroup],
    callback: BodyResponseCallback[Readable | SchemaPlacementGroup]
  ): Unit = js.native
  def insert(params: ParamsResourcePlacementgroupsInsert, options: MethodOptions): GaxiosPromise[SchemaPlacementGroup] = js.native
  def insert(
    params: ParamsResourcePlacementgroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementGroup]
  ): Unit = js.native
  /**
    * Inserts a new placement group.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.placementGroups.insert({
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
    *       //   "archived": false,
    *       //   "campaignId": "my_campaignId",
    *       //   "campaignIdDimensionValue": {},
    *       //   "childPlacementIds": [],
    *       //   "comment": "my_comment",
    *       //   "contentCategoryId": "my_contentCategoryId",
    *       //   "createInfo": {},
    *       //   "directorySiteId": "my_directorySiteId",
    *       //   "directorySiteIdDimensionValue": {},
    *       //   "externalId": "my_externalId",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "lastModifiedInfo": {},
    *       //   "name": "my_name",
    *       //   "placementGroupType": "my_placementGroupType",
    *       //   "placementStrategyId": "my_placementStrategyId",
    *       //   "pricingSchedule": {},
    *       //   "primaryPlacementId": "my_primaryPlacementId",
    *       //   "primaryPlacementIdDimensionValue": {},
    *       //   "siteId": "my_siteId",
    *       //   "siteIdDimensionValue": {},
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
    *   //   "archived": false,
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "childPlacementIds": [],
    *   //   "comment": "my_comment",
    *   //   "contentCategoryId": "my_contentCategoryId",
    *   //   "createInfo": {},
    *   //   "directorySiteId": "my_directorySiteId",
    *   //   "directorySiteIdDimensionValue": {},
    *   //   "externalId": "my_externalId",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "name": "my_name",
    *   //   "placementGroupType": "my_placementGroupType",
    *   //   "placementStrategyId": "my_placementStrategyId",
    *   //   "pricingSchedule": {},
    *   //   "primaryPlacementId": "my_primaryPlacementId",
    *   //   "primaryPlacementIdDimensionValue": {},
    *   //   "siteId": "my_siteId",
    *   //   "siteIdDimensionValue": {},
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
  def insert(params: ParamsResourcePlacementgroupsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourcePlacementgroupsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPlacementGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlacementGroupsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementGroupsListResponse] = js.native
  def list(params: ParamsResourcePlacementgroupsList): GaxiosPromise[SchemaPlacementGroupsListResponse] = js.native
  def list(
    params: ParamsResourcePlacementgroupsList,
    callback: BodyResponseCallback[SchemaPlacementGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePlacementgroupsList,
    options: BodyResponseCallback[Readable | SchemaPlacementGroupsListResponse],
    callback: BodyResponseCallback[Readable | SchemaPlacementGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlacementgroupsList, options: MethodOptions): GaxiosPromise[SchemaPlacementGroupsListResponse] = js.native
  def list(
    params: ParamsResourcePlacementgroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementGroupsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of placement groups, possibly filtered. This method supports paging.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.placementGroups.list({
    *     // Select only placement groups that belong to these advertisers.
    *     advertiserIds: 'placeholder-value',
    *     // Select only archived placements. Don't set this field to select both archived and non-archived placements.
    *     archived: 'placeholder-value',
    *     // Select only placement groups that belong to these campaigns.
    *     campaignIds: 'placeholder-value',
    *     // Select only placement groups that are associated with these content categories.
    *     contentCategoryIds: 'placeholder-value',
    *     // Select only placement groups that are associated with these directory sites.
    *     directorySiteIds: 'placeholder-value',
    *     // Select only placement groups with these IDs.
    *     ids: 'placeholder-value',
    *     // Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as "yyyy-MM-dd".
    *     maxEndDate: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as "yyyy-MM-dd".
    *     maxStartDate: 'placeholder-value',
    *     // Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as "yyyy-MM-dd".
    *     minEndDate: 'placeholder-value',
    *     // Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as "yyyy-MM-dd".
    *     minStartDate: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // Select only placement groups belonging with this group type. A package is a simple group of placements that acts as a single pricing point for a group of tags. A roadblock is a group of placements that not only acts as a single pricing point but also assumes that all the tags in it will be served at the same time. A roadblock requires one of its assigned placements to be marked as primary for reporting.
    *     placementGroupType: 'placeholder-value',
    *     // Select only placement groups that are associated with these placement strategies.
    *     placementStrategyIds: 'placeholder-value',
    *     // Select only placement groups with these pricing types.
    *     pricingTypes: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for placement groups by name or ID. Wildcards (*) are allowed. For example, "placement*2015" will return placement groups with names like "placement group June 2015", "placement group May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "placementgroup" will match placement groups with name "my placementgroup", "placementgroup 2015", or simply "placementgroup".
    *     searchString: 'placeholder-value',
    *     // Select only placement groups that are associated with these sites.
    *     siteIds: 'placeholder-value',
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
    *   //   "placementGroups": []
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
  def list(params: ParamsResourcePlacementgroupsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePlacementgroupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPlacementGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementGroup] = js.native
  def patch(params: ParamsResourcePlacementgroupsPatch): GaxiosPromise[SchemaPlacementGroup] = js.native
  def patch(params: ParamsResourcePlacementgroupsPatch, callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def patch(
    params: ParamsResourcePlacementgroupsPatch,
    options: BodyResponseCallback[Readable | SchemaPlacementGroup],
    callback: BodyResponseCallback[Readable | SchemaPlacementGroup]
  ): Unit = js.native
  def patch(params: ParamsResourcePlacementgroupsPatch, options: MethodOptions): GaxiosPromise[SchemaPlacementGroup] = js.native
  def patch(
    params: ParamsResourcePlacementgroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementGroup]
  ): Unit = js.native
  /**
    * Updates an existing placement group. This method supports patch semantics.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.placementGroups.patch({
    *     // PlacementGroup ID.
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
    *       //   "archived": false,
    *       //   "campaignId": "my_campaignId",
    *       //   "campaignIdDimensionValue": {},
    *       //   "childPlacementIds": [],
    *       //   "comment": "my_comment",
    *       //   "contentCategoryId": "my_contentCategoryId",
    *       //   "createInfo": {},
    *       //   "directorySiteId": "my_directorySiteId",
    *       //   "directorySiteIdDimensionValue": {},
    *       //   "externalId": "my_externalId",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "lastModifiedInfo": {},
    *       //   "name": "my_name",
    *       //   "placementGroupType": "my_placementGroupType",
    *       //   "placementStrategyId": "my_placementStrategyId",
    *       //   "pricingSchedule": {},
    *       //   "primaryPlacementId": "my_primaryPlacementId",
    *       //   "primaryPlacementIdDimensionValue": {},
    *       //   "siteId": "my_siteId",
    *       //   "siteIdDimensionValue": {},
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
    *   //   "archived": false,
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "childPlacementIds": [],
    *   //   "comment": "my_comment",
    *   //   "contentCategoryId": "my_contentCategoryId",
    *   //   "createInfo": {},
    *   //   "directorySiteId": "my_directorySiteId",
    *   //   "directorySiteIdDimensionValue": {},
    *   //   "externalId": "my_externalId",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "name": "my_name",
    *   //   "placementGroupType": "my_placementGroupType",
    *   //   "placementStrategyId": "my_placementStrategyId",
    *   //   "pricingSchedule": {},
    *   //   "primaryPlacementId": "my_primaryPlacementId",
    *   //   "primaryPlacementIdDimensionValue": {},
    *   //   "siteId": "my_siteId",
    *   //   "siteIdDimensionValue": {},
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
  def patch(params: ParamsResourcePlacementgroupsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePlacementgroupsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaPlacementGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementGroup] = js.native
  def update(params: ParamsResourcePlacementgroupsUpdate): GaxiosPromise[SchemaPlacementGroup] = js.native
  def update(params: ParamsResourcePlacementgroupsUpdate, callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def update(
    params: ParamsResourcePlacementgroupsUpdate,
    options: BodyResponseCallback[Readable | SchemaPlacementGroup],
    callback: BodyResponseCallback[Readable | SchemaPlacementGroup]
  ): Unit = js.native
  def update(params: ParamsResourcePlacementgroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaPlacementGroup] = js.native
  def update(
    params: ParamsResourcePlacementgroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementGroup]
  ): Unit = js.native
  /**
    * Updates an existing placement group.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.placementGroups.update({
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
    *       //   "archived": false,
    *       //   "campaignId": "my_campaignId",
    *       //   "campaignIdDimensionValue": {},
    *       //   "childPlacementIds": [],
    *       //   "comment": "my_comment",
    *       //   "contentCategoryId": "my_contentCategoryId",
    *       //   "createInfo": {},
    *       //   "directorySiteId": "my_directorySiteId",
    *       //   "directorySiteIdDimensionValue": {},
    *       //   "externalId": "my_externalId",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "lastModifiedInfo": {},
    *       //   "name": "my_name",
    *       //   "placementGroupType": "my_placementGroupType",
    *       //   "placementStrategyId": "my_placementStrategyId",
    *       //   "pricingSchedule": {},
    *       //   "primaryPlacementId": "my_primaryPlacementId",
    *       //   "primaryPlacementIdDimensionValue": {},
    *       //   "siteId": "my_siteId",
    *       //   "siteIdDimensionValue": {},
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
    *   //   "archived": false,
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "childPlacementIds": [],
    *   //   "comment": "my_comment",
    *   //   "contentCategoryId": "my_contentCategoryId",
    *   //   "createInfo": {},
    *   //   "directorySiteId": "my_directorySiteId",
    *   //   "directorySiteIdDimensionValue": {},
    *   //   "externalId": "my_externalId",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "name": "my_name",
    *   //   "placementGroupType": "my_placementGroupType",
    *   //   "placementStrategyId": "my_placementStrategyId",
    *   //   "pricingSchedule": {},
    *   //   "primaryPlacementId": "my_primaryPlacementId",
    *   //   "primaryPlacementIdDimensionValue": {},
    *   //   "siteId": "my_siteId",
    *   //   "siteIdDimensionValue": {},
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
  def update(params: ParamsResourcePlacementgroupsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePlacementgroupsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
