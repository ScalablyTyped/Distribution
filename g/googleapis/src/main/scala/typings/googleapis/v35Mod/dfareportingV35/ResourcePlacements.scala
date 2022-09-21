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

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Placements")
@js.native
open class ResourcePlacements protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def generatetags(): GaxiosPromise[SchemaPlacementsGenerateTagsResponse] = js.native
  def generatetags(callback: BodyResponseCallback[SchemaPlacementsGenerateTagsResponse]): Unit = js.native
  def generatetags(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementsGenerateTagsResponse] = js.native
  def generatetags(params: ParamsResourcePlacementsGeneratetags): GaxiosPromise[SchemaPlacementsGenerateTagsResponse] = js.native
  def generatetags(
    params: ParamsResourcePlacementsGeneratetags,
    callback: BodyResponseCallback[SchemaPlacementsGenerateTagsResponse]
  ): Unit = js.native
  def generatetags(
    params: ParamsResourcePlacementsGeneratetags,
    options: BodyResponseCallback[Readable | SchemaPlacementsGenerateTagsResponse],
    callback: BodyResponseCallback[Readable | SchemaPlacementsGenerateTagsResponse]
  ): Unit = js.native
  def generatetags(params: ParamsResourcePlacementsGeneratetags, options: MethodOptions): GaxiosPromise[SchemaPlacementsGenerateTagsResponse] = js.native
  def generatetags(
    params: ParamsResourcePlacementsGeneratetags,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementsGenerateTagsResponse]
  ): Unit = js.native
  /**
    * Generates tags for a placement.
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
    *   const res = await dfareporting.placements.generatetags({
    *     // Generate placements belonging to this campaign. This is a required field.
    *     campaignId: 'placeholder-value',
    *     // Generate tags for these placements.
    *     placementIds: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Tag formats to generate for these placements. *Note:* PLACEMENT_TAG_STANDARD can only be generated for 1x1 placements.
    *     tagFormats: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "placementTags": []
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
  def generatetags(params: ParamsResourcePlacementsGeneratetags, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generatetags(
    params: ParamsResourcePlacementsGeneratetags,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPlacement] = js.native
  def get(callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def get(params: ParamsResourcePlacementsGet): GaxiosPromise[SchemaPlacement] = js.native
  def get(params: ParamsResourcePlacementsGet, callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def get(
    params: ParamsResourcePlacementsGet,
    options: BodyResponseCallback[Readable | SchemaPlacement],
    callback: BodyResponseCallback[Readable | SchemaPlacement]
  ): Unit = js.native
  def get(params: ParamsResourcePlacementsGet, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def get(
    params: ParamsResourcePlacementsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacement]
  ): Unit = js.native
  /**
    * Gets one placement by ID.
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
    *   const res = await dfareporting.placements.get({
    *     // Placement ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adBlockingOptOut": false,
    *   //   "additionalSizes": [],
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "archived": false,
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "comment": "my_comment",
    *   //   "compatibility": "my_compatibility",
    *   //   "contentCategoryId": "my_contentCategoryId",
    *   //   "createInfo": {},
    *   //   "directorySiteId": "my_directorySiteId",
    *   //   "directorySiteIdDimensionValue": {},
    *   //   "externalId": "my_externalId",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "keyName": "my_keyName",
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "lookbackConfiguration": {},
    *   //   "name": "my_name",
    *   //   "partnerWrappingData": {},
    *   //   "paymentApproved": false,
    *   //   "paymentSource": "my_paymentSource",
    *   //   "placementGroupId": "my_placementGroupId",
    *   //   "placementGroupIdDimensionValue": {},
    *   //   "placementStrategyId": "my_placementStrategyId",
    *   //   "pricingSchedule": {},
    *   //   "primary": false,
    *   //   "publisherUpdateInfo": {},
    *   //   "siteId": "my_siteId",
    *   //   "siteIdDimensionValue": {},
    *   //   "size": {},
    *   //   "sslRequired": false,
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagFormats": [],
    *   //   "tagSetting": {},
    *   //   "videoActiveViewOptOut": false,
    *   //   "videoSettings": {},
    *   //   "vpaidAdapterChoice": "my_vpaidAdapterChoice",
    *   //   "wrappingOptOut": false
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
  def get(params: ParamsResourcePlacementsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePlacementsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaPlacement] = js.native
  def insert(callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def insert(params: ParamsResourcePlacementsInsert): GaxiosPromise[SchemaPlacement] = js.native
  def insert(params: ParamsResourcePlacementsInsert, callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def insert(
    params: ParamsResourcePlacementsInsert,
    options: BodyResponseCallback[Readable | SchemaPlacement],
    callback: BodyResponseCallback[Readable | SchemaPlacement]
  ): Unit = js.native
  def insert(params: ParamsResourcePlacementsInsert, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def insert(
    params: ParamsResourcePlacementsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacement]
  ): Unit = js.native
  /**
    * Inserts a new placement.
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
    *   const res = await dfareporting.placements.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "adBlockingOptOut": false,
    *       //   "additionalSizes": [],
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "archived": false,
    *       //   "campaignId": "my_campaignId",
    *       //   "campaignIdDimensionValue": {},
    *       //   "comment": "my_comment",
    *       //   "compatibility": "my_compatibility",
    *       //   "contentCategoryId": "my_contentCategoryId",
    *       //   "createInfo": {},
    *       //   "directorySiteId": "my_directorySiteId",
    *       //   "directorySiteIdDimensionValue": {},
    *       //   "externalId": "my_externalId",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "keyName": "my_keyName",
    *       //   "kind": "my_kind",
    *       //   "lastModifiedInfo": {},
    *       //   "lookbackConfiguration": {},
    *       //   "name": "my_name",
    *       //   "partnerWrappingData": {},
    *       //   "paymentApproved": false,
    *       //   "paymentSource": "my_paymentSource",
    *       //   "placementGroupId": "my_placementGroupId",
    *       //   "placementGroupIdDimensionValue": {},
    *       //   "placementStrategyId": "my_placementStrategyId",
    *       //   "pricingSchedule": {},
    *       //   "primary": false,
    *       //   "publisherUpdateInfo": {},
    *       //   "siteId": "my_siteId",
    *       //   "siteIdDimensionValue": {},
    *       //   "size": {},
    *       //   "sslRequired": false,
    *       //   "status": "my_status",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "tagFormats": [],
    *       //   "tagSetting": {},
    *       //   "videoActiveViewOptOut": false,
    *       //   "videoSettings": {},
    *       //   "vpaidAdapterChoice": "my_vpaidAdapterChoice",
    *       //   "wrappingOptOut": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adBlockingOptOut": false,
    *   //   "additionalSizes": [],
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "archived": false,
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "comment": "my_comment",
    *   //   "compatibility": "my_compatibility",
    *   //   "contentCategoryId": "my_contentCategoryId",
    *   //   "createInfo": {},
    *   //   "directorySiteId": "my_directorySiteId",
    *   //   "directorySiteIdDimensionValue": {},
    *   //   "externalId": "my_externalId",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "keyName": "my_keyName",
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "lookbackConfiguration": {},
    *   //   "name": "my_name",
    *   //   "partnerWrappingData": {},
    *   //   "paymentApproved": false,
    *   //   "paymentSource": "my_paymentSource",
    *   //   "placementGroupId": "my_placementGroupId",
    *   //   "placementGroupIdDimensionValue": {},
    *   //   "placementStrategyId": "my_placementStrategyId",
    *   //   "pricingSchedule": {},
    *   //   "primary": false,
    *   //   "publisherUpdateInfo": {},
    *   //   "siteId": "my_siteId",
    *   //   "siteIdDimensionValue": {},
    *   //   "size": {},
    *   //   "sslRequired": false,
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagFormats": [],
    *   //   "tagSetting": {},
    *   //   "videoActiveViewOptOut": false,
    *   //   "videoSettings": {},
    *   //   "vpaidAdapterChoice": "my_vpaidAdapterChoice",
    *   //   "wrappingOptOut": false
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
  def insert(params: ParamsResourcePlacementsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourcePlacementsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPlacementsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlacementsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementsListResponse] = js.native
  def list(params: ParamsResourcePlacementsList): GaxiosPromise[SchemaPlacementsListResponse] = js.native
  def list(params: ParamsResourcePlacementsList, callback: BodyResponseCallback[SchemaPlacementsListResponse]): Unit = js.native
  def list(
    params: ParamsResourcePlacementsList,
    options: BodyResponseCallback[Readable | SchemaPlacementsListResponse],
    callback: BodyResponseCallback[Readable | SchemaPlacementsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlacementsList, options: MethodOptions): GaxiosPromise[SchemaPlacementsListResponse] = js.native
  def list(
    params: ParamsResourcePlacementsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of placements, possibly filtered. This method supports paging.
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
    *   const res = await dfareporting.placements.list({
    *     // Select only placements that belong to these advertisers.
    *     advertiserIds: 'placeholder-value',
    *     // Select only archived placements. Don't set this field to select both archived and non-archived placements.
    *     archived: 'placeholder-value',
    *     // Select only placements that belong to these campaigns.
    *     campaignIds: 'placeholder-value',
    *     // Select only placements that are associated with these compatibilities. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on mobile devices for regular or interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with the VAST standard.
    *     compatibilities: 'placeholder-value',
    *     // Select only placements that are associated with these content categories.
    *     contentCategoryIds: 'placeholder-value',
    *     // Select only placements that are associated with these directory sites.
    *     directorySiteIds: 'placeholder-value',
    *     // Select only placements that belong to these placement groups.
    *     groupIds: 'placeholder-value',
    *     // Select only placements with these IDs.
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
    *     // Select only placements with this payment source.
    *     paymentSource: 'placeholder-value',
    *     // Select only placements that are associated with these placement strategies.
    *     placementStrategyIds: 'placeholder-value',
    *     // Select only placements with these pricing types.
    *     pricingTypes: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for placements by name or ID. Wildcards (*) are allowed. For example, "placement*2015" will return placements with names like "placement June 2015", "placement May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "placement" will match placements with name "my placement", "placement 2015", or simply "placement" .
    *     searchString: 'placeholder-value',
    *     // Select only placements that are associated with these sites.
    *     siteIds: 'placeholder-value',
    *     // Select only placements that are associated with these sizes.
    *     sizeIds: 'placeholder-value',
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
    *   //   "placements": []
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
  def list(params: ParamsResourcePlacementsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePlacementsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPlacement] = js.native
  def patch(callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def patch(params: ParamsResourcePlacementsPatch): GaxiosPromise[SchemaPlacement] = js.native
  def patch(params: ParamsResourcePlacementsPatch, callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def patch(
    params: ParamsResourcePlacementsPatch,
    options: BodyResponseCallback[Readable | SchemaPlacement],
    callback: BodyResponseCallback[Readable | SchemaPlacement]
  ): Unit = js.native
  def patch(params: ParamsResourcePlacementsPatch, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def patch(
    params: ParamsResourcePlacementsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacement]
  ): Unit = js.native
  /**
    * Updates an existing placement. This method supports patch semantics.
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
    *   const res = await dfareporting.placements.patch({
    *     // Placement ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "adBlockingOptOut": false,
    *       //   "additionalSizes": [],
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "archived": false,
    *       //   "campaignId": "my_campaignId",
    *       //   "campaignIdDimensionValue": {},
    *       //   "comment": "my_comment",
    *       //   "compatibility": "my_compatibility",
    *       //   "contentCategoryId": "my_contentCategoryId",
    *       //   "createInfo": {},
    *       //   "directorySiteId": "my_directorySiteId",
    *       //   "directorySiteIdDimensionValue": {},
    *       //   "externalId": "my_externalId",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "keyName": "my_keyName",
    *       //   "kind": "my_kind",
    *       //   "lastModifiedInfo": {},
    *       //   "lookbackConfiguration": {},
    *       //   "name": "my_name",
    *       //   "partnerWrappingData": {},
    *       //   "paymentApproved": false,
    *       //   "paymentSource": "my_paymentSource",
    *       //   "placementGroupId": "my_placementGroupId",
    *       //   "placementGroupIdDimensionValue": {},
    *       //   "placementStrategyId": "my_placementStrategyId",
    *       //   "pricingSchedule": {},
    *       //   "primary": false,
    *       //   "publisherUpdateInfo": {},
    *       //   "siteId": "my_siteId",
    *       //   "siteIdDimensionValue": {},
    *       //   "size": {},
    *       //   "sslRequired": false,
    *       //   "status": "my_status",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "tagFormats": [],
    *       //   "tagSetting": {},
    *       //   "videoActiveViewOptOut": false,
    *       //   "videoSettings": {},
    *       //   "vpaidAdapterChoice": "my_vpaidAdapterChoice",
    *       //   "wrappingOptOut": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adBlockingOptOut": false,
    *   //   "additionalSizes": [],
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "archived": false,
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "comment": "my_comment",
    *   //   "compatibility": "my_compatibility",
    *   //   "contentCategoryId": "my_contentCategoryId",
    *   //   "createInfo": {},
    *   //   "directorySiteId": "my_directorySiteId",
    *   //   "directorySiteIdDimensionValue": {},
    *   //   "externalId": "my_externalId",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "keyName": "my_keyName",
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "lookbackConfiguration": {},
    *   //   "name": "my_name",
    *   //   "partnerWrappingData": {},
    *   //   "paymentApproved": false,
    *   //   "paymentSource": "my_paymentSource",
    *   //   "placementGroupId": "my_placementGroupId",
    *   //   "placementGroupIdDimensionValue": {},
    *   //   "placementStrategyId": "my_placementStrategyId",
    *   //   "pricingSchedule": {},
    *   //   "primary": false,
    *   //   "publisherUpdateInfo": {},
    *   //   "siteId": "my_siteId",
    *   //   "siteIdDimensionValue": {},
    *   //   "size": {},
    *   //   "sslRequired": false,
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagFormats": [],
    *   //   "tagSetting": {},
    *   //   "videoActiveViewOptOut": false,
    *   //   "videoSettings": {},
    *   //   "vpaidAdapterChoice": "my_vpaidAdapterChoice",
    *   //   "wrappingOptOut": false
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
  def patch(params: ParamsResourcePlacementsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePlacementsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaPlacement] = js.native
  def update(callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def update(params: ParamsResourcePlacementsUpdate): GaxiosPromise[SchemaPlacement] = js.native
  def update(params: ParamsResourcePlacementsUpdate, callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def update(
    params: ParamsResourcePlacementsUpdate,
    options: BodyResponseCallback[Readable | SchemaPlacement],
    callback: BodyResponseCallback[Readable | SchemaPlacement]
  ): Unit = js.native
  def update(params: ParamsResourcePlacementsUpdate, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def update(
    params: ParamsResourcePlacementsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacement]
  ): Unit = js.native
  /**
    * Updates an existing placement.
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
    *   const res = await dfareporting.placements.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "adBlockingOptOut": false,
    *       //   "additionalSizes": [],
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "archived": false,
    *       //   "campaignId": "my_campaignId",
    *       //   "campaignIdDimensionValue": {},
    *       //   "comment": "my_comment",
    *       //   "compatibility": "my_compatibility",
    *       //   "contentCategoryId": "my_contentCategoryId",
    *       //   "createInfo": {},
    *       //   "directorySiteId": "my_directorySiteId",
    *       //   "directorySiteIdDimensionValue": {},
    *       //   "externalId": "my_externalId",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "keyName": "my_keyName",
    *       //   "kind": "my_kind",
    *       //   "lastModifiedInfo": {},
    *       //   "lookbackConfiguration": {},
    *       //   "name": "my_name",
    *       //   "partnerWrappingData": {},
    *       //   "paymentApproved": false,
    *       //   "paymentSource": "my_paymentSource",
    *       //   "placementGroupId": "my_placementGroupId",
    *       //   "placementGroupIdDimensionValue": {},
    *       //   "placementStrategyId": "my_placementStrategyId",
    *       //   "pricingSchedule": {},
    *       //   "primary": false,
    *       //   "publisherUpdateInfo": {},
    *       //   "siteId": "my_siteId",
    *       //   "siteIdDimensionValue": {},
    *       //   "size": {},
    *       //   "sslRequired": false,
    *       //   "status": "my_status",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "tagFormats": [],
    *       //   "tagSetting": {},
    *       //   "videoActiveViewOptOut": false,
    *       //   "videoSettings": {},
    *       //   "vpaidAdapterChoice": "my_vpaidAdapterChoice",
    *       //   "wrappingOptOut": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adBlockingOptOut": false,
    *   //   "additionalSizes": [],
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "archived": false,
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "comment": "my_comment",
    *   //   "compatibility": "my_compatibility",
    *   //   "contentCategoryId": "my_contentCategoryId",
    *   //   "createInfo": {},
    *   //   "directorySiteId": "my_directorySiteId",
    *   //   "directorySiteIdDimensionValue": {},
    *   //   "externalId": "my_externalId",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "keyName": "my_keyName",
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "lookbackConfiguration": {},
    *   //   "name": "my_name",
    *   //   "partnerWrappingData": {},
    *   //   "paymentApproved": false,
    *   //   "paymentSource": "my_paymentSource",
    *   //   "placementGroupId": "my_placementGroupId",
    *   //   "placementGroupIdDimensionValue": {},
    *   //   "placementStrategyId": "my_placementStrategyId",
    *   //   "pricingSchedule": {},
    *   //   "primary": false,
    *   //   "publisherUpdateInfo": {},
    *   //   "siteId": "my_siteId",
    *   //   "siteIdDimensionValue": {},
    *   //   "size": {},
    *   //   "sslRequired": false,
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagFormats": [],
    *   //   "tagSetting": {},
    *   //   "videoActiveViewOptOut": false,
    *   //   "videoSettings": {},
    *   //   "vpaidAdapterChoice": "my_vpaidAdapterChoice",
    *   //   "wrappingOptOut": false
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
  def update(params: ParamsResourcePlacementsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePlacementsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
