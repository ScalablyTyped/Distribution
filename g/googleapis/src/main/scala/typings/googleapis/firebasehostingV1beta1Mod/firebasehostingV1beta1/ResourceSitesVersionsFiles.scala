package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites$Versions$Files")
@js.native
class ResourceSitesVersionsFiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * firebasehosting.sites.versions.files.list
    * @desc Lists the remaining files to be uploaded for the specified version.
    * @alias firebasehosting.sites.versions.files.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The page size to return. Defaults to 1000.
    * @param {string=} params.pageToken The next_page_token from a previous request, if provided. This will be the encoded version of a firebase.hosting.proto.metadata.ListFilesPageToken.
    * @param {string} params.parent Required. The parent to list files for, in the format: <code>sites/<var>site-name</var>/versions/<var>versionID</var></code>
    * @param {string=} params.status The type of files in the version that should be listed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListVersionFilesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVersionFilesResponse]): Unit = js.native
  def list(params: ParamsResourceSitesVersionsFilesList): GaxiosPromise[SchemaListVersionFilesResponse] = js.native
  def list(
    params: ParamsResourceSitesVersionsFilesList,
    callback: BodyResponseCallback[SchemaListVersionFilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSitesVersionsFilesList,
    options: BodyResponseCallback[SchemaListVersionFilesResponse],
    callback: BodyResponseCallback[SchemaListVersionFilesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSitesVersionsFilesList, options: MethodOptions): GaxiosPromise[SchemaListVersionFilesResponse] = js.native
  def list(
    params: ParamsResourceSitesVersionsFilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVersionFilesResponse]
  ): Unit = js.native
}

