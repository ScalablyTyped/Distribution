package typings.googleapis.v41Mod.adsensehostV41

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Accounts$Adunits")
@js.native
class ResourceAccountsAdunits protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsensehost.accounts.adunits.delete
    * @desc Delete the specified ad unit from the specified publisher AdSense
    * account.
    * @alias adsensehost.accounts.adunits.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad unit.
    * @param {string} params.adClientId Ad client for which to get ad unit.
    * @param {string} params.adUnitId Ad unit to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaAdUnit] = js.native
  def delete(callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def delete(params: ParamsResourceAccountsAdunitsDelete): GaxiosPromise[SchemaAdUnit] = js.native
  def delete(params: ParamsResourceAccountsAdunitsDelete, callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsAdunitsDelete,
    options: BodyResponseCallback[SchemaAdUnit],
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsAdunitsDelete, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def delete(
    params: ParamsResourceAccountsAdunitsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  
  /**
    * adsensehost.accounts.adunits.get
    * @desc Get the specified host ad unit in this AdSense account.
    * @alias adsensehost.accounts.adunits.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad unit.
    * @param {string} params.adClientId Ad client for which to get ad unit.
    * @param {string} params.adUnitId Ad unit to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAdUnit] = js.native
  def get(callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def get(params: ParamsResourceAccountsAdunitsGet): GaxiosPromise[SchemaAdUnit] = js.native
  def get(params: ParamsResourceAccountsAdunitsGet, callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def get(
    params: ParamsResourceAccountsAdunitsGet,
    options: BodyResponseCallback[SchemaAdUnit],
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsAdunitsGet, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def get(
    params: ParamsResourceAccountsAdunitsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  
  /**
    * adsensehost.accounts.adunits.getAdCode
    * @desc Get ad code for the specified ad unit, attaching the specified host
    * custom channels.
    * @alias adsensehost.accounts.adunits.getAdCode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad client.
    * @param {string} params.adClientId Ad client with contains the ad unit.
    * @param {string} params.adUnitId Ad unit to get the code for.
    * @param {string=} params.hostCustomChannelId Host custom channel to attach to the ad code.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAdCode(): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(callback: BodyResponseCallback[SchemaAdCode]): Unit = js.native
  def getAdCode(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(params: ParamsResourceAccountsAdunitsGetadcode): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(params: ParamsResourceAccountsAdunitsGetadcode, callback: BodyResponseCallback[SchemaAdCode]): Unit = js.native
  def getAdCode(
    params: ParamsResourceAccountsAdunitsGetadcode,
    options: BodyResponseCallback[SchemaAdCode],
    callback: BodyResponseCallback[SchemaAdCode]
  ): Unit = js.native
  def getAdCode(params: ParamsResourceAccountsAdunitsGetadcode, options: MethodOptions): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(
    params: ParamsResourceAccountsAdunitsGetadcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdCode]
  ): Unit = js.native
  
  /**
    * adsensehost.accounts.adunits.insert
    * @desc Insert the supplied ad unit into the specified publisher AdSense
    * account.
    * @alias adsensehost.accounts.adunits.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which will contain the ad unit.
    * @param {string} params.adClientId Ad client into which to insert the ad unit.
    * @param {().AdUnit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAdUnit] = js.native
  def insert(callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def insert(params: ParamsResourceAccountsAdunitsInsert): GaxiosPromise[SchemaAdUnit] = js.native
  def insert(params: ParamsResourceAccountsAdunitsInsert, callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def insert(
    params: ParamsResourceAccountsAdunitsInsert,
    options: BodyResponseCallback[SchemaAdUnit],
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  def insert(params: ParamsResourceAccountsAdunitsInsert, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def insert(
    params: ParamsResourceAccountsAdunitsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  
  /**
    * adsensehost.accounts.adunits.list
    * @desc List all ad units in the specified publisher's AdSense account.
    * @alias adsensehost.accounts.adunits.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad client.
    * @param {string} params.adClientId Ad client for which to list ad units.
    * @param {boolean=} params.includeInactive Whether to include inactive ad units. Default: true.
    * @param {integer=} params.maxResults The maximum number of ad units to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through ad units. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAdUnits] = js.native
  def list(callback: BodyResponseCallback[SchemaAdUnits]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdUnits] = js.native
  def list(params: ParamsResourceAccountsAdunitsList): GaxiosPromise[SchemaAdUnits] = js.native
  def list(params: ParamsResourceAccountsAdunitsList, callback: BodyResponseCallback[SchemaAdUnits]): Unit = js.native
  def list(
    params: ParamsResourceAccountsAdunitsList,
    options: BodyResponseCallback[SchemaAdUnits],
    callback: BodyResponseCallback[SchemaAdUnits]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsAdunitsList, options: MethodOptions): GaxiosPromise[SchemaAdUnits] = js.native
  def list(
    params: ParamsResourceAccountsAdunitsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnits]
  ): Unit = js.native
  
  /**
    * adsensehost.accounts.adunits.patch
    * @desc Update the supplied ad unit in the specified publisher AdSense
    * account. This method supports patch semantics.
    * @alias adsensehost.accounts.adunits.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad client.
    * @param {string} params.adClientId Ad client which contains the ad unit.
    * @param {string} params.adUnitId Ad unit to get.
    * @param {().AdUnit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaAdUnit] = js.native
  def patch(callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def patch(params: ParamsResourceAccountsAdunitsPatch): GaxiosPromise[SchemaAdUnit] = js.native
  def patch(params: ParamsResourceAccountsAdunitsPatch, callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def patch(
    params: ParamsResourceAccountsAdunitsPatch,
    options: BodyResponseCallback[SchemaAdUnit],
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountsAdunitsPatch, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def patch(
    params: ParamsResourceAccountsAdunitsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  
  /**
    * adsensehost.accounts.adunits.update
    * @desc Update the supplied ad unit in the specified publisher AdSense
    * account.
    * @alias adsensehost.accounts.adunits.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad client.
    * @param {string} params.adClientId Ad client which contains the ad unit.
    * @param {().AdUnit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaAdUnit] = js.native
  def update(callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def update(params: ParamsResourceAccountsAdunitsUpdate): GaxiosPromise[SchemaAdUnit] = js.native
  def update(params: ParamsResourceAccountsAdunitsUpdate, callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def update(
    params: ParamsResourceAccountsAdunitsUpdate,
    options: BodyResponseCallback[SchemaAdUnit],
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsAdunitsUpdate, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def update(
    params: ParamsResourceAccountsAdunitsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
}
