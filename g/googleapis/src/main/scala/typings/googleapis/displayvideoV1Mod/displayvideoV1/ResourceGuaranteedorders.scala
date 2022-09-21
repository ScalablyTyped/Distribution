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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Guaranteedorders")
@js.native
open class ResourceGuaranteedorders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGuaranteedOrder] = js.native
  def create(callback: BodyResponseCallback[SchemaGuaranteedOrder]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGuaranteedOrder] = js.native
  def create(params: ParamsResourceGuaranteedordersCreate): GaxiosPromise[SchemaGuaranteedOrder] = js.native
  def create(
    params: ParamsResourceGuaranteedordersCreate,
    callback: BodyResponseCallback[SchemaGuaranteedOrder]
  ): Unit = js.native
  def create(
    params: ParamsResourceGuaranteedordersCreate,
    options: BodyResponseCallback[Readable | SchemaGuaranteedOrder],
    callback: BodyResponseCallback[Readable | SchemaGuaranteedOrder]
  ): Unit = js.native
  def create(params: ParamsResourceGuaranteedordersCreate, options: MethodOptions): GaxiosPromise[SchemaGuaranteedOrder] = js.native
  def create(
    params: ParamsResourceGuaranteedordersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGuaranteedOrder]
  ): Unit = js.native
  /**
    * Creates a new guaranteed order. Returns the newly created guaranteed order if successful.
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
    *   const res = await displayvideo.guaranteedOrders.create({
    *     // The ID of the advertiser that the request is being made within.
    *     advertiserId: 'placeholder-value',
    *     // The ID of the partner that the request is being made within.
    *     partnerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "defaultAdvertiserId": "my_defaultAdvertiserId",
    *       //   "defaultCampaignId": "my_defaultCampaignId",
    *       //   "displayName": "my_displayName",
    *       //   "exchange": "my_exchange",
    *       //   "guaranteedOrderId": "my_guaranteedOrderId",
    *       //   "legacyGuaranteedOrderId": "my_legacyGuaranteedOrderId",
    *       //   "name": "my_name",
    *       //   "publisherName": "my_publisherName",
    *       //   "readAccessInherited": false,
    *       //   "readAdvertiserIds": [],
    *       //   "readWriteAdvertiserId": "my_readWriteAdvertiserId",
    *       //   "readWritePartnerId": "my_readWritePartnerId",
    *       //   "status": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultAdvertiserId": "my_defaultAdvertiserId",
    *   //   "defaultCampaignId": "my_defaultCampaignId",
    *   //   "displayName": "my_displayName",
    *   //   "exchange": "my_exchange",
    *   //   "guaranteedOrderId": "my_guaranteedOrderId",
    *   //   "legacyGuaranteedOrderId": "my_legacyGuaranteedOrderId",
    *   //   "name": "my_name",
    *   //   "publisherName": "my_publisherName",
    *   //   "readAccessInherited": false,
    *   //   "readAdvertiserIds": [],
    *   //   "readWriteAdvertiserId": "my_readWriteAdvertiserId",
    *   //   "readWritePartnerId": "my_readWritePartnerId",
    *   //   "status": {},
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
  def create(params: ParamsResourceGuaranteedordersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceGuaranteedordersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def editGuaranteedOrderReadAccessors(): GaxiosPromise[SchemaEditGuaranteedOrderReadAccessorsResponse] = js.native
  def editGuaranteedOrderReadAccessors(callback: BodyResponseCallback[SchemaEditGuaranteedOrderReadAccessorsResponse]): Unit = js.native
  def editGuaranteedOrderReadAccessors(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEditGuaranteedOrderReadAccessorsResponse] = js.native
  def editGuaranteedOrderReadAccessors(params: ParamsResourceGuaranteedordersEditguaranteedorderreadaccessors): GaxiosPromise[SchemaEditGuaranteedOrderReadAccessorsResponse] = js.native
  def editGuaranteedOrderReadAccessors(
    params: ParamsResourceGuaranteedordersEditguaranteedorderreadaccessors,
    callback: BodyResponseCallback[SchemaEditGuaranteedOrderReadAccessorsResponse]
  ): Unit = js.native
  def editGuaranteedOrderReadAccessors(
    params: ParamsResourceGuaranteedordersEditguaranteedorderreadaccessors,
    options: BodyResponseCallback[Readable | SchemaEditGuaranteedOrderReadAccessorsResponse],
    callback: BodyResponseCallback[Readable | SchemaEditGuaranteedOrderReadAccessorsResponse]
  ): Unit = js.native
  def editGuaranteedOrderReadAccessors(params: ParamsResourceGuaranteedordersEditguaranteedorderreadaccessors, options: MethodOptions): GaxiosPromise[SchemaEditGuaranteedOrderReadAccessorsResponse] = js.native
  def editGuaranteedOrderReadAccessors(
    params: ParamsResourceGuaranteedordersEditguaranteedorderreadaccessors,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEditGuaranteedOrderReadAccessorsResponse]
  ): Unit = js.native
  /**
    * Edits read advertisers of a guaranteed order.
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
    *     await displayvideo.guaranteedOrders.editGuaranteedOrderReadAccessors({
    *       // Required. The ID of the guaranteed order to edit. The ID is of the format `{exchange\}-{legacy_guaranteed_order_id\}`
    *       guaranteedOrderId: '[^/]+',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "addedAdvertisers": [],
    *         //   "partnerId": "my_partnerId",
    *         //   "readAccessInherited": false,
    *         //   "removedAdvertisers": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "readAccessInherited": false,
    *   //   "readAdvertiserIds": []
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
  def editGuaranteedOrderReadAccessors(
    params: ParamsResourceGuaranteedordersEditguaranteedorderreadaccessors,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def editGuaranteedOrderReadAccessors(
    params: ParamsResourceGuaranteedordersEditguaranteedorderreadaccessors,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGuaranteedOrder] = js.native
  def get(callback: BodyResponseCallback[SchemaGuaranteedOrder]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGuaranteedOrder] = js.native
  def get(params: ParamsResourceGuaranteedordersGet): GaxiosPromise[SchemaGuaranteedOrder] = js.native
  def get(params: ParamsResourceGuaranteedordersGet, callback: BodyResponseCallback[SchemaGuaranteedOrder]): Unit = js.native
  def get(
    params: ParamsResourceGuaranteedordersGet,
    options: BodyResponseCallback[Readable | SchemaGuaranteedOrder],
    callback: BodyResponseCallback[Readable | SchemaGuaranteedOrder]
  ): Unit = js.native
  def get(params: ParamsResourceGuaranteedordersGet, options: MethodOptions): GaxiosPromise[SchemaGuaranteedOrder] = js.native
  def get(
    params: ParamsResourceGuaranteedordersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGuaranteedOrder]
  ): Unit = js.native
  /**
    * Gets a guaranteed order.
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
    *   const res = await displayvideo.guaranteedOrders.get({
    *     // The ID of the advertiser that has access to the guaranteed order.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the guaranteed order to fetch. The ID is of the format `{exchange\}-{legacy_guaranteed_order_id\}`
    *     guaranteedOrderId: '[^/]+',
    *     // The ID of the partner that has access to the guaranteed order.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultAdvertiserId": "my_defaultAdvertiserId",
    *   //   "defaultCampaignId": "my_defaultCampaignId",
    *   //   "displayName": "my_displayName",
    *   //   "exchange": "my_exchange",
    *   //   "guaranteedOrderId": "my_guaranteedOrderId",
    *   //   "legacyGuaranteedOrderId": "my_legacyGuaranteedOrderId",
    *   //   "name": "my_name",
    *   //   "publisherName": "my_publisherName",
    *   //   "readAccessInherited": false,
    *   //   "readAdvertiserIds": [],
    *   //   "readWriteAdvertiserId": "my_readWriteAdvertiserId",
    *   //   "readWritePartnerId": "my_readWritePartnerId",
    *   //   "status": {},
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
  def get(params: ParamsResourceGuaranteedordersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceGuaranteedordersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListGuaranteedOrdersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGuaranteedOrdersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListGuaranteedOrdersResponse] = js.native
  def list(params: ParamsResourceGuaranteedordersList): GaxiosPromise[SchemaListGuaranteedOrdersResponse] = js.native
  def list(
    params: ParamsResourceGuaranteedordersList,
    callback: BodyResponseCallback[SchemaListGuaranteedOrdersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceGuaranteedordersList,
    options: BodyResponseCallback[Readable | SchemaListGuaranteedOrdersResponse],
    callback: BodyResponseCallback[Readable | SchemaListGuaranteedOrdersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGuaranteedordersList, options: MethodOptions): GaxiosPromise[SchemaListGuaranteedOrdersResponse] = js.native
  def list(
    params: ParamsResourceGuaranteedordersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGuaranteedOrdersResponse]
  ): Unit = js.native
  /**
    * Lists guaranteed orders that are accessible to the current user. The order is defined by the order_by parameter. If a filter by entity_status is not specified, guaranteed orders with entity status `ENTITY_STATUS_ARCHIVED` will not be included in the results.
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
    *   const res = await displayvideo.guaranteedOrders.list({
    *     // The ID of the advertiser that has access to the guaranteed order.
    *     advertiserId: 'placeholder-value',
    *     // Allows filtering by guaranteed order properties. * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `guaranteed_order_id` - `exchange` - `display_name` - `status.entityStatus` Examples: * All active guaranteed orders: `status.entityStatus="ENTITY_STATUS_ACTIVE"` * Guaranteed orders belonging to Google Ad Manager or Rubicon exchanges: `exchange="EXCHANGE_GOOGLE_AD_MANAGER" OR exchange="EXCHANGE_RUBICON"` The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `displayName` (default) The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. For example, `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified or greater than `100` will default to `100`.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListGuaranteedOrders` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *     // The ID of the partner that has access to the guaranteed order.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "guaranteedOrders": [],
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
  def list(params: ParamsResourceGuaranteedordersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceGuaranteedordersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGuaranteedOrder] = js.native
  def patch(callback: BodyResponseCallback[SchemaGuaranteedOrder]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGuaranteedOrder] = js.native
  def patch(params: ParamsResourceGuaranteedordersPatch): GaxiosPromise[SchemaGuaranteedOrder] = js.native
  def patch(params: ParamsResourceGuaranteedordersPatch, callback: BodyResponseCallback[SchemaGuaranteedOrder]): Unit = js.native
  def patch(
    params: ParamsResourceGuaranteedordersPatch,
    options: BodyResponseCallback[Readable | SchemaGuaranteedOrder],
    callback: BodyResponseCallback[Readable | SchemaGuaranteedOrder]
  ): Unit = js.native
  def patch(params: ParamsResourceGuaranteedordersPatch, options: MethodOptions): GaxiosPromise[SchemaGuaranteedOrder] = js.native
  def patch(
    params: ParamsResourceGuaranteedordersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGuaranteedOrder]
  ): Unit = js.native
  /**
    * Updates an existing guaranteed order. Returns the updated guaranteed order if successful.
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
    *   const res = await displayvideo.guaranteedOrders.patch({
    *     // The ID of the advertiser that the request is being made within.
    *     advertiserId: 'placeholder-value',
    *     // Output only. The unique identifier of the guaranteed order. The guaranteed order IDs have the format `{exchange\}-{legacy_guaranteed_order_id\}`.
    *     guaranteedOrderId: '[^/]+',
    *     // The ID of the partner that the request is being made within.
    *     partnerId: 'placeholder-value',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "defaultAdvertiserId": "my_defaultAdvertiserId",
    *       //   "defaultCampaignId": "my_defaultCampaignId",
    *       //   "displayName": "my_displayName",
    *       //   "exchange": "my_exchange",
    *       //   "guaranteedOrderId": "my_guaranteedOrderId",
    *       //   "legacyGuaranteedOrderId": "my_legacyGuaranteedOrderId",
    *       //   "name": "my_name",
    *       //   "publisherName": "my_publisherName",
    *       //   "readAccessInherited": false,
    *       //   "readAdvertiserIds": [],
    *       //   "readWriteAdvertiserId": "my_readWriteAdvertiserId",
    *       //   "readWritePartnerId": "my_readWritePartnerId",
    *       //   "status": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultAdvertiserId": "my_defaultAdvertiserId",
    *   //   "defaultCampaignId": "my_defaultCampaignId",
    *   //   "displayName": "my_displayName",
    *   //   "exchange": "my_exchange",
    *   //   "guaranteedOrderId": "my_guaranteedOrderId",
    *   //   "legacyGuaranteedOrderId": "my_legacyGuaranteedOrderId",
    *   //   "name": "my_name",
    *   //   "publisherName": "my_publisherName",
    *   //   "readAccessInherited": false,
    *   //   "readAdvertiserIds": [],
    *   //   "readWriteAdvertiserId": "my_readWriteAdvertiserId",
    *   //   "readWritePartnerId": "my_readWritePartnerId",
    *   //   "status": {},
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
  def patch(params: ParamsResourceGuaranteedordersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceGuaranteedordersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
