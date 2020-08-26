package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Inventoryitems")
@js.native
class ResourceInventoryitems protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.inventoryItems.get
    * @desc Gets one inventory item by ID.
    * @alias dfareporting.inventoryItems.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Inventory item ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.projectId Project ID for order documents.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaInventoryItem] = js.native
  def get(callback: BodyResponseCallback[SchemaInventoryItem]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInventoryItem] = js.native
  def get(params: ParamsResourceInventoryitemsGet): GaxiosPromise[SchemaInventoryItem] = js.native
  def get(params: ParamsResourceInventoryitemsGet, callback: BodyResponseCallback[SchemaInventoryItem]): Unit = js.native
  def get(
    params: ParamsResourceInventoryitemsGet,
    options: BodyResponseCallback[SchemaInventoryItem],
    callback: BodyResponseCallback[SchemaInventoryItem]
  ): Unit = js.native
  def get(params: ParamsResourceInventoryitemsGet, options: MethodOptions): GaxiosPromise[SchemaInventoryItem] = js.native
  def get(
    params: ParamsResourceInventoryitemsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventoryItem]
  ): Unit = js.native
  /**
    * dfareporting.inventoryItems.list
    * @desc Retrieves a list of inventory items, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.inventoryItems.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only inventory items with these IDs.
    * @param {boolean=} params.inPlan Select only inventory items that are in plan.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.orderId Select only inventory items that belong to specified orders.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.projectId Project ID for order documents.
    * @param {string=} params.siteId Select only inventory items that are associated with these sites.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.type Select only inventory items with this type.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaInventoryItemsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaInventoryItemsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInventoryItemsListResponse] = js.native
  def list(params: ParamsResourceInventoryitemsList): GaxiosPromise[SchemaInventoryItemsListResponse] = js.native
  def list(
    params: ParamsResourceInventoryitemsList,
    callback: BodyResponseCallback[SchemaInventoryItemsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceInventoryitemsList,
    options: BodyResponseCallback[SchemaInventoryItemsListResponse],
    callback: BodyResponseCallback[SchemaInventoryItemsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceInventoryitemsList, options: MethodOptions): GaxiosPromise[SchemaInventoryItemsListResponse] = js.native
  def list(
    params: ParamsResourceInventoryitemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventoryItemsListResponse]
  ): Unit = js.native
}

