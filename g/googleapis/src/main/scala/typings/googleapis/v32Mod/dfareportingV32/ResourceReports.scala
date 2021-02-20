package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Reports")
@js.native
class ResourceReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var compatibleFields: ResourceReportsCompatiblefields = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.reports.delete
    * @desc Deletes a report by its ID.
    * @alias dfareporting.reports.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA user profile ID.
    * @param {string} params.reportId The ID of the report.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceReportsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceReportsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceReportsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceReportsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceReportsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  var files: ResourceReportsFiles = js.native
  
  /**
    * dfareporting.reports.get
    * @desc Retrieves a report by its ID.
    * @alias dfareporting.reports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA user profile ID.
    * @param {string} params.reportId The ID of the report.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaReport] = js.native
  def get(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def get(params: ParamsResourceReportsGet): GaxiosPromise[SchemaReport] = js.native
  def get(params: ParamsResourceReportsGet, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def get(
    params: ParamsResourceReportsGet,
    options: BodyResponseCallback[SchemaReport],
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  def get(params: ParamsResourceReportsGet, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def get(
    params: ParamsResourceReportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  
  /**
    * dfareporting.reports.insert
    * @desc Creates a report.
    * @alias dfareporting.reports.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA user profile ID.
    * @param {().Report} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaReport] = js.native
  def insert(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def insert(params: ParamsResourceReportsInsert): GaxiosPromise[SchemaReport] = js.native
  def insert(params: ParamsResourceReportsInsert, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def insert(
    params: ParamsResourceReportsInsert,
    options: BodyResponseCallback[SchemaReport],
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  def insert(params: ParamsResourceReportsInsert, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def insert(
    params: ParamsResourceReportsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  
  /**
    * dfareporting.reports.list
    * @desc Retrieves list of reports.
    * @alias dfareporting.reports.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken The value of the nextToken from the previous result page.
    * @param {string} params.profileId The DFA user profile ID.
    * @param {string=} params.scope The scope that defines which results are returned.
    * @param {string=} params.sortField The field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaReportList] = js.native
  def list(callback: BodyResponseCallback[SchemaReportList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReportList] = js.native
  def list(params: ParamsResourceReportsList): GaxiosPromise[SchemaReportList] = js.native
  def list(params: ParamsResourceReportsList, callback: BodyResponseCallback[SchemaReportList]): Unit = js.native
  def list(
    params: ParamsResourceReportsList,
    options: BodyResponseCallback[SchemaReportList],
    callback: BodyResponseCallback[SchemaReportList]
  ): Unit = js.native
  def list(params: ParamsResourceReportsList, options: MethodOptions): GaxiosPromise[SchemaReportList] = js.native
  def list(
    params: ParamsResourceReportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReportList]
  ): Unit = js.native
  
  /**
    * dfareporting.reports.patch
    * @desc Updates a report. This method supports patch semantics.
    * @alias dfareporting.reports.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA user profile ID.
    * @param {string} params.reportId The ID of the report.
    * @param {().Report} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaReport] = js.native
  def patch(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def patch(params: ParamsResourceReportsPatch): GaxiosPromise[SchemaReport] = js.native
  def patch(params: ParamsResourceReportsPatch, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def patch(
    params: ParamsResourceReportsPatch,
    options: BodyResponseCallback[SchemaReport],
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  def patch(params: ParamsResourceReportsPatch, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def patch(
    params: ParamsResourceReportsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  
  /**
    * dfareporting.reports.run
    * @desc Runs a report.
    * @alias dfareporting.reports.run
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA profile ID.
    * @param {string} params.reportId The ID of the report.
    * @param {boolean=} params.synchronous If set and true, tries to run the report synchronously.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def run(): GaxiosPromise[SchemaFile] = js.native
  def run(callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def run(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def run(params: ParamsResourceReportsRun): GaxiosPromise[SchemaFile] = js.native
  def run(params: ParamsResourceReportsRun, callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def run(
    params: ParamsResourceReportsRun,
    options: BodyResponseCallback[SchemaFile],
    callback: BodyResponseCallback[SchemaFile]
  ): Unit = js.native
  def run(params: ParamsResourceReportsRun, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def run(
    params: ParamsResourceReportsRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFile]
  ): Unit = js.native
  
  /**
    * dfareporting.reports.update
    * @desc Updates a report.
    * @alias dfareporting.reports.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA user profile ID.
    * @param {string} params.reportId The ID of the report.
    * @param {().Report} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaReport] = js.native
  def update(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def update(params: ParamsResourceReportsUpdate): GaxiosPromise[SchemaReport] = js.native
  def update(params: ParamsResourceReportsUpdate, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def update(
    params: ParamsResourceReportsUpdate,
    options: BodyResponseCallback[SchemaReport],
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  def update(params: ParamsResourceReportsUpdate, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def update(
    params: ParamsResourceReportsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
}
