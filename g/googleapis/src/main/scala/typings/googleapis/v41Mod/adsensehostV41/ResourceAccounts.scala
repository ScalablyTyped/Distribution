package typings.googleapis.v41Mod.adsensehostV41

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Accounts")
@js.native
class ResourceAccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var adclients: ResourceAccountsAdclients = js.native
  
  var adunits: ResourceAccountsAdunits = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * adsensehost.accounts.get
    * @desc Get information about the selected associated AdSense account.
    * @alias adsensehost.accounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account to get information about.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAccount] = js.native
  def get(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
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
    * adsensehost.accounts.list
    * @desc List hosted accounts associated with this AdSense account by ad
    * client id.
    * @alias adsensehost.accounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.filterAdClientId Ad clients to list accounts for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAccounts] = js.native
  def list(callback: BodyResponseCallback[SchemaAccounts]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccounts] = js.native
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
  
  var reports: ResourceAccountsReports = js.native
}
