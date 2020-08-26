package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fusiontables/v2", "fusiontables_v2.Resource$Task")
@js.native
class ResourceTask protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fusiontables.task.delete
    * @desc Deletes a specific task by its ID, unless that task has already
    * started running.
    * @alias fusiontables.task.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table from which the task is being deleted.
    * @param {string} params.taskId The identifier of the task to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTaskDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTaskDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTaskDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTaskDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTaskDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * fusiontables.task.get
    * @desc Retrieves a specific task by its ID.
    * @alias fusiontables.task.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table to which the task belongs.
    * @param {string} params.taskId The identifier of the task to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTask] = js.native
  def get(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceTaskGet): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceTaskGet, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def get(
    params: ParamsResourceTaskGet,
    options: BodyResponseCallback[SchemaTask],
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def get(params: ParamsResourceTaskGet, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceTaskGet, options: MethodOptions, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  /**
    * fusiontables.task.list
    * @desc Retrieves a list of tasks.
    * @alias fusiontables.task.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of tasks to return. Default is 5.
    * @param {string=} params.pageToken Continuation token specifying which result page to return.
    * @param {integer=} params.startIndex Index of the first result returned in the current page.
    * @param {string} params.tableId Table whose tasks are being listed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTaskList] = js.native
  def list(callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def list(params: ParamsResourceTaskList): GaxiosPromise[SchemaTaskList] = js.native
  def list(params: ParamsResourceTaskList, callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def list(
    params: ParamsResourceTaskList,
    options: BodyResponseCallback[SchemaTaskList],
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
  def list(params: ParamsResourceTaskList, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def list(
    params: ParamsResourceTaskList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
}

