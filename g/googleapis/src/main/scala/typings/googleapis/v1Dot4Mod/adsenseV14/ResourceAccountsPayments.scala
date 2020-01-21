package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Payments")
@js.native
class ResourceAccountsPayments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.accounts.payments.list
    * @desc List the payments for the specified AdSense account.
    * @alias adsense.accounts.payments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account for which to retrieve the payments.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPayments] = js.native
  def list(callback: BodyResponseCallback[SchemaPayments]): Unit = js.native
  def list(params: ParamsResourceAccountsPaymentsList): GaxiosPromise[SchemaPayments] = js.native
  def list(params: ParamsResourceAccountsPaymentsList, callback: BodyResponseCallback[SchemaPayments]): Unit = js.native
  def list(
    params: ParamsResourceAccountsPaymentsList,
    options: BodyResponseCallback[SchemaPayments],
    callback: BodyResponseCallback[SchemaPayments]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsPaymentsList, options: MethodOptions): GaxiosPromise[SchemaPayments] = js.native
  def list(
    params: ParamsResourceAccountsPaymentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPayments]
  ): Unit = js.native
}

