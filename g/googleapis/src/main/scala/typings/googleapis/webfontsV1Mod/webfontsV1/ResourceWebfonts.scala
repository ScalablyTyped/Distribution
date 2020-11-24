package typings.googleapis.webfontsV1Mod.webfontsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/webfonts/v1", "webfonts_v1.Resource$Webfonts")
@js.native
class ResourceWebfonts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * webfonts.webfonts.list
    * @desc Retrieves the list of fonts currently served by the Google Fonts
    * Developer API
    * @alias webfonts.webfonts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.sort Enables sorting of the list
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaWebfontList] = js.native
  def list(callback: BodyResponseCallback[SchemaWebfontList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWebfontList] = js.native
  def list(params: ParamsResourceWebfontsList): GaxiosPromise[SchemaWebfontList] = js.native
  def list(params: ParamsResourceWebfontsList, callback: BodyResponseCallback[SchemaWebfontList]): Unit = js.native
  def list(
    params: ParamsResourceWebfontsList,
    options: BodyResponseCallback[SchemaWebfontList],
    callback: BodyResponseCallback[SchemaWebfontList]
  ): Unit = js.native
  def list(params: ParamsResourceWebfontsList, options: MethodOptions): GaxiosPromise[SchemaWebfontList] = js.native
  def list(
    params: ParamsResourceWebfontsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebfontList]
  ): Unit = js.native
}
