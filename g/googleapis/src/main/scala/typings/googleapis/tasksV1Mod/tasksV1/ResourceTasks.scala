package typings.googleapis.tasksV1Mod.tasksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tasks/v1", "tasks_v1.Resource$Tasks")
@js.native
class ResourceTasks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * tasks.tasks.clear
    * @desc Clears all completed tasks from the specified task list. The
    * affected tasks will be marked as 'hidden' and no longer be returned by
    * default when retrieving all tasks for a task list.
    * @alias tasks.tasks.clear
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tasklist Task list identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def clear(): GaxiosPromise[Unit] = js.native
  def clear(callback: BodyResponseCallback[Unit]): Unit = js.native
  def clear(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsResourceTasksClear): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsResourceTasksClear, callback: BodyResponseCallback[Unit]): Unit = js.native
  def clear(
    params: ParamsResourceTasksClear,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def clear(params: ParamsResourceTasksClear, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsResourceTasksClear, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * tasks.tasks.delete
    * @desc Deletes the specified task from the task list.
    * @alias tasks.tasks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.task Task identifier.
    * @param {string} params.tasklist Task list identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTasksDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTasksDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTasksDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTasksDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTasksDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * tasks.tasks.get
    * @desc Returns the specified task.
    * @alias tasks.tasks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.task Task identifier.
    * @param {string} params.tasklist Task list identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTask] = js.native
  def get(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceTasksGet): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceTasksGet, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def get(
    params: ParamsResourceTasksGet,
    options: BodyResponseCallback[SchemaTask],
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def get(params: ParamsResourceTasksGet, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceTasksGet, options: MethodOptions, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  
  /**
    * tasks.tasks.insert
    * @desc Creates a new task on the specified task list.
    * @alias tasks.tasks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.parent Parent task identifier. If the task is created at the top level, this parameter is omitted. Optional.
    * @param {string=} params.previous Previous sibling task identifier. If the task is created at the first position among its siblings, this parameter is omitted. Optional.
    * @param {string} params.tasklist Task list identifier.
    * @param {().Task} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaTask] = js.native
  def insert(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def insert(params: ParamsResourceTasksInsert): GaxiosPromise[SchemaTask] = js.native
  def insert(params: ParamsResourceTasksInsert, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def insert(
    params: ParamsResourceTasksInsert,
    options: BodyResponseCallback[SchemaTask],
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def insert(params: ParamsResourceTasksInsert, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def insert(
    params: ParamsResourceTasksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  
  /**
    * tasks.tasks.list
    * @desc Returns all tasks in the specified task list.
    * @alias tasks.tasks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.completedMax Upper bound for a task's completion date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by completion date.
    * @param {string=} params.completedMin Lower bound for a task's completion date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by completion date.
    * @param {string=} params.dueMax Upper bound for a task's due date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by due date.
    * @param {string=} params.dueMin Lower bound for a task's due date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by due date.
    * @param {string=} params.maxResults Maximum number of task lists returned on one page. Optional. The default is 20 (max allowed: 100).
    * @param {string=} params.pageToken Token specifying the result page to return. Optional.
    * @param {boolean=} params.showCompleted Flag indicating whether completed tasks are returned in the result. Optional. The default is True.
    * @param {boolean=} params.showDeleted Flag indicating whether deleted tasks are returned in the result. Optional. The default is False.
    * @param {boolean=} params.showHidden Flag indicating whether hidden tasks are returned in the result. Optional. The default is False.
    * @param {string} params.tasklist Task list identifier.
    * @param {string=} params.updatedMin Lower bound for a task's last modification time (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by last modification time.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTasks] = js.native
  def list(callback: BodyResponseCallback[SchemaTasks]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTasks] = js.native
  def list(params: ParamsResourceTasksList): GaxiosPromise[SchemaTasks] = js.native
  def list(params: ParamsResourceTasksList, callback: BodyResponseCallback[SchemaTasks]): Unit = js.native
  def list(
    params: ParamsResourceTasksList,
    options: BodyResponseCallback[SchemaTasks],
    callback: BodyResponseCallback[SchemaTasks]
  ): Unit = js.native
  def list(params: ParamsResourceTasksList, options: MethodOptions): GaxiosPromise[SchemaTasks] = js.native
  def list(
    params: ParamsResourceTasksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTasks]
  ): Unit = js.native
  
  /**
    * tasks.tasks.move
    * @desc Moves the specified task to another position in the task list. This
    * can include putting it as a child task under a new parent and/or move it
    * to a different position among its sibling tasks.
    * @alias tasks.tasks.move
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.parent New parent task identifier. If the task is moved to the top level, this parameter is omitted. Optional.
    * @param {string=} params.previous New previous sibling task identifier. If the task is moved to the first position among its siblings, this parameter is omitted. Optional.
    * @param {string} params.task Task identifier.
    * @param {string} params.tasklist Task list identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def move(): GaxiosPromise[SchemaTask] = js.native
  def move(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def move(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def move(params: ParamsResourceTasksMove): GaxiosPromise[SchemaTask] = js.native
  def move(params: ParamsResourceTasksMove, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def move(
    params: ParamsResourceTasksMove,
    options: BodyResponseCallback[SchemaTask],
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def move(params: ParamsResourceTasksMove, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def move(
    params: ParamsResourceTasksMove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  
  /**
    * tasks.tasks.patch
    * @desc Updates the specified task. This method supports patch semantics.
    * @alias tasks.tasks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.task Task identifier.
    * @param {string} params.tasklist Task list identifier.
    * @param {().Task} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaTask] = js.native
  def patch(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def patch(params: ParamsResourceTasksPatch): GaxiosPromise[SchemaTask] = js.native
  def patch(params: ParamsResourceTasksPatch, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def patch(
    params: ParamsResourceTasksPatch,
    options: BodyResponseCallback[SchemaTask],
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def patch(params: ParamsResourceTasksPatch, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def patch(
    params: ParamsResourceTasksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  
  /**
    * tasks.tasks.update
    * @desc Updates the specified task.
    * @alias tasks.tasks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.task Task identifier.
    * @param {string} params.tasklist Task list identifier.
    * @param {().Task} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaTask] = js.native
  def update(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def update(params: ParamsResourceTasksUpdate): GaxiosPromise[SchemaTask] = js.native
  def update(params: ParamsResourceTasksUpdate, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def update(
    params: ParamsResourceTasksUpdate,
    options: BodyResponseCallback[SchemaTask],
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def update(params: ParamsResourceTasksUpdate, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def update(
    params: ParamsResourceTasksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
}
