package typings.googleapis.driveV3Mod.driveV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$About")
@js.native
class ResourceAbout protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * drive.about.get
    * @desc Gets information about the user, the user's Drive, and system
    * capabilities.
    * @alias drive.about.get
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAbout] = js.native
  def get(callback: BodyResponseCallback[SchemaAbout]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAbout] = js.native
  def get(params: ParamsResourceAboutGet): GaxiosPromise[SchemaAbout] = js.native
  def get(params: ParamsResourceAboutGet, callback: BodyResponseCallback[SchemaAbout]): Unit = js.native
  def get(
    params: ParamsResourceAboutGet,
    options: BodyResponseCallback[SchemaAbout],
    callback: BodyResponseCallback[SchemaAbout]
  ): Unit = js.native
  def get(params: ParamsResourceAboutGet, options: MethodOptions): GaxiosPromise[SchemaAbout] = js.native
  def get(
    params: ParamsResourceAboutGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAbout]
  ): Unit = js.native
}
