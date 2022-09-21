package typings.googleapis.tasksV1Mod.tasksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tasks/v1", "tasks_v1.Resource$Tasks")
@js.native
open class ResourceTasks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def clear(): GaxiosPromise[Unit] = js.native
  def clear(callback: BodyResponseCallback[Unit]): Unit = js.native
  def clear(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsResourceTasksClear): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsResourceTasksClear, callback: BodyResponseCallback[Unit]): Unit = js.native
  def clear(
    params: ParamsResourceTasksClear,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def clear(params: ParamsResourceTasksClear, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsResourceTasksClear, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Clears all completed tasks from the specified task list. The affected tasks will be marked as 'hidden' and no longer be returned by default when retrieving all tasks for a task list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tasks = google.tasks('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tasks'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tasks.tasks.clear({
    *     // Task list identifier.
    *     tasklist: 'placeholder-value',
    *   });
    *   console.log(res.data);
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def clear(params: ParamsResourceTasksClear, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def clear(
    params: ParamsResourceTasksClear,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTasksDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTasksDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTasksDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTasksDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTasksDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes the specified task from the task list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tasks = google.tasks('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tasks'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tasks.tasks.delete({
    *     // Task identifier.
    *     task: 'placeholder-value',
    *     // Task list identifier.
    *     tasklist: 'placeholder-value',
    *   });
    *   console.log(res.data);
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceTasksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceTasksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTask] = js.native
  def get(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceTasksGet): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceTasksGet, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def get(
    params: ParamsResourceTasksGet,
    options: BodyResponseCallback[Readable | SchemaTask],
    callback: BodyResponseCallback[Readable | SchemaTask]
  ): Unit = js.native
  def get(params: ParamsResourceTasksGet, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceTasksGet, options: MethodOptions, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  /**
    * Returns the specified task.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tasks = google.tasks('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/tasks',
    *       'https://www.googleapis.com/auth/tasks.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tasks.tasks.get({
    *     // Task identifier.
    *     task: 'placeholder-value',
    *     // Task list identifier.
    *     tasklist: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completed": "my_completed",
    *   //   "deleted": false,
    *   //   "due": "my_due",
    *   //   "etag": "my_etag",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "links": [],
    *   //   "notes": "my_notes",
    *   //   "parent": "my_parent",
    *   //   "position": "my_position",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceTasksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTasksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaTask] = js.native
  def insert(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def insert(params: ParamsResourceTasksInsert): GaxiosPromise[SchemaTask] = js.native
  def insert(params: ParamsResourceTasksInsert, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def insert(
    params: ParamsResourceTasksInsert,
    options: BodyResponseCallback[Readable | SchemaTask],
    callback: BodyResponseCallback[Readable | SchemaTask]
  ): Unit = js.native
  def insert(params: ParamsResourceTasksInsert, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def insert(
    params: ParamsResourceTasksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  /**
    * Creates a new task on the specified task list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tasks = google.tasks('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tasks'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tasks.tasks.insert({
    *     // Parent task identifier. If the task is created at the top level, this parameter is omitted. Optional.
    *     parent: 'placeholder-value',
    *     // Previous sibling task identifier. If the task is created at the first position among its siblings, this parameter is omitted. Optional.
    *     previous: 'placeholder-value',
    *     // Task list identifier.
    *     tasklist: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "completed": "my_completed",
    *       //   "deleted": false,
    *       //   "due": "my_due",
    *       //   "etag": "my_etag",
    *       //   "hidden": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "links": [],
    *       //   "notes": "my_notes",
    *       //   "parent": "my_parent",
    *       //   "position": "my_position",
    *       //   "selfLink": "my_selfLink",
    *       //   "status": "my_status",
    *       //   "title": "my_title",
    *       //   "updated": "my_updated"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completed": "my_completed",
    *   //   "deleted": false,
    *   //   "due": "my_due",
    *   //   "etag": "my_etag",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "links": [],
    *   //   "notes": "my_notes",
    *   //   "parent": "my_parent",
    *   //   "position": "my_position",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def insert(params: ParamsResourceTasksInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceTasksInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaTasks] = js.native
  def list(callback: BodyResponseCallback[SchemaTasks]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTasks] = js.native
  def list(params: ParamsResourceTasksList): GaxiosPromise[SchemaTasks] = js.native
  def list(params: ParamsResourceTasksList, callback: BodyResponseCallback[SchemaTasks]): Unit = js.native
  def list(
    params: ParamsResourceTasksList,
    options: BodyResponseCallback[Readable | SchemaTasks],
    callback: BodyResponseCallback[Readable | SchemaTasks]
  ): Unit = js.native
  def list(params: ParamsResourceTasksList, options: MethodOptions): GaxiosPromise[SchemaTasks] = js.native
  def list(
    params: ParamsResourceTasksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTasks]
  ): Unit = js.native
  /**
    * Returns all tasks in the specified task list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tasks = google.tasks('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/tasks',
    *       'https://www.googleapis.com/auth/tasks.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tasks.tasks.list({
    *     // Upper bound for a task's completion date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by completion date.
    *     completedMax: 'placeholder-value',
    *     // Lower bound for a task's completion date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by completion date.
    *     completedMin: 'placeholder-value',
    *     // Upper bound for a task's due date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by due date.
    *     dueMax: 'placeholder-value',
    *     // Lower bound for a task's due date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by due date.
    *     dueMin: 'placeholder-value',
    *     // Maximum number of task lists returned on one page. Optional. The default is 20 (max allowed: 100).
    *     maxResults: 'placeholder-value',
    *     // Token specifying the result page to return. Optional.
    *     pageToken: 'placeholder-value',
    *     // Flag indicating whether completed tasks are returned in the result. Optional. The default is True. Note that showHidden must also be True to show tasks completed in first party clients, such as the web UI and Google's mobile apps.
    *     showCompleted: 'placeholder-value',
    *     // Flag indicating whether deleted tasks are returned in the result. Optional. The default is False.
    *     showDeleted: 'placeholder-value',
    *     // Flag indicating whether hidden tasks are returned in the result. Optional. The default is False.
    *     showHidden: 'placeholder-value',
    *     // Task list identifier.
    *     tasklist: 'placeholder-value',
    *     // Lower bound for a task's last modification time (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by last modification time.
    *     updatedMin: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceTasksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTasksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def move(): GaxiosPromise[SchemaTask] = js.native
  def move(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def move(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def move(params: ParamsResourceTasksMove): GaxiosPromise[SchemaTask] = js.native
  def move(params: ParamsResourceTasksMove, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def move(
    params: ParamsResourceTasksMove,
    options: BodyResponseCallback[Readable | SchemaTask],
    callback: BodyResponseCallback[Readable | SchemaTask]
  ): Unit = js.native
  def move(params: ParamsResourceTasksMove, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def move(
    params: ParamsResourceTasksMove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  /**
    * Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a different position among its sibling tasks.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tasks = google.tasks('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tasks'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tasks.tasks.move({
    *     // New parent task identifier. If the task is moved to the top level, this parameter is omitted. Optional.
    *     parent: 'placeholder-value',
    *     // New previous sibling task identifier. If the task is moved to the first position among its siblings, this parameter is omitted. Optional.
    *     previous: 'placeholder-value',
    *     // Task identifier.
    *     task: 'placeholder-value',
    *     // Task list identifier.
    *     tasklist: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completed": "my_completed",
    *   //   "deleted": false,
    *   //   "due": "my_due",
    *   //   "etag": "my_etag",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "links": [],
    *   //   "notes": "my_notes",
    *   //   "parent": "my_parent",
    *   //   "position": "my_position",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def move(params: ParamsResourceTasksMove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def move(
    params: ParamsResourceTasksMove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTask] = js.native
  def patch(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def patch(params: ParamsResourceTasksPatch): GaxiosPromise[SchemaTask] = js.native
  def patch(params: ParamsResourceTasksPatch, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def patch(
    params: ParamsResourceTasksPatch,
    options: BodyResponseCallback[Readable | SchemaTask],
    callback: BodyResponseCallback[Readable | SchemaTask]
  ): Unit = js.native
  def patch(params: ParamsResourceTasksPatch, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def patch(
    params: ParamsResourceTasksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  /**
    * Updates the specified task. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tasks = google.tasks('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tasks'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tasks.tasks.patch({
    *     // Task identifier.
    *     task: 'placeholder-value',
    *     // Task list identifier.
    *     tasklist: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "completed": "my_completed",
    *       //   "deleted": false,
    *       //   "due": "my_due",
    *       //   "etag": "my_etag",
    *       //   "hidden": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "links": [],
    *       //   "notes": "my_notes",
    *       //   "parent": "my_parent",
    *       //   "position": "my_position",
    *       //   "selfLink": "my_selfLink",
    *       //   "status": "my_status",
    *       //   "title": "my_title",
    *       //   "updated": "my_updated"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completed": "my_completed",
    *   //   "deleted": false,
    *   //   "due": "my_due",
    *   //   "etag": "my_etag",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "links": [],
    *   //   "notes": "my_notes",
    *   //   "parent": "my_parent",
    *   //   "position": "my_position",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceTasksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceTasksPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaTask] = js.native
  def update(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def update(params: ParamsResourceTasksUpdate): GaxiosPromise[SchemaTask] = js.native
  def update(params: ParamsResourceTasksUpdate, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def update(
    params: ParamsResourceTasksUpdate,
    options: BodyResponseCallback[Readable | SchemaTask],
    callback: BodyResponseCallback[Readable | SchemaTask]
  ): Unit = js.native
  def update(params: ParamsResourceTasksUpdate, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def update(
    params: ParamsResourceTasksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  /**
    * Updates the specified task.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tasks = google.tasks('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tasks'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tasks.tasks.update({
    *     // Task identifier.
    *     task: 'placeholder-value',
    *     // Task list identifier.
    *     tasklist: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "completed": "my_completed",
    *       //   "deleted": false,
    *       //   "due": "my_due",
    *       //   "etag": "my_etag",
    *       //   "hidden": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "links": [],
    *       //   "notes": "my_notes",
    *       //   "parent": "my_parent",
    *       //   "position": "my_position",
    *       //   "selfLink": "my_selfLink",
    *       //   "status": "my_status",
    *       //   "title": "my_title",
    *       //   "updated": "my_updated"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completed": "my_completed",
    *   //   "deleted": false,
    *   //   "due": "my_due",
    *   //   "etag": "my_etag",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "links": [],
    *   //   "notes": "my_notes",
    *   //   "parent": "my_parent",
    *   //   "position": "my_position",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def update(params: ParamsResourceTasksUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceTasksUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
