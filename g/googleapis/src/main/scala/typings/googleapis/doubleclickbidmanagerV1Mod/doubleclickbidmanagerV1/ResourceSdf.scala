package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1", "doubleclickbidmanager_v1.Resource$Sdf")
@js.native
class ResourceSdf protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * doubleclickbidmanager.sdf.download
    * @desc Retrieves entities in SDF format.
    * @alias doubleclickbidmanager.sdf.download
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().DownloadRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def download(): GaxiosPromise[SchemaDownloadResponse] = js.native
  def download(callback: BodyResponseCallback[SchemaDownloadResponse]): Unit = js.native
  def download(params: ParamsResourceSdfDownload): GaxiosPromise[SchemaDownloadResponse] = js.native
  def download(params: ParamsResourceSdfDownload, callback: BodyResponseCallback[SchemaDownloadResponse]): Unit = js.native
  def download(
    params: ParamsResourceSdfDownload,
    options: BodyResponseCallback[SchemaDownloadResponse],
    callback: BodyResponseCallback[SchemaDownloadResponse]
  ): Unit = js.native
  def download(params: ParamsResourceSdfDownload, options: MethodOptions): GaxiosPromise[SchemaDownloadResponse] = js.native
  def download(
    params: ParamsResourceSdfDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDownloadResponse]
  ): Unit = js.native
}

