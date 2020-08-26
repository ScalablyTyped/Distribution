package typings.googleapis.oauth2V2Mod.oauth2V2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/oauth2/v2", "oauth2_v2.Resource$Userinfo")
@js.native
class ResourceUserinfo protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var v2: ResourceUserinfoV2 = js.native
  /**
    * oauth2.userinfo.get
    * @alias oauth2.userinfo.get
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUserinfoplus] = js.native
  def get(callback: BodyResponseCallback[SchemaUserinfoplus]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserinfoplus] = js.native
  def get(params: ParamsResourceUserinfoGet): GaxiosPromise[SchemaUserinfoplus] = js.native
  def get(params: ParamsResourceUserinfoGet, callback: BodyResponseCallback[SchemaUserinfoplus]): Unit = js.native
  def get(
    params: ParamsResourceUserinfoGet,
    options: BodyResponseCallback[SchemaUserinfoplus],
    callback: BodyResponseCallback[SchemaUserinfoplus]
  ): Unit = js.native
  def get(params: ParamsResourceUserinfoGet, options: MethodOptions): GaxiosPromise[SchemaUserinfoplus] = js.native
  def get(
    params: ParamsResourceUserinfoGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserinfoplus]
  ): Unit = js.native
}

