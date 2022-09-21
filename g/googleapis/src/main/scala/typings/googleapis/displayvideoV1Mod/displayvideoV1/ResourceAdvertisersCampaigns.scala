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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Campaigns")
@js.native
open class ResourceAdvertisersCampaigns protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def bulkListCampaignAssignedTargetingOptions(): GaxiosPromise[SchemaBulkListCampaignAssignedTargetingOptionsResponse] = js.native
  def bulkListCampaignAssignedTargetingOptions(callback: BodyResponseCallback[SchemaBulkListCampaignAssignedTargetingOptionsResponse]): Unit = js.native
  def bulkListCampaignAssignedTargetingOptions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkListCampaignAssignedTargetingOptionsResponse] = js.native
  def bulkListCampaignAssignedTargetingOptions(params: ParamsResourceAdvertisersCampaignsBulklistcampaignassignedtargetingoptions): GaxiosPromise[SchemaBulkListCampaignAssignedTargetingOptionsResponse] = js.native
  def bulkListCampaignAssignedTargetingOptions(
    params: ParamsResourceAdvertisersCampaignsBulklistcampaignassignedtargetingoptions,
    callback: BodyResponseCallback[SchemaBulkListCampaignAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkListCampaignAssignedTargetingOptions(
    params: ParamsResourceAdvertisersCampaignsBulklistcampaignassignedtargetingoptions,
    options: BodyResponseCallback[Readable | SchemaBulkListCampaignAssignedTargetingOptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkListCampaignAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkListCampaignAssignedTargetingOptions(
    params: ParamsResourceAdvertisersCampaignsBulklistcampaignassignedtargetingoptions,
    options: MethodOptions
  ): GaxiosPromise[SchemaBulkListCampaignAssignedTargetingOptionsResponse] = js.native
  def bulkListCampaignAssignedTargetingOptions(
    params: ParamsResourceAdvertisersCampaignsBulklistcampaignassignedtargetingoptions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBulkListCampaignAssignedTargetingOptionsResponse]
  ): Unit = js.native
  /**
    * Lists assigned targeting options of a campaign across targeting types.
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
    *   const res =
    *     await displayvideo.advertisers.campaigns.bulkListCampaignAssignedTargetingOptions(
    *       {
    *         // Required. The ID of the advertiser the campaign belongs to.
    *         advertiserId: '[^/]+',
    *         // Required. The ID of the campaign to list assigned targeting options for.
    *         campaignId: '[^/]+',
    *         // Allows filtering by assigned targeting option properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR` on the same field. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `targetingType` - `inheritance` Examples: * AssignedTargetingOptions of targeting type TARGETING_TYPE_LANGUAGE or TARGETING_TYPE_GENDER `targetingType="TARGETING_TYPE_LANGUAGE" OR targetingType="TARGETING_TYPE_GENDER"` * AssignedTargetingOptions with inheritance status of NOT_INHERITED or INHERITED_FROM_PARTNER `inheritance="NOT_INHERITED" OR inheritance="INHERITED_FROM_PARTNER"` The length of this field should be no more than 500 characters.
    *         filter: 'placeholder-value',
    *         // Field by which to sort the list. Acceptable values are: * `targetingType` (default) The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `targetingType desc`.
    *         orderBy: 'placeholder-value',
    *         // Requested page size. The size must be an integer between `1` and `5000`. If unspecified, the default is `5000`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *         pageSize: 'placeholder-value',
    *         // A token that lets the client fetch the next page of results. Typically, this is the value of next_page_token returned from the previous call to `BulkListCampaignAssignedTargetingOptions` method. If not specified, the first page of results will be returned.
    *         pageToken: 'placeholder-value',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignedTargetingOptions": [],
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
  def bulkListCampaignAssignedTargetingOptions(
    params: ParamsResourceAdvertisersCampaignsBulklistcampaignassignedtargetingoptions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def bulkListCampaignAssignedTargetingOptions(
    params: ParamsResourceAdvertisersCampaignsBulklistcampaignassignedtargetingoptions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCampaign] = js.native
  def create(callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def create(params: ParamsResourceAdvertisersCampaignsCreate): GaxiosPromise[SchemaCampaign] = js.native
  def create(params: ParamsResourceAdvertisersCampaignsCreate, callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersCampaignsCreate,
    options: BodyResponseCallback[Readable | SchemaCampaign],
    callback: BodyResponseCallback[Readable | SchemaCampaign]
  ): Unit = js.native
  def create(params: ParamsResourceAdvertisersCampaignsCreate, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def create(
    params: ParamsResourceAdvertisersCampaignsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  /**
    * Creates a new campaign. Returns the newly created campaign if successful.
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/display-video',
    *       'https://www.googleapis.com/auth/display-video-mediaplanning',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.campaigns.create({
    *     // Output only. The unique ID of the advertiser the campaign belongs to.
    *     advertiserId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "campaignBudgets": [],
    *       //   "campaignFlight": {},
    *       //   "campaignGoal": {},
    *       //   "campaignId": "my_campaignId",
    *       //   "displayName": "my_displayName",
    *       //   "entityStatus": "my_entityStatus",
    *       //   "frequencyCap": {},
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "campaignBudgets": [],
    *   //   "campaignFlight": {},
    *   //   "campaignGoal": {},
    *   //   "campaignId": "my_campaignId",
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "frequencyCap": {},
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceAdvertisersCampaignsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersCampaignsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersCampaignsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersCampaignsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisersCampaignsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAdvertisersCampaignsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersCampaignsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Permanently deletes a campaign. A deleted campaign cannot be recovered. The campaign should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, to be able to delete it.
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/display-video',
    *       'https://www.googleapis.com/auth/display-video-mediaplanning',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.campaigns.delete({
    *     // The ID of the advertiser this campaign belongs to.
    *     advertiserId: '[^/]+',
    *     // The ID of the campaign we need to delete.
    *     campaignId: '[^/]+',
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
  def delete(params: ParamsResourceAdvertisersCampaignsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdvertisersCampaignsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCampaign] = js.native
  def get(callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def get(params: ParamsResourceAdvertisersCampaignsGet): GaxiosPromise[SchemaCampaign] = js.native
  def get(params: ParamsResourceAdvertisersCampaignsGet, callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersCampaignsGet,
    options: BodyResponseCallback[Readable | SchemaCampaign],
    callback: BodyResponseCallback[Readable | SchemaCampaign]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertisersCampaignsGet, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def get(
    params: ParamsResourceAdvertisersCampaignsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  /**
    * Gets a campaign.
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/display-video',
    *       'https://www.googleapis.com/auth/display-video-mediaplanning',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.campaigns.get({
    *     // Required. The ID of the advertiser this campaign belongs to.
    *     advertiserId: '[^/]+',
    *     // Required. The ID of the campaign to fetch.
    *     campaignId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "campaignBudgets": [],
    *   //   "campaignFlight": {},
    *   //   "campaignGoal": {},
    *   //   "campaignId": "my_campaignId",
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "frequencyCap": {},
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceAdvertisersCampaignsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertisersCampaignsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCampaignsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCampaignsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCampaignsResponse] = js.native
  def list(params: ParamsResourceAdvertisersCampaignsList): GaxiosPromise[SchemaListCampaignsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersCampaignsList,
    callback: BodyResponseCallback[SchemaListCampaignsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersCampaignsList,
    options: BodyResponseCallback[Readable | SchemaListCampaignsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCampaignsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersCampaignsList, options: MethodOptions): GaxiosPromise[SchemaListCampaignsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersCampaignsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCampaignsResponse]
  ): Unit = js.native
  /**
    * Lists campaigns in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, campaigns with `ENTITY_STATUS_ARCHIVED` will not be included in the results.
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/display-video',
    *       'https://www.googleapis.com/auth/display-video-mediaplanning',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.campaigns.list({
    *     // The ID of the advertiser to list campaigns for.
    *     advertiserId: '[^/]+',
    *     // Allows filtering by campaign properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator used on `updateTime` must be `GREATER THAN OR EQUAL TO (\>=)` or `LESS THAN OR EQUAL TO (<=)`. * The operator must be `EQUALS (=)`. * Supported fields: - `campaignId` - `displayName` - `entityStatus` - `updateTime` (input in ISO 8601 format, or YYYY-MM-DDTHH:MM:SSZ) Examples: * All `ENTITY_STATUS_ACTIVE` or `ENTITY_STATUS_PAUSED` campaigns under an advertiser: `(entityStatus="ENTITY_STATUS_ACTIVE" OR entityStatus="ENTITY_STATUS_PAUSED")` * All campaigns with an update time less than or equal to `2020-11-04T18:54:47Z (format of ISO 8601)`: `updateTime<="2020-11-04T18:54:47Z"` * All campaigns with an update time greater than or equal to `2020-11-04T18:54:47Z (format of ISO 8601)`: `updateTime\>="2020-11-04T18:54:47Z"` The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `displayName` (default) * `entityStatus` * `updateTime` The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListCampaigns` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "campaigns": [],
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
  def list(params: ParamsResourceAdvertisersCampaignsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersCampaignsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCampaign] = js.native
  def patch(callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def patch(params: ParamsResourceAdvertisersCampaignsPatch): GaxiosPromise[SchemaCampaign] = js.native
  def patch(params: ParamsResourceAdvertisersCampaignsPatch, callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def patch(
    params: ParamsResourceAdvertisersCampaignsPatch,
    options: BodyResponseCallback[Readable | SchemaCampaign],
    callback: BodyResponseCallback[Readable | SchemaCampaign]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertisersCampaignsPatch, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def patch(
    params: ParamsResourceAdvertisersCampaignsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  /**
    * Updates an existing campaign. Returns the updated campaign if successful.
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/display-video',
    *       'https://www.googleapis.com/auth/display-video-mediaplanning',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.campaigns.patch({
    *     // Output only. The unique ID of the advertiser the campaign belongs to.
    *     advertiserId: '[^/]+',
    *     // Output only. The unique ID of the campaign. Assigned by the system.
    *     campaignId: '[^/]+',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "campaignBudgets": [],
    *       //   "campaignFlight": {},
    *       //   "campaignGoal": {},
    *       //   "campaignId": "my_campaignId",
    *       //   "displayName": "my_displayName",
    *       //   "entityStatus": "my_entityStatus",
    *       //   "frequencyCap": {},
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "campaignBudgets": [],
    *   //   "campaignFlight": {},
    *   //   "campaignGoal": {},
    *   //   "campaignId": "my_campaignId",
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "frequencyCap": {},
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceAdvertisersCampaignsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdvertisersCampaignsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var targetingTypes: ResourceAdvertisersCampaignsTargetingtypes = js.native
}
