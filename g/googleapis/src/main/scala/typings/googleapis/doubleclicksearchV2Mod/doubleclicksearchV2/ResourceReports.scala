package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/doubleclicksearch/v2", "doubleclicksearch_v2.Resource$Reports")
@js.native
class ResourceReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * doubleclicksearch.reports.generate
    * @desc Generates and returns a report immediately.
    * @alias doubleclicksearch.reports.generate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ReportRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generate(): GaxiosPromise[SchemaReport] = js.native
  def generate(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def generate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def generate(params: ParamsResourceReportsGenerate): GaxiosPromise[SchemaReport] = js.native
  def generate(params: ParamsResourceReportsGenerate, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def generate(
    params: ParamsResourceReportsGenerate,
    options: BodyResponseCallback[SchemaReport],
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  def generate(params: ParamsResourceReportsGenerate, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def generate(
    params: ParamsResourceReportsGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  
  /**
    * doubleclicksearch.reports.get
    * @desc Polls for the status of a report request.
    * @alias doubleclicksearch.reports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.reportId ID of the report request being polled.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaReport] = js.native
  def get(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
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
    * doubleclicksearch.reports.getFile
    * @desc Downloads a report file encoded in UTF-8.
    * @alias doubleclicksearch.reports.getFile
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.reportFragment The index of the report fragment to download.
    * @param {string} params.reportId ID of the report.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getFile(): GaxiosPromise[Unit] = js.native
  def getFile(callback: BodyResponseCallback[Unit]): Unit = js.native
  def getFile(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def getFile(params: ParamsResourceReportsGetfile): GaxiosPromise[Unit] = js.native
  def getFile(params: ParamsResourceReportsGetfile, callback: BodyResponseCallback[Unit]): Unit = js.native
  def getFile(
    params: ParamsResourceReportsGetfile,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def getFile(params: ParamsResourceReportsGetfile, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def getFile(params: ParamsResourceReportsGetfile, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * doubleclicksearch.reports.request
    * @desc Inserts a report request into the reporting system.
    * @alias doubleclicksearch.reports.request
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ReportRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def request(): GaxiosPromise[SchemaReport] = js.native
  def request(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def request(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def request(params: ParamsResourceReportsRequest): GaxiosPromise[SchemaReport] = js.native
  def request(params: ParamsResourceReportsRequest, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def request(
    params: ParamsResourceReportsRequest,
    options: BodyResponseCallback[SchemaReport],
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  def request(params: ParamsResourceReportsRequest, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def request(
    params: ParamsResourceReportsRequest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
}
