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

@JSImport("googleapis/build/src/apis/tasks/v1", "tasks_v1.Resource$Tasklists")
@js.native
open class ResourceTasklists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTasklistsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTasklistsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTasklistsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTasklistsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceTasklistsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes the authenticated user's specified task list.
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
    *   const res = await tasks.tasklists.delete({
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
  def delete(params: ParamsResourceTasklistsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceTasklistsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTaskList] = js.native
  def get(callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def get(params: ParamsResourceTasklistsGet): GaxiosPromise[SchemaTaskList] = js.native
  def get(params: ParamsResourceTasklistsGet, callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def get(
    params: ParamsResourceTasklistsGet,
    options: BodyResponseCallback[Readable | SchemaTaskList],
    callback: BodyResponseCallback[Readable | SchemaTaskList]
  ): Unit = js.native
  def get(params: ParamsResourceTasklistsGet, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def get(
    params: ParamsResourceTasklistsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
  /**
    * Returns the authenticated user's specified task list.
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
    *   const res = await tasks.tasklists.get({
    *     // Task list identifier.
    *     tasklist: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
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
  def get(params: ParamsResourceTasklistsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTasklistsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaTaskList] = js.native
  def insert(callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def insert(params: ParamsResourceTasklistsInsert): GaxiosPromise[SchemaTaskList] = js.native
  def insert(params: ParamsResourceTasklistsInsert, callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def insert(
    params: ParamsResourceTasklistsInsert,
    options: BodyResponseCallback[Readable | SchemaTaskList],
    callback: BodyResponseCallback[Readable | SchemaTaskList]
  ): Unit = js.native
  def insert(params: ParamsResourceTasklistsInsert, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def insert(
    params: ParamsResourceTasklistsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
  /**
    * Creates a new task list and adds it to the authenticated user's task lists.
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
    *   const res = await tasks.tasklists.insert({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "selfLink": "my_selfLink",
    *       //   "title": "my_title",
    *       //   "updated": "my_updated"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
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
  def insert(params: ParamsResourceTasklistsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceTasklistsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaTaskLists] = js.native
  def list(callback: BodyResponseCallback[SchemaTaskLists]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTaskLists] = js.native
  def list(params: ParamsResourceTasklistsList): GaxiosPromise[SchemaTaskLists] = js.native
  def list(params: ParamsResourceTasklistsList, callback: BodyResponseCallback[SchemaTaskLists]): Unit = js.native
  def list(
    params: ParamsResourceTasklistsList,
    options: BodyResponseCallback[Readable | SchemaTaskLists],
    callback: BodyResponseCallback[Readable | SchemaTaskLists]
  ): Unit = js.native
  def list(params: ParamsResourceTasklistsList, options: MethodOptions): GaxiosPromise[SchemaTaskLists] = js.native
  def list(
    params: ParamsResourceTasklistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTaskLists]
  ): Unit = js.native
  /**
    * Returns all the authenticated user's task lists.
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
    *   const res = await tasks.tasklists.list({
    *     // Maximum number of task lists returned on one page. Optional. The default is 20 (max allowed: 100).
    *     maxResults: 'placeholder-value',
    *     // Token specifying the result page to return. Optional.
    *     pageToken: 'placeholder-value',
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
  def list(params: ParamsResourceTasklistsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTasklistsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTaskList] = js.native
  def patch(callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def patch(params: ParamsResourceTasklistsPatch): GaxiosPromise[SchemaTaskList] = js.native
  def patch(params: ParamsResourceTasklistsPatch, callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def patch(
    params: ParamsResourceTasklistsPatch,
    options: BodyResponseCallback[Readable | SchemaTaskList],
    callback: BodyResponseCallback[Readable | SchemaTaskList]
  ): Unit = js.native
  def patch(params: ParamsResourceTasklistsPatch, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def patch(
    params: ParamsResourceTasklistsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
  /**
    * Updates the authenticated user's specified task list. This method supports patch semantics.
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
    *   const res = await tasks.tasklists.patch({
    *     // Task list identifier.
    *     tasklist: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "selfLink": "my_selfLink",
    *       //   "title": "my_title",
    *       //   "updated": "my_updated"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
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
  def patch(params: ParamsResourceTasklistsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceTasklistsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaTaskList] = js.native
  def update(callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def update(params: ParamsResourceTasklistsUpdate): GaxiosPromise[SchemaTaskList] = js.native
  def update(params: ParamsResourceTasklistsUpdate, callback: BodyResponseCallback[SchemaTaskList]): Unit = js.native
  def update(
    params: ParamsResourceTasklistsUpdate,
    options: BodyResponseCallback[Readable | SchemaTaskList],
    callback: BodyResponseCallback[Readable | SchemaTaskList]
  ): Unit = js.native
  def update(params: ParamsResourceTasklistsUpdate, options: MethodOptions): GaxiosPromise[SchemaTaskList] = js.native
  def update(
    params: ParamsResourceTasklistsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTaskList]
  ): Unit = js.native
  /**
    * Updates the authenticated user's specified task list.
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
    *   const res = await tasks.tasklists.update({
    *     // Task list identifier.
    *     tasklist: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "selfLink": "my_selfLink",
    *       //   "title": "my_title",
    *       //   "updated": "my_updated"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
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
  def update(params: ParamsResourceTasklistsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceTasklistsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
