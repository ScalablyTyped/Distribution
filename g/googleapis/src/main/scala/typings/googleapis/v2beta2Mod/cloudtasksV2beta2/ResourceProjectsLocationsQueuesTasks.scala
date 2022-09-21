package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudtasks/v2beta2", "cloudtasks_v2beta2.Resource$Projects$Locations$Queues$Tasks")
@js.native
open class ResourceProjectsLocationsQueuesTasks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def acknowledge(): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def acknowledge(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(params: ParamsResourceProjectsLocationsQueuesTasksAcknowledge): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(
    params: ParamsResourceProjectsLocationsQueuesTasksAcknowledge,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def acknowledge(
    params: ParamsResourceProjectsLocationsQueuesTasksAcknowledge,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def acknowledge(params: ParamsResourceProjectsLocationsQueuesTasksAcknowledge, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(
    params: ParamsResourceProjectsLocationsQueuesTasksAcknowledge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Acknowledges a pull task. The worker, that is, the entity that leased this task must call this method to indicate that the work associated with the task has finished. The worker must acknowledge a task within the lease_duration or the lease will expire and the task will become available to be leased again. After the task is acknowledged, it will not be returned by a later LeaseTasks, GetTask, or ListTasks.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudtasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudtasks = google.cloudtasks('v2beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudtasks.projects.locations.queues.tasks.acknowledge({
    *     // Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *     name: 'projects/my-project/locations/my-location/queues/my-queue/tasks/my-task',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "scheduleTime": "my_scheduleTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def acknowledge(params: ParamsResourceProjectsLocationsQueuesTasksAcknowledge, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def acknowledge(
    params: ParamsResourceProjectsLocationsQueuesTasksAcknowledge,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def cancelLease(): GaxiosPromise[SchemaTask] = js.native
  def cancelLease(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def cancelLease(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def cancelLease(params: ParamsResourceProjectsLocationsQueuesTasksCancellease): GaxiosPromise[SchemaTask] = js.native
  def cancelLease(
    params: ParamsResourceProjectsLocationsQueuesTasksCancellease,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def cancelLease(
    params: ParamsResourceProjectsLocationsQueuesTasksCancellease,
    options: BodyResponseCallback[Readable | SchemaTask],
    callback: BodyResponseCallback[Readable | SchemaTask]
  ): Unit = js.native
  def cancelLease(params: ParamsResourceProjectsLocationsQueuesTasksCancellease, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def cancelLease(
    params: ParamsResourceProjectsLocationsQueuesTasksCancellease,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  /**
    * Cancel a pull task's lease. The worker can use this method to cancel a task's lease by setting its schedule_time to now. This will make the task available to be leased to the next caller of LeaseTasks.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudtasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudtasks = google.cloudtasks('v2beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudtasks.projects.locations.queues.tasks.cancelLease({
    *     // Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *     name: 'projects/my-project/locations/my-location/queues/my-queue/tasks/my-task',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "responseView": "my_responseView",
    *       //   "scheduleTime": "my_scheduleTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appEngineHttpRequest": {},
    *   //   "createTime": "my_createTime",
    *   //   "httpRequest": {},
    *   //   "name": "my_name",
    *   //   "pullMessage": {},
    *   //   "scheduleTime": "my_scheduleTime",
    *   //   "status": {},
    *   //   "view": "my_view"
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
  def cancelLease(params: ParamsResourceProjectsLocationsQueuesTasksCancellease, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancelLease(
    params: ParamsResourceProjectsLocationsQueuesTasksCancellease,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTask] = js.native
  def create(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def create(params: ParamsResourceProjectsLocationsQueuesTasksCreate): GaxiosPromise[SchemaTask] = js.native
  def create(
    params: ParamsResourceProjectsLocationsQueuesTasksCreate,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsQueuesTasksCreate,
    options: BodyResponseCallback[Readable | SchemaTask],
    callback: BodyResponseCallback[Readable | SchemaTask]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsQueuesTasksCreate, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def create(
    params: ParamsResourceProjectsLocationsQueuesTasksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  /**
    * Creates a task and adds it to a queue. Tasks cannot be updated after creation; there is no UpdateTask command. * For App Engine queues, the maximum task size is 100KB. * For pull queues, the maximum task size is 1MB.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudtasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudtasks = google.cloudtasks('v2beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudtasks.projects.locations.queues.tasks.create({
    *     // Required. The queue name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` The queue must already exist.
    *     parent: 'projects/my-project/locations/my-location/queues/my-queue',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "responseView": "my_responseView",
    *       //   "task": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appEngineHttpRequest": {},
    *   //   "createTime": "my_createTime",
    *   //   "httpRequest": {},
    *   //   "name": "my_name",
    *   //   "pullMessage": {},
    *   //   "scheduleTime": "my_scheduleTime",
    *   //   "status": {},
    *   //   "view": "my_view"
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
  def create(params: ParamsResourceProjectsLocationsQueuesTasksCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsQueuesTasksCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsQueuesTasksDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsQueuesTasksDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsQueuesTasksDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsQueuesTasksDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsQueuesTasksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a task. A task can be deleted if it is scheduled or dispatched. A task cannot be deleted if it has completed successfully or permanently failed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudtasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudtasks = google.cloudtasks('v2beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudtasks.projects.locations.queues.tasks.delete({
    *     // Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *     name: 'projects/my-project/locations/my-location/queues/my-queue/tasks/my-task',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsLocationsQueuesTasksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsQueuesTasksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTask] = js.native
  def get(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceProjectsLocationsQueuesTasksGet): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceProjectsLocationsQueuesTasksGet, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsQueuesTasksGet,
    options: BodyResponseCallback[Readable | SchemaTask],
    callback: BodyResponseCallback[Readable | SchemaTask]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsQueuesTasksGet, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def get(
    params: ParamsResourceProjectsLocationsQueuesTasksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  /**
    * Gets a task.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudtasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudtasks = google.cloudtasks('v2beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudtasks.projects.locations.queues.tasks.get({
    *     // Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *     name: 'projects/my-project/locations/my-location/queues/my-queue/tasks/my-task',
    *     // The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
    *     responseView: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appEngineHttpRequest": {},
    *   //   "createTime": "my_createTime",
    *   //   "httpRequest": {},
    *   //   "name": "my_name",
    *   //   "pullMessage": {},
    *   //   "scheduleTime": "my_scheduleTime",
    *   //   "status": {},
    *   //   "view": "my_view"
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
  def get(params: ParamsResourceProjectsLocationsQueuesTasksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsQueuesTasksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def lease(): GaxiosPromise[SchemaLeaseTasksResponse] = js.native
  def lease(callback: BodyResponseCallback[SchemaLeaseTasksResponse]): Unit = js.native
  def lease(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaseTasksResponse] = js.native
  def lease(params: ParamsResourceProjectsLocationsQueuesTasksLease): GaxiosPromise[SchemaLeaseTasksResponse] = js.native
  def lease(
    params: ParamsResourceProjectsLocationsQueuesTasksLease,
    callback: BodyResponseCallback[SchemaLeaseTasksResponse]
  ): Unit = js.native
  def lease(
    params: ParamsResourceProjectsLocationsQueuesTasksLease,
    options: BodyResponseCallback[Readable | SchemaLeaseTasksResponse],
    callback: BodyResponseCallback[Readable | SchemaLeaseTasksResponse]
  ): Unit = js.native
  def lease(params: ParamsResourceProjectsLocationsQueuesTasksLease, options: MethodOptions): GaxiosPromise[SchemaLeaseTasksResponse] = js.native
  def lease(
    params: ParamsResourceProjectsLocationsQueuesTasksLease,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaseTasksResponse]
  ): Unit = js.native
  /**
    * Leases tasks from a pull queue for lease_duration. This method is invoked by the worker to obtain a lease. The worker must acknowledge the task via AcknowledgeTask after they have performed the work associated with the task. The payload is intended to store data that the worker needs to perform the work associated with the task. To return the payloads in the response, set response_view to FULL. A maximum of 10 qps of LeaseTasks requests are allowed per queue. RESOURCE_EXHAUSTED is returned when this limit is exceeded. RESOURCE_EXHAUSTED is also returned when max_tasks_dispatched_per_second is exceeded.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudtasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudtasks = google.cloudtasks('v2beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudtasks.projects.locations.queues.tasks.lease({
    *     // Required. The queue name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    *     parent: 'projects/my-project/locations/my-location/queues/my-queue',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "filter": "my_filter",
    *       //   "leaseDuration": "my_leaseDuration",
    *       //   "maxTasks": 0,
    *       //   "responseView": "my_responseView"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "tasks": []
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
  def lease(params: ParamsResourceProjectsLocationsQueuesTasksLease, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def lease(
    params: ParamsResourceProjectsLocationsQueuesTasksLease,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTasksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTasksResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTasksResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsQueuesTasksList): GaxiosPromise[SchemaListTasksResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsQueuesTasksList,
    callback: BodyResponseCallback[SchemaListTasksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsQueuesTasksList,
    options: BodyResponseCallback[Readable | SchemaListTasksResponse],
    callback: BodyResponseCallback[Readable | SchemaListTasksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsQueuesTasksList, options: MethodOptions): GaxiosPromise[SchemaListTasksResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsQueuesTasksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTasksResponse]
  ): Unit = js.native
  /**
    * Lists the tasks in a queue. By default, only the BASIC view is retrieved due to performance considerations; response_view controls the subset of information which is returned. The tasks may be returned in any order. The ordering may change at any time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudtasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudtasks = google.cloudtasks('v2beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudtasks.projects.locations.queues.tasks.list({
    *     // Maximum page size. Fewer tasks than requested might be returned, even if more tasks exist; use next_page_token in the response to determine if more tasks exist. The maximum page size is 1000. If unspecified, the page size will be the maximum.
    *     pageSize: 'placeholder-value',
    *     // A token identifying the page of results to return. To request the first page results, page_token must be empty. To request the next page of results, page_token must be the value of next_page_token returned from the previous call to ListTasks method. The page token is valid for only 2 hours.
    *     pageToken: 'placeholder-value',
    *     // Required. The queue name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    *     parent: 'projects/my-project/locations/my-location/queues/my-queue',
    *     // The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
    *     responseView: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "tasks": []
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
  def list(params: ParamsResourceProjectsLocationsQueuesTasksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsQueuesTasksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def renewLease(): GaxiosPromise[SchemaTask] = js.native
  def renewLease(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def renewLease(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def renewLease(params: ParamsResourceProjectsLocationsQueuesTasksRenewlease): GaxiosPromise[SchemaTask] = js.native
  def renewLease(
    params: ParamsResourceProjectsLocationsQueuesTasksRenewlease,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def renewLease(
    params: ParamsResourceProjectsLocationsQueuesTasksRenewlease,
    options: BodyResponseCallback[Readable | SchemaTask],
    callback: BodyResponseCallback[Readable | SchemaTask]
  ): Unit = js.native
  def renewLease(params: ParamsResourceProjectsLocationsQueuesTasksRenewlease, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def renewLease(
    params: ParamsResourceProjectsLocationsQueuesTasksRenewlease,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  /**
    * Renew the current lease of a pull task. The worker can use this method to extend the lease by a new duration, starting from now. The new task lease will be returned in the task's schedule_time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudtasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudtasks = google.cloudtasks('v2beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudtasks.projects.locations.queues.tasks.renewLease({
    *     // Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *     name: 'projects/my-project/locations/my-location/queues/my-queue/tasks/my-task',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "leaseDuration": "my_leaseDuration",
    *       //   "responseView": "my_responseView",
    *       //   "scheduleTime": "my_scheduleTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appEngineHttpRequest": {},
    *   //   "createTime": "my_createTime",
    *   //   "httpRequest": {},
    *   //   "name": "my_name",
    *   //   "pullMessage": {},
    *   //   "scheduleTime": "my_scheduleTime",
    *   //   "status": {},
    *   //   "view": "my_view"
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
  def renewLease(params: ParamsResourceProjectsLocationsQueuesTasksRenewlease, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def renewLease(
    params: ParamsResourceProjectsLocationsQueuesTasksRenewlease,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def run(): GaxiosPromise[SchemaTask] = js.native
  def run(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def run(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def run(params: ParamsResourceProjectsLocationsQueuesTasksRun): GaxiosPromise[SchemaTask] = js.native
  def run(params: ParamsResourceProjectsLocationsQueuesTasksRun, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def run(
    params: ParamsResourceProjectsLocationsQueuesTasksRun,
    options: BodyResponseCallback[Readable | SchemaTask],
    callback: BodyResponseCallback[Readable | SchemaTask]
  ): Unit = js.native
  def run(params: ParamsResourceProjectsLocationsQueuesTasksRun, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def run(
    params: ParamsResourceProjectsLocationsQueuesTasksRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  /**
    * Forces a task to run now. When this method is called, Cloud Tasks will dispatch the task, even if the task is already running, the queue has reached its RateLimits or is PAUSED. This command is meant to be used for manual debugging. For example, RunTask can be used to retry a failed task after a fix has been made or to manually force a task to be dispatched now. The dispatched task is returned. That is, the task that is returned contains the status after the task is dispatched but before the task is received by its target. If Cloud Tasks receives a successful response from the task's target, then the task will be deleted; otherwise the task's schedule_time will be reset to the time that RunTask was called plus the retry delay specified in the queue's RetryConfig. RunTask returns NOT_FOUND when it is called on a task that has already succeeded or permanently failed. RunTask cannot be called on a pull task.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudtasks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudtasks = google.cloudtasks('v2beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudtasks.projects.locations.queues.tasks.run({
    *     // Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *     name: 'projects/my-project/locations/my-location/queues/my-queue/tasks/my-task',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "responseView": "my_responseView"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appEngineHttpRequest": {},
    *   //   "createTime": "my_createTime",
    *   //   "httpRequest": {},
    *   //   "name": "my_name",
    *   //   "pullMessage": {},
    *   //   "scheduleTime": "my_scheduleTime",
    *   //   "status": {},
    *   //   "view": "my_view"
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
  def run(params: ParamsResourceProjectsLocationsQueuesTasksRun, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def run(
    params: ParamsResourceProjectsLocationsQueuesTasksRun,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
