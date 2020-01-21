package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Reports$Files")
@js.native
class ResourceReportsFiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.reports.files.get
    * @desc Retrieves a report file. This method supports media download.
    * @alias dfareporting.reports.files.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the report file.
    * @param {string} params.profileId The DFA profile ID.
    * @param {string} params.reportId The ID of the report.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFile] = js.native
  def get(callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def get(params: ParamsResourceReportsFilesGet): GaxiosPromise[SchemaFile] = js.native
  def get(params: ParamsResourceReportsFilesGet, callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def get(
    params: ParamsResourceReportsFilesGet,
    options: BodyResponseCallback[SchemaFile],
    callback: BodyResponseCallback[SchemaFile]
  ): Unit = js.native
  def get(params: ParamsResourceReportsFilesGet, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def get(
    params: ParamsResourceReportsFilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFile]
  ): Unit = js.native
  /**
    * dfareporting.reports.files.list
    * @desc Lists files for a report.
    * @alias dfareporting.reports.files.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken The value of the nextToken from the previous result page.
    * @param {string} params.profileId The DFA profile ID.
    * @param {string} params.reportId The ID of the parent report.
    * @param {string=} params.sortField The field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaFileList] = js.native
  def list(callback: BodyResponseCallback[SchemaFileList]): Unit = js.native
  def list(params: ParamsResourceReportsFilesList): GaxiosPromise[SchemaFileList] = js.native
  def list(params: ParamsResourceReportsFilesList, callback: BodyResponseCallback[SchemaFileList]): Unit = js.native
  def list(
    params: ParamsResourceReportsFilesList,
    options: BodyResponseCallback[SchemaFileList],
    callback: BodyResponseCallback[SchemaFileList]
  ): Unit = js.native
  def list(params: ParamsResourceReportsFilesList, options: MethodOptions): GaxiosPromise[SchemaFileList] = js.native
  def list(
    params: ParamsResourceReportsFilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFileList]
  ): Unit = js.native
}

