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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Insertionorders")
@js.native
open class ResourceAdvertisersInsertionorders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def bulkListInsertionOrderAssignedTargetingOptions(): GaxiosPromise[SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse] = js.native
  def bulkListInsertionOrderAssignedTargetingOptions(callback: BodyResponseCallback[SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse]): Unit = js.native
  def bulkListInsertionOrderAssignedTargetingOptions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse] = js.native
  def bulkListInsertionOrderAssignedTargetingOptions(params: ParamsResourceAdvertisersInsertionordersBulklistinsertionorderassignedtargetingoptions): GaxiosPromise[SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse] = js.native
  def bulkListInsertionOrderAssignedTargetingOptions(
    params: ParamsResourceAdvertisersInsertionordersBulklistinsertionorderassignedtargetingoptions,
    callback: BodyResponseCallback[SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkListInsertionOrderAssignedTargetingOptions(
    params: ParamsResourceAdvertisersInsertionordersBulklistinsertionorderassignedtargetingoptions,
    options: BodyResponseCallback[Readable | SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkListInsertionOrderAssignedTargetingOptions(
    params: ParamsResourceAdvertisersInsertionordersBulklistinsertionorderassignedtargetingoptions,
    options: MethodOptions
  ): GaxiosPromise[SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse] = js.native
  def bulkListInsertionOrderAssignedTargetingOptions(
    params: ParamsResourceAdvertisersInsertionordersBulklistinsertionorderassignedtargetingoptions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse]
  ): Unit = js.native
  /**
    * Lists assigned targeting options of an insertion order across targeting types.
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
    *     await displayvideo.advertisers.insertionOrders.bulkListInsertionOrderAssignedTargetingOptions(
    *       {
    *         // Required. The ID of the advertiser the insertion order belongs to.
    *         advertiserId: '[^/]+',
    *         // Allows filtering by assigned targeting option properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR` on the same field. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `targetingType` - `inheritance` Examples: * AssignedTargetingOptions of targeting type TARGETING_TYPE_PROXIMITY_LOCATION_LIST or TARGETING_TYPE_CHANNEL `targetingType="TARGETING_TYPE_PROXIMITY_LOCATION_LIST" OR targetingType="TARGETING_TYPE_CHANNEL"` * AssignedTargetingOptions with inheritance status of NOT_INHERITED or INHERITED_FROM_PARTNER `inheritance="NOT_INHERITED" OR inheritance="INHERITED_FROM_PARTNER"` The length of this field should be no more than 500 characters.
    *         filter: 'placeholder-value',
    *         // Required. The ID of the insertion order to list assigned targeting options for.
    *         insertionOrderId: '[^/]+',
    *         // Field by which to sort the list. Acceptable values are: * `targetingType` (default) The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `targetingType desc`.
    *         orderBy: 'placeholder-value',
    *         // Requested page size. The size must be an integer between `1` and `5000`. If unspecified, the default is `5000`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *         pageSize: 'placeholder-value',
    *         // A token that lets the client fetch the next page of results. Typically, this is the value of next_page_token returned from the previous call to `BulkListInsertionOrderAssignedTargetingOptions` method. If not specified, the first page of results will be returned.
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
  def bulkListInsertionOrderAssignedTargetingOptions(
    params: ParamsResourceAdvertisersInsertionordersBulklistinsertionorderassignedtargetingoptions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def bulkListInsertionOrderAssignedTargetingOptions(
    params: ParamsResourceAdvertisersInsertionordersBulklistinsertionorderassignedtargetingoptions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaInsertionOrder] = js.native
  def create(callback: BodyResponseCallback[SchemaInsertionOrder]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInsertionOrder] = js.native
  def create(params: ParamsResourceAdvertisersInsertionordersCreate): GaxiosPromise[SchemaInsertionOrder] = js.native
  def create(
    params: ParamsResourceAdvertisersInsertionordersCreate,
    callback: BodyResponseCallback[SchemaInsertionOrder]
  ): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersInsertionordersCreate,
    options: BodyResponseCallback[Readable | SchemaInsertionOrder],
    callback: BodyResponseCallback[Readable | SchemaInsertionOrder]
  ): Unit = js.native
  def create(params: ParamsResourceAdvertisersInsertionordersCreate, options: MethodOptions): GaxiosPromise[SchemaInsertionOrder] = js.native
  def create(
    params: ParamsResourceAdvertisersInsertionordersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInsertionOrder]
  ): Unit = js.native
  /**
    * Creates a new insertion order. Returns the newly created insertion order if successful.
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
    *   const res = await displayvideo.advertisers.insertionOrders.create({
    *     // Output only. The unique ID of the advertiser the insertion order belongs to.
    *     advertiserId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "bidStrategy": {},
    *       //   "billableOutcome": "my_billableOutcome",
    *       //   "budget": {},
    *       //   "campaignId": "my_campaignId",
    *       //   "displayName": "my_displayName",
    *       //   "entityStatus": "my_entityStatus",
    *       //   "frequencyCap": {},
    *       //   "insertionOrderId": "my_insertionOrderId",
    *       //   "insertionOrderType": "my_insertionOrderType",
    *       //   "integrationDetails": {},
    *       //   "name": "my_name",
    *       //   "pacing": {},
    *       //   "partnerCosts": [],
    *       //   "performanceGoal": {},
    *       //   "reservationType": "my_reservationType",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "bidStrategy": {},
    *   //   "billableOutcome": "my_billableOutcome",
    *   //   "budget": {},
    *   //   "campaignId": "my_campaignId",
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "frequencyCap": {},
    *   //   "insertionOrderId": "my_insertionOrderId",
    *   //   "insertionOrderType": "my_insertionOrderType",
    *   //   "integrationDetails": {},
    *   //   "name": "my_name",
    *   //   "pacing": {},
    *   //   "partnerCosts": [],
    *   //   "performanceGoal": {},
    *   //   "reservationType": "my_reservationType",
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
  def create(params: ParamsResourceAdvertisersInsertionordersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersInsertionordersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersInsertionordersDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersInsertionordersDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisersInsertionordersDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAdvertisersInsertionordersDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersInsertionordersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an insertion order. Returns error code `NOT_FOUND` if the insertion order does not exist. The insertion order should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, to be able to delete it.
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
    *   const res = await displayvideo.advertisers.insertionOrders.delete({
    *     // The ID of the advertiser this insertion order belongs to.
    *     advertiserId: '[^/]+',
    *     // The ID of the insertion order to delete.
    *     insertionOrderId: '[^/]+',
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
  def delete(params: ParamsResourceAdvertisersInsertionordersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdvertisersInsertionordersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaInsertionOrder] = js.native
  def get(callback: BodyResponseCallback[SchemaInsertionOrder]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInsertionOrder] = js.native
  def get(params: ParamsResourceAdvertisersInsertionordersGet): GaxiosPromise[SchemaInsertionOrder] = js.native
  def get(
    params: ParamsResourceAdvertisersInsertionordersGet,
    callback: BodyResponseCallback[SchemaInsertionOrder]
  ): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersInsertionordersGet,
    options: BodyResponseCallback[Readable | SchemaInsertionOrder],
    callback: BodyResponseCallback[Readable | SchemaInsertionOrder]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertisersInsertionordersGet, options: MethodOptions): GaxiosPromise[SchemaInsertionOrder] = js.native
  def get(
    params: ParamsResourceAdvertisersInsertionordersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInsertionOrder]
  ): Unit = js.native
  /**
    * Gets an insertion order. Returns error code `NOT_FOUND` if the insertion order does not exist.
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
    *   const res = await displayvideo.advertisers.insertionOrders.get({
    *     // Required. The ID of the advertiser this insertion order belongs to.
    *     advertiserId: '[^/]+',
    *     // Required. The ID of the insertion order to fetch.
    *     insertionOrderId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "bidStrategy": {},
    *   //   "billableOutcome": "my_billableOutcome",
    *   //   "budget": {},
    *   //   "campaignId": "my_campaignId",
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "frequencyCap": {},
    *   //   "insertionOrderId": "my_insertionOrderId",
    *   //   "insertionOrderType": "my_insertionOrderType",
    *   //   "integrationDetails": {},
    *   //   "name": "my_name",
    *   //   "pacing": {},
    *   //   "partnerCosts": [],
    *   //   "performanceGoal": {},
    *   //   "reservationType": "my_reservationType",
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
  def get(params: ParamsResourceAdvertisersInsertionordersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertisersInsertionordersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListInsertionOrdersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInsertionOrdersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListInsertionOrdersResponse] = js.native
  def list(params: ParamsResourceAdvertisersInsertionordersList): GaxiosPromise[SchemaListInsertionOrdersResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersInsertionordersList,
    callback: BodyResponseCallback[SchemaListInsertionOrdersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersInsertionordersList,
    options: BodyResponseCallback[Readable | SchemaListInsertionOrdersResponse],
    callback: BodyResponseCallback[Readable | SchemaListInsertionOrdersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersInsertionordersList, options: MethodOptions): GaxiosPromise[SchemaListInsertionOrdersResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersInsertionordersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInsertionOrdersResponse]
  ): Unit = js.native
  /**
    * Lists insertion orders in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, insertion orders with `ENTITY_STATUS_ARCHIVED` will not be included in the results.
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
    *   const res = await displayvideo.advertisers.insertionOrders.list({
    *     // Required. The ID of the advertiser to list insertion orders for.
    *     advertiserId: '[^/]+',
    *     // Allows filtering by insertion order properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator used on `budget.budget_segments.date_range.end_date` must be LESS THAN (<). * The operator used on `updateTime` must be `GREATER THAN OR EQUAL TO (\>=)` or `LESS THAN OR EQUAL TO (<=)`. * The operators used on all other fields must be `EQUALS (=)`. * Supported fields: - `campaignId` - `displayName` - `entityStatus` - `budget.budget_segments.date_range.end_date` (input as YYYY-MM-DD) - `updateTime` (input in ISO 8601 format, or YYYY-MM-DDTHH:MM:SSZ) Examples: * All insertion orders under a campaign: `campaignId="1234"` * All `ENTITY_STATUS_ACTIVE` or `ENTITY_STATUS_PAUSED` insertion orders under an advertiser: `(entityStatus="ENTITY_STATUS_ACTIVE" OR entityStatus="ENTITY_STATUS_PAUSED")` * All insertion orders whose budget segments' dates end before March 28, 2019: `budget.budget_segments.date_range.end_date<"2019-03-28"` * All insertion orders with an update time less than or equal to `2020-11-04T18:54:47Z (format of ISO 8601)`: `updateTime<="2020-11-04T18:54:47Z"` * All insertion orders with an update time greater than or equal to `2020-11-04T18:54:47Z (format of ISO 8601)`: `updateTime\>="2020-11-04T18:54:47Z"` The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * "displayName" (default) * "entityStatus" * "updateTime" The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListInsertionOrders` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "insertionOrders": [],
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
  def list(params: ParamsResourceAdvertisersInsertionordersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersInsertionordersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaInsertionOrder] = js.native
  def patch(callback: BodyResponseCallback[SchemaInsertionOrder]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInsertionOrder] = js.native
  def patch(params: ParamsResourceAdvertisersInsertionordersPatch): GaxiosPromise[SchemaInsertionOrder] = js.native
  def patch(
    params: ParamsResourceAdvertisersInsertionordersPatch,
    callback: BodyResponseCallback[SchemaInsertionOrder]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAdvertisersInsertionordersPatch,
    options: BodyResponseCallback[Readable | SchemaInsertionOrder],
    callback: BodyResponseCallback[Readable | SchemaInsertionOrder]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertisersInsertionordersPatch, options: MethodOptions): GaxiosPromise[SchemaInsertionOrder] = js.native
  def patch(
    params: ParamsResourceAdvertisersInsertionordersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInsertionOrder]
  ): Unit = js.native
  /**
    * Updates an existing insertion order. Returns the updated insertion order if successful.
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
    *   const res = await displayvideo.advertisers.insertionOrders.patch({
    *     // Output only. The unique ID of the advertiser the insertion order belongs to.
    *     advertiserId: '[^/]+',
    *     // Output only. The unique ID of the insertion order. Assigned by the system.
    *     insertionOrderId: '[^/]+',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "bidStrategy": {},
    *       //   "billableOutcome": "my_billableOutcome",
    *       //   "budget": {},
    *       //   "campaignId": "my_campaignId",
    *       //   "displayName": "my_displayName",
    *       //   "entityStatus": "my_entityStatus",
    *       //   "frequencyCap": {},
    *       //   "insertionOrderId": "my_insertionOrderId",
    *       //   "insertionOrderType": "my_insertionOrderType",
    *       //   "integrationDetails": {},
    *       //   "name": "my_name",
    *       //   "pacing": {},
    *       //   "partnerCosts": [],
    *       //   "performanceGoal": {},
    *       //   "reservationType": "my_reservationType",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "bidStrategy": {},
    *   //   "billableOutcome": "my_billableOutcome",
    *   //   "budget": {},
    *   //   "campaignId": "my_campaignId",
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "frequencyCap": {},
    *   //   "insertionOrderId": "my_insertionOrderId",
    *   //   "insertionOrderType": "my_insertionOrderType",
    *   //   "integrationDetails": {},
    *   //   "name": "my_name",
    *   //   "pacing": {},
    *   //   "partnerCosts": [],
    *   //   "performanceGoal": {},
    *   //   "reservationType": "my_reservationType",
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
  def patch(params: ParamsResourceAdvertisersInsertionordersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdvertisersInsertionordersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var targetingTypes: ResourceAdvertisersInsertionordersTargetingtypes = js.native
}
