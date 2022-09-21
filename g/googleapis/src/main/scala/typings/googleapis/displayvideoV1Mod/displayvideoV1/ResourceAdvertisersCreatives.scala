package typings.googleapis.displayvideoV1Mod.displayvideoV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Creatives")
@js.native
open class ResourceAdvertisersCreatives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCreative] = js.native
  def create(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def create(params: ParamsResourceAdvertisersCreativesCreate): GaxiosPromise[SchemaCreative] = js.native
  def create(params: ParamsResourceAdvertisersCreativesCreate, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersCreativesCreate,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def create(params: ParamsResourceAdvertisersCreativesCreate, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def create(
    params: ParamsResourceAdvertisersCreativesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Creates a new creative. Returns the newly created creative if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.creatives.create({
    *     // Output only. The unique ID of the advertiser the creative belongs to.
    *     advertiserId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "additionalDimensions": [],
    *       //   "advertiserId": "my_advertiserId",
    *       //   "appendedTag": "my_appendedTag",
    *       //   "assets": [],
    *       //   "cmPlacementId": "my_cmPlacementId",
    *       //   "cmTrackingAd": {},
    *       //   "companionCreativeIds": [],
    *       //   "counterEvents": [],
    *       //   "createTime": "my_createTime",
    *       //   "creativeAttributes": [],
    *       //   "creativeId": "my_creativeId",
    *       //   "creativeType": "my_creativeType",
    *       //   "dimensions": {},
    *       //   "displayName": "my_displayName",
    *       //   "dynamic": false,
    *       //   "entityStatus": "my_entityStatus",
    *       //   "exitEvents": [],
    *       //   "expandOnHover": false,
    *       //   "expandingDirection": "my_expandingDirection",
    *       //   "hostingSource": "my_hostingSource",
    *       //   "html5Video": false,
    *       //   "iasCampaignMonitoring": false,
    *       //   "integrationCode": "my_integrationCode",
    *       //   "jsTrackerUrl": "my_jsTrackerUrl",
    *       //   "lineItemIds": [],
    *       //   "mediaDuration": "my_mediaDuration",
    *       //   "mp3Audio": false,
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "obaIcon": {},
    *       //   "oggAudio": false,
    *       //   "progressOffset": {},
    *       //   "requireHtml5": false,
    *       //   "requireMraid": false,
    *       //   "requirePingForAttribution": false,
    *       //   "reviewStatus": {},
    *       //   "skipOffset": {},
    *       //   "skippable": false,
    *       //   "thirdPartyTag": "my_thirdPartyTag",
    *       //   "thirdPartyUrls": [],
    *       //   "timerEvents": [],
    *       //   "trackerUrls": [],
    *       //   "transcodes": [],
    *       //   "universalAdId": {},
    *       //   "updateTime": "my_updateTime",
    *       //   "vastTagUrl": "my_vastTagUrl",
    *       //   "vpaid": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalDimensions": [],
    *   //   "advertiserId": "my_advertiserId",
    *   //   "appendedTag": "my_appendedTag",
    *   //   "assets": [],
    *   //   "cmPlacementId": "my_cmPlacementId",
    *   //   "cmTrackingAd": {},
    *   //   "companionCreativeIds": [],
    *   //   "counterEvents": [],
    *   //   "createTime": "my_createTime",
    *   //   "creativeAttributes": [],
    *   //   "creativeId": "my_creativeId",
    *   //   "creativeType": "my_creativeType",
    *   //   "dimensions": {},
    *   //   "displayName": "my_displayName",
    *   //   "dynamic": false,
    *   //   "entityStatus": "my_entityStatus",
    *   //   "exitEvents": [],
    *   //   "expandOnHover": false,
    *   //   "expandingDirection": "my_expandingDirection",
    *   //   "hostingSource": "my_hostingSource",
    *   //   "html5Video": false,
    *   //   "iasCampaignMonitoring": false,
    *   //   "integrationCode": "my_integrationCode",
    *   //   "jsTrackerUrl": "my_jsTrackerUrl",
    *   //   "lineItemIds": [],
    *   //   "mediaDuration": "my_mediaDuration",
    *   //   "mp3Audio": false,
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "obaIcon": {},
    *   //   "oggAudio": false,
    *   //   "progressOffset": {},
    *   //   "requireHtml5": false,
    *   //   "requireMraid": false,
    *   //   "requirePingForAttribution": false,
    *   //   "reviewStatus": {},
    *   //   "skipOffset": {},
    *   //   "skippable": false,
    *   //   "thirdPartyTag": "my_thirdPartyTag",
    *   //   "thirdPartyUrls": [],
    *   //   "timerEvents": [],
    *   //   "trackerUrls": [],
    *   //   "transcodes": [],
    *   //   "universalAdId": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "vastTagUrl": "my_vastTagUrl",
    *   //   "vpaid": false
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
  def create(params: ParamsResourceAdvertisersCreativesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersCreativesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersCreativesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersCreativesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisersCreativesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAdvertisersCreativesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersCreativesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a creative. Returns error code `NOT_FOUND` if the creative does not exist. The creative should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, before it can be deleted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.creatives.delete({
    *     // The ID of the advertiser this creative belongs to.
    *     advertiserId: '[^/]+',
    *     // The ID of the creative to be deleted.
    *     creativeId: '[^/]+',
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
  def delete(params: ParamsResourceAdvertisersCreativesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdvertisersCreativesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCreative] = js.native
  def get(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceAdvertisersCreativesGet): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceAdvertisersCreativesGet, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersCreativesGet,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertisersCreativesGet, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(
    params: ParamsResourceAdvertisersCreativesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Gets a creative.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.creatives.get({
    *     // Required. The ID of the advertiser this creative belongs to.
    *     advertiserId: '[^/]+',
    *     // Required. The ID of the creative to fetch.
    *     creativeId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalDimensions": [],
    *   //   "advertiserId": "my_advertiserId",
    *   //   "appendedTag": "my_appendedTag",
    *   //   "assets": [],
    *   //   "cmPlacementId": "my_cmPlacementId",
    *   //   "cmTrackingAd": {},
    *   //   "companionCreativeIds": [],
    *   //   "counterEvents": [],
    *   //   "createTime": "my_createTime",
    *   //   "creativeAttributes": [],
    *   //   "creativeId": "my_creativeId",
    *   //   "creativeType": "my_creativeType",
    *   //   "dimensions": {},
    *   //   "displayName": "my_displayName",
    *   //   "dynamic": false,
    *   //   "entityStatus": "my_entityStatus",
    *   //   "exitEvents": [],
    *   //   "expandOnHover": false,
    *   //   "expandingDirection": "my_expandingDirection",
    *   //   "hostingSource": "my_hostingSource",
    *   //   "html5Video": false,
    *   //   "iasCampaignMonitoring": false,
    *   //   "integrationCode": "my_integrationCode",
    *   //   "jsTrackerUrl": "my_jsTrackerUrl",
    *   //   "lineItemIds": [],
    *   //   "mediaDuration": "my_mediaDuration",
    *   //   "mp3Audio": false,
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "obaIcon": {},
    *   //   "oggAudio": false,
    *   //   "progressOffset": {},
    *   //   "requireHtml5": false,
    *   //   "requireMraid": false,
    *   //   "requirePingForAttribution": false,
    *   //   "reviewStatus": {},
    *   //   "skipOffset": {},
    *   //   "skippable": false,
    *   //   "thirdPartyTag": "my_thirdPartyTag",
    *   //   "thirdPartyUrls": [],
    *   //   "timerEvents": [],
    *   //   "trackerUrls": [],
    *   //   "transcodes": [],
    *   //   "universalAdId": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "vastTagUrl": "my_vastTagUrl",
    *   //   "vpaid": false
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
  def get(params: ParamsResourceAdvertisersCreativesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertisersCreativesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCreativesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(params: ParamsResourceAdvertisersCreativesList): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersCreativesList,
    callback: BodyResponseCallback[SchemaListCreativesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersCreativesList,
    options: BodyResponseCallback[Readable | SchemaListCreativesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCreativesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersCreativesList, options: MethodOptions): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersCreativesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCreativesResponse]
  ): Unit = js.native
  /**
    * Lists creatives in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, creatives with `ENTITY_STATUS_ARCHIVED` will not be included in the results.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.creatives.list({
    *     // Required. The ID of the advertiser to list creatives for.
    *     advertiserId: '[^/]+',
    *     // Allows filtering by creative properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restriction for the same field must be combined by `OR`. * Restriction for different fields must be combined by `AND`. * Between `(` and `)` there can only be restrictions combined by `OR` for the same field. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)` for the following fields: - `entityStatus` - `creativeType`. - `dimensions` - `minDuration` - `maxDuration` - `approvalStatus` - `exchangeReviewStatus` - `dynamic` - `creativeId` * The operator must be `HAS (:)` for the following fields: - `lineItemIds` * The operator must be `GREATER THAN OR EQUAL TO (\>=)` or `LESS THAN OR EQUAL TO (<=)` for the following fields: - `updateTime` (input in ISO 8601 format, or YYYY-MM-DDTHH:MM:SSZ) * For `entityStatus`, `minDuration`, `maxDuration`, `updateTime`, and `dynamic`, there may be at most one restriction. * For `dimensions`, the value is in the form of `"{width\}x{height\}"`. * For `exchangeReviewStatus`, the value is in the form of `{exchange\}-{reviewStatus\}`. * For `minDuration` and `maxDuration`, the value is in the form of `"{duration\}s"`. Only seconds are supported with millisecond granularity. * For `updateTime`, a creative resource's field value reflects the last time that a creative has been updated, which includes updates made by the system (e.g. creative review updates). * There may be multiple `lineItemIds` restrictions in order to search against multiple possible line item IDs. * There may be multiple `creativeId` restrictions in order to search against multiple possible creative IDs. Examples: * All native creatives: `creativeType="CREATIVE_TYPE_NATIVE"` * All active creatives with 300x400 or 50x100 dimensions: `entityStatus="ENTITY_STATUS_ACTIVE" AND (dimensions="300x400" OR dimensions="50x100")` * All dynamic creatives that are approved by AdX or AppNexus, with a minimum duration of 5 seconds and 200ms. `dynamic="true" AND minDuration="5.2s" AND (exchangeReviewStatus="EXCHANGE_GOOGLE_AD_MANAGER-REVIEW_STATUS_APPROVED" OR exchangeReviewStatus="EXCHANGE_APPNEXUS-REVIEW_STATUS_APPROVED")` * All video creatives that are associated with line item ID 1 or 2: `creativeType="CREATIVE_TYPE_VIDEO" AND (lineItemIds:1 OR lineItemIds:2)` * Find creatives by multiple creative IDs: `creativeId=1 OR creativeId=2` * All creatives with an update time greater than or equal to `2020-11-04T18:54:47Z (format of ISO 8601)`: `updateTime\>="2020-11-04T18:54:47Z"` The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `creativeId` (default) * `createTime` * `mediaDuration` * `dimensions` (sorts by width first, then by height) The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `createTime desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListCreatives` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creatives": [],
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
  def list(params: ParamsResourceAdvertisersCreativesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersCreativesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCreative] = js.native
  def patch(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def patch(params: ParamsResourceAdvertisersCreativesPatch): GaxiosPromise[SchemaCreative] = js.native
  def patch(params: ParamsResourceAdvertisersCreativesPatch, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def patch(
    params: ParamsResourceAdvertisersCreativesPatch,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertisersCreativesPatch, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def patch(
    params: ParamsResourceAdvertisersCreativesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Updates an existing creative. Returns the updated creative if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.creatives.patch({
    *     // Output only. The unique ID of the advertiser the creative belongs to.
    *     advertiserId: '[^/]+',
    *     // Output only. The unique ID of the creative. Assigned by the system.
    *     creativeId: '[^/]+',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "additionalDimensions": [],
    *       //   "advertiserId": "my_advertiserId",
    *       //   "appendedTag": "my_appendedTag",
    *       //   "assets": [],
    *       //   "cmPlacementId": "my_cmPlacementId",
    *       //   "cmTrackingAd": {},
    *       //   "companionCreativeIds": [],
    *       //   "counterEvents": [],
    *       //   "createTime": "my_createTime",
    *       //   "creativeAttributes": [],
    *       //   "creativeId": "my_creativeId",
    *       //   "creativeType": "my_creativeType",
    *       //   "dimensions": {},
    *       //   "displayName": "my_displayName",
    *       //   "dynamic": false,
    *       //   "entityStatus": "my_entityStatus",
    *       //   "exitEvents": [],
    *       //   "expandOnHover": false,
    *       //   "expandingDirection": "my_expandingDirection",
    *       //   "hostingSource": "my_hostingSource",
    *       //   "html5Video": false,
    *       //   "iasCampaignMonitoring": false,
    *       //   "integrationCode": "my_integrationCode",
    *       //   "jsTrackerUrl": "my_jsTrackerUrl",
    *       //   "lineItemIds": [],
    *       //   "mediaDuration": "my_mediaDuration",
    *       //   "mp3Audio": false,
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "obaIcon": {},
    *       //   "oggAudio": false,
    *       //   "progressOffset": {},
    *       //   "requireHtml5": false,
    *       //   "requireMraid": false,
    *       //   "requirePingForAttribution": false,
    *       //   "reviewStatus": {},
    *       //   "skipOffset": {},
    *       //   "skippable": false,
    *       //   "thirdPartyTag": "my_thirdPartyTag",
    *       //   "thirdPartyUrls": [],
    *       //   "timerEvents": [],
    *       //   "trackerUrls": [],
    *       //   "transcodes": [],
    *       //   "universalAdId": {},
    *       //   "updateTime": "my_updateTime",
    *       //   "vastTagUrl": "my_vastTagUrl",
    *       //   "vpaid": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalDimensions": [],
    *   //   "advertiserId": "my_advertiserId",
    *   //   "appendedTag": "my_appendedTag",
    *   //   "assets": [],
    *   //   "cmPlacementId": "my_cmPlacementId",
    *   //   "cmTrackingAd": {},
    *   //   "companionCreativeIds": [],
    *   //   "counterEvents": [],
    *   //   "createTime": "my_createTime",
    *   //   "creativeAttributes": [],
    *   //   "creativeId": "my_creativeId",
    *   //   "creativeType": "my_creativeType",
    *   //   "dimensions": {},
    *   //   "displayName": "my_displayName",
    *   //   "dynamic": false,
    *   //   "entityStatus": "my_entityStatus",
    *   //   "exitEvents": [],
    *   //   "expandOnHover": false,
    *   //   "expandingDirection": "my_expandingDirection",
    *   //   "hostingSource": "my_hostingSource",
    *   //   "html5Video": false,
    *   //   "iasCampaignMonitoring": false,
    *   //   "integrationCode": "my_integrationCode",
    *   //   "jsTrackerUrl": "my_jsTrackerUrl",
    *   //   "lineItemIds": [],
    *   //   "mediaDuration": "my_mediaDuration",
    *   //   "mp3Audio": false,
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "obaIcon": {},
    *   //   "oggAudio": false,
    *   //   "progressOffset": {},
    *   //   "requireHtml5": false,
    *   //   "requireMraid": false,
    *   //   "requirePingForAttribution": false,
    *   //   "reviewStatus": {},
    *   //   "skipOffset": {},
    *   //   "skippable": false,
    *   //   "thirdPartyTag": "my_thirdPartyTag",
    *   //   "thirdPartyUrls": [],
    *   //   "timerEvents": [],
    *   //   "trackerUrls": [],
    *   //   "transcodes": [],
    *   //   "universalAdId": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "vastTagUrl": "my_vastTagUrl",
    *   //   "vpaid": false
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
  def patch(params: ParamsResourceAdvertisersCreativesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdvertisersCreativesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
