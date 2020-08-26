package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Files")
@js.native
class ResourceFiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.files.get
    * @desc Retrieves a report file by its report ID and file ID. This method
    * supports media download.
    * @alias dfareporting.files.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the report file.
    * @param {string} params.reportId The ID of the report.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFile] = js.native
  def get(callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def get(params: ParamsResourceFilesGet): GaxiosPromise[SchemaFile] = js.native
  def get(params: ParamsResourceFilesGet, callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def get(
    params: ParamsResourceFilesGet,
    options: BodyResponseCallback[SchemaFile],
    callback: BodyResponseCallback[SchemaFile]
  ): Unit = js.native
  def get(params: ParamsResourceFilesGet, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def get(params: ParamsResourceFilesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  /**
    * dfareporting.files.list
    * @desc Lists files for a user profile.
    * @alias dfareporting.files.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken The value of the nextToken from the previous result page.
    * @param {string} params.profileId The DFA profile ID.
    * @param {string=} params.scope The scope that defines which results are returned.
    * @param {string=} params.sortField The field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaFileList] = js.native
  def list(callback: BodyResponseCallback[SchemaFileList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFileList] = js.native
  def list(params: ParamsResourceFilesList): GaxiosPromise[SchemaFileList] = js.native
  def list(params: ParamsResourceFilesList, callback: BodyResponseCallback[SchemaFileList]): Unit = js.native
  def list(
    params: ParamsResourceFilesList,
    options: BodyResponseCallback[SchemaFileList],
    callback: BodyResponseCallback[SchemaFileList]
  ): Unit = js.native
  def list(params: ParamsResourceFilesList, options: MethodOptions): GaxiosPromise[SchemaFileList] = js.native
  def list(
    params: ParamsResourceFilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFileList]
  ): Unit = js.native
}

