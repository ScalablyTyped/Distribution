package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Marketplacedeals")
@js.native
class ResourceMarketplacedeals protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.marketplacedeals.delete
    * @desc Delete the specified deals from the proposal
    * @alias adexchangebuyer.marketplacedeals.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId The proposalId to delete deals from.
    * @param {().DeleteOrderDealsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaDeleteOrderDealsResponse] = js.native
  def delete(callback: BodyResponseCallback[SchemaDeleteOrderDealsResponse]): Unit = js.native
  def delete(params: ParamsResourceMarketplacedealsDelete): GaxiosPromise[SchemaDeleteOrderDealsResponse] = js.native
  def delete(
    params: ParamsResourceMarketplacedealsDelete,
    callback: BodyResponseCallback[SchemaDeleteOrderDealsResponse]
  ): Unit = js.native
  def delete(
    params: ParamsResourceMarketplacedealsDelete,
    options: BodyResponseCallback[SchemaDeleteOrderDealsResponse],
    callback: BodyResponseCallback[SchemaDeleteOrderDealsResponse]
  ): Unit = js.native
  def delete(params: ParamsResourceMarketplacedealsDelete, options: MethodOptions): GaxiosPromise[SchemaDeleteOrderDealsResponse] = js.native
  def delete(
    params: ParamsResourceMarketplacedealsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeleteOrderDealsResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer.marketplacedeals.insert
    * @desc Add new deals for the specified proposal
    * @alias adexchangebuyer.marketplacedeals.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId proposalId for which deals need to be added.
    * @param {().AddOrderDealsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAddOrderDealsResponse] = js.native
  def insert(callback: BodyResponseCallback[SchemaAddOrderDealsResponse]): Unit = js.native
  def insert(params: ParamsResourceMarketplacedealsInsert): GaxiosPromise[SchemaAddOrderDealsResponse] = js.native
  def insert(
    params: ParamsResourceMarketplacedealsInsert,
    callback: BodyResponseCallback[SchemaAddOrderDealsResponse]
  ): Unit = js.native
  def insert(
    params: ParamsResourceMarketplacedealsInsert,
    options: BodyResponseCallback[SchemaAddOrderDealsResponse],
    callback: BodyResponseCallback[SchemaAddOrderDealsResponse]
  ): Unit = js.native
  def insert(params: ParamsResourceMarketplacedealsInsert, options: MethodOptions): GaxiosPromise[SchemaAddOrderDealsResponse] = js.native
  def insert(
    params: ParamsResourceMarketplacedealsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAddOrderDealsResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer.marketplacedeals.list
    * @desc List all the deals for a given proposal
    * @alias adexchangebuyer.marketplacedeals.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pqlQuery Query string to retrieve specific deals.
    * @param {string} params.proposalId The proposalId to get deals for. To search across all proposals specify order_id = '-' as part of the URL.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGetOrderDealsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGetOrderDealsResponse]): Unit = js.native
  def list(params: ParamsResourceMarketplacedealsList): GaxiosPromise[SchemaGetOrderDealsResponse] = js.native
  def list(
    params: ParamsResourceMarketplacedealsList,
    callback: BodyResponseCallback[SchemaGetOrderDealsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMarketplacedealsList,
    options: BodyResponseCallback[SchemaGetOrderDealsResponse],
    callback: BodyResponseCallback[SchemaGetOrderDealsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMarketplacedealsList, options: MethodOptions): GaxiosPromise[SchemaGetOrderDealsResponse] = js.native
  def list(
    params: ParamsResourceMarketplacedealsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetOrderDealsResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer.marketplacedeals.update
    * @desc Replaces all the deals in the proposal with the passed in deals
    * @alias adexchangebuyer.marketplacedeals.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId The proposalId to edit deals on.
    * @param {().EditAllOrderDealsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaEditAllOrderDealsResponse] = js.native
  def update(callback: BodyResponseCallback[SchemaEditAllOrderDealsResponse]): Unit = js.native
  def update(params: ParamsResourceMarketplacedealsUpdate): GaxiosPromise[SchemaEditAllOrderDealsResponse] = js.native
  def update(
    params: ParamsResourceMarketplacedealsUpdate,
    callback: BodyResponseCallback[SchemaEditAllOrderDealsResponse]
  ): Unit = js.native
  def update(
    params: ParamsResourceMarketplacedealsUpdate,
    options: BodyResponseCallback[SchemaEditAllOrderDealsResponse],
    callback: BodyResponseCallback[SchemaEditAllOrderDealsResponse]
  ): Unit = js.native
  def update(params: ParamsResourceMarketplacedealsUpdate, options: MethodOptions): GaxiosPromise[SchemaEditAllOrderDealsResponse] = js.native
  def update(
    params: ParamsResourceMarketplacedealsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEditAllOrderDealsResponse]
  ): Unit = js.native
}

