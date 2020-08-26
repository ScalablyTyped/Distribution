package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Creatives")
@js.native
class ResourceAccountsCreatives protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var dealAssociations: ResourceAccountsCreativesDealassociations = js.native
  /**
    * adexchangebuyer2.accounts.creatives.create
    * @desc Creates a creative.
    * @alias adexchangebuyer2.accounts.creatives.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account that this creative belongs to. Can be used to filter the response of the creatives.list method.
    * @param {string=} params.duplicateIdMode Indicates if multiple creatives can share an ID or not. Default is NO_DUPLICATES (one ID per creative).
    * @param {().Creative} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaCreative] = js.native
  def create(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def create(params: ParamsResourceAccountsCreativesCreate): GaxiosPromise[SchemaCreative] = js.native
  def create(params: ParamsResourceAccountsCreativesCreate, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def create(
    params: ParamsResourceAccountsCreativesCreate,
    options: BodyResponseCallback[SchemaCreative],
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsCreativesCreate, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def create(
    params: ParamsResourceAccountsCreativesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.get
    * @desc Gets a creative.
    * @alias adexchangebuyer2.accounts.creatives.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account the creative belongs to.
    * @param {string} params.creativeId The ID of the creative to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCreative] = js.native
  def get(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceAccountsCreativesGet): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceAccountsCreativesGet, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(
    params: ParamsResourceAccountsCreativesGet,
    options: BodyResponseCallback[SchemaCreative],
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsCreativesGet, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(
    params: ParamsResourceAccountsCreativesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.list
    * @desc Lists creatives.
    * @alias adexchangebuyer2.accounts.creatives.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account to list the creatives from. Specify "-" to list all creatives the current user has access to.
    * @param {integer=} params.pageSize Requested page size. The server may return fewer creatives than requested (due to timeout constraint) even if more are available via another call. If unspecified, server will pick an appropriate default. Acceptable values are 1 to 1000, inclusive.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListCreativesResponse.next_page_token returned from the previous call to 'ListCreatives' method.
    * @param {string=} params.query An optional query string to filter creatives. If no filter is specified, all active creatives will be returned. <p>Supported queries are: <ul> <li>accountId=<i>account_id_string</i> <li>creativeId=<i>creative_id_string</i> <li>dealsStatus: {approved, conditionally_approved, disapproved,                    not_checked} <li>openAuctionStatus: {approved, conditionally_approved, disapproved,                           not_checked} <li>attribute: {a numeric attribute from the list of attributes} <li>disapprovalReason: {a reason from DisapprovalReason} </ul> Example: 'accountId=12345 AND (dealsStatus:disapproved AND disapprovalReason:unacceptable_content) OR attribute:47'
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCreativesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(params: ParamsResourceAccountsCreativesList): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(
    params: ParamsResourceAccountsCreativesList,
    callback: BodyResponseCallback[SchemaListCreativesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsCreativesList,
    options: BodyResponseCallback[SchemaListCreativesResponse],
    callback: BodyResponseCallback[SchemaListCreativesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsCreativesList, options: MethodOptions): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(
    params: ParamsResourceAccountsCreativesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCreativesResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.stopWatching
    * @desc Stops watching a creative. Will stop push notifications being sent
    * to the topics when the creative changes status.
    * @alias adexchangebuyer2.accounts.creatives.stopWatching
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account of the creative to stop notifications for.
    * @param {string} params.creativeId The creative ID of the creative to stop notifications for. Specify "-" to specify stopping account level notifications.
    * @param {().StopWatchingCreativeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stopWatching(): GaxiosPromise[SchemaEmpty] = js.native
  def stopWatching(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def stopWatching(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def stopWatching(params: ParamsResourceAccountsCreativesStopwatching): GaxiosPromise[SchemaEmpty] = js.native
  def stopWatching(params: ParamsResourceAccountsCreativesStopwatching, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def stopWatching(
    params: ParamsResourceAccountsCreativesStopwatching,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def stopWatching(params: ParamsResourceAccountsCreativesStopwatching, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def stopWatching(
    params: ParamsResourceAccountsCreativesStopwatching,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.update
    * @desc Updates a creative.
    * @alias adexchangebuyer2.accounts.creatives.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account that this creative belongs to. Can be used to filter the response of the creatives.list method.
    * @param {string} params.creativeId The buyer-defined creative ID of this creative. Can be used to filter the response of the creatives.list method.
    * @param {().Creative} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCreative] = js.native
  def update(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def update(params: ParamsResourceAccountsCreativesUpdate): GaxiosPromise[SchemaCreative] = js.native
  def update(params: ParamsResourceAccountsCreativesUpdate, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def update(
    params: ParamsResourceAccountsCreativesUpdate,
    options: BodyResponseCallback[SchemaCreative],
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsCreativesUpdate, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def update(
    params: ParamsResourceAccountsCreativesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.watch
    * @desc Watches a creative. Will result in push notifications being sent to
    * the topic when the creative changes status.
    * @alias adexchangebuyer2.accounts.creatives.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account of the creative to watch.
    * @param {string} params.creativeId The creative ID to watch for status changes. Specify "-" to watch all creatives under the above account. If both creative-level and account-level notifications are sent, only a single notification will be sent to the creative-level notification topic.
    * @param {().WatchCreativeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[SchemaEmpty] = js.native
  def watch(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def watch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def watch(params: ParamsResourceAccountsCreativesWatch): GaxiosPromise[SchemaEmpty] = js.native
  def watch(params: ParamsResourceAccountsCreativesWatch, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def watch(
    params: ParamsResourceAccountsCreativesWatch,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def watch(params: ParamsResourceAccountsCreativesWatch, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def watch(
    params: ParamsResourceAccountsCreativesWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}

