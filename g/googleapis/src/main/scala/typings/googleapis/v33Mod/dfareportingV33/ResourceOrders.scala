package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Orders")
@js.native
class ResourceOrders protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.orders.get
    * @desc Gets one order by ID.
    * @alias dfareporting.orders.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Order ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.projectId Project ID for orders.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOrder] = js.native
  def get(callback: BodyResponseCallback[SchemaOrder]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrder] = js.native
  def get(params: ParamsResourceOrdersGet): GaxiosPromise[SchemaOrder] = js.native
  def get(params: ParamsResourceOrdersGet, callback: BodyResponseCallback[SchemaOrder]): Unit = js.native
  def get(
    params: ParamsResourceOrdersGet,
    options: BodyResponseCallback[SchemaOrder],
    callback: BodyResponseCallback[SchemaOrder]
  ): Unit = js.native
  def get(params: ParamsResourceOrdersGet, options: MethodOptions): GaxiosPromise[SchemaOrder] = js.native
  def get(
    params: ParamsResourceOrdersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrder]
  ): Unit = js.native
  /**
    * dfareporting.orders.list
    * @desc Retrieves a list of orders, possibly filtered. This method supports
    * paging.
    * @alias dfareporting.orders.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only orders with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.projectId Project ID for orders.
    * @param {string=} params.searchString Allows searching for orders by name or ID. Wildcards (*) are allowed. For example, "order*2015" will return orders with names like "order June 2015", "order April 2015", or simply "order 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "order" will match orders with name "my order", "order 2015", or simply "order".
    * @param {string=} params.siteId Select only orders that are associated with these site IDs.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaOrdersListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(params: ParamsResourceOrdersList): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(params: ParamsResourceOrdersList, callback: BodyResponseCallback[SchemaOrdersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceOrdersList,
    options: BodyResponseCallback[SchemaOrdersListResponse],
    callback: BodyResponseCallback[SchemaOrdersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrdersList, options: MethodOptions): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(
    params: ParamsResourceOrdersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersListResponse]
  ): Unit = js.native
}

