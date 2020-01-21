package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Orderreports")
@js.native
class ResourceOrderreports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.orderreports.listdisbursements
    * @desc Retrieves a report for disbursements from your Merchant Center
    * account.
    * @alias content.orderreports.listdisbursements
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.disbursementEndDate The last date which disbursements occurred. In ISO 8601 format. Default: current date.
    * @param {string} params.disbursementStartDate The first date which disbursements occurred. In ISO 8601 format.
    * @param {integer=} params.maxResults The maximum number of disbursements to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listdisbursements(): GaxiosPromise[SchemaOrderreportsListDisbursementsResponse] = js.native
  def listdisbursements(callback: BodyResponseCallback[SchemaOrderreportsListDisbursementsResponse]): Unit = js.native
  def listdisbursements(params: ParamsResourceOrderreportsListdisbursements): GaxiosPromise[SchemaOrderreportsListDisbursementsResponse] = js.native
  def listdisbursements(
    params: ParamsResourceOrderreportsListdisbursements,
    callback: BodyResponseCallback[SchemaOrderreportsListDisbursementsResponse]
  ): Unit = js.native
  def listdisbursements(
    params: ParamsResourceOrderreportsListdisbursements,
    options: BodyResponseCallback[SchemaOrderreportsListDisbursementsResponse],
    callback: BodyResponseCallback[SchemaOrderreportsListDisbursementsResponse]
  ): Unit = js.native
  def listdisbursements(params: ParamsResourceOrderreportsListdisbursements, options: MethodOptions): GaxiosPromise[SchemaOrderreportsListDisbursementsResponse] = js.native
  def listdisbursements(
    params: ParamsResourceOrderreportsListdisbursements,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderreportsListDisbursementsResponse]
  ): Unit = js.native
  /**
    * content.orderreports.listtransactions
    * @desc Retrieves a list of transactions for a disbursement from your
    * Merchant Center account.
    * @alias content.orderreports.listtransactions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.disbursementId The Google-provided ID of the disbursement (found in Wallet).
    * @param {integer=} params.maxResults The maximum number of disbursements to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string=} params.transactionEndDate The last date in which transaction occurred. In ISO 8601 format. Default: current date.
    * @param {string} params.transactionStartDate The first date in which transaction occurred. In ISO 8601 format.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listtransactions(): GaxiosPromise[SchemaOrderreportsListTransactionsResponse] = js.native
  def listtransactions(callback: BodyResponseCallback[SchemaOrderreportsListTransactionsResponse]): Unit = js.native
  def listtransactions(params: ParamsResourceOrderreportsListtransactions): GaxiosPromise[SchemaOrderreportsListTransactionsResponse] = js.native
  def listtransactions(
    params: ParamsResourceOrderreportsListtransactions,
    callback: BodyResponseCallback[SchemaOrderreportsListTransactionsResponse]
  ): Unit = js.native
  def listtransactions(
    params: ParamsResourceOrderreportsListtransactions,
    options: BodyResponseCallback[SchemaOrderreportsListTransactionsResponse],
    callback: BodyResponseCallback[SchemaOrderreportsListTransactionsResponse]
  ): Unit = js.native
  def listtransactions(params: ParamsResourceOrderreportsListtransactions, options: MethodOptions): GaxiosPromise[SchemaOrderreportsListTransactionsResponse] = js.native
  def listtransactions(
    params: ParamsResourceOrderreportsListtransactions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderreportsListTransactionsResponse]
  ): Unit = js.native
}

