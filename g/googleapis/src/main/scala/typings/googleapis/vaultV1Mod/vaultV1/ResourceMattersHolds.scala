package typings.googleapis.vaultV1Mod.vaultV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters$Holds")
@js.native
class ResourceMattersHolds protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var accounts: ResourceMattersHoldsAccounts = js.native
  
  /**
    * vault.matters.holds.addHeldAccounts
    * @desc Adds HeldAccounts to a hold. Returns a list of accounts that have
    * been successfully added. Accounts can only be added to an existing
    * account-based hold.
    * @alias vault.matters.holds.addHeldAccounts
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {().AddHeldAccountsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addHeldAccounts(): GaxiosPromise[SchemaAddHeldAccountsResponse] = js.native
  def addHeldAccounts(callback: BodyResponseCallback[SchemaAddHeldAccountsResponse]): Unit = js.native
  def addHeldAccounts(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAddHeldAccountsResponse] = js.native
  def addHeldAccounts(params: ParamsResourceMattersHoldsAddheldaccounts): GaxiosPromise[SchemaAddHeldAccountsResponse] = js.native
  def addHeldAccounts(
    params: ParamsResourceMattersHoldsAddheldaccounts,
    callback: BodyResponseCallback[SchemaAddHeldAccountsResponse]
  ): Unit = js.native
  def addHeldAccounts(
    params: ParamsResourceMattersHoldsAddheldaccounts,
    options: BodyResponseCallback[SchemaAddHeldAccountsResponse],
    callback: BodyResponseCallback[SchemaAddHeldAccountsResponse]
  ): Unit = js.native
  def addHeldAccounts(params: ParamsResourceMattersHoldsAddheldaccounts, options: MethodOptions): GaxiosPromise[SchemaAddHeldAccountsResponse] = js.native
  def addHeldAccounts(
    params: ParamsResourceMattersHoldsAddheldaccounts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAddHeldAccountsResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * vault.matters.holds.create
    * @desc Creates a hold in the given matter.
    * @alias vault.matters.holds.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().Hold} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaHold] = js.native
  def create(callback: BodyResponseCallback[SchemaHold]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHold] = js.native
  def create(params: ParamsResourceMattersHoldsCreate): GaxiosPromise[SchemaHold] = js.native
  def create(params: ParamsResourceMattersHoldsCreate, callback: BodyResponseCallback[SchemaHold]): Unit = js.native
  def create(
    params: ParamsResourceMattersHoldsCreate,
    options: BodyResponseCallback[SchemaHold],
    callback: BodyResponseCallback[SchemaHold]
  ): Unit = js.native
  def create(params: ParamsResourceMattersHoldsCreate, options: MethodOptions): GaxiosPromise[SchemaHold] = js.native
  def create(
    params: ParamsResourceMattersHoldsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHold]
  ): Unit = js.native
  
  /**
    * vault.matters.holds.delete
    * @desc Removes a hold by ID. This will release any HeldAccounts on this
    * Hold.
    * @alias vault.matters.holds.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersHoldsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersHoldsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceMattersHoldsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceMattersHoldsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceMattersHoldsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * vault.matters.holds.get
    * @desc Gets a hold by ID.
    * @alias vault.matters.holds.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {string=} params.view Specifies which parts of the Hold to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaHold] = js.native
  def get(callback: BodyResponseCallback[SchemaHold]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHold] = js.native
  def get(params: ParamsResourceMattersHoldsGet): GaxiosPromise[SchemaHold] = js.native
  def get(params: ParamsResourceMattersHoldsGet, callback: BodyResponseCallback[SchemaHold]): Unit = js.native
  def get(
    params: ParamsResourceMattersHoldsGet,
    options: BodyResponseCallback[SchemaHold],
    callback: BodyResponseCallback[SchemaHold]
  ): Unit = js.native
  def get(params: ParamsResourceMattersHoldsGet, options: MethodOptions): GaxiosPromise[SchemaHold] = js.native
  def get(
    params: ParamsResourceMattersHoldsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHold]
  ): Unit = js.native
  
  /**
    * vault.matters.holds.list
    * @desc Lists holds within a matter. An empty page token in
    * ListHoldsResponse denotes no more holds to list.
    * @alias vault.matters.holds.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {integer=} params.pageSize The number of holds to return in the response, between 0 and 100 inclusive. Leaving this empty, or as 0, is the same as page_size = 100.
    * @param {string=} params.pageToken The pagination token as returned in the response. An empty token means start from the beginning.
    * @param {string=} params.view Specifies which parts of the Hold to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListHoldsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListHoldsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListHoldsResponse] = js.native
  def list(params: ParamsResourceMattersHoldsList): GaxiosPromise[SchemaListHoldsResponse] = js.native
  def list(params: ParamsResourceMattersHoldsList, callback: BodyResponseCallback[SchemaListHoldsResponse]): Unit = js.native
  def list(
    params: ParamsResourceMattersHoldsList,
    options: BodyResponseCallback[SchemaListHoldsResponse],
    callback: BodyResponseCallback[SchemaListHoldsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMattersHoldsList, options: MethodOptions): GaxiosPromise[SchemaListHoldsResponse] = js.native
  def list(
    params: ParamsResourceMattersHoldsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListHoldsResponse]
  ): Unit = js.native
  
  /**
    * vault.matters.holds.removeHeldAccounts
    * @desc Removes HeldAccounts from a hold. Returns a list of statuses in the
    * same order as the request. If this request leaves the hold with no held
    * accounts, the hold will not apply to any accounts.
    * @alias vault.matters.holds.removeHeldAccounts
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {().RemoveHeldAccountsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeHeldAccounts(): GaxiosPromise[SchemaRemoveHeldAccountsResponse] = js.native
  def removeHeldAccounts(callback: BodyResponseCallback[SchemaRemoveHeldAccountsResponse]): Unit = js.native
  def removeHeldAccounts(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRemoveHeldAccountsResponse] = js.native
  def removeHeldAccounts(params: ParamsResourceMattersHoldsRemoveheldaccounts): GaxiosPromise[SchemaRemoveHeldAccountsResponse] = js.native
  def removeHeldAccounts(
    params: ParamsResourceMattersHoldsRemoveheldaccounts,
    callback: BodyResponseCallback[SchemaRemoveHeldAccountsResponse]
  ): Unit = js.native
  def removeHeldAccounts(
    params: ParamsResourceMattersHoldsRemoveheldaccounts,
    options: BodyResponseCallback[SchemaRemoveHeldAccountsResponse],
    callback: BodyResponseCallback[SchemaRemoveHeldAccountsResponse]
  ): Unit = js.native
  def removeHeldAccounts(params: ParamsResourceMattersHoldsRemoveheldaccounts, options: MethodOptions): GaxiosPromise[SchemaRemoveHeldAccountsResponse] = js.native
  def removeHeldAccounts(
    params: ParamsResourceMattersHoldsRemoveheldaccounts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemoveHeldAccountsResponse]
  ): Unit = js.native
  
  /**
    * vault.matters.holds.update
    * @desc Updates the OU and/or query parameters of a hold. You cannot add
    * accounts to a hold that covers an OU, nor can you add OUs to a hold that
    * covers individual accounts. Accounts listed in the hold will be ignored.
    * @alias vault.matters.holds.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The ID of the hold.
    * @param {string} params.matterId The matter ID.
    * @param {().Hold} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaHold] = js.native
  def update(callback: BodyResponseCallback[SchemaHold]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHold] = js.native
  def update(params: ParamsResourceMattersHoldsUpdate): GaxiosPromise[SchemaHold] = js.native
  def update(params: ParamsResourceMattersHoldsUpdate, callback: BodyResponseCallback[SchemaHold]): Unit = js.native
  def update(
    params: ParamsResourceMattersHoldsUpdate,
    options: BodyResponseCallback[SchemaHold],
    callback: BodyResponseCallback[SchemaHold]
  ): Unit = js.native
  def update(params: ParamsResourceMattersHoldsUpdate, options: MethodOptions): GaxiosPromise[SchemaHold] = js.native
  def update(
    params: ParamsResourceMattersHoldsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHold]
  ): Unit = js.native
}
