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

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Ads")
@js.native
open class ResourceAds protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAd] = js.native
  def get(callback: BodyResponseCallback[SchemaAd]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAd] = js.native
  def get(params: ParamsResourceAdsGet): GaxiosPromise[SchemaAd] = js.native
  def get(params: ParamsResourceAdsGet, callback: BodyResponseCallback[SchemaAd]): Unit = js.native
  def get(
    params: ParamsResourceAdsGet,
    options: BodyResponseCallback[Readable | SchemaAd],
    callback: BodyResponseCallback[Readable | SchemaAd]
  ): Unit = js.native
  def get(params: ParamsResourceAdsGet, options: MethodOptions): GaxiosPromise[SchemaAd] = js.native
  def get(params: ParamsResourceAdsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaAd]): Unit = js.native
  /**
    * Gets one ad by ID.
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
    *   const res = await dfareporting.ads.get({
    *     // Ad ID.
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
    *   //   "archived": false,
    *   //   "audienceSegmentId": "my_audienceSegmentId",
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "clickThroughUrl": {},
    *   //   "clickThroughUrlSuffixProperties": {},
    *   //   "comments": "my_comments",
    *   //   "compatibility": "my_compatibility",
    *   //   "createInfo": {},
    *   //   "creativeGroupAssignments": [],
    *   //   "creativeRotation": {},
    *   //   "dayPartTargeting": {},
    *   //   "defaultClickThroughEventTagProperties": {},
    *   //   "deliverySchedule": {},
    *   //   "dynamicClickTracker": false,
    *   //   "endTime": "my_endTime",
    *   //   "eventTagOverrides": [],
    *   //   "geoTargeting": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "keyValueTargetingExpression": {},
    *   //   "kind": "my_kind",
    *   //   "languageTargeting": {},
    *   //   "lastModifiedInfo": {},
    *   //   "name": "my_name",
    *   //   "placementAssignments": [],
    *   //   "remarketingListExpression": {},
    *   //   "size": {},
    *   //   "sslCompliant": false,
    *   //   "sslRequired": false,
    *   //   "startTime": "my_startTime",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "targetingTemplateId": "my_targetingTemplateId",
    *   //   "technologyTargeting": {},
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
  def get(params: ParamsResourceAdsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaAd] = js.native
  def insert(callback: BodyResponseCallback[SchemaAd]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAd] = js.native
  def insert(params: ParamsResourceAdsInsert): GaxiosPromise[SchemaAd] = js.native
  def insert(params: ParamsResourceAdsInsert, callback: BodyResponseCallback[SchemaAd]): Unit = js.native
  def insert(
    params: ParamsResourceAdsInsert,
    options: BodyResponseCallback[Readable | SchemaAd],
    callback: BodyResponseCallback[Readable | SchemaAd]
  ): Unit = js.native
  def insert(params: ParamsResourceAdsInsert, options: MethodOptions): GaxiosPromise[SchemaAd] = js.native
  def insert(params: ParamsResourceAdsInsert, options: MethodOptions, callback: BodyResponseCallback[SchemaAd]): Unit = js.native
  /**
    * Inserts a new ad.
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
    *   const res = await dfareporting.ads.insert({
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
    *       //   "archived": false,
    *       //   "audienceSegmentId": "my_audienceSegmentId",
    *       //   "campaignId": "my_campaignId",
    *       //   "campaignIdDimensionValue": {},
    *       //   "clickThroughUrl": {},
    *       //   "clickThroughUrlSuffixProperties": {},
    *       //   "comments": "my_comments",
    *       //   "compatibility": "my_compatibility",
    *       //   "createInfo": {},
    *       //   "creativeGroupAssignments": [],
    *       //   "creativeRotation": {},
    *       //   "dayPartTargeting": {},
    *       //   "defaultClickThroughEventTagProperties": {},
    *       //   "deliverySchedule": {},
    *       //   "dynamicClickTracker": false,
    *       //   "endTime": "my_endTime",
    *       //   "eventTagOverrides": [],
    *       //   "geoTargeting": {},
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "keyValueTargetingExpression": {},
    *       //   "kind": "my_kind",
    *       //   "languageTargeting": {},
    *       //   "lastModifiedInfo": {},
    *       //   "name": "my_name",
    *       //   "placementAssignments": [],
    *       //   "remarketingListExpression": {},
    *       //   "size": {},
    *       //   "sslCompliant": false,
    *       //   "sslRequired": false,
    *       //   "startTime": "my_startTime",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "targetingTemplateId": "my_targetingTemplateId",
    *       //   "technologyTargeting": {},
    *       //   "type": "my_type"
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
    *   //   "archived": false,
    *   //   "audienceSegmentId": "my_audienceSegmentId",
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "clickThroughUrl": {},
    *   //   "clickThroughUrlSuffixProperties": {},
    *   //   "comments": "my_comments",
    *   //   "compatibility": "my_compatibility",
    *   //   "createInfo": {},
    *   //   "creativeGroupAssignments": [],
    *   //   "creativeRotation": {},
    *   //   "dayPartTargeting": {},
    *   //   "defaultClickThroughEventTagProperties": {},
    *   //   "deliverySchedule": {},
    *   //   "dynamicClickTracker": false,
    *   //   "endTime": "my_endTime",
    *   //   "eventTagOverrides": [],
    *   //   "geoTargeting": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "keyValueTargetingExpression": {},
    *   //   "kind": "my_kind",
    *   //   "languageTargeting": {},
    *   //   "lastModifiedInfo": {},
    *   //   "name": "my_name",
    *   //   "placementAssignments": [],
    *   //   "remarketingListExpression": {},
    *   //   "size": {},
    *   //   "sslCompliant": false,
    *   //   "sslRequired": false,
    *   //   "startTime": "my_startTime",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "targetingTemplateId": "my_targetingTemplateId",
    *   //   "technologyTargeting": {},
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
  def insert(params: ParamsResourceAdsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceAdsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAdsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAdsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdsListResponse] = js.native
  def list(params: ParamsResourceAdsList): GaxiosPromise[SchemaAdsListResponse] = js.native
  def list(params: ParamsResourceAdsList, callback: BodyResponseCallback[SchemaAdsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceAdsList,
    options: BodyResponseCallback[Readable | SchemaAdsListResponse],
    callback: BodyResponseCallback[Readable | SchemaAdsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdsList, options: MethodOptions): GaxiosPromise[SchemaAdsListResponse] = js.native
  def list(
    params: ParamsResourceAdsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of ads, possibly filtered. This method supports paging.
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
    *   const res = await dfareporting.ads.list({
    *     // Select only active ads.
    *     active: 'placeholder-value',
    *     // Select only ads with this advertiser ID.
    *     advertiserId: 'placeholder-value',
    *     // Select only archived ads.
    *     archived: 'placeholder-value',
    *     // Select only ads with these audience segment IDs.
    *     audienceSegmentIds: 'placeholder-value',
    *     // Select only ads with these campaign IDs.
    *     campaignIds: 'placeholder-value',
    *     // Select default ads with the specified compatibility. Applicable when type is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on mobile devices for regular or interstitial ads, respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering an in-stream video ads developed with the VAST standard.
    *     compatibility: 'placeholder-value',
    *     // Select only ads with these creative IDs assigned.
    *     creativeIds: 'placeholder-value',
    *     // Select only ads with these creative optimization configuration IDs.
    *     creativeOptimizationConfigurationIds: 'placeholder-value',
    *     // Select only dynamic click trackers. Applicable when type is AD_SERVING_CLICK_TRACKER. If true, select dynamic click trackers. If false, select static click trackers. Leave unset to select both.
    *     dynamicClickTracker: 'placeholder-value',
    *     // Select only ads with these IDs.
    *     ids: 'placeholder-value',
    *     // Select only ads with these landing page IDs.
    *     landingPageIds: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Select only ads with this event tag override ID.
    *     overriddenEventTagId: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // Select only ads with these placement IDs assigned.
    *     placementIds: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Select only ads whose list targeting expression use these remarketing list IDs.
    *     remarketingListIds: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "ad*2015" will return objects with names like "ad June 2015", "ad April 2015", or simply "ad 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "ad" will match objects with name "my ad", "ad 2015", or simply "ad".
    *     searchString: 'placeholder-value',
    *     // Select only ads with these size IDs.
    *     sizeIds: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *     // Select only ads that are SSL-compliant.
    *     sslCompliant: 'placeholder-value',
    *     // Select only ads that require SSL.
    *     sslRequired: 'placeholder-value',
    *     // Select only ads with these types.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ads": [],
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
  def list(params: ParamsResourceAdsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAd] = js.native
  def patch(callback: BodyResponseCallback[SchemaAd]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAd] = js.native
  def patch(params: ParamsResourceAdsPatch): GaxiosPromise[SchemaAd] = js.native
  def patch(params: ParamsResourceAdsPatch, callback: BodyResponseCallback[SchemaAd]): Unit = js.native
  def patch(
    params: ParamsResourceAdsPatch,
    options: BodyResponseCallback[Readable | SchemaAd],
    callback: BodyResponseCallback[Readable | SchemaAd]
  ): Unit = js.native
  def patch(params: ParamsResourceAdsPatch, options: MethodOptions): GaxiosPromise[SchemaAd] = js.native
  def patch(params: ParamsResourceAdsPatch, options: MethodOptions, callback: BodyResponseCallback[SchemaAd]): Unit = js.native
  /**
    * Updates an existing ad. This method supports patch semantics.
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
    *   const res = await dfareporting.ads.patch({
    *     // Ad ID.
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
    *       //   "archived": false,
    *       //   "audienceSegmentId": "my_audienceSegmentId",
    *       //   "campaignId": "my_campaignId",
    *       //   "campaignIdDimensionValue": {},
    *       //   "clickThroughUrl": {},
    *       //   "clickThroughUrlSuffixProperties": {},
    *       //   "comments": "my_comments",
    *       //   "compatibility": "my_compatibility",
    *       //   "createInfo": {},
    *       //   "creativeGroupAssignments": [],
    *       //   "creativeRotation": {},
    *       //   "dayPartTargeting": {},
    *       //   "defaultClickThroughEventTagProperties": {},
    *       //   "deliverySchedule": {},
    *       //   "dynamicClickTracker": false,
    *       //   "endTime": "my_endTime",
    *       //   "eventTagOverrides": [],
    *       //   "geoTargeting": {},
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "keyValueTargetingExpression": {},
    *       //   "kind": "my_kind",
    *       //   "languageTargeting": {},
    *       //   "lastModifiedInfo": {},
    *       //   "name": "my_name",
    *       //   "placementAssignments": [],
    *       //   "remarketingListExpression": {},
    *       //   "size": {},
    *       //   "sslCompliant": false,
    *       //   "sslRequired": false,
    *       //   "startTime": "my_startTime",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "targetingTemplateId": "my_targetingTemplateId",
    *       //   "technologyTargeting": {},
    *       //   "type": "my_type"
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
    *   //   "archived": false,
    *   //   "audienceSegmentId": "my_audienceSegmentId",
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "clickThroughUrl": {},
    *   //   "clickThroughUrlSuffixProperties": {},
    *   //   "comments": "my_comments",
    *   //   "compatibility": "my_compatibility",
    *   //   "createInfo": {},
    *   //   "creativeGroupAssignments": [],
    *   //   "creativeRotation": {},
    *   //   "dayPartTargeting": {},
    *   //   "defaultClickThroughEventTagProperties": {},
    *   //   "deliverySchedule": {},
    *   //   "dynamicClickTracker": false,
    *   //   "endTime": "my_endTime",
    *   //   "eventTagOverrides": [],
    *   //   "geoTargeting": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "keyValueTargetingExpression": {},
    *   //   "kind": "my_kind",
    *   //   "languageTargeting": {},
    *   //   "lastModifiedInfo": {},
    *   //   "name": "my_name",
    *   //   "placementAssignments": [],
    *   //   "remarketingListExpression": {},
    *   //   "size": {},
    *   //   "sslCompliant": false,
    *   //   "sslRequired": false,
    *   //   "startTime": "my_startTime",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "targetingTemplateId": "my_targetingTemplateId",
    *   //   "technologyTargeting": {},
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
  def patch(params: ParamsResourceAdsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaAd] = js.native
  def update(callback: BodyResponseCallback[SchemaAd]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAd] = js.native
  def update(params: ParamsResourceAdsUpdate): GaxiosPromise[SchemaAd] = js.native
  def update(params: ParamsResourceAdsUpdate, callback: BodyResponseCallback[SchemaAd]): Unit = js.native
  def update(
    params: ParamsResourceAdsUpdate,
    options: BodyResponseCallback[Readable | SchemaAd],
    callback: BodyResponseCallback[Readable | SchemaAd]
  ): Unit = js.native
  def update(params: ParamsResourceAdsUpdate, options: MethodOptions): GaxiosPromise[SchemaAd] = js.native
  def update(params: ParamsResourceAdsUpdate, options: MethodOptions, callback: BodyResponseCallback[SchemaAd]): Unit = js.native
  /**
    * Updates an existing ad.
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
    *   const res = await dfareporting.ads.update({
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
    *       //   "archived": false,
    *       //   "audienceSegmentId": "my_audienceSegmentId",
    *       //   "campaignId": "my_campaignId",
    *       //   "campaignIdDimensionValue": {},
    *       //   "clickThroughUrl": {},
    *       //   "clickThroughUrlSuffixProperties": {},
    *       //   "comments": "my_comments",
    *       //   "compatibility": "my_compatibility",
    *       //   "createInfo": {},
    *       //   "creativeGroupAssignments": [],
    *       //   "creativeRotation": {},
    *       //   "dayPartTargeting": {},
    *       //   "defaultClickThroughEventTagProperties": {},
    *       //   "deliverySchedule": {},
    *       //   "dynamicClickTracker": false,
    *       //   "endTime": "my_endTime",
    *       //   "eventTagOverrides": [],
    *       //   "geoTargeting": {},
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "keyValueTargetingExpression": {},
    *       //   "kind": "my_kind",
    *       //   "languageTargeting": {},
    *       //   "lastModifiedInfo": {},
    *       //   "name": "my_name",
    *       //   "placementAssignments": [],
    *       //   "remarketingListExpression": {},
    *       //   "size": {},
    *       //   "sslCompliant": false,
    *       //   "sslRequired": false,
    *       //   "startTime": "my_startTime",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "targetingTemplateId": "my_targetingTemplateId",
    *       //   "technologyTargeting": {},
    *       //   "type": "my_type"
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
    *   //   "archived": false,
    *   //   "audienceSegmentId": "my_audienceSegmentId",
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "clickThroughUrl": {},
    *   //   "clickThroughUrlSuffixProperties": {},
    *   //   "comments": "my_comments",
    *   //   "compatibility": "my_compatibility",
    *   //   "createInfo": {},
    *   //   "creativeGroupAssignments": [],
    *   //   "creativeRotation": {},
    *   //   "dayPartTargeting": {},
    *   //   "defaultClickThroughEventTagProperties": {},
    *   //   "deliverySchedule": {},
    *   //   "dynamicClickTracker": false,
    *   //   "endTime": "my_endTime",
    *   //   "eventTagOverrides": [],
    *   //   "geoTargeting": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "keyValueTargetingExpression": {},
    *   //   "kind": "my_kind",
    *   //   "languageTargeting": {},
    *   //   "lastModifiedInfo": {},
    *   //   "name": "my_name",
    *   //   "placementAssignments": [],
    *   //   "remarketingListExpression": {},
    *   //   "size": {},
    *   //   "sslCompliant": false,
    *   //   "sslRequired": false,
    *   //   "startTime": "my_startTime",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "targetingTemplateId": "my_targetingTemplateId",
    *   //   "technologyTargeting": {},
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
  def update(params: ParamsResourceAdsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAdsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
