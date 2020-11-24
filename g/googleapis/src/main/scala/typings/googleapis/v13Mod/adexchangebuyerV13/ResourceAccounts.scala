package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.3", "adexchangebuyer_v1_3.Resource$Accounts")
@js.native
class ResourceAccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer.accounts.get
    * @desc Gets one account by ID.
    * @alias adexchangebuyer.accounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.id The account id
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
    * adexchangebuyer.accounts.list
    * @desc Retrieves the authenticated user's list of accounts.
    * @alias adexchangebuyer.accounts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAccountsList] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountsList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountsList] = js.native
  def list(params: ParamsResourceAccountsList): GaxiosPromise[SchemaAccountsList] = js.native
  def list(params: ParamsResourceAccountsList, callback: BodyResponseCallback[SchemaAccountsList]): Unit = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: BodyResponseCallback[SchemaAccountsList],
    callback: BodyResponseCallback[SchemaAccountsList]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsList, options: MethodOptions): GaxiosPromise[SchemaAccountsList] = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsList]
  ): Unit = js.native
  
  /**
    * adexchangebuyer.accounts.patch
    * @desc Updates an existing account. This method supports patch semantics.
    * @alias adexchangebuyer.accounts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.id The account id
    * @param {().Account} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaAccount] = js.native
  def patch(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def patch(params: ParamsResourceAccountsPatch): GaxiosPromise[SchemaAccount] = js.native
  def patch(params: ParamsResourceAccountsPatch, callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def patch(
    params: ParamsResourceAccountsPatch,
    options: BodyResponseCallback[SchemaAccount],
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountsPatch, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def patch(
    params: ParamsResourceAccountsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
  
  /**
    * adexchangebuyer.accounts.update
    * @desc Updates an existing account.
    * @alias adexchangebuyer.accounts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.id The account id
    * @param {().Account} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaAccount] = js.native
  def update(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def update(params: ParamsResourceAccountsUpdate): GaxiosPromise[SchemaAccount] = js.native
  def update(params: ParamsResourceAccountsUpdate, callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def update(
    params: ParamsResourceAccountsUpdate,
    options: BodyResponseCallback[SchemaAccount],
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsUpdate, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def update(
    params: ParamsResourceAccountsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
}
