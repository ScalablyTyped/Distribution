package typings.googleapis.v2Mod.androidpublisherV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Purchases$Products")
@js.native
class ResourcePurchasesProducts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.purchases.products.get
    * @desc Checks the purchase and consumption status of an inapp item.
    * @alias androidpublisher.purchases.products.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName The package name of the application the inapp product was sold in (for example, 'com.some.thing').
    * @param {string} params.productId The inapp product SKU (for example, 'com.some.thing.inapp1').
    * @param {string} params.token The token provided to the user's device when the inapp product was purchased.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProductPurchase] = js.native
  def get(callback: BodyResponseCallback[SchemaProductPurchase]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProductPurchase] = js.native
  def get(params: ParamsResourcePurchasesProductsGet): GaxiosPromise[SchemaProductPurchase] = js.native
  def get(params: ParamsResourcePurchasesProductsGet, callback: BodyResponseCallback[SchemaProductPurchase]): Unit = js.native
  def get(
    params: ParamsResourcePurchasesProductsGet,
    options: BodyResponseCallback[SchemaProductPurchase],
    callback: BodyResponseCallback[SchemaProductPurchase]
  ): Unit = js.native
  def get(params: ParamsResourcePurchasesProductsGet, options: MethodOptions): GaxiosPromise[SchemaProductPurchase] = js.native
  def get(
    params: ParamsResourcePurchasesProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductPurchase]
  ): Unit = js.native
}

