package typings.googleapis.dataplexV1Mod.dataplexV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataplex/v1", "dataplex_v1.Resource$Projects$Locations$Lakes$Tasks$Jobs")
@js.native
open class ResourceProjectsLocationsLakesTasksJobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def cancel(): GaxiosPromise[SchemaEmpty] = js.native
  def cancel(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def cancel(params: ParamsResourceProjectsLocationsLakesTasksJobsCancel): GaxiosPromise[SchemaEmpty] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsLakesTasksJobsCancel,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsLakesTasksJobsCancel,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsLocationsLakesTasksJobsCancel, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsLakesTasksJobsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Cancel jobs running for the task resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataplex.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataplex = google.dataplex('v1');
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
    *   const res = await dataplex.projects.locations.lakes.tasks.jobs.cancel({
    *     // Required. The resource name of the job: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/task/{task_id\}/job/{job_id\}.
    *     name: 'projects/my-project/locations/my-location/lakes/my-lake/tasks/my-task/jobs/my-job',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def cancel(params: ParamsResourceProjectsLocationsLakesTasksJobsCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsLakesTasksJobsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDataplexV1Job] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Job]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1Job] = js.native
  def get(params: ParamsResourceProjectsLocationsLakesTasksJobsGet): GaxiosPromise[SchemaGoogleCloudDataplexV1Job] = js.native
  def get(
    params: ParamsResourceProjectsLocationsLakesTasksJobsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Job]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsLakesTasksJobsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1Job],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1Job]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsLakesTasksJobsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1Job] = js.native
  def get(
    params: ParamsResourceProjectsLocationsLakesTasksJobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Job]
  ): Unit = js.native
  /**
    * Get job resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataplex.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataplex = google.dataplex('v1');
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
    *   const res = await dataplex.projects.locations.lakes.tasks.jobs.get({
    *     // Required. The resource name of the job: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/tasks/{task_id\}/jobs/{job_id\}.
    *     name: 'projects/my-project/locations/my-location/lakes/my-lake/tasks/my-task/jobs/my-job',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "endTime": "my_endTime",
    *   //   "message": "my_message",
    *   //   "name": "my_name",
    *   //   "retryCount": 0,
    *   //   "service": "my_service",
    *   //   "serviceJob": "my_serviceJob",
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "uid": "my_uid"
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
  def get(params: ParamsResourceProjectsLocationsLakesTasksJobsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsLakesTasksJobsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDataplexV1ListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1ListJobsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsLakesTasksJobsList): GaxiosPromise[SchemaGoogleCloudDataplexV1ListJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesTasksJobsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesTasksJobsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1ListJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1ListJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsLakesTasksJobsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1ListJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesTasksJobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListJobsResponse]
  ): Unit = js.native
  /**
    * Lists Jobs under the given task.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataplex.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataplex = google.dataplex('v1');
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
    *   const res = await dataplex.projects.locations.lakes.tasks.jobs.list({
    *     // Optional. Maximum number of jobs to return. The service may return fewer than this value. If unspecified, at most 10 jobs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. Page token received from a previous ListJobs call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to ListJobs must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the parent environment: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/tasks/{task_id\}.
    *     parent:
    *       'projects/my-project/locations/my-location/lakes/my-lake/tasks/my-task',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "jobs": [],
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
  def list(params: ParamsResourceProjectsLocationsLakesTasksJobsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesTasksJobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
