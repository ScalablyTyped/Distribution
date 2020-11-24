package typings.googleapis.loggingV2Mod.loggingV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Entries")
@js.native
class ResourceEntries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * logging.entries.list
    * @desc Lists log entries. Use this method to retrieve log entries that
    * originated from a project/folder/organization/billing account. For ways
    * to export log entries, see Exporting Logs.
    * @alias logging.entries.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ListLogEntriesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListLogEntriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLogEntriesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListLogEntriesResponse] = js.native
  def list(params: ParamsResourceEntriesList): GaxiosPromise[SchemaListLogEntriesResponse] = js.native
  def list(params: ParamsResourceEntriesList, callback: BodyResponseCallback[SchemaListLogEntriesResponse]): Unit = js.native
  def list(
    params: ParamsResourceEntriesList,
    options: BodyResponseCallback[SchemaListLogEntriesResponse],
    callback: BodyResponseCallback[SchemaListLogEntriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEntriesList, options: MethodOptions): GaxiosPromise[SchemaListLogEntriesResponse] = js.native
  def list(
    params: ParamsResourceEntriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLogEntriesResponse]
  ): Unit = js.native
  
  /**
    * logging.entries.write
    * @desc Writes log entries to Logging. This API method is the only way to
    * send log entries to Logging. This method is used, directly or indirectly,
    * by the Logging agent (fluentd) and all logging libraries configured to
    * use Logging. A single request may contain log entries for a maximum of
    * 1000 different resources (projects, organizations, billing accounts or
    * folders)
    * @alias logging.entries.write
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().WriteLogEntriesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def write(): GaxiosPromise[SchemaWriteLogEntriesResponse] = js.native
  def write(callback: BodyResponseCallback[SchemaWriteLogEntriesResponse]): Unit = js.native
  def write(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWriteLogEntriesResponse] = js.native
  def write(params: ParamsResourceEntriesWrite): GaxiosPromise[SchemaWriteLogEntriesResponse] = js.native
  def write(params: ParamsResourceEntriesWrite, callback: BodyResponseCallback[SchemaWriteLogEntriesResponse]): Unit = js.native
  def write(
    params: ParamsResourceEntriesWrite,
    options: BodyResponseCallback[SchemaWriteLogEntriesResponse],
    callback: BodyResponseCallback[SchemaWriteLogEntriesResponse]
  ): Unit = js.native
  def write(params: ParamsResourceEntriesWrite, options: MethodOptions): GaxiosPromise[SchemaWriteLogEntriesResponse] = js.native
  def write(
    params: ParamsResourceEntriesWrite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWriteLogEntriesResponse]
  ): Unit = js.native
}
