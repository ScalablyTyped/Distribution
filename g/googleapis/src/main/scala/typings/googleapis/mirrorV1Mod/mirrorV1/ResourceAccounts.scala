package typings.googleapis.mirrorV1Mod.mirrorV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Accounts")
@js.native
class ResourceAccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * mirror.accounts.insert
    * @desc Inserts a new account for a user
    * @alias mirror.accounts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountName The name of the account to be passed to the Android Account Manager.
    * @param {string} params.accountType Account type to be passed to Android Account Manager.
    * @param {string} params.userToken The ID for the user.
    * @param {().Account} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAccount] = js.native
  def insert(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def insert(params: ParamsResourceAccountsInsert): GaxiosPromise[SchemaAccount] = js.native
  def insert(params: ParamsResourceAccountsInsert, callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def insert(
    params: ParamsResourceAccountsInsert,
    options: BodyResponseCallback[SchemaAccount],
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
  def insert(params: ParamsResourceAccountsInsert, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def insert(
    params: ParamsResourceAccountsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
}

