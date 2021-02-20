package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Accounttax")
@js.native
class ResourceAccounttax protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * content.accounttax.custombatch
    * @desc Retrieves and updates tax settings of multiple accounts in a single
    * request.
    * @alias content.accounttax.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AccounttaxCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[SchemaAccounttaxCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaAccounttaxCustomBatchResponse]): Unit = js.native
  def custombatch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccounttaxCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceAccounttaxCustombatch): GaxiosPromise[SchemaAccounttaxCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceAccounttaxCustombatch,
    callback: BodyResponseCallback[SchemaAccounttaxCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceAccounttaxCustombatch,
    options: BodyResponseCallback[SchemaAccounttaxCustomBatchResponse],
    callback: BodyResponseCallback[SchemaAccounttaxCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceAccounttaxCustombatch, options: MethodOptions): GaxiosPromise[SchemaAccounttaxCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceAccounttaxCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccounttaxCustomBatchResponse]
  ): Unit = js.native
  
  /**
    * content.accounttax.get
    * @desc Retrieves the tax settings of the account.
    * @alias content.accounttax.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get/update account tax settings.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAccountTax] = js.native
  def get(callback: BodyResponseCallback[SchemaAccountTax]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountTax] = js.native
  def get(params: ParamsResourceAccounttaxGet): GaxiosPromise[SchemaAccountTax] = js.native
  def get(params: ParamsResourceAccounttaxGet, callback: BodyResponseCallback[SchemaAccountTax]): Unit = js.native
  def get(
    params: ParamsResourceAccounttaxGet,
    options: BodyResponseCallback[SchemaAccountTax],
    callback: BodyResponseCallback[SchemaAccountTax]
  ): Unit = js.native
  def get(params: ParamsResourceAccounttaxGet, options: MethodOptions): GaxiosPromise[SchemaAccountTax] = js.native
  def get(
    params: ParamsResourceAccounttaxGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountTax]
  ): Unit = js.native
  
  /**
    * content.accounttax.list
    * @desc Lists the tax settings of the sub-accounts in your Merchant Center
    * account.
    * @alias content.accounttax.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of tax settings to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAccounttaxListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccounttaxListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccounttaxListResponse] = js.native
  def list(params: ParamsResourceAccounttaxList): GaxiosPromise[SchemaAccounttaxListResponse] = js.native
  def list(params: ParamsResourceAccounttaxList, callback: BodyResponseCallback[SchemaAccounttaxListResponse]): Unit = js.native
  def list(
    params: ParamsResourceAccounttaxList,
    options: BodyResponseCallback[SchemaAccounttaxListResponse],
    callback: BodyResponseCallback[SchemaAccounttaxListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccounttaxList, options: MethodOptions): GaxiosPromise[SchemaAccounttaxListResponse] = js.native
  def list(
    params: ParamsResourceAccounttaxList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccounttaxListResponse]
  ): Unit = js.native
  
  /**
    * content.accounttax.update
    * @desc Updates the tax settings of the account.
    * @alias content.accounttax.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get/update account tax settings.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {().AccountTax} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaAccountTax] = js.native
  def update(callback: BodyResponseCallback[SchemaAccountTax]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountTax] = js.native
  def update(params: ParamsResourceAccounttaxUpdate): GaxiosPromise[SchemaAccountTax] = js.native
  def update(params: ParamsResourceAccounttaxUpdate, callback: BodyResponseCallback[SchemaAccountTax]): Unit = js.native
  def update(
    params: ParamsResourceAccounttaxUpdate,
    options: BodyResponseCallback[SchemaAccountTax],
    callback: BodyResponseCallback[SchemaAccountTax]
  ): Unit = js.native
  def update(params: ParamsResourceAccounttaxUpdate, options: MethodOptions): GaxiosPromise[SchemaAccountTax] = js.native
  def update(
    params: ParamsResourceAccounttaxUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountTax]
  ): Unit = js.native
}
