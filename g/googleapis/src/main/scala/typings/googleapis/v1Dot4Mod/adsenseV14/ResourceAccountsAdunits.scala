package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Adunits")
@js.native
class ResourceAccountsAdunits protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var customchannels: ResourceAccountsAdunitsCustomchannels = js.native
  
  /**
    * adsense.accounts.adunits.get
    * @desc Gets the specified ad unit in the specified ad client for the
    * specified account.
    * @alias adsense.accounts.adunits.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account to which the ad client belongs.
    * @param {string} params.adClientId Ad client for which to get the ad unit.
    * @param {string} params.adUnitId Ad unit to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAdUnit] = js.native
  def get(callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
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
    * adsense.accounts.adunits.getAdCode
    * @desc Get ad code for the specified ad unit.
    * @alias adsense.accounts.adunits.getAdCode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad client.
    * @param {string} params.adClientId Ad client with contains the ad unit.
    * @param {string} params.adUnitId Ad unit to get the code for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAdCode(): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(callback: BodyResponseCallback[SchemaAdCode]): Unit = js.native
  def getAdCode(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdCode] = js.native
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
    * adsense.accounts.adunits.list
    * @desc List all ad units in the specified ad client for the specified
    * account.
    * @alias adsense.accounts.adunits.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account to which the ad client belongs.
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
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdUnits] = js.native
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
}
