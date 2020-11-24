package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Adclients")
@js.native
class ResourceAdclients protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsense.adclients.list
    * @desc List all ad clients in this AdSense account.
    * @alias adsense.adclients.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of ad clients to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAdClients] = js.native
  def list(callback: BodyResponseCallback[SchemaAdClients]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdClients] = js.native
  def list(params: ParamsResourceAdclientsList): GaxiosPromise[SchemaAdClients] = js.native
  def list(params: ParamsResourceAdclientsList, callback: BodyResponseCallback[SchemaAdClients]): Unit = js.native
  def list(
    params: ParamsResourceAdclientsList,
    options: BodyResponseCallback[SchemaAdClients],
    callback: BodyResponseCallback[SchemaAdClients]
  ): Unit = js.native
  def list(params: ParamsResourceAdclientsList, options: MethodOptions): GaxiosPromise[SchemaAdClients] = js.native
  def list(
    params: ParamsResourceAdclientsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdClients]
  ): Unit = js.native
}
