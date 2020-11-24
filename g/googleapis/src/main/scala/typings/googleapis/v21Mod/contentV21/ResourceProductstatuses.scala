package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Productstatuses")
@js.native
class ResourceProductstatuses protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * content.productstatuses.custombatch
    * @desc Gets the statuses of multiple products in a single request.
    * @alias content.productstatuses.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ProductstatusesCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[SchemaProductstatusesCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaProductstatusesCustomBatchResponse]): Unit = js.native
  def custombatch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProductstatusesCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceProductstatusesCustombatch): GaxiosPromise[SchemaProductstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceProductstatusesCustombatch,
    callback: BodyResponseCallback[SchemaProductstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceProductstatusesCustombatch,
    options: BodyResponseCallback[SchemaProductstatusesCustomBatchResponse],
    callback: BodyResponseCallback[SchemaProductstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceProductstatusesCustombatch, options: MethodOptions): GaxiosPromise[SchemaProductstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceProductstatusesCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductstatusesCustomBatchResponse]
  ): Unit = js.native
  
  /**
    * content.productstatuses.get
    * @desc Gets the status of a product from your Merchant Center account.
    * @alias content.productstatuses.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.destinations If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    * @param {string} params.merchantId The ID of the account that contains the product. This account cannot be a multi-client account.
    * @param {string} params.productId The REST ID of the product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProductStatus] = js.native
  def get(callback: BodyResponseCallback[SchemaProductStatus]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProductStatus] = js.native
  def get(params: ParamsResourceProductstatusesGet): GaxiosPromise[SchemaProductStatus] = js.native
  def get(params: ParamsResourceProductstatusesGet, callback: BodyResponseCallback[SchemaProductStatus]): Unit = js.native
  def get(
    params: ParamsResourceProductstatusesGet,
    options: BodyResponseCallback[SchemaProductStatus],
    callback: BodyResponseCallback[SchemaProductStatus]
  ): Unit = js.native
  def get(params: ParamsResourceProductstatusesGet, options: MethodOptions): GaxiosPromise[SchemaProductStatus] = js.native
  def get(
    params: ParamsResourceProductstatusesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductStatus]
  ): Unit = js.native
  
  /**
    * content.productstatuses.list
    * @desc Lists the statuses of the products in your Merchant Center account.
    * @alias content.productstatuses.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.destinations If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    * @param {integer=} params.maxResults The maximum number of product statuses to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the account that contains the products. This account cannot be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaProductstatusesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaProductstatusesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProductstatusesListResponse] = js.native
  def list(params: ParamsResourceProductstatusesList): GaxiosPromise[SchemaProductstatusesListResponse] = js.native
  def list(
    params: ParamsResourceProductstatusesList,
    callback: BodyResponseCallback[SchemaProductstatusesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProductstatusesList,
    options: BodyResponseCallback[SchemaProductstatusesListResponse],
    callback: BodyResponseCallback[SchemaProductstatusesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProductstatusesList, options: MethodOptions): GaxiosPromise[SchemaProductstatusesListResponse] = js.native
  def list(
    params: ParamsResourceProductstatusesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductstatusesListResponse]
  ): Unit = js.native
}
