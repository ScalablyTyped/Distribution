package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Accounts")
@js.native
class ResourceAccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * content.accounts.authinfo
    * @desc Returns information about the authenticated user.
    * @alias content.accounts.authinfo
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def authinfo(): GaxiosPromise[SchemaAccountsAuthInfoResponse] = js.native
  def authinfo(callback: BodyResponseCallback[SchemaAccountsAuthInfoResponse]): Unit = js.native
  def authinfo(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsAuthInfoResponse] = js.native
  def authinfo(params: ParamsResourceAccountsAuthinfo): GaxiosPromise[SchemaAccountsAuthInfoResponse] = js.native
  def authinfo(
    params: ParamsResourceAccountsAuthinfo,
    callback: BodyResponseCallback[SchemaAccountsAuthInfoResponse]
  ): Unit = js.native
  def authinfo(
    params: ParamsResourceAccountsAuthinfo,
    options: BodyResponseCallback[SchemaAccountsAuthInfoResponse],
    callback: BodyResponseCallback[SchemaAccountsAuthInfoResponse]
  ): Unit = js.native
  def authinfo(params: ParamsResourceAccountsAuthinfo, options: MethodOptions): GaxiosPromise[SchemaAccountsAuthInfoResponse] = js.native
  def authinfo(
    params: ParamsResourceAccountsAuthinfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsAuthInfoResponse]
  ): Unit = js.native
  
  /**
    * content.accounts.claimwebsite
    * @desc Claims the website of a Merchant Center sub-account.
    * @alias content.accounts.claimwebsite
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account whose website is claimed.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {boolean=} params.overwrite Only available to selected merchants. When set to True, this flag removes any existing claim on the requested website by another account and replaces it with a claim from this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def claimwebsite(): GaxiosPromise[SchemaAccountsClaimWebsiteResponse] = js.native
  def claimwebsite(callback: BodyResponseCallback[SchemaAccountsClaimWebsiteResponse]): Unit = js.native
  def claimwebsite(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsClaimWebsiteResponse] = js.native
  def claimwebsite(params: ParamsResourceAccountsClaimwebsite): GaxiosPromise[SchemaAccountsClaimWebsiteResponse] = js.native
  def claimwebsite(
    params: ParamsResourceAccountsClaimwebsite,
    callback: BodyResponseCallback[SchemaAccountsClaimWebsiteResponse]
  ): Unit = js.native
  def claimwebsite(
    params: ParamsResourceAccountsClaimwebsite,
    options: BodyResponseCallback[SchemaAccountsClaimWebsiteResponse],
    callback: BodyResponseCallback[SchemaAccountsClaimWebsiteResponse]
  ): Unit = js.native
  def claimwebsite(params: ParamsResourceAccountsClaimwebsite, options: MethodOptions): GaxiosPromise[SchemaAccountsClaimWebsiteResponse] = js.native
  def claimwebsite(
    params: ParamsResourceAccountsClaimwebsite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsClaimWebsiteResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * content.accounts.custombatch
    * @desc Retrieves, inserts, updates, and deletes multiple Merchant Center
    * (sub-)accounts in a single request.
    * @alias content.accounts.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AccountsCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[SchemaAccountsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaAccountsCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceAccountsCustombatch): GaxiosPromise[SchemaAccountsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceAccountsCustombatch,
    callback: BodyResponseCallback[SchemaAccountsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceAccountsCustombatch,
    options: BodyResponseCallback[SchemaAccountsCustomBatchResponse],
    callback: BodyResponseCallback[SchemaAccountsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceAccountsCustombatch, options: MethodOptions): GaxiosPromise[SchemaAccountsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceAccountsCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsCustomBatchResponse]
  ): Unit = js.native
  
  /**
    * content.accounts.delete
    * @desc Deletes a Merchant Center sub-account.
    * @alias content.accounts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account.
    * @param {boolean=} params.force Flag to delete sub-accounts with products. The default value is false.
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account, and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * content.accounts.get
    * @desc Retrieves a Merchant Center account.
    * @alias content.accounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
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
    * content.accounts.insert
    * @desc Creates a Merchant Center sub-account.
    * @alias content.accounts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account.
    * @param {().Account} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAccount] = js.native
  def insert(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
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
  
  /**
    * content.accounts.link
    * @desc Performs an action on a link between a Merchant Center account and
    * another account.
    * @alias content.accounts.link
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account that should be linked.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {().AccountsLinkRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def link(): GaxiosPromise[SchemaAccountsLinkResponse] = js.native
  def link(callback: BodyResponseCallback[SchemaAccountsLinkResponse]): Unit = js.native
  def link(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsLinkResponse] = js.native
  def link(params: ParamsResourceAccountsLink): GaxiosPromise[SchemaAccountsLinkResponse] = js.native
  def link(params: ParamsResourceAccountsLink, callback: BodyResponseCallback[SchemaAccountsLinkResponse]): Unit = js.native
  def link(
    params: ParamsResourceAccountsLink,
    options: BodyResponseCallback[SchemaAccountsLinkResponse],
    callback: BodyResponseCallback[SchemaAccountsLinkResponse]
  ): Unit = js.native
  def link(params: ParamsResourceAccountsLink, options: MethodOptions): GaxiosPromise[SchemaAccountsLinkResponse] = js.native
  def link(
    params: ParamsResourceAccountsLink,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsLinkResponse]
  ): Unit = js.native
  
  /**
    * content.accounts.list
    * @desc Lists the sub-accounts in your Merchant Center account.
    * @alias content.accounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of accounts to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAccountsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsListResponse] = js.native
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
    * content.accounts.update
    * @desc Updates a Merchant Center account.
    * @alias content.accounts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {().Account} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaAccount] = js.native
  def update(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
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
