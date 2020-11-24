package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Customchannels$Adunits")
@js.native
class ResourceCustomchannelsAdunits protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsense.customchannels.adunits.list
    * @desc List all ad units in the specified custom channel.
    * @alias adsense.customchannels.adunits.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client which contains the custom channel.
    * @param {string} params.customChannelId Custom channel for which to list ad units.
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
  def list(params: ParamsResourceCustomchannelsAdunitsList): GaxiosPromise[SchemaAdUnits] = js.native
  def list(params: ParamsResourceCustomchannelsAdunitsList, callback: BodyResponseCallback[SchemaAdUnits]): Unit = js.native
  def list(
    params: ParamsResourceCustomchannelsAdunitsList,
    options: BodyResponseCallback[SchemaAdUnits],
    callback: BodyResponseCallback[SchemaAdUnits]
  ): Unit = js.native
  def list(params: ParamsResourceCustomchannelsAdunitsList, options: MethodOptions): GaxiosPromise[SchemaAdUnits] = js.native
  def list(
    params: ParamsResourceCustomchannelsAdunitsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnits]
  ): Unit = js.native
}
