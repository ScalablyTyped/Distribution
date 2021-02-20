package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Urlchannels")
@js.native
class ResourceUrlchannels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsense.urlchannels.list
    * @desc List all URL channels in the specified ad client for this AdSense
    * account.
    * @alias adsense.urlchannels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client for which to list URL channels.
    * @param {integer=} params.maxResults The maximum number of URL channels to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through URL channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaUrlChannels] = js.native
  def list(callback: BodyResponseCallback[SchemaUrlChannels]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrlChannels] = js.native
  def list(params: ParamsResourceUrlchannelsList): GaxiosPromise[SchemaUrlChannels] = js.native
  def list(params: ParamsResourceUrlchannelsList, callback: BodyResponseCallback[SchemaUrlChannels]): Unit = js.native
  def list(
    params: ParamsResourceUrlchannelsList,
    options: BodyResponseCallback[SchemaUrlChannels],
    callback: BodyResponseCallback[SchemaUrlChannels]
  ): Unit = js.native
  def list(params: ParamsResourceUrlchannelsList, options: MethodOptions): GaxiosPromise[SchemaUrlChannels] = js.native
  def list(
    params: ParamsResourceUrlchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlChannels]
  ): Unit = js.native
}
