package typings.googleapis.vaultV1Mod.vaultV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters$Holds$Accounts")
@js.native
class ResourceMattersHoldsAccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * vault.matters.holds.accounts.create
    * @desc Adds a HeldAccount to a hold. Accounts can only be added to a hold
    * that has no held_org_unit set. Attempting to add an account to an
    * OU-based hold will result in an error.
    * @alias vault.matters.holds.accounts.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {().HeldAccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaHeldAccount] = js.native
  def create(callback: BodyResponseCallback[SchemaHeldAccount]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHeldAccount] = js.native
  def create(params: ParamsResourceMattersHoldsAccountsCreate): GaxiosPromise[SchemaHeldAccount] = js.native
  def create(
    params: ParamsResourceMattersHoldsAccountsCreate,
    callback: BodyResponseCallback[SchemaHeldAccount]
  ): Unit = js.native
  def create(
    params: ParamsResourceMattersHoldsAccountsCreate,
    options: BodyResponseCallback[SchemaHeldAccount],
    callback: BodyResponseCallback[SchemaHeldAccount]
  ): Unit = js.native
  def create(params: ParamsResourceMattersHoldsAccountsCreate, options: MethodOptions): GaxiosPromise[SchemaHeldAccount] = js.native
  def create(
    params: ParamsResourceMattersHoldsAccountsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHeldAccount]
  ): Unit = js.native
  
  /**
    * vault.matters.holds.accounts.delete
    * @desc Removes a HeldAccount from a hold. If this request leaves the hold
    * with no held accounts, the hold will not apply to any accounts.
    * @alias vault.matters.holds.accounts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account to remove from the hold.
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersHoldsAccountsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersHoldsAccountsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceMattersHoldsAccountsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceMattersHoldsAccountsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceMattersHoldsAccountsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * vault.matters.holds.accounts.list
    * @desc Lists HeldAccounts for a hold. This will only list individually
    * specified held accounts. If the hold is on an OU, then use <a
    * href="https://developers.google.com/admin-sdk/">Admin SDK</a> to
    * enumerate its members.
    * @alias vault.matters.holds.accounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListHeldAccountsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListHeldAccountsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListHeldAccountsResponse] = js.native
  def list(params: ParamsResourceMattersHoldsAccountsList): GaxiosPromise[SchemaListHeldAccountsResponse] = js.native
  def list(
    params: ParamsResourceMattersHoldsAccountsList,
    callback: BodyResponseCallback[SchemaListHeldAccountsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMattersHoldsAccountsList,
    options: BodyResponseCallback[SchemaListHeldAccountsResponse],
    callback: BodyResponseCallback[SchemaListHeldAccountsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMattersHoldsAccountsList, options: MethodOptions): GaxiosPromise[SchemaListHeldAccountsResponse] = js.native
  def list(
    params: ParamsResourceMattersHoldsAccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListHeldAccountsResponse]
  ): Unit = js.native
}
