package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Jobs")
@js.native
open class ResourceProjectsJobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def aggregated(): GaxiosPromise[SchemaListJobsResponse] = js.native
  def aggregated(callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def aggregated(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def aggregated(params: ParamsResourceProjectsJobsAggregated): GaxiosPromise[SchemaListJobsResponse] = js.native
  def aggregated(
    params: ParamsResourceProjectsJobsAggregated,
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  def aggregated(
    params: ParamsResourceProjectsJobsAggregated,
    options: BodyResponseCallback[Readable | SchemaListJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaListJobsResponse]
  ): Unit = js.native
  def aggregated(params: ParamsResourceProjectsJobsAggregated, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def aggregated(
    params: ParamsResourceProjectsJobsAggregated,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  /**
    * List the jobs of a project across all regions.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataflow = google.dataflow('v1b3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dataflow.projects.jobs.aggregated({
    *     // The kind of filter to use.
    *     filter: 'placeholder-value',
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    *     location: 'placeholder-value',
    *     // If there are many jobs, limit response to at most this many. The actual number of jobs returned will be the lesser of max_responses and an unspecified server-defined limit.
    *     pageSize: 'placeholder-value',
    *     // Set this to the 'next_page_token' field of a previous response to request additional results in a long list.
    *     pageToken: 'placeholder-value',
    *     // The project which owns the jobs.
    *     projectId: 'placeholder-value',
    *     // Deprecated. ListJobs always returns summaries now. Use GetJob for other JobViews.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "failedLocation": [],
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
  def aggregated(params: ParamsResourceProjectsJobsAggregated, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def aggregated(
    params: ParamsResourceProjectsJobsAggregated,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaJob] = js.native
  def create(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceProjectsJobsCreate): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceProjectsJobsCreate, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(
    params: ParamsResourceProjectsJobsCreate,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsJobsCreate, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(
    params: ParamsResourceProjectsJobsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * Creates a Cloud Dataflow job. To create a job, we recommend using `projects.locations.jobs.create` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.create` is not recommended, as your job will always start in `us-central1`. Do not enter confidential information when you supply string values using the API.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataflow = google.dataflow('v1b3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dataflow.projects.jobs.create({
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    *     location: 'placeholder-value',
    *     // The ID of the Cloud Platform project that the job belongs to.
    *     projectId: 'placeholder-value',
    *     // Deprecated. This field is now in the Job message.
    *     replaceJobId: 'placeholder-value',
    *     // The level of information requested in response.
    *     view: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientRequestId": "my_clientRequestId",
    *       //   "createTime": "my_createTime",
    *       //   "createdFromSnapshotId": "my_createdFromSnapshotId",
    *       //   "currentState": "my_currentState",
    *       //   "currentStateTime": "my_currentStateTime",
    *       //   "environment": {},
    *       //   "executionInfo": {},
    *       //   "id": "my_id",
    *       //   "jobMetadata": {},
    *       //   "labels": {},
    *       //   "location": "my_location",
    *       //   "name": "my_name",
    *       //   "pipelineDescription": {},
    *       //   "projectId": "my_projectId",
    *       //   "replaceJobId": "my_replaceJobId",
    *       //   "replacedByJobId": "my_replacedByJobId",
    *       //   "requestedState": "my_requestedState",
    *       //   "satisfiesPzs": false,
    *       //   "stageStates": [],
    *       //   "startTime": "my_startTime",
    *       //   "steps": [],
    *       //   "stepsLocation": "my_stepsLocation",
    *       //   "tempFiles": [],
    *       //   "transformNameMapping": {},
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientRequestId": "my_clientRequestId",
    *   //   "createTime": "my_createTime",
    *   //   "createdFromSnapshotId": "my_createdFromSnapshotId",
    *   //   "currentState": "my_currentState",
    *   //   "currentStateTime": "my_currentStateTime",
    *   //   "environment": {},
    *   //   "executionInfo": {},
    *   //   "id": "my_id",
    *   //   "jobMetadata": {},
    *   //   "labels": {},
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "pipelineDescription": {},
    *   //   "projectId": "my_projectId",
    *   //   "replaceJobId": "my_replaceJobId",
    *   //   "replacedByJobId": "my_replacedByJobId",
    *   //   "requestedState": "my_requestedState",
    *   //   "satisfiesPzs": false,
    *   //   "stageStates": [],
    *   //   "startTime": "my_startTime",
    *   //   "steps": [],
    *   //   "stepsLocation": "my_stepsLocation",
    *   //   "tempFiles": [],
    *   //   "transformNameMapping": {},
    *   //   "type": "my_type"
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
  def create(params: ParamsResourceProjectsJobsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsJobsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var debug: ResourceProjectsJobsDebug = js.native
  
  def get(): GaxiosPromise[SchemaJob] = js.native
  def get(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceProjectsJobsGet): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceProjectsJobsGet, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(
    params: ParamsResourceProjectsJobsGet,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsJobsGet, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(
    params: ParamsResourceProjectsJobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * Gets the state of the specified Cloud Dataflow job. To get the state of a job, we recommend using `projects.locations.jobs.get` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.get` is not recommended, as you can only get the state of jobs that are running in `us-central1`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataflow = google.dataflow('v1b3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dataflow.projects.jobs.get({
    *     // The job ID.
    *     jobId: 'placeholder-value',
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    *     location: 'placeholder-value',
    *     // The ID of the Cloud Platform project that the job belongs to.
    *     projectId: 'placeholder-value',
    *     // The level of information requested in response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientRequestId": "my_clientRequestId",
    *   //   "createTime": "my_createTime",
    *   //   "createdFromSnapshotId": "my_createdFromSnapshotId",
    *   //   "currentState": "my_currentState",
    *   //   "currentStateTime": "my_currentStateTime",
    *   //   "environment": {},
    *   //   "executionInfo": {},
    *   //   "id": "my_id",
    *   //   "jobMetadata": {},
    *   //   "labels": {},
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "pipelineDescription": {},
    *   //   "projectId": "my_projectId",
    *   //   "replaceJobId": "my_replaceJobId",
    *   //   "replacedByJobId": "my_replacedByJobId",
    *   //   "requestedState": "my_requestedState",
    *   //   "satisfiesPzs": false,
    *   //   "stageStates": [],
    *   //   "startTime": "my_startTime",
    *   //   "steps": [],
    *   //   "stepsLocation": "my_stepsLocation",
    *   //   "tempFiles": [],
    *   //   "transformNameMapping": {},
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceProjectsJobsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsJobsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getMetrics(): GaxiosPromise[SchemaJobMetrics] = js.native
  def getMetrics(callback: BodyResponseCallback[SchemaJobMetrics]): Unit = js.native
  def getMetrics(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJobMetrics] = js.native
  def getMetrics(params: ParamsResourceProjectsJobsGetmetrics): GaxiosPromise[SchemaJobMetrics] = js.native
  def getMetrics(params: ParamsResourceProjectsJobsGetmetrics, callback: BodyResponseCallback[SchemaJobMetrics]): Unit = js.native
  def getMetrics(
    params: ParamsResourceProjectsJobsGetmetrics,
    options: BodyResponseCallback[Readable | SchemaJobMetrics],
    callback: BodyResponseCallback[Readable | SchemaJobMetrics]
  ): Unit = js.native
  def getMetrics(params: ParamsResourceProjectsJobsGetmetrics, options: MethodOptions): GaxiosPromise[SchemaJobMetrics] = js.native
  def getMetrics(
    params: ParamsResourceProjectsJobsGetmetrics,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJobMetrics]
  ): Unit = js.native
  /**
    * Request the job status. To request the status of a job, we recommend using `projects.locations.jobs.getMetrics` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.getMetrics` is not recommended, as you can only request the status of jobs that are running in `us-central1`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataflow = google.dataflow('v1b3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dataflow.projects.jobs.getMetrics({
    *     // The job to get metrics for.
    *     jobId: 'placeholder-value',
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    *     location: 'placeholder-value',
    *     // A project id.
    *     projectId: 'placeholder-value',
    *     // Return only metric data that has changed since this time. Default is to return all information about all metrics for the job.
    *     startTime: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "metricTime": "my_metricTime",
    *   //   "metrics": []
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
  def getMetrics(params: ParamsResourceProjectsJobsGetmetrics, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getMetrics(
    params: ParamsResourceProjectsJobsGetmetrics,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(params: ParamsResourceProjectsJobsList): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(params: ParamsResourceProjectsJobsList, callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsJobsList,
    options: BodyResponseCallback[Readable | SchemaListJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaListJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsJobsList, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsJobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  /**
    * List the jobs of a project. To list the jobs of a project in a region, we recommend using `projects.locations.jobs.list` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). To list the all jobs across all regions, use `projects.jobs.aggregated`. Using `projects.jobs.list` is not recommended, as you can only get the list of jobs that are running in `us-central1`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataflow = google.dataflow('v1b3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dataflow.projects.jobs.list({
    *     // The kind of filter to use.
    *     filter: 'placeholder-value',
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    *     location: 'placeholder-value',
    *     // If there are many jobs, limit response to at most this many. The actual number of jobs returned will be the lesser of max_responses and an unspecified server-defined limit.
    *     pageSize: 'placeholder-value',
    *     // Set this to the 'next_page_token' field of a previous response to request additional results in a long list.
    *     pageToken: 'placeholder-value',
    *     // The project which owns the jobs.
    *     projectId: 'placeholder-value',
    *     // Deprecated. ListJobs always returns summaries now. Use GetJob for other JobViews.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "failedLocation": [],
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
  def list(params: ParamsResourceProjectsJobsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsJobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var messages: ResourceProjectsJobsMessages = js.native
  
  def snapshot(): GaxiosPromise[SchemaSnapshot] = js.native
  def snapshot(callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def snapshot(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def snapshot(params: ParamsResourceProjectsJobsSnapshot): GaxiosPromise[SchemaSnapshot] = js.native
  def snapshot(params: ParamsResourceProjectsJobsSnapshot, callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def snapshot(
    params: ParamsResourceProjectsJobsSnapshot,
    options: BodyResponseCallback[Readable | SchemaSnapshot],
    callback: BodyResponseCallback[Readable | SchemaSnapshot]
  ): Unit = js.native
  def snapshot(params: ParamsResourceProjectsJobsSnapshot, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def snapshot(
    params: ParamsResourceProjectsJobsSnapshot,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  /**
    * Snapshot the state of a streaming job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataflow = google.dataflow('v1b3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dataflow.projects.jobs.snapshot({
    *     // The job to be snapshotted.
    *     jobId: 'placeholder-value',
    *     // The project which owns the job to be snapshotted.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "location": "my_location",
    *       //   "snapshotSources": false,
    *       //   "ttl": "my_ttl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "description": "my_description",
    *   //   "diskSizeBytes": "my_diskSizeBytes",
    *   //   "id": "my_id",
    *   //   "projectId": "my_projectId",
    *   //   "pubsubMetadata": [],
    *   //   "region": "my_region",
    *   //   "sourceJobId": "my_sourceJobId",
    *   //   "state": "my_state",
    *   //   "ttl": "my_ttl"
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
  def snapshot(params: ParamsResourceProjectsJobsSnapshot, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def snapshot(
    params: ParamsResourceProjectsJobsSnapshot,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaJob] = js.native
  def update(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def update(params: ParamsResourceProjectsJobsUpdate): GaxiosPromise[SchemaJob] = js.native
  def update(params: ParamsResourceProjectsJobsUpdate, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def update(
    params: ParamsResourceProjectsJobsUpdate,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsJobsUpdate, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def update(
    params: ParamsResourceProjectsJobsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * Updates the state of an existing Cloud Dataflow job. To update the state of an existing job, we recommend using `projects.locations.jobs.update` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.update` is not recommended, as you can only update the state of jobs that are running in `us-central1`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataflow = google.dataflow('v1b3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dataflow.projects.jobs.update({
    *     // The job ID.
    *     jobId: 'placeholder-value',
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    *     location: 'placeholder-value',
    *     // The ID of the Cloud Platform project that the job belongs to.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientRequestId": "my_clientRequestId",
    *       //   "createTime": "my_createTime",
    *       //   "createdFromSnapshotId": "my_createdFromSnapshotId",
    *       //   "currentState": "my_currentState",
    *       //   "currentStateTime": "my_currentStateTime",
    *       //   "environment": {},
    *       //   "executionInfo": {},
    *       //   "id": "my_id",
    *       //   "jobMetadata": {},
    *       //   "labels": {},
    *       //   "location": "my_location",
    *       //   "name": "my_name",
    *       //   "pipelineDescription": {},
    *       //   "projectId": "my_projectId",
    *       //   "replaceJobId": "my_replaceJobId",
    *       //   "replacedByJobId": "my_replacedByJobId",
    *       //   "requestedState": "my_requestedState",
    *       //   "satisfiesPzs": false,
    *       //   "stageStates": [],
    *       //   "startTime": "my_startTime",
    *       //   "steps": [],
    *       //   "stepsLocation": "my_stepsLocation",
    *       //   "tempFiles": [],
    *       //   "transformNameMapping": {},
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientRequestId": "my_clientRequestId",
    *   //   "createTime": "my_createTime",
    *   //   "createdFromSnapshotId": "my_createdFromSnapshotId",
    *   //   "currentState": "my_currentState",
    *   //   "currentStateTime": "my_currentStateTime",
    *   //   "environment": {},
    *   //   "executionInfo": {},
    *   //   "id": "my_id",
    *   //   "jobMetadata": {},
    *   //   "labels": {},
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "pipelineDescription": {},
    *   //   "projectId": "my_projectId",
    *   //   "replaceJobId": "my_replaceJobId",
    *   //   "replacedByJobId": "my_replacedByJobId",
    *   //   "requestedState": "my_requestedState",
    *   //   "satisfiesPzs": false,
    *   //   "stageStates": [],
    *   //   "startTime": "my_startTime",
    *   //   "steps": [],
    *   //   "stepsLocation": "my_stepsLocation",
    *   //   "tempFiles": [],
    *   //   "transformNameMapping": {},
    *   //   "type": "my_type"
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
  def update(params: ParamsResourceProjectsJobsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsJobsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var workItems: ResourceProjectsJobsWorkitems = js.native
}
