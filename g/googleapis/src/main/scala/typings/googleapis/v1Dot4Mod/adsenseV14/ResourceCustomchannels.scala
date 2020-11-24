package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Customchannels")
@js.native
class ResourceCustomchannels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var adunits: ResourceCustomchannelsAdunits = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * adsense.customchannels.get
    * @desc Get the specified custom channel from the specified ad client.
    * @alias adsense.customchannels.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client which contains the custom channel.
    * @param {string} params.customChannelId Custom channel to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(params: ParamsResourceCustomchannelsGet): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(params: ParamsResourceCustomchannelsGet, callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def get(
    params: ParamsResourceCustomchannelsGet,
    options: BodyResponseCallback[SchemaCustomChannel],
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  def get(params: ParamsResourceCustomchannelsGet, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(
    params: ParamsResourceCustomchannelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  
  /**
    * adsense.customchannels.list
    * @desc List all custom channels in the specified ad client for this
    * AdSense account.
    * @alias adsense.customchannels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
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
  def list(params: ParamsResourceCustomchannelsList): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(params: ParamsResourceCustomchannelsList, callback: BodyResponseCallback[SchemaCustomChannels]): Unit = js.native
  def list(
    params: ParamsResourceCustomchannelsList,
    options: BodyResponseCallback[SchemaCustomChannels],
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
  def list(params: ParamsResourceCustomchannelsList, options: MethodOptions): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(
    params: ParamsResourceCustomchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
}
