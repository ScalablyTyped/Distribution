package typings.googleapis.runV2Mod.runV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/run/v2", "run_v2.Resource$Projects$Locations$Jobs$Executions$Tasks")
@js.native
open class ResourceProjectsLocationsJobsExecutionsTasks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudRunV2Task] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudRunV2Task]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRunV2Task] = js.native
  def get(params: ParamsResourceProjectsLocationsJobsExecutionsTasksGet): GaxiosPromise[SchemaGoogleCloudRunV2Task] = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobsExecutionsTasksGet,
    callback: BodyResponseCallback[SchemaGoogleCloudRunV2Task]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobsExecutionsTasksGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRunV2Task],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRunV2Task]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsJobsExecutionsTasksGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRunV2Task] = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobsExecutionsTasksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRunV2Task]
  ): Unit = js.native
  /**
    * Gets information about a Task.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v2');
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
    *   const res = await run.projects.locations.jobs.executions.tasks.get({
    *     // Required. The full name of the Task. Format: projects/{project\}/locations/{location\}/jobs/{job\}/executions/{execution\}/tasks/{task\}
    *     name: 'projects/my-project/locations/my-location/jobs/my-job/executions/my-execution/tasks/my-task',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "completionTime": "my_completionTime",
    *   //   "conditions": [],
    *   //   "containers": [],
    *   //   "createTime": "my_createTime",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "encryptionKey": "my_encryptionKey",
    *   //   "etag": "my_etag",
    *   //   "execution": "my_execution",
    *   //   "executionEnvironment": "my_executionEnvironment",
    *   //   "expireTime": "my_expireTime",
    *   //   "generation": "my_generation",
    *   //   "index": 0,
    *   //   "job": "my_job",
    *   //   "labels": {},
    *   //   "lastAttemptResult": {},
    *   //   "launchStage": "my_launchStage",
    *   //   "maxRetries": 0,
    *   //   "name": "my_name",
    *   //   "observedGeneration": "my_observedGeneration",
    *   //   "reconciling": false,
    *   //   "retried": 0,
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "startTime": "my_startTime",
    *   //   "timeout": "my_timeout",
    *   //   "uid": "my_uid",
    *   //   "updateTime": "my_updateTime",
    *   //   "volumes": [],
    *   //   "vpcAccess": {}
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
  def get(params: ParamsResourceProjectsLocationsJobsExecutionsTasksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobsExecutionsTasksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRunV2ListTasksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudRunV2ListTasksResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRunV2ListTasksResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsJobsExecutionsTasksList): GaxiosPromise[SchemaGoogleCloudRunV2ListTasksResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsExecutionsTasksList,
    callback: BodyResponseCallback[SchemaGoogleCloudRunV2ListTasksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsExecutionsTasksList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRunV2ListTasksResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRunV2ListTasksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsJobsExecutionsTasksList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRunV2ListTasksResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsExecutionsTasksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRunV2ListTasksResponse]
  ): Unit = js.native
  /**
    * List Tasks from an Execution of a Job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v2');
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
    *   const res = await run.projects.locations.jobs.executions.tasks.list({
    *     // Maximum number of Tasks to return in this call.
    *     pageSize: 'placeholder-value',
    *     // A page token received from a previous call to ListTasks. All other parameters must match.
    *     pageToken: 'placeholder-value',
    *     // Required. The Execution from which the Tasks should be listed. To list all Tasks across Executions of a Job, use "-" instead of Execution name. To list all Tasks across Jobs, use "-" instead of Job name. Format: projects/{project\}/locations/{location\}/jobs/{job\}/executions/{execution\}
    *     parent:
    *       'projects/my-project/locations/my-location/jobs/my-job/executions/my-execution',
    *     // If true, returns deleted (but unexpired) resources along with active ones.
    *     showDeleted: 'placeholder-value',
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
  def list(params: ParamsResourceProjectsLocationsJobsExecutionsTasksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsExecutionsTasksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
