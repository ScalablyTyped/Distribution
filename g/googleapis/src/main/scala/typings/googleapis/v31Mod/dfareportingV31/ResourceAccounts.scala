package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Accounts")
@js.native
class ResourceAccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.accounts.get
    * @desc Gets one account by ID.
    * @alias dfareporting.accounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Account ID.
    * @param {string} params.profileId User profile ID associated with this request.
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
    * dfareporting.accounts.list
    * @desc Retrieves the list of accounts, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.accounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.active Select only active accounts. Don't set this field to select both active and non-active accounts.
    * @param {string=} params.ids Select only accounts with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "account*2015" will return objects with names like "account June 2015", "account April 2015", or simply "account 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "account" will match objects with name "my account", "account 2015", or simply "account".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAccountsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountsListResponse] = js.native
  def list(params: ParamsResourceAccountsList): GaxiosPromise[SchemaAccountsListResponse] = js.native
  def list(params: ParamsResourceAccountsList, callback: BodyResponseCallback[SchemaAccountsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: BodyResponseCallback[SchemaAccountsListResponse],
    callback: BodyResponseCallback[SchemaAccountsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsList, options: MethodOptions): GaxiosPromise[SchemaAccountsListResponse] = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.accounts.patch
    * @desc Updates an existing account. This method supports patch semantics.
    * @alias dfareporting.accounts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Account ID.
    * @param {string} params.profileId User profile ID associated with this request.
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
    * dfareporting.accounts.update
    * @desc Updates an existing account.
    * @alias dfareporting.accounts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
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
