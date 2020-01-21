package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts")
@js.native
class ResourceAccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var containers: ResourceAccountsContainers = js.native
  var context: APIRequestContext = js.native
  var user_permissions: ResourceAccountsUserPermissions = js.native
  /**
    * tagmanager.accounts.get
    * @desc Gets a GTM Account.
    * @alias tagmanager.accounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Accounts's API relative path. Example: accounts/{account_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAccount] = js.native
  def get(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
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
    * tagmanager.accounts.list
    * @desc Lists all GTM Accounts that a user has access to.
    * @alias tagmanager.accounts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListAccountsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAccountsResponse]): Unit = js.native
  def list(params: ParamsResourceAccountsList): GaxiosPromise[SchemaListAccountsResponse] = js.native
  def list(params: ParamsResourceAccountsList, callback: BodyResponseCallback[SchemaListAccountsResponse]): Unit = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: BodyResponseCallback[SchemaListAccountsResponse],
    callback: BodyResponseCallback[SchemaListAccountsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsList, options: MethodOptions): GaxiosPromise[SchemaListAccountsResponse] = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAccountsResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.update
    * @desc Updates a GTM Account.
    * @alias tagmanager.accounts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the account in storage.
    * @param {string} params.path GTM Accounts's API relative path. Example: accounts/{account_id}
    * @param {().Account} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaAccount] = js.native
  def update(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
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

