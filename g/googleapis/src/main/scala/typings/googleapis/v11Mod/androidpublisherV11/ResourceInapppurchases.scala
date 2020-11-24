package typings.googleapis.v11Mod.androidpublisherV11

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v1.1", "androidpublisher_v1_1.Resource$Inapppurchases")
@js.native
class ResourceInapppurchases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * androidpublisher.inapppurchases.get
    * @desc Checks the purchase and consumption status of an inapp item.
    * @alias androidpublisher.inapppurchases.get
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
  def get(): GaxiosPromise[SchemaInappPurchase] = js.native
  def get(callback: BodyResponseCallback[SchemaInappPurchase]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInappPurchase] = js.native
  def get(params: ParamsResourceInapppurchasesGet): GaxiosPromise[SchemaInappPurchase] = js.native
  def get(params: ParamsResourceInapppurchasesGet, callback: BodyResponseCallback[SchemaInappPurchase]): Unit = js.native
  def get(
    params: ParamsResourceInapppurchasesGet,
    options: BodyResponseCallback[SchemaInappPurchase],
    callback: BodyResponseCallback[SchemaInappPurchase]
  ): Unit = js.native
  def get(params: ParamsResourceInapppurchasesGet, options: MethodOptions): GaxiosPromise[SchemaInappPurchase] = js.native
  def get(
    params: ParamsResourceInapppurchasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInappPurchase]
  ): Unit = js.native
}
