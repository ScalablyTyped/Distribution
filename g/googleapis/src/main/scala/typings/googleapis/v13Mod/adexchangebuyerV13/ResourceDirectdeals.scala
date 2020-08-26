package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.3", "adexchangebuyer_v1_3.Resource$Directdeals")
@js.native
class ResourceDirectdeals protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.directDeals.get
    * @desc Gets one direct deal by ID.
    * @alias adexchangebuyer.directDeals.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The direct deal id
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDirectDeal] = js.native
  def get(callback: BodyResponseCallback[SchemaDirectDeal]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDirectDeal] = js.native
  def get(params: ParamsResourceDirectdealsGet): GaxiosPromise[SchemaDirectDeal] = js.native
  def get(params: ParamsResourceDirectdealsGet, callback: BodyResponseCallback[SchemaDirectDeal]): Unit = js.native
  def get(
    params: ParamsResourceDirectdealsGet,
    options: BodyResponseCallback[SchemaDirectDeal],
    callback: BodyResponseCallback[SchemaDirectDeal]
  ): Unit = js.native
  def get(params: ParamsResourceDirectdealsGet, options: MethodOptions): GaxiosPromise[SchemaDirectDeal] = js.native
  def get(
    params: ParamsResourceDirectdealsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectDeal]
  ): Unit = js.native
  /**
    * adexchangebuyer.directDeals.list
    * @desc Retrieves the authenticated user's list of direct deals.
    * @alias adexchangebuyer.directDeals.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDirectDealsList] = js.native
  def list(callback: BodyResponseCallback[SchemaDirectDealsList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDirectDealsList] = js.native
  def list(params: ParamsResourceDirectdealsList): GaxiosPromise[SchemaDirectDealsList] = js.native
  def list(params: ParamsResourceDirectdealsList, callback: BodyResponseCallback[SchemaDirectDealsList]): Unit = js.native
  def list(
    params: ParamsResourceDirectdealsList,
    options: BodyResponseCallback[SchemaDirectDealsList],
    callback: BodyResponseCallback[SchemaDirectDealsList]
  ): Unit = js.native
  def list(params: ParamsResourceDirectdealsList, options: MethodOptions): GaxiosPromise[SchemaDirectDealsList] = js.native
  def list(
    params: ParamsResourceDirectdealsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectDealsList]
  ): Unit = js.native
}

