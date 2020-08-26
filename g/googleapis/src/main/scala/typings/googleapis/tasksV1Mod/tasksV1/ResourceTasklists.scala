package typings.googleapis.tasksV1Mod.tasksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tasks/v1", "tasks_v1.Resource$Tasklists")
@js.native
class ResourceTasklists protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tasks.tasklists.delete
    * @desc Deletes the authenticated user's specified task list.
    * @alias tasks.tasklists.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tasklist Task list identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTasklistsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTasklistsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTasklistsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTasklistsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceTasklistsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tasks.tasklists.get
    * @desc Returns the authenticated user's specified task list.
    * @alias tasks.tasklists.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tasklist Task list identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTaskList] = js.native
  def get(callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def get(params: ParamsResourceTasklistsGet): GaxiosPromise[SchemaTaskList] = js.native
  def get(params: ParamsResourceTasklistsGet, callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def get(
    params: ParamsResourceTasklistsGet,
    options: BodyResponseCallback[SchemaTaskList],
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
  def get(params: ParamsResourceTasklistsGet, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def get(
    params: ParamsResourceTasklistsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
  /**
    * tasks.tasklists.insert
    * @desc Creates a new task list and adds it to the authenticated user's
    * task lists.
    * @alias tasks.tasklists.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().TaskList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaTaskList] = js.native
  def insert(callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def insert(params: ParamsResourceTasklistsInsert): GaxiosPromise[SchemaTaskList] = js.native
  def insert(params: ParamsResourceTasklistsInsert, callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def insert(
    params: ParamsResourceTasklistsInsert,
    options: BodyResponseCallback[SchemaTaskList],
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
  def insert(params: ParamsResourceTasklistsInsert, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def insert(
    params: ParamsResourceTasklistsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
  /**
    * tasks.tasklists.list
    * @desc Returns all the authenticated user's task lists.
    * @alias tasks.tasklists.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.maxResults Maximum number of task lists returned on one page. Optional. The default is 20 (max allowed: 100).
    * @param {string=} params.pageToken Token specifying the result page to return. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTaskLists] = js.native
  def list(callback: BodyResponseCallback[SchemaTaskLists]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTaskLists] = js.native
  def list(params: ParamsResourceTasklistsList): GaxiosPromise[SchemaTaskLists] = js.native
  def list(params: ParamsResourceTasklistsList, callback: BodyResponseCallback[SchemaTaskLists]): Unit = js.native
  def list(
    params: ParamsResourceTasklistsList,
    options: BodyResponseCallback[SchemaTaskLists],
    callback: BodyResponseCallback[SchemaTaskLists]
  ): Unit = js.native
  def list(params: ParamsResourceTasklistsList, options: MethodOptions): GaxiosPromise[SchemaTaskLists] = js.native
  def list(
    params: ParamsResourceTasklistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTaskLists]
  ): Unit = js.native
  /**
    * tasks.tasklists.patch
    * @desc Updates the authenticated user's specified task list. This method
    * supports patch semantics.
    * @alias tasks.tasklists.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tasklist Task list identifier.
    * @param {().TaskList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaTaskList] = js.native
  def patch(callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def patch(params: ParamsResourceTasklistsPatch): GaxiosPromise[SchemaTaskList] = js.native
  def patch(params: ParamsResourceTasklistsPatch, callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def patch(
    params: ParamsResourceTasklistsPatch,
    options: BodyResponseCallback[SchemaTaskList],
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
  def patch(params: ParamsResourceTasklistsPatch, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def patch(
    params: ParamsResourceTasklistsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
  /**
    * tasks.tasklists.update
    * @desc Updates the authenticated user's specified task list.
    * @alias tasks.tasklists.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tasklist Task list identifier.
    * @param {().TaskList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaTaskList] = js.native
  def update(callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def update(params: ParamsResourceTasklistsUpdate): GaxiosPromise[SchemaTaskList] = js.native
  def update(params: ParamsResourceTasklistsUpdate, callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def update(
    params: ParamsResourceTasklistsUpdate,
    options: BodyResponseCallback[SchemaTaskList],
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
  def update(params: ParamsResourceTasklistsUpdate, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def update(
    params: ParamsResourceTasklistsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
}

