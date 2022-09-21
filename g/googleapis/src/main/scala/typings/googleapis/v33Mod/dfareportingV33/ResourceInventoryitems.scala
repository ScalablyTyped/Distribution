package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Inventoryitems")
@js.native
open class ResourceInventoryitems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaInventoryItem] = js.native
  def get(callback: BodyResponseCallback[SchemaInventoryItem]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInventoryItem] = js.native
  def get(params: ParamsResourceInventoryitemsGet): GaxiosPromise[SchemaInventoryItem] = js.native
  def get(params: ParamsResourceInventoryitemsGet, callback: BodyResponseCallback[SchemaInventoryItem]): Unit = js.native
  def get(
    params: ParamsResourceInventoryitemsGet,
    options: BodyResponseCallback[Readable | SchemaInventoryItem],
    callback: BodyResponseCallback[Readable | SchemaInventoryItem]
  ): Unit = js.native
  def get(params: ParamsResourceInventoryitemsGet, options: MethodOptions): GaxiosPromise[SchemaInventoryItem] = js.native
  def get(
    params: ParamsResourceInventoryitemsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventoryItem]
  ): Unit = js.native
  /**
    * Gets one inventory item by ID.
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
    * const dfareporting = google.dfareporting('v3.3');
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
    *   const res = await dfareporting.inventoryItems.get({
    *     // Inventory item ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Project ID for order documents.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adSlots": [],
    *   //   "advertiserId": "my_advertiserId",
    *   //   "contentCategoryId": "my_contentCategoryId",
    *   //   "estimatedClickThroughRate": "my_estimatedClickThroughRate",
    *   //   "estimatedConversionRate": "my_estimatedConversionRate",
    *   //   "id": "my_id",
    *   //   "inPlan": false,
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "name": "my_name",
    *   //   "negotiationChannelId": "my_negotiationChannelId",
    *   //   "orderId": "my_orderId",
    *   //   "placementStrategyId": "my_placementStrategyId",
    *   //   "pricing": {},
    *   //   "projectId": "my_projectId",
    *   //   "rfpId": "my_rfpId",
    *   //   "siteId": "my_siteId",
    *   //   "subaccountId": "my_subaccountId",
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
  def get(params: ParamsResourceInventoryitemsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceInventoryitemsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaInventoryItemsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaInventoryItemsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInventoryItemsListResponse] = js.native
  def list(params: ParamsResourceInventoryitemsList): GaxiosPromise[SchemaInventoryItemsListResponse] = js.native
  def list(
    params: ParamsResourceInventoryitemsList,
    callback: BodyResponseCallback[SchemaInventoryItemsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceInventoryitemsList,
    options: BodyResponseCallback[Readable | SchemaInventoryItemsListResponse],
    callback: BodyResponseCallback[Readable | SchemaInventoryItemsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceInventoryitemsList, options: MethodOptions): GaxiosPromise[SchemaInventoryItemsListResponse] = js.native
  def list(
    params: ParamsResourceInventoryitemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventoryItemsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of inventory items, possibly filtered. This method supports paging.
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
    * const dfareporting = google.dfareporting('v3.3');
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
    *   const res = await dfareporting.inventoryItems.list({
    *     // Select only inventory items with these IDs.
    *     ids: 'placeholder-value',
    *     // Select only inventory items that are in plan.
    *     inPlan: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Select only inventory items that belong to specified orders.
    *     orderId: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Project ID for order documents.
    *     projectId: 'placeholder-value',
    *     // Select only inventory items that are associated with these sites.
    *     siteId: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *     // Select only inventory items with this type.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "inventoryItems": [],
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
  def list(params: ParamsResourceInventoryitemsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceInventoryitemsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
