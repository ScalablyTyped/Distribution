package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Accountstatuses")
@js.native
class ResourceAccountstatuses protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.accountstatuses.custombatch
    * @desc Retrieves multiple Merchant Center account statuses in a single
    * request.
    * @alias content.accountstatuses.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AccountstatusesCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[SchemaAccountstatusesCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaAccountstatusesCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsResourceAccountstatusesCustombatch): GaxiosPromise[SchemaAccountstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceAccountstatusesCustombatch,
    callback: BodyResponseCallback[SchemaAccountstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceAccountstatusesCustombatch,
    options: BodyResponseCallback[SchemaAccountstatusesCustomBatchResponse],
    callback: BodyResponseCallback[SchemaAccountstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceAccountstatusesCustombatch, options: MethodOptions): GaxiosPromise[SchemaAccountstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceAccountstatusesCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountstatusesCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.accountstatuses.get
    * @desc Retrieves the status of a Merchant Center account. No
    * itemLevelIssues are returned for multi-client accounts.
    * @alias content.accountstatuses.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account.
    * @param {string=} params.destinations If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAccountStatus] = js.native
  def get(callback: BodyResponseCallback[SchemaAccountStatus]): Unit = js.native
  def get(params: ParamsResourceAccountstatusesGet): GaxiosPromise[SchemaAccountStatus] = js.native
  def get(params: ParamsResourceAccountstatusesGet, callback: BodyResponseCallback[SchemaAccountStatus]): Unit = js.native
  def get(
    params: ParamsResourceAccountstatusesGet,
    options: BodyResponseCallback[SchemaAccountStatus],
    callback: BodyResponseCallback[SchemaAccountStatus]
  ): Unit = js.native
  def get(params: ParamsResourceAccountstatusesGet, options: MethodOptions): GaxiosPromise[SchemaAccountStatus] = js.native
  def get(
    params: ParamsResourceAccountstatusesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountStatus]
  ): Unit = js.native
  /**
    * content.accountstatuses.list
    * @desc Lists the statuses of the sub-accounts in your Merchant Center
    * account.
    * @alias content.accountstatuses.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.destinations If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    * @param {integer=} params.maxResults The maximum number of account statuses to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAccountstatusesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountstatusesListResponse]): Unit = js.native
  def list(params: ParamsResourceAccountstatusesList): GaxiosPromise[SchemaAccountstatusesListResponse] = js.native
  def list(
    params: ParamsResourceAccountstatusesList,
    callback: BodyResponseCallback[SchemaAccountstatusesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountstatusesList,
    options: BodyResponseCallback[SchemaAccountstatusesListResponse],
    callback: BodyResponseCallback[SchemaAccountstatusesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountstatusesList, options: MethodOptions): GaxiosPromise[SchemaAccountstatusesListResponse] = js.native
  def list(
    params: ParamsResourceAccountstatusesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountstatusesListResponse]
  ): Unit = js.native
}

