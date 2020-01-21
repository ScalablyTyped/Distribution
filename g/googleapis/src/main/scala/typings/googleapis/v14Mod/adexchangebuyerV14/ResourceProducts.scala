package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Products")
@js.native
class ResourceProducts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.products.get
    * @desc Gets the requested product by id.
    * @alias adexchangebuyer.products.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productId The id for the product to get the head revision for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProduct] = js.native
  def get(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(params: ParamsResourceProductsGet): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceProductsGet, callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: BodyResponseCallback[SchemaProduct],
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  def get(params: ParamsResourceProductsGet, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  /**
    * adexchangebuyer.products.search
    * @desc Gets the requested product.
    * @alias adexchangebuyer.products.search
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.pqlQuery The pql query used to query for products.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaGetOffersResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGetOffersResponse]): Unit = js.native
  def search(params: ParamsResourceProductsSearch): GaxiosPromise[SchemaGetOffersResponse] = js.native
  def search(params: ParamsResourceProductsSearch, callback: BodyResponseCallback[SchemaGetOffersResponse]): Unit = js.native
  def search(
    params: ParamsResourceProductsSearch,
    options: BodyResponseCallback[SchemaGetOffersResponse],
    callback: BodyResponseCallback[SchemaGetOffersResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProductsSearch, options: MethodOptions): GaxiosPromise[SchemaGetOffersResponse] = js.native
  def search(
    params: ParamsResourceProductsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetOffersResponse]
  ): Unit = js.native
}

