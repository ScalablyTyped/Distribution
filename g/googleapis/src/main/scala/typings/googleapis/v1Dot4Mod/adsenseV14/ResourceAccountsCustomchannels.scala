package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Customchannels")
@js.native
class ResourceAccountsCustomchannels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var adunits: ResourceAccountsCustomchannelsAdunits = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * adsense.accounts.customchannels.get
    * @desc Get the specified custom channel from the specified ad client for
    * the specified account.
    * @alias adsense.accounts.customchannels.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account to which the ad client belongs.
    * @param {string} params.adClientId Ad client which contains the custom channel.
    * @param {string} params.customChannelId Custom channel to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(params: ParamsResourceAccountsCustomchannelsGet): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(
    params: ParamsResourceAccountsCustomchannelsGet,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsCustomchannelsGet,
    options: BodyResponseCallback[SchemaCustomChannel],
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsCustomchannelsGet, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(
    params: ParamsResourceAccountsCustomchannelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  
  /**
    * adsense.accounts.customchannels.list
    * @desc List all custom channels in the specified ad client for the
    * specified account.
    * @alias adsense.accounts.customchannels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account to which the ad client belongs.
    * @param {string} params.adClientId Ad client for which to list custom channels.
    * @param {integer=} params.maxResults The maximum number of custom channels to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through custom channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomChannels]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(params: ParamsResourceAccountsCustomchannelsList): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(
    params: ParamsResourceAccountsCustomchannelsList,
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsCustomchannelsList,
    options: BodyResponseCallback[SchemaCustomChannels],
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsCustomchannelsList, options: MethodOptions): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(
    params: ParamsResourceAccountsCustomchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
}
