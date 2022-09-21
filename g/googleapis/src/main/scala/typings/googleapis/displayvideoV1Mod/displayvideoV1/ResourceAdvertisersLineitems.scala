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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Lineitems")
@js.native
open class ResourceAdvertisersLineitems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def bulkEditLineItemAssignedTargetingOptions(): GaxiosPromise[SchemaBulkEditLineItemAssignedTargetingOptionsResponse] = js.native
  def bulkEditLineItemAssignedTargetingOptions(callback: BodyResponseCallback[SchemaBulkEditLineItemAssignedTargetingOptionsResponse]): Unit = js.native
  def bulkEditLineItemAssignedTargetingOptions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkEditLineItemAssignedTargetingOptionsResponse] = js.native
  def bulkEditLineItemAssignedTargetingOptions(params: ParamsResourceAdvertisersLineitemsBulkeditlineitemassignedtargetingoptions): GaxiosPromise[SchemaBulkEditLineItemAssignedTargetingOptionsResponse] = js.native
  def bulkEditLineItemAssignedTargetingOptions(
    params: ParamsResourceAdvertisersLineitemsBulkeditlineitemassignedtargetingoptions,
    callback: BodyResponseCallback[SchemaBulkEditLineItemAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkEditLineItemAssignedTargetingOptions(
    params: ParamsResourceAdvertisersLineitemsBulkeditlineitemassignedtargetingoptions,
    options: BodyResponseCallback[Readable | SchemaBulkEditLineItemAssignedTargetingOptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkEditLineItemAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkEditLineItemAssignedTargetingOptions(
    params: ParamsResourceAdvertisersLineitemsBulkeditlineitemassignedtargetingoptions,
    options: MethodOptions
  ): GaxiosPromise[SchemaBulkEditLineItemAssignedTargetingOptionsResponse] = js.native
  def bulkEditLineItemAssignedTargetingOptions(
    params: ParamsResourceAdvertisersLineitemsBulkeditlineitemassignedtargetingoptions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBulkEditLineItemAssignedTargetingOptionsResponse]
  ): Unit = js.native
  /**
    * Bulk edits targeting options under a single line item. The operation will delete the assigned targeting options provided in BulkEditLineItemAssignedTargetingOptionsRequest.delete_requests and then create the assigned targeting options provided in BulkEditLineItemAssignedTargetingOptionsRequest.create_requests. Requests to this endpoint cannot be made concurrently with the following requests updating the same line item: * BulkEditLineItemAssignedTargetingOptions * UpdateLineItem * CreateLineItemAssignedTargetingOption * DeleteLineItemAssignedTargetingOption
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
    *     await displayvideo.advertisers.lineItems.bulkEditLineItemAssignedTargetingOptions(
    *       {
    *         // Required. The ID of the advertiser the line item belongs to.
    *         advertiserId: '[^/]+',
    *         // Required. The ID of the line item the assigned targeting option will belong to.
    *         lineItemId: '[^/]+',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "createRequests": [],
    *           //   "deleteRequests": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createdAssignedTargetingOptions": []
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
  def bulkEditLineItemAssignedTargetingOptions(
    params: ParamsResourceAdvertisersLineitemsBulkeditlineitemassignedtargetingoptions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def bulkEditLineItemAssignedTargetingOptions(
    params: ParamsResourceAdvertisersLineitemsBulkeditlineitemassignedtargetingoptions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def bulkListLineItemAssignedTargetingOptions(): GaxiosPromise[SchemaBulkListLineItemAssignedTargetingOptionsResponse] = js.native
  def bulkListLineItemAssignedTargetingOptions(callback: BodyResponseCallback[SchemaBulkListLineItemAssignedTargetingOptionsResponse]): Unit = js.native
  def bulkListLineItemAssignedTargetingOptions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkListLineItemAssignedTargetingOptionsResponse] = js.native
  def bulkListLineItemAssignedTargetingOptions(params: ParamsResourceAdvertisersLineitemsBulklistlineitemassignedtargetingoptions): GaxiosPromise[SchemaBulkListLineItemAssignedTargetingOptionsResponse] = js.native
  def bulkListLineItemAssignedTargetingOptions(
    params: ParamsResourceAdvertisersLineitemsBulklistlineitemassignedtargetingoptions,
    callback: BodyResponseCallback[SchemaBulkListLineItemAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkListLineItemAssignedTargetingOptions(
    params: ParamsResourceAdvertisersLineitemsBulklistlineitemassignedtargetingoptions,
    options: BodyResponseCallback[Readable | SchemaBulkListLineItemAssignedTargetingOptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkListLineItemAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkListLineItemAssignedTargetingOptions(
    params: ParamsResourceAdvertisersLineitemsBulklistlineitemassignedtargetingoptions,
    options: MethodOptions
  ): GaxiosPromise[SchemaBulkListLineItemAssignedTargetingOptionsResponse] = js.native
  def bulkListLineItemAssignedTargetingOptions(
    params: ParamsResourceAdvertisersLineitemsBulklistlineitemassignedtargetingoptions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBulkListLineItemAssignedTargetingOptionsResponse]
  ): Unit = js.native
  /**
    * Lists assigned targeting options of a line item across targeting types.
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
    *     await displayvideo.advertisers.lineItems.bulkListLineItemAssignedTargetingOptions(
    *       {
    *         // Required. The ID of the advertiser the line item belongs to.
    *         advertiserId: '[^/]+',
    *         // Allows filtering by assigned targeting option properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR` on the same field. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `targetingType` - `inheritance` Examples: * AssignedTargetingOptions of targeting type TARGETING_TYPE_PROXIMITY_LOCATION_LIST or TARGETING_TYPE_CHANNEL `targetingType="TARGETING_TYPE_PROXIMITY_LOCATION_LIST" OR targetingType="TARGETING_TYPE_CHANNEL"` * AssignedTargetingOptions with inheritance status of NOT_INHERITED or INHERITED_FROM_PARTNER `inheritance="NOT_INHERITED" OR inheritance="INHERITED_FROM_PARTNER"` The length of this field should be no more than 500 characters.
    *         filter: 'placeholder-value',
    *         // Required. The ID of the line item to list assigned targeting options for.
    *         lineItemId: '[^/]+',
    *         // Field by which to sort the list. Acceptable values are: * `targetingType` (default) The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `targetingType desc`.
    *         orderBy: 'placeholder-value',
    *         // Requested page size. The size must be an integer between `1` and `5000`. If unspecified, the default is '5000'. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *         pageSize: 'placeholder-value',
    *         // A token that lets the client fetch the next page of results. Typically, this is the value of next_page_token returned from the previous call to `BulkListLineItemAssignedTargetingOptions` method. If not specified, the first page of results will be returned.
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
  def bulkListLineItemAssignedTargetingOptions(
    params: ParamsResourceAdvertisersLineitemsBulklistlineitemassignedtargetingoptions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def bulkListLineItemAssignedTargetingOptions(
    params: ParamsResourceAdvertisersLineitemsBulklistlineitemassignedtargetingoptions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaLineItem] = js.native
  def create(callback: BodyResponseCallback[SchemaLineItem]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLineItem] = js.native
  def create(params: ParamsResourceAdvertisersLineitemsCreate): GaxiosPromise[SchemaLineItem] = js.native
  def create(params: ParamsResourceAdvertisersLineitemsCreate, callback: BodyResponseCallback[SchemaLineItem]): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersLineitemsCreate,
    options: BodyResponseCallback[Readable | SchemaLineItem],
    callback: BodyResponseCallback[Readable | SchemaLineItem]
  ): Unit = js.native
  def create(params: ParamsResourceAdvertisersLineitemsCreate, options: MethodOptions): GaxiosPromise[SchemaLineItem] = js.native
  def create(
    params: ParamsResourceAdvertisersLineitemsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLineItem]
  ): Unit = js.native
  /**
    * Creates a new line item. Returns the newly created line item if successful.
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
    *   const res = await displayvideo.advertisers.lineItems.create({
    *     // Output only. The unique ID of the advertiser the line item belongs to.
    *     advertiserId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "bidStrategy": {},
    *       //   "budget": {},
    *       //   "campaignId": "my_campaignId",
    *       //   "conversionCounting": {},
    *       //   "creativeIds": [],
    *       //   "displayName": "my_displayName",
    *       //   "entityStatus": "my_entityStatus",
    *       //   "excludeNewExchanges": false,
    *       //   "flight": {},
    *       //   "frequencyCap": {},
    *       //   "insertionOrderId": "my_insertionOrderId",
    *       //   "integrationDetails": {},
    *       //   "inventorySourceIds": [],
    *       //   "lineItemId": "my_lineItemId",
    *       //   "lineItemType": "my_lineItemType",
    *       //   "mobileApp": {},
    *       //   "name": "my_name",
    *       //   "pacing": {},
    *       //   "partnerCosts": [],
    *       //   "partnerRevenueModel": {},
    *       //   "reservationType": "my_reservationType",
    *       //   "targetingExpansion": {},
    *       //   "updateTime": "my_updateTime",
    *       //   "warningMessages": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "bidStrategy": {},
    *   //   "budget": {},
    *   //   "campaignId": "my_campaignId",
    *   //   "conversionCounting": {},
    *   //   "creativeIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "excludeNewExchanges": false,
    *   //   "flight": {},
    *   //   "frequencyCap": {},
    *   //   "insertionOrderId": "my_insertionOrderId",
    *   //   "integrationDetails": {},
    *   //   "inventorySourceIds": [],
    *   //   "lineItemId": "my_lineItemId",
    *   //   "lineItemType": "my_lineItemType",
    *   //   "mobileApp": {},
    *   //   "name": "my_name",
    *   //   "pacing": {},
    *   //   "partnerCosts": [],
    *   //   "partnerRevenueModel": {},
    *   //   "reservationType": "my_reservationType",
    *   //   "targetingExpansion": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "warningMessages": []
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
  def create(params: ParamsResourceAdvertisersLineitemsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersLineitemsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersLineitemsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersLineitemsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisersLineitemsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAdvertisersLineitemsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersLineitemsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a line item. Returns error code `NOT_FOUND` if the line item does not exist. The line item should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, to be able to delete it.
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
    *   const res = await displayvideo.advertisers.lineItems.delete({
    *     // The ID of the advertiser this line item belongs to.
    *     advertiserId: '[^/]+',
    *     // The ID of the line item to delete.
    *     lineItemId: '[^/]+',
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
  def delete(params: ParamsResourceAdvertisersLineitemsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdvertisersLineitemsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def generateDefault(): GaxiosPromise[SchemaLineItem] = js.native
  def generateDefault(callback: BodyResponseCallback[SchemaLineItem]): Unit = js.native
  def generateDefault(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLineItem] = js.native
  def generateDefault(params: ParamsResourceAdvertisersLineitemsGeneratedefault): GaxiosPromise[SchemaLineItem] = js.native
  def generateDefault(
    params: ParamsResourceAdvertisersLineitemsGeneratedefault,
    callback: BodyResponseCallback[SchemaLineItem]
  ): Unit = js.native
  def generateDefault(
    params: ParamsResourceAdvertisersLineitemsGeneratedefault,
    options: BodyResponseCallback[Readable | SchemaLineItem],
    callback: BodyResponseCallback[Readable | SchemaLineItem]
  ): Unit = js.native
  def generateDefault(params: ParamsResourceAdvertisersLineitemsGeneratedefault, options: MethodOptions): GaxiosPromise[SchemaLineItem] = js.native
  def generateDefault(
    params: ParamsResourceAdvertisersLineitemsGeneratedefault,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLineItem]
  ): Unit = js.native
  /**
    * Creates a new line item with settings (including targeting) inherited from the insertion order and an `ENTITY_STATUS_DRAFT` entity_status. Returns the newly created line item if successful. There are default values based on the three fields: * The insertion order's insertion_order_type * The insertion order's automation_type * The given line_item_type
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
    *   const res = await displayvideo.advertisers.lineItems.generateDefault({
    *     // Required. The ID of the advertiser this line item belongs to.
    *     advertiserId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "insertionOrderId": "my_insertionOrderId",
    *       //   "lineItemType": "my_lineItemType",
    *       //   "mobileApp": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "bidStrategy": {},
    *   //   "budget": {},
    *   //   "campaignId": "my_campaignId",
    *   //   "conversionCounting": {},
    *   //   "creativeIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "excludeNewExchanges": false,
    *   //   "flight": {},
    *   //   "frequencyCap": {},
    *   //   "insertionOrderId": "my_insertionOrderId",
    *   //   "integrationDetails": {},
    *   //   "inventorySourceIds": [],
    *   //   "lineItemId": "my_lineItemId",
    *   //   "lineItemType": "my_lineItemType",
    *   //   "mobileApp": {},
    *   //   "name": "my_name",
    *   //   "pacing": {},
    *   //   "partnerCosts": [],
    *   //   "partnerRevenueModel": {},
    *   //   "reservationType": "my_reservationType",
    *   //   "targetingExpansion": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "warningMessages": []
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
  def generateDefault(params: ParamsResourceAdvertisersLineitemsGeneratedefault, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateDefault(
    params: ParamsResourceAdvertisersLineitemsGeneratedefault,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaLineItem] = js.native
  def get(callback: BodyResponseCallback[SchemaLineItem]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLineItem] = js.native
  def get(params: ParamsResourceAdvertisersLineitemsGet): GaxiosPromise[SchemaLineItem] = js.native
  def get(params: ParamsResourceAdvertisersLineitemsGet, callback: BodyResponseCallback[SchemaLineItem]): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersLineitemsGet,
    options: BodyResponseCallback[Readable | SchemaLineItem],
    callback: BodyResponseCallback[Readable | SchemaLineItem]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertisersLineitemsGet, options: MethodOptions): GaxiosPromise[SchemaLineItem] = js.native
  def get(
    params: ParamsResourceAdvertisersLineitemsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLineItem]
  ): Unit = js.native
  /**
    * Gets a line item.
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
    *   const res = await displayvideo.advertisers.lineItems.get({
    *     // Required. The ID of the advertiser this line item belongs to.
    *     advertiserId: '[^/]+',
    *     // Required. The ID of the line item to fetch.
    *     lineItemId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "bidStrategy": {},
    *   //   "budget": {},
    *   //   "campaignId": "my_campaignId",
    *   //   "conversionCounting": {},
    *   //   "creativeIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "excludeNewExchanges": false,
    *   //   "flight": {},
    *   //   "frequencyCap": {},
    *   //   "insertionOrderId": "my_insertionOrderId",
    *   //   "integrationDetails": {},
    *   //   "inventorySourceIds": [],
    *   //   "lineItemId": "my_lineItemId",
    *   //   "lineItemType": "my_lineItemType",
    *   //   "mobileApp": {},
    *   //   "name": "my_name",
    *   //   "pacing": {},
    *   //   "partnerCosts": [],
    *   //   "partnerRevenueModel": {},
    *   //   "reservationType": "my_reservationType",
    *   //   "targetingExpansion": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "warningMessages": []
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
  def get(params: ParamsResourceAdvertisersLineitemsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertisersLineitemsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListLineItemsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLineItemsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLineItemsResponse] = js.native
  def list(params: ParamsResourceAdvertisersLineitemsList): GaxiosPromise[SchemaListLineItemsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersLineitemsList,
    callback: BodyResponseCallback[SchemaListLineItemsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersLineitemsList,
    options: BodyResponseCallback[Readable | SchemaListLineItemsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLineItemsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersLineitemsList, options: MethodOptions): GaxiosPromise[SchemaListLineItemsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersLineitemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLineItemsResponse]
  ): Unit = js.native
  /**
    * Lists line items in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, line items with `ENTITY_STATUS_ARCHIVED` will not be included in the results.
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
    *   const res = await displayvideo.advertisers.lineItems.list({
    *     // Required. The ID of the advertiser to list line items for.
    *     advertiserId: '[^/]+',
    *     // Allows filtering by line item properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator used on `flight.dateRange.endDate` must be LESS THAN (<). * The operator used on `updateTime` must be `GREATER THAN OR EQUAL TO (\>=)` or `LESS THAN OR EQUAL TO (<=)`. * The operator used on `warningMessages` must be `HAS (:)`. * The operators used on all other fields must be `EQUALS (=)`. * Supported properties: - `campaignId` - `displayName` - `insertionOrderId` - `entityStatus` - `lineItemId` - `lineItemType` - `flight.dateRange.endDate` (input formatted as YYYY-MM-DD) - `warningMessages` - `flight.triggerId` - `updateTime` (input in ISO 8601 format, or YYYY-MM-DDTHH:MM:SSZ) - `targetedChannelId` - `targetedNegativeKeywordListId` Examples: * All line items under an insertion order: `insertionOrderId="1234"` * All `ENTITY_STATUS_ACTIVE` or `ENTITY_STATUS_PAUSED` and `LINE_ITEM_TYPE_DISPLAY_DEFAULT` line items under an advertiser: `(entityStatus="ENTITY_STATUS_ACTIVE" OR entityStatus="ENTITY_STATUS_PAUSED") AND lineItemType="LINE_ITEM_TYPE_DISPLAY_DEFAULT"` * All line items whose flight dates end before March 28, 2019: `flight.dateRange.endDate<"2019-03-28"` * All line items that have `NO_VALID_CREATIVE` in `warningMessages`: `warningMessages:"NO_VALID_CREATIVE"` * All line items with an update time less than or equal to `2020-11-04T18:54:47Z (format of ISO 8601)`: `updateTime<="2020-11-04T18:54:47Z"` * All line items with an update time greater than or equal to `2020-11-04T18:54:47Z (format of ISO 8601)`: `updateTime\>="2020-11-04T18:54:47Z"` * All line items that are using both the specified channel and specified negative keyword list in their targeting: `targetedNegativeKeywordListId=789 AND targetedChannelId=12345` The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `displayName` (default) * `entityStatus` * `flight.dateRange.endDate` * `updateTime` The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListLineItems` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "lineItems": [],
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
  def list(params: ParamsResourceAdvertisersLineitemsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersLineitemsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaLineItem] = js.native
  def patch(callback: BodyResponseCallback[SchemaLineItem]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLineItem] = js.native
  def patch(params: ParamsResourceAdvertisersLineitemsPatch): GaxiosPromise[SchemaLineItem] = js.native
  def patch(params: ParamsResourceAdvertisersLineitemsPatch, callback: BodyResponseCallback[SchemaLineItem]): Unit = js.native
  def patch(
    params: ParamsResourceAdvertisersLineitemsPatch,
    options: BodyResponseCallback[Readable | SchemaLineItem],
    callback: BodyResponseCallback[Readable | SchemaLineItem]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertisersLineitemsPatch, options: MethodOptions): GaxiosPromise[SchemaLineItem] = js.native
  def patch(
    params: ParamsResourceAdvertisersLineitemsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLineItem]
  ): Unit = js.native
  /**
    * Updates an existing line item. Returns the updated line item if successful. Requests to this endpoint cannot be made concurrently with the following requests updating the same line item: * BulkEditLineItemAssignedTargetingOptions * UpdateLineItem * CreateLineItemAssignedTargetingOption * DeleteLineItemAssignedTargetingOption
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
    *   const res = await displayvideo.advertisers.lineItems.patch({
    *     // Output only. The unique ID of the advertiser the line item belongs to.
    *     advertiserId: '[^/]+',
    *     // Output only. The unique ID of the line item. Assigned by the system.
    *     lineItemId: '[^/]+',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "bidStrategy": {},
    *       //   "budget": {},
    *       //   "campaignId": "my_campaignId",
    *       //   "conversionCounting": {},
    *       //   "creativeIds": [],
    *       //   "displayName": "my_displayName",
    *       //   "entityStatus": "my_entityStatus",
    *       //   "excludeNewExchanges": false,
    *       //   "flight": {},
    *       //   "frequencyCap": {},
    *       //   "insertionOrderId": "my_insertionOrderId",
    *       //   "integrationDetails": {},
    *       //   "inventorySourceIds": [],
    *       //   "lineItemId": "my_lineItemId",
    *       //   "lineItemType": "my_lineItemType",
    *       //   "mobileApp": {},
    *       //   "name": "my_name",
    *       //   "pacing": {},
    *       //   "partnerCosts": [],
    *       //   "partnerRevenueModel": {},
    *       //   "reservationType": "my_reservationType",
    *       //   "targetingExpansion": {},
    *       //   "updateTime": "my_updateTime",
    *       //   "warningMessages": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "bidStrategy": {},
    *   //   "budget": {},
    *   //   "campaignId": "my_campaignId",
    *   //   "conversionCounting": {},
    *   //   "creativeIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "excludeNewExchanges": false,
    *   //   "flight": {},
    *   //   "frequencyCap": {},
    *   //   "insertionOrderId": "my_insertionOrderId",
    *   //   "integrationDetails": {},
    *   //   "inventorySourceIds": [],
    *   //   "lineItemId": "my_lineItemId",
    *   //   "lineItemType": "my_lineItemType",
    *   //   "mobileApp": {},
    *   //   "name": "my_name",
    *   //   "pacing": {},
    *   //   "partnerCosts": [],
    *   //   "partnerRevenueModel": {},
    *   //   "reservationType": "my_reservationType",
    *   //   "targetingExpansion": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "warningMessages": []
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
  def patch(params: ParamsResourceAdvertisersLineitemsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdvertisersLineitemsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var targetingTypes: ResourceAdvertisersLineitemsTargetingtypes = js.native
}
