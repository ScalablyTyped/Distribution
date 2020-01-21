package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesConfiguration/v1configuration", "gamesConfiguration_v1configuration.Resource$Imageconfigurations")
@js.native
class ResourceImageconfigurations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesConfiguration.imageConfigurations.upload
    * @desc Uploads an image for a resource with the given ID and image type.
    * @alias gamesConfiguration.imageConfigurations.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.imageType Selects which image in a resource for this method.
    * @param {string} params.resourceId The ID of the resource used by this method.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[SchemaImageConfiguration] = js.native
  def upload(callback: BodyResponseCallback[SchemaImageConfiguration]): Unit = js.native
  def upload(params: ParamsResourceImageconfigurationsUpload): GaxiosPromise[SchemaImageConfiguration] = js.native
  def upload(
    params: ParamsResourceImageconfigurationsUpload,
    callback: BodyResponseCallback[SchemaImageConfiguration]
  ): Unit = js.native
  def upload(
    params: ParamsResourceImageconfigurationsUpload,
    options: BodyResponseCallback[SchemaImageConfiguration],
    callback: BodyResponseCallback[SchemaImageConfiguration]
  ): Unit = js.native
  def upload(params: ParamsResourceImageconfigurationsUpload, options: MethodOptions): GaxiosPromise[SchemaImageConfiguration] = js.native
  def upload(
    params: ParamsResourceImageconfigurationsUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImageConfiguration]
  ): Unit = js.native
}

