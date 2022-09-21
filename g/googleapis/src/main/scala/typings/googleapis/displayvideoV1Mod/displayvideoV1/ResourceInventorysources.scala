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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Inventorysources")
@js.native
open class ResourceInventorysources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaInventorySource] = js.native
  def create(callback: BodyResponseCallback[SchemaInventorySource]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInventorySource] = js.native
  def create(params: ParamsResourceInventorysourcesCreate): GaxiosPromise[SchemaInventorySource] = js.native
  def create(
    params: ParamsResourceInventorysourcesCreate,
    callback: BodyResponseCallback[SchemaInventorySource]
  ): Unit = js.native
  def create(
    params: ParamsResourceInventorysourcesCreate,
    options: BodyResponseCallback[Readable | SchemaInventorySource],
    callback: BodyResponseCallback[Readable | SchemaInventorySource]
  ): Unit = js.native
  def create(params: ParamsResourceInventorysourcesCreate, options: MethodOptions): GaxiosPromise[SchemaInventorySource] = js.native
  def create(
    params: ParamsResourceInventorysourcesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventorySource]
  ): Unit = js.native
  /**
    * Creates a new inventory source. Returns the newly created inventory source if successful.
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
    *   const res = await displayvideo.inventorySources.create({
    *     // The ID of the advertiser that the request is being made within.
    *     advertiserId: 'placeholder-value',
    *     // The ID of the partner that the request is being made within.
    *     partnerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "commitment": "my_commitment",
    *       //   "creativeConfigs": [],
    *       //   "dealId": "my_dealId",
    *       //   "deliveryMethod": "my_deliveryMethod",
    *       //   "displayName": "my_displayName",
    *       //   "exchange": "my_exchange",
    *       //   "guaranteedOrderId": "my_guaranteedOrderId",
    *       //   "inventorySourceId": "my_inventorySourceId",
    *       //   "inventorySourceProductType": "my_inventorySourceProductType",
    *       //   "inventorySourceType": "my_inventorySourceType",
    *       //   "name": "my_name",
    *       //   "publisherName": "my_publisherName",
    *       //   "rateDetails": {},
    *       //   "readAdvertiserIds": [],
    *       //   "readPartnerIds": [],
    *       //   "readWriteAccessors": {},
    *       //   "status": {},
    *       //   "subSitePropertyId": "my_subSitePropertyId",
    *       //   "timeRange": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commitment": "my_commitment",
    *   //   "creativeConfigs": [],
    *   //   "dealId": "my_dealId",
    *   //   "deliveryMethod": "my_deliveryMethod",
    *   //   "displayName": "my_displayName",
    *   //   "exchange": "my_exchange",
    *   //   "guaranteedOrderId": "my_guaranteedOrderId",
    *   //   "inventorySourceId": "my_inventorySourceId",
    *   //   "inventorySourceProductType": "my_inventorySourceProductType",
    *   //   "inventorySourceType": "my_inventorySourceType",
    *   //   "name": "my_name",
    *   //   "publisherName": "my_publisherName",
    *   //   "rateDetails": {},
    *   //   "readAdvertiserIds": [],
    *   //   "readPartnerIds": [],
    *   //   "readWriteAccessors": {},
    *   //   "status": {},
    *   //   "subSitePropertyId": "my_subSitePropertyId",
    *   //   "timeRange": {},
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
  def create(params: ParamsResourceInventorysourcesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceInventorysourcesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def editInventorySourceReadWriteAccessors(): GaxiosPromise[SchemaInventorySourceAccessors] = js.native
  def editInventorySourceReadWriteAccessors(callback: BodyResponseCallback[SchemaInventorySourceAccessors]): Unit = js.native
  def editInventorySourceReadWriteAccessors(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInventorySourceAccessors] = js.native
  def editInventorySourceReadWriteAccessors(params: ParamsResourceInventorysourcesEditinventorysourcereadwriteaccessors): GaxiosPromise[SchemaInventorySourceAccessors] = js.native
  def editInventorySourceReadWriteAccessors(
    params: ParamsResourceInventorysourcesEditinventorysourcereadwriteaccessors,
    callback: BodyResponseCallback[SchemaInventorySourceAccessors]
  ): Unit = js.native
  def editInventorySourceReadWriteAccessors(
    params: ParamsResourceInventorysourcesEditinventorysourcereadwriteaccessors,
    options: BodyResponseCallback[Readable | SchemaInventorySourceAccessors],
    callback: BodyResponseCallback[Readable | SchemaInventorySourceAccessors]
  ): Unit = js.native
  def editInventorySourceReadWriteAccessors(
    params: ParamsResourceInventorysourcesEditinventorysourcereadwriteaccessors,
    options: MethodOptions
  ): GaxiosPromise[SchemaInventorySourceAccessors] = js.native
  def editInventorySourceReadWriteAccessors(
    params: ParamsResourceInventorysourcesEditinventorysourcereadwriteaccessors,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventorySourceAccessors]
  ): Unit = js.native
  /**
    * Edits read/write accessors of an inventory source. Returns the updated read_write_accessors for the inventory source.
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
    *     await displayvideo.inventorySources.editInventorySourceReadWriteAccessors({
    *       // Required. The ID of inventory source to update.
    *       inventorySourceId: '[^/]+',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "advertisersUpdate": {},
    *         //   "assignPartner": false,
    *         //   "partnerId": "my_partnerId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertisers": {},
    *   //   "partner": {}
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
  def editInventorySourceReadWriteAccessors(
    params: ParamsResourceInventorysourcesEditinventorysourcereadwriteaccessors,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def editInventorySourceReadWriteAccessors(
    params: ParamsResourceInventorysourcesEditinventorysourcereadwriteaccessors,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaInventorySource] = js.native
  def get(callback: BodyResponseCallback[SchemaInventorySource]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInventorySource] = js.native
  def get(params: ParamsResourceInventorysourcesGet): GaxiosPromise[SchemaInventorySource] = js.native
  def get(params: ParamsResourceInventorysourcesGet, callback: BodyResponseCallback[SchemaInventorySource]): Unit = js.native
  def get(
    params: ParamsResourceInventorysourcesGet,
    options: BodyResponseCallback[Readable | SchemaInventorySource],
    callback: BodyResponseCallback[Readable | SchemaInventorySource]
  ): Unit = js.native
  def get(params: ParamsResourceInventorysourcesGet, options: MethodOptions): GaxiosPromise[SchemaInventorySource] = js.native
  def get(
    params: ParamsResourceInventorysourcesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventorySource]
  ): Unit = js.native
  /**
    * Gets an inventory source.
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
    *   const res = await displayvideo.inventorySources.get({
    *     // Required. The ID of the inventory source to fetch.
    *     inventorySourceId: '[^/]+',
    *     // Required. The ID of the DV360 partner to which the fetched inventory source is permissioned.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commitment": "my_commitment",
    *   //   "creativeConfigs": [],
    *   //   "dealId": "my_dealId",
    *   //   "deliveryMethod": "my_deliveryMethod",
    *   //   "displayName": "my_displayName",
    *   //   "exchange": "my_exchange",
    *   //   "guaranteedOrderId": "my_guaranteedOrderId",
    *   //   "inventorySourceId": "my_inventorySourceId",
    *   //   "inventorySourceProductType": "my_inventorySourceProductType",
    *   //   "inventorySourceType": "my_inventorySourceType",
    *   //   "name": "my_name",
    *   //   "publisherName": "my_publisherName",
    *   //   "rateDetails": {},
    *   //   "readAdvertiserIds": [],
    *   //   "readPartnerIds": [],
    *   //   "readWriteAccessors": {},
    *   //   "status": {},
    *   //   "subSitePropertyId": "my_subSitePropertyId",
    *   //   "timeRange": {},
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
  def get(params: ParamsResourceInventorysourcesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceInventorysourcesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListInventorySourcesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInventorySourcesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListInventorySourcesResponse] = js.native
  def list(params: ParamsResourceInventorysourcesList): GaxiosPromise[SchemaListInventorySourcesResponse] = js.native
  def list(
    params: ParamsResourceInventorysourcesList,
    callback: BodyResponseCallback[SchemaListInventorySourcesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceInventorysourcesList,
    options: BodyResponseCallback[Readable | SchemaListInventorySourcesResponse],
    callback: BodyResponseCallback[Readable | SchemaListInventorySourcesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceInventorysourcesList, options: MethodOptions): GaxiosPromise[SchemaListInventorySourcesResponse] = js.native
  def list(
    params: ParamsResourceInventorysourcesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInventorySourcesResponse]
  ): Unit = js.native
  /**
    * Lists inventory sources that are accessible to the current user. The order is defined by the order_by parameter. If a filter by entity_status is not specified, inventory sources with entity status `ENTITY_STATUS_ARCHIVED` will not be included in the results.
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
    *   const res = await displayvideo.inventorySources.list({
    *     // The ID of the advertiser that has access to the inventory source.
    *     advertiserId: 'placeholder-value',
    *     // Allows filtering by inventory source properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `status.entityStatus` - `commitment` - `deliveryMethod` - `rateDetails.rateType` - `exchange` Examples: * All active inventory sources: `status.entityStatus="ENTITY_STATUS_ACTIVE"` * Inventory sources belonging to Google Ad Manager or Rubicon exchanges: `exchange="EXCHANGE_GOOGLE_AD_MANAGER" OR exchange="EXCHANGE_RUBICON"` The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `displayName` (default) The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. For example, `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListInventorySources` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *     // The ID of the partner that has access to the inventory source.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "inventorySources": [],
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
  def list(params: ParamsResourceInventorysourcesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceInventorysourcesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaInventorySource] = js.native
  def patch(callback: BodyResponseCallback[SchemaInventorySource]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInventorySource] = js.native
  def patch(params: ParamsResourceInventorysourcesPatch): GaxiosPromise[SchemaInventorySource] = js.native
  def patch(params: ParamsResourceInventorysourcesPatch, callback: BodyResponseCallback[SchemaInventorySource]): Unit = js.native
  def patch(
    params: ParamsResourceInventorysourcesPatch,
    options: BodyResponseCallback[Readable | SchemaInventorySource],
    callback: BodyResponseCallback[Readable | SchemaInventorySource]
  ): Unit = js.native
  def patch(params: ParamsResourceInventorysourcesPatch, options: MethodOptions): GaxiosPromise[SchemaInventorySource] = js.native
  def patch(
    params: ParamsResourceInventorysourcesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventorySource]
  ): Unit = js.native
  /**
    * Updates an existing inventory source. Returns the updated inventory source if successful.
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
    *   const res = await displayvideo.inventorySources.patch({
    *     // The ID of the advertiser that the request is being made within.
    *     advertiserId: 'placeholder-value',
    *     // Output only. The unique ID of the inventory source. Assigned by the system.
    *     inventorySourceId: '[^/]+',
    *     // The ID of the partner that the request is being made within.
    *     partnerId: 'placeholder-value',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "commitment": "my_commitment",
    *       //   "creativeConfigs": [],
    *       //   "dealId": "my_dealId",
    *       //   "deliveryMethod": "my_deliveryMethod",
    *       //   "displayName": "my_displayName",
    *       //   "exchange": "my_exchange",
    *       //   "guaranteedOrderId": "my_guaranteedOrderId",
    *       //   "inventorySourceId": "my_inventorySourceId",
    *       //   "inventorySourceProductType": "my_inventorySourceProductType",
    *       //   "inventorySourceType": "my_inventorySourceType",
    *       //   "name": "my_name",
    *       //   "publisherName": "my_publisherName",
    *       //   "rateDetails": {},
    *       //   "readAdvertiserIds": [],
    *       //   "readPartnerIds": [],
    *       //   "readWriteAccessors": {},
    *       //   "status": {},
    *       //   "subSitePropertyId": "my_subSitePropertyId",
    *       //   "timeRange": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commitment": "my_commitment",
    *   //   "creativeConfigs": [],
    *   //   "dealId": "my_dealId",
    *   //   "deliveryMethod": "my_deliveryMethod",
    *   //   "displayName": "my_displayName",
    *   //   "exchange": "my_exchange",
    *   //   "guaranteedOrderId": "my_guaranteedOrderId",
    *   //   "inventorySourceId": "my_inventorySourceId",
    *   //   "inventorySourceProductType": "my_inventorySourceProductType",
    *   //   "inventorySourceType": "my_inventorySourceType",
    *   //   "name": "my_name",
    *   //   "publisherName": "my_publisherName",
    *   //   "rateDetails": {},
    *   //   "readAdvertiserIds": [],
    *   //   "readPartnerIds": [],
    *   //   "readWriteAccessors": {},
    *   //   "status": {},
    *   //   "subSitePropertyId": "my_subSitePropertyId",
    *   //   "timeRange": {},
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
  def patch(params: ParamsResourceInventorysourcesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceInventorysourcesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
