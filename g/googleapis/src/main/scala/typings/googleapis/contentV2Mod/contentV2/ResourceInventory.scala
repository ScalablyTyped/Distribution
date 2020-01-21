package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Inventory")
@js.native
class ResourceInventory protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.inventory.custombatch
    * @desc Updates price and availability for multiple products or stores in a
    * single request. This operation does not update the expiration date of the
    * products.
    * @alias content.inventory.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {().InventoryCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[SchemaInventoryCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaInventoryCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsResourceInventoryCustombatch): GaxiosPromise[SchemaInventoryCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceInventoryCustombatch,
    callback: BodyResponseCallback[SchemaInventoryCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceInventoryCustombatch,
    options: BodyResponseCallback[SchemaInventoryCustomBatchResponse],
    callback: BodyResponseCallback[SchemaInventoryCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceInventoryCustombatch, options: MethodOptions): GaxiosPromise[SchemaInventoryCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceInventoryCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventoryCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.inventory.set
    * @desc Updates price and availability of a product in your Merchant Center
    * account.
    * @alias content.inventory.set
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the account that contains the product. This account cannot be a multi-client account.
    * @param {string} params.productId The REST ID of the product for which to update price and availability.
    * @param {string} params.storeCode The code of the store for which to update price and availability. Use online to update price and availability of an online product.
    * @param {().InventorySetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def set(): GaxiosPromise[SchemaInventorySetResponse] = js.native
  def set(callback: BodyResponseCallback[SchemaInventorySetResponse]): Unit = js.native
  def set(params: ParamsResourceInventorySet): GaxiosPromise[SchemaInventorySetResponse] = js.native
  def set(params: ParamsResourceInventorySet, callback: BodyResponseCallback[SchemaInventorySetResponse]): Unit = js.native
  def set(
    params: ParamsResourceInventorySet,
    options: BodyResponseCallback[SchemaInventorySetResponse],
    callback: BodyResponseCallback[SchemaInventorySetResponse]
  ): Unit = js.native
  def set(params: ParamsResourceInventorySet, options: MethodOptions): GaxiosPromise[SchemaInventorySetResponse] = js.native
  def set(
    params: ParamsResourceInventorySet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventorySetResponse]
  ): Unit = js.native
}

