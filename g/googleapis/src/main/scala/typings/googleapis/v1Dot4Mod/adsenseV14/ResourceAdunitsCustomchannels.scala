package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Adunits$Customchannels")
@js.native
class ResourceAdunitsCustomchannels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsense.adunits.customchannels.list
    * @desc List all custom channels which the specified ad unit belongs to.
    * @alias adsense.adunits.customchannels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client which contains the ad unit.
    * @param {string} params.adUnitId Ad unit for which to list custom channels.
    * @param {integer=} params.maxResults The maximum number of custom channels to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through custom channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomChannels]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(params: ParamsResourceAdunitsCustomchannelsList): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(
    params: ParamsResourceAdunitsCustomchannelsList,
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdunitsCustomchannelsList,
    options: BodyResponseCallback[SchemaCustomChannels],
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
  def list(params: ParamsResourceAdunitsCustomchannelsList, options: MethodOptions): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(
    params: ParamsResourceAdunitsCustomchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
}
