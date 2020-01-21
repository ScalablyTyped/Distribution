package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Liasettings")
@js.native
class ResourceLiasettings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.liasettings.custombatch
    * @desc Retrieves and/or updates the LIA settings of multiple accounts in a
    * single request.
    * @alias content.liasettings.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {().LiasettingsCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[SchemaLiasettingsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaLiasettingsCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsResourceLiasettingsCustombatch): GaxiosPromise[SchemaLiasettingsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceLiasettingsCustombatch,
    callback: BodyResponseCallback[SchemaLiasettingsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceLiasettingsCustombatch,
    options: BodyResponseCallback[SchemaLiasettingsCustomBatchResponse],
    callback: BodyResponseCallback[SchemaLiasettingsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceLiasettingsCustombatch, options: MethodOptions): GaxiosPromise[SchemaLiasettingsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceLiasettingsCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.liasettings.get
    * @desc Retrieves the LIA settings of the account.
    * @alias content.liasettings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get or update LIA settings.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLiaSettings] = js.native
  def get(callback: BodyResponseCallback[SchemaLiaSettings]): Unit = js.native
  def get(params: ParamsResourceLiasettingsGet): GaxiosPromise[SchemaLiaSettings] = js.native
  def get(params: ParamsResourceLiasettingsGet, callback: BodyResponseCallback[SchemaLiaSettings]): Unit = js.native
  def get(
    params: ParamsResourceLiasettingsGet,
    options: BodyResponseCallback[SchemaLiaSettings],
    callback: BodyResponseCallback[SchemaLiaSettings]
  ): Unit = js.native
  def get(params: ParamsResourceLiasettingsGet, options: MethodOptions): GaxiosPromise[SchemaLiaSettings] = js.native
  def get(
    params: ParamsResourceLiasettingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiaSettings]
  ): Unit = js.native
  /**
    * content.liasettings.getaccessiblegmbaccounts
    * @desc Retrieves the list of accessible Google My Business accounts.
    * @alias content.liasettings.getaccessiblegmbaccounts
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to retrieve accessible Google My Business accounts.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getaccessiblegmbaccounts(): GaxiosPromise[SchemaLiasettingsGetAccessibleGmbAccountsResponse] = js.native
  def getaccessiblegmbaccounts(callback: BodyResponseCallback[SchemaLiasettingsGetAccessibleGmbAccountsResponse]): Unit = js.native
  def getaccessiblegmbaccounts(params: ParamsResourceLiasettingsGetaccessiblegmbaccounts): GaxiosPromise[SchemaLiasettingsGetAccessibleGmbAccountsResponse] = js.native
  def getaccessiblegmbaccounts(
    params: ParamsResourceLiasettingsGetaccessiblegmbaccounts,
    callback: BodyResponseCallback[SchemaLiasettingsGetAccessibleGmbAccountsResponse]
  ): Unit = js.native
  def getaccessiblegmbaccounts(
    params: ParamsResourceLiasettingsGetaccessiblegmbaccounts,
    options: BodyResponseCallback[SchemaLiasettingsGetAccessibleGmbAccountsResponse],
    callback: BodyResponseCallback[SchemaLiasettingsGetAccessibleGmbAccountsResponse]
  ): Unit = js.native
  def getaccessiblegmbaccounts(params: ParamsResourceLiasettingsGetaccessiblegmbaccounts, options: MethodOptions): GaxiosPromise[SchemaLiasettingsGetAccessibleGmbAccountsResponse] = js.native
  def getaccessiblegmbaccounts(
    params: ParamsResourceLiasettingsGetaccessiblegmbaccounts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsGetAccessibleGmbAccountsResponse]
  ): Unit = js.native
  /**
    * content.liasettings.list
    * @desc Lists the LIA settings of the sub-accounts in your Merchant Center
    * account.
    * @alias content.liasettings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of LIA settings to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaLiasettingsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaLiasettingsListResponse]): Unit = js.native
  def list(params: ParamsResourceLiasettingsList): GaxiosPromise[SchemaLiasettingsListResponse] = js.native
  def list(
    params: ParamsResourceLiasettingsList,
    callback: BodyResponseCallback[SchemaLiasettingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLiasettingsList,
    options: BodyResponseCallback[SchemaLiasettingsListResponse],
    callback: BodyResponseCallback[SchemaLiasettingsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLiasettingsList, options: MethodOptions): GaxiosPromise[SchemaLiasettingsListResponse] = js.native
  def list(
    params: ParamsResourceLiasettingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsListResponse]
  ): Unit = js.native
  /**
    * content.liasettings.listposdataproviders
    * @desc Retrieves the list of POS data providers that have active settings
    * for the all eiligible countries.
    * @alias content.liasettings.listposdataproviders
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listposdataproviders(): GaxiosPromise[SchemaLiasettingsListPosDataProvidersResponse] = js.native
  def listposdataproviders(callback: BodyResponseCallback[SchemaLiasettingsListPosDataProvidersResponse]): Unit = js.native
  def listposdataproviders(params: ParamsResourceLiasettingsListposdataproviders): GaxiosPromise[SchemaLiasettingsListPosDataProvidersResponse] = js.native
  def listposdataproviders(
    params: ParamsResourceLiasettingsListposdataproviders,
    callback: BodyResponseCallback[SchemaLiasettingsListPosDataProvidersResponse]
  ): Unit = js.native
  def listposdataproviders(
    params: ParamsResourceLiasettingsListposdataproviders,
    options: BodyResponseCallback[SchemaLiasettingsListPosDataProvidersResponse],
    callback: BodyResponseCallback[SchemaLiasettingsListPosDataProvidersResponse]
  ): Unit = js.native
  def listposdataproviders(params: ParamsResourceLiasettingsListposdataproviders, options: MethodOptions): GaxiosPromise[SchemaLiasettingsListPosDataProvidersResponse] = js.native
  def listposdataproviders(
    params: ParamsResourceLiasettingsListposdataproviders,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsListPosDataProvidersResponse]
  ): Unit = js.native
  /**
    * content.liasettings.patch
    * @desc Updates the LIA settings of the account. This method supports patch
    * semantics.
    * @alias content.liasettings.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get or update LIA settings.
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {().LiaSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaLiaSettings] = js.native
  def patch(callback: BodyResponseCallback[SchemaLiaSettings]): Unit = js.native
  def patch(params: ParamsResourceLiasettingsPatch): GaxiosPromise[SchemaLiaSettings] = js.native
  def patch(params: ParamsResourceLiasettingsPatch, callback: BodyResponseCallback[SchemaLiaSettings]): Unit = js.native
  def patch(
    params: ParamsResourceLiasettingsPatch,
    options: BodyResponseCallback[SchemaLiaSettings],
    callback: BodyResponseCallback[SchemaLiaSettings]
  ): Unit = js.native
  def patch(params: ParamsResourceLiasettingsPatch, options: MethodOptions): GaxiosPromise[SchemaLiaSettings] = js.native
  def patch(
    params: ParamsResourceLiasettingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiaSettings]
  ): Unit = js.native
  /**
    * content.liasettings.requestgmbaccess
    * @desc Requests access to a specified Google My Business account.
    * @alias content.liasettings.requestgmbaccess
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which GMB access is requested.
    * @param {string} params.gmbEmail The email of the Google My Business account.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def requestgmbaccess(): GaxiosPromise[SchemaLiasettingsRequestGmbAccessResponse] = js.native
  def requestgmbaccess(callback: BodyResponseCallback[SchemaLiasettingsRequestGmbAccessResponse]): Unit = js.native
  def requestgmbaccess(params: ParamsResourceLiasettingsRequestgmbaccess): GaxiosPromise[SchemaLiasettingsRequestGmbAccessResponse] = js.native
  def requestgmbaccess(
    params: ParamsResourceLiasettingsRequestgmbaccess,
    callback: BodyResponseCallback[SchemaLiasettingsRequestGmbAccessResponse]
  ): Unit = js.native
  def requestgmbaccess(
    params: ParamsResourceLiasettingsRequestgmbaccess,
    options: BodyResponseCallback[SchemaLiasettingsRequestGmbAccessResponse],
    callback: BodyResponseCallback[SchemaLiasettingsRequestGmbAccessResponse]
  ): Unit = js.native
  def requestgmbaccess(params: ParamsResourceLiasettingsRequestgmbaccess, options: MethodOptions): GaxiosPromise[SchemaLiasettingsRequestGmbAccessResponse] = js.native
  def requestgmbaccess(
    params: ParamsResourceLiasettingsRequestgmbaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsRequestGmbAccessResponse]
  ): Unit = js.native
  /**
    * content.liasettings.requestinventoryverification
    * @desc Requests inventory validation for the specified country.
    * @alias content.liasettings.requestinventoryverification
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.country The country for which inventory validation is requested.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def requestinventoryverification(): GaxiosPromise[SchemaLiasettingsRequestInventoryVerificationResponse] = js.native
  def requestinventoryverification(callback: BodyResponseCallback[SchemaLiasettingsRequestInventoryVerificationResponse]): Unit = js.native
  def requestinventoryverification(params: ParamsResourceLiasettingsRequestinventoryverification): GaxiosPromise[SchemaLiasettingsRequestInventoryVerificationResponse] = js.native
  def requestinventoryverification(
    params: ParamsResourceLiasettingsRequestinventoryverification,
    callback: BodyResponseCallback[SchemaLiasettingsRequestInventoryVerificationResponse]
  ): Unit = js.native
  def requestinventoryverification(
    params: ParamsResourceLiasettingsRequestinventoryverification,
    options: BodyResponseCallback[SchemaLiasettingsRequestInventoryVerificationResponse],
    callback: BodyResponseCallback[SchemaLiasettingsRequestInventoryVerificationResponse]
  ): Unit = js.native
  def requestinventoryverification(params: ParamsResourceLiasettingsRequestinventoryverification, options: MethodOptions): GaxiosPromise[SchemaLiasettingsRequestInventoryVerificationResponse] = js.native
  def requestinventoryverification(
    params: ParamsResourceLiasettingsRequestinventoryverification,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsRequestInventoryVerificationResponse]
  ): Unit = js.native
  /**
    * content.liasettings.setinventoryverificationcontact
    * @desc Sets the inventory verification contract for the specified country.
    * @alias content.liasettings.setinventoryverificationcontact
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.contactEmail The email of the inventory verification contact.
    * @param {string} params.contactName The name of the inventory verification contact.
    * @param {string} params.country The country for which inventory verification is requested.
    * @param {string} params.language The language for which inventory verification is requested.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setinventoryverificationcontact(): GaxiosPromise[SchemaLiasettingsSetInventoryVerificationContactResponse] = js.native
  def setinventoryverificationcontact(callback: BodyResponseCallback[SchemaLiasettingsSetInventoryVerificationContactResponse]): Unit = js.native
  def setinventoryverificationcontact(params: ParamsResourceLiasettingsSetinventoryverificationcontact): GaxiosPromise[SchemaLiasettingsSetInventoryVerificationContactResponse] = js.native
  def setinventoryverificationcontact(
    params: ParamsResourceLiasettingsSetinventoryverificationcontact,
    callback: BodyResponseCallback[SchemaLiasettingsSetInventoryVerificationContactResponse]
  ): Unit = js.native
  def setinventoryverificationcontact(
    params: ParamsResourceLiasettingsSetinventoryverificationcontact,
    options: BodyResponseCallback[SchemaLiasettingsSetInventoryVerificationContactResponse],
    callback: BodyResponseCallback[SchemaLiasettingsSetInventoryVerificationContactResponse]
  ): Unit = js.native
  def setinventoryverificationcontact(params: ParamsResourceLiasettingsSetinventoryverificationcontact, options: MethodOptions): GaxiosPromise[SchemaLiasettingsSetInventoryVerificationContactResponse] = js.native
  def setinventoryverificationcontact(
    params: ParamsResourceLiasettingsSetinventoryverificationcontact,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsSetInventoryVerificationContactResponse]
  ): Unit = js.native
  /**
    * content.liasettings.setposdataprovider
    * @desc Sets the POS data provider for the specified country.
    * @alias content.liasettings.setposdataprovider
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to retrieve accessible Google My Business accounts.
    * @param {string} params.country The country for which the POS data provider is selected.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {string=} params.posDataProviderId The ID of POS data provider.
    * @param {string=} params.posExternalAccountId The account ID by which this merchant is known to the POS data provider.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setposdataprovider(): GaxiosPromise[SchemaLiasettingsSetPosDataProviderResponse] = js.native
  def setposdataprovider(callback: BodyResponseCallback[SchemaLiasettingsSetPosDataProviderResponse]): Unit = js.native
  def setposdataprovider(params: ParamsResourceLiasettingsSetposdataprovider): GaxiosPromise[SchemaLiasettingsSetPosDataProviderResponse] = js.native
  def setposdataprovider(
    params: ParamsResourceLiasettingsSetposdataprovider,
    callback: BodyResponseCallback[SchemaLiasettingsSetPosDataProviderResponse]
  ): Unit = js.native
  def setposdataprovider(
    params: ParamsResourceLiasettingsSetposdataprovider,
    options: BodyResponseCallback[SchemaLiasettingsSetPosDataProviderResponse],
    callback: BodyResponseCallback[SchemaLiasettingsSetPosDataProviderResponse]
  ): Unit = js.native
  def setposdataprovider(params: ParamsResourceLiasettingsSetposdataprovider, options: MethodOptions): GaxiosPromise[SchemaLiasettingsSetPosDataProviderResponse] = js.native
  def setposdataprovider(
    params: ParamsResourceLiasettingsSetposdataprovider,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsSetPosDataProviderResponse]
  ): Unit = js.native
  /**
    * content.liasettings.update
    * @desc Updates the LIA settings of the account.
    * @alias content.liasettings.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get or update LIA settings.
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {().LiaSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaLiaSettings] = js.native
  def update(callback: BodyResponseCallback[SchemaLiaSettings]): Unit = js.native
  def update(params: ParamsResourceLiasettingsUpdate): GaxiosPromise[SchemaLiaSettings] = js.native
  def update(params: ParamsResourceLiasettingsUpdate, callback: BodyResponseCallback[SchemaLiaSettings]): Unit = js.native
  def update(
    params: ParamsResourceLiasettingsUpdate,
    options: BodyResponseCallback[SchemaLiaSettings],
    callback: BodyResponseCallback[SchemaLiaSettings]
  ): Unit = js.native
  def update(params: ParamsResourceLiasettingsUpdate, options: MethodOptions): GaxiosPromise[SchemaLiaSettings] = js.native
  def update(
    params: ParamsResourceLiasettingsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiaSettings]
  ): Unit = js.native
}

