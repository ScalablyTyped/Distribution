package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts")
@js.native
class ResourceAccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var adclients: ResourceAccountsAdclients = js.native
  var adunits: ResourceAccountsAdunits = js.native
  var alerts: ResourceAccountsAlerts = js.native
  var context: APIRequestContext = js.native
  var customchannels: ResourceAccountsCustomchannels = js.native
  var payments: ResourceAccountsPayments = js.native
  var reports: ResourceAccountsReports = js.native
  var savedadstyles: ResourceAccountsSavedadstyles = js.native
  var urlchannels: ResourceAccountsUrlchannels = js.native
  /**
    * adsense.accounts.get
    * @desc Get information about the selected AdSense account.
    * @alias adsense.accounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account to get information about.
    * @param {boolean=} params.tree Whether the tree of sub accounts should be returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAccount] = js.native
  def get(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def get(params: ParamsResourceAccountsGet): GaxiosPromise[SchemaAccount] = js.native
  def get(params: ParamsResourceAccountsGet, callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def get(
    params: ParamsResourceAccountsGet,
    options: BodyResponseCallback[SchemaAccount],
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsGet, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def get(
    params: ParamsResourceAccountsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
  /**
    * adsense.accounts.list
    * @desc List all accounts available to this AdSense account.
    * @alias adsense.accounts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of accounts to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through accounts. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAccounts] = js.native
  def list(callback: BodyResponseCallback[SchemaAccounts]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccounts] = js.native
  def list(params: ParamsResourceAccountsList): GaxiosPromise[SchemaAccounts] = js.native
  def list(params: ParamsResourceAccountsList, callback: BodyResponseCallback[SchemaAccounts]): Unit = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: BodyResponseCallback[SchemaAccounts],
    callback: BodyResponseCallback[SchemaAccounts]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsList, options: MethodOptions): GaxiosPromise[SchemaAccounts] = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccounts]
  ): Unit = js.native
}

