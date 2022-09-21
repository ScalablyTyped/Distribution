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

@JSImport("googleapis/build/src/apis/run/v2", "run_v2.Resource$Projects$Locations$Jobs$Executions")
@js.native
open class ResourceProjectsLocationsJobsExecutions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsJobsExecutionsDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsJobsExecutionsDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsJobsExecutionsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsJobsExecutionsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsJobsExecutionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Delete an Execution.
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
    *   const res = await run.projects.locations.jobs.executions.delete({
    *     // A system-generated fingerprint for this version of the resource. This may be used to detect modification conflict during updates.
    *     etag: 'placeholder-value',
    *     // Required. The name of the Execution to delete. Format: projects/{project\}/locations/{location\}/jobs/{job\}/executions/{execution\}
    *     name: 'projects/my-project/locations/my-location/jobs/my-job/executions/my-execution',
    *     // Indicates that the request should be validated without actually deleting any resources.
    *     validateOnly: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def delete(params: ParamsResourceProjectsLocationsJobsExecutionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsJobsExecutionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudRunV2Execution] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudRunV2Execution]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRunV2Execution] = js.native
  def get(params: ParamsResourceProjectsLocationsJobsExecutionsGet): GaxiosPromise[SchemaGoogleCloudRunV2Execution] = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobsExecutionsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudRunV2Execution]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobsExecutionsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRunV2Execution],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRunV2Execution]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsJobsExecutionsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRunV2Execution] = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobsExecutionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRunV2Execution]
  ): Unit = js.native
  /**
    * Gets information about a Execution.
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
    *   const res = await run.projects.locations.jobs.executions.get({
    *     // Required. The full name of the Execution. Format: projects/{project\}/locations/{location\}/jobs/{job\}/executions/{execution\}
    *     name: 'projects/my-project/locations/my-location/jobs/my-job/executions/my-execution',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "completionTime": "my_completionTime",
    *   //   "conditions": [],
    *   //   "createTime": "my_createTime",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "etag": "my_etag",
    *   //   "expireTime": "my_expireTime",
    *   //   "failedCount": 0,
    *   //   "generation": "my_generation",
    *   //   "job": "my_job",
    *   //   "labels": {},
    *   //   "launchStage": "my_launchStage",
    *   //   "name": "my_name",
    *   //   "observedGeneration": "my_observedGeneration",
    *   //   "parallelism": 0,
    *   //   "reconciling": false,
    *   //   "runningCount": 0,
    *   //   "startTime": "my_startTime",
    *   //   "succeededCount": 0,
    *   //   "taskCount": 0,
    *   //   "template": {},
    *   //   "uid": "my_uid",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsJobsExecutionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobsExecutionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRunV2ListExecutionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudRunV2ListExecutionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRunV2ListExecutionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsJobsExecutionsList): GaxiosPromise[SchemaGoogleCloudRunV2ListExecutionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsExecutionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRunV2ListExecutionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsExecutionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRunV2ListExecutionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRunV2ListExecutionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsJobsExecutionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRunV2ListExecutionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsExecutionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRunV2ListExecutionsResponse]
  ): Unit = js.native
  /**
    * List Executions from a Job.
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
    *   const res = await run.projects.locations.jobs.executions.list({
    *     // Maximum number of Executions to return in this call.
    *     pageSize: 'placeholder-value',
    *     // A page token received from a previous call to ListExecutions. All other parameters must match.
    *     pageToken: 'placeholder-value',
    *     // Required. The Execution from which the Executions should be listed. To list all Executions across Jobs, use "-" instead of Job name. Format: projects/{project\}/locations/{location\}/jobs/{job\}
    *     parent: 'projects/my-project/locations/my-location/jobs/my-job',
    *     // If true, returns deleted (but unexpired) resources along with active ones.
    *     showDeleted: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "executions": [],
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
  def list(params: ParamsResourceProjectsLocationsJobsExecutionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsExecutionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var tasks: ResourceProjectsLocationsJobsExecutionsTasks = js.native
}
