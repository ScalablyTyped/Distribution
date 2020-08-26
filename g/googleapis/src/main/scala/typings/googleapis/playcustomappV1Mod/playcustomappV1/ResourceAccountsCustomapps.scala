package typings.googleapis.playcustomappV1Mod.playcustomappV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/playcustomapp/v1", "playcustomapp_v1.Resource$Accounts$Customapps")
@js.native
class ResourceAccountsCustomapps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * playcustomapp.accounts.customApps.create
    * @desc Create and publish a new custom app.
    * @alias playcustomapp.accounts.customApps.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.account Developer account ID.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaCustomApp] = js.native
  def create(callback: BodyResponseCallback[SchemaCustomApp]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomApp] = js.native
  def create(params: ParamsResourceAccountsCustomappsCreate): GaxiosPromise[SchemaCustomApp] = js.native
  def create(params: ParamsResourceAccountsCustomappsCreate, callback: BodyResponseCallback[SchemaCustomApp]): Unit = js.native
  def create(
    params: ParamsResourceAccountsCustomappsCreate,
    options: BodyResponseCallback[SchemaCustomApp],
    callback: BodyResponseCallback[SchemaCustomApp]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsCustomappsCreate, options: MethodOptions): GaxiosPromise[SchemaCustomApp] = js.native
  def create(
    params: ParamsResourceAccountsCustomappsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomApp]
  ): Unit = js.native
}

