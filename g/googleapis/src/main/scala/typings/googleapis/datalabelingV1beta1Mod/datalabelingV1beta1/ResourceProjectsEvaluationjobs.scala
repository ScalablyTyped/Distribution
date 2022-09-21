package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects$Evaluationjobs")
@js.native
open class ResourceProjectsEvaluationjobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def create(params: ParamsResourceProjectsEvaluationjobsCreate): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def create(
    params: ParamsResourceProjectsEvaluationjobsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsEvaluationjobsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1EvaluationJob],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsEvaluationjobsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def create(
    params: ParamsResourceProjectsEvaluationjobsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]
  ): Unit = js.native
  /**
    * Creates an evaluation job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
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
    *   const res = await datalabeling.projects.evaluationJobs.create({
    *     // Required. Evaluation job resource parent. Format: "projects/{project_id\}"
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "job": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationSpecSet": "my_annotationSpecSet",
    *   //   "attempts": [],
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "evaluationJobConfig": {},
    *   //   "labelMissingGroundTruth": false,
    *   //   "modelVersion": "my_modelVersion",
    *   //   "name": "my_name",
    *   //   "schedule": "my_schedule",
    *   //   "state": "my_state"
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
  def create(params: ParamsResourceProjectsEvaluationjobsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsEvaluationjobsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsEvaluationjobsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsEvaluationjobsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsEvaluationjobsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsEvaluationjobsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsEvaluationjobsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Stops and deletes an evaluation job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
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
    *   const res = await datalabeling.projects.evaluationJobs.delete({
    *     // Required. Name of the evaluation job that is going to be deleted. Format: "projects/{project_id\}/evaluationJobs/{evaluation_job_id\}"
    *     name: 'projects/my-project/evaluationJobs/my-evaluationJob',
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
  def delete(params: ParamsResourceProjectsEvaluationjobsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsEvaluationjobsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def get(params: ParamsResourceProjectsEvaluationjobsGet): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def get(
    params: ParamsResourceProjectsEvaluationjobsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsEvaluationjobsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1EvaluationJob],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsEvaluationjobsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def get(
    params: ParamsResourceProjectsEvaluationjobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]
  ): Unit = js.native
  /**
    * Gets an evaluation job by resource name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
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
    *   const res = await datalabeling.projects.evaluationJobs.get({
    *     // Required. Name of the evaluation job. Format: "projects/{project_id\} /evaluationJobs/{evaluation_job_id\}"
    *     name: 'projects/my-project/evaluationJobs/my-evaluationJob',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationSpecSet": "my_annotationSpecSet",
    *   //   "attempts": [],
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "evaluationJobConfig": {},
    *   //   "labelMissingGroundTruth": false,
    *   //   "modelVersion": "my_modelVersion",
    *   //   "name": "my_name",
    *   //   "schedule": "my_schedule",
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceProjectsEvaluationjobsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsEvaluationjobsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse] = js.native
  def list(params: ParamsResourceProjectsEvaluationjobsList): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsEvaluationjobsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsEvaluationjobsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsEvaluationjobsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsEvaluationjobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse]
  ): Unit = js.native
  /**
    * Lists all evaluation jobs within a project with possible filters. Pagination is supported.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
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
    *   const res = await datalabeling.projects.evaluationJobs.list({
    *     // Optional. You can filter the jobs to list by model_id (also known as model_name, as described in EvaluationJob.modelVersion) or by evaluation job state (as described in EvaluationJob.state). To filter by both criteria, use the `AND` operator or the `OR` operator. For example, you can use the following string for your filter: "evaluation_job.model_id = {model_name\} AND evaluation_job.state = {evaluation_job_state\}"
    *     filter: 'placeholder-value',
    *     // Optional. Requested page size. Server may return fewer results than requested. Default value is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token identifying a page of results for the server to return. Typically obtained by the nextPageToken in the response to the previous request. The request returns the first page if this is empty.
    *     pageToken: 'placeholder-value',
    *     // Required. Evaluation job resource parent. Format: "projects/{project_id\}"
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "evaluationJobs": [],
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
  def list(params: ParamsResourceProjectsEvaluationjobsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsEvaluationjobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def patch(params: ParamsResourceProjectsEvaluationjobsPatch): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def patch(
    params: ParamsResourceProjectsEvaluationjobsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsEvaluationjobsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1EvaluationJob],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsEvaluationjobsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def patch(
    params: ParamsResourceProjectsEvaluationjobsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]
  ): Unit = js.native
  /**
    * Updates an evaluation job. You can only update certain fields of the job's EvaluationJobConfig: `humanAnnotationConfig.instruction`, `exampleCount`, and `exampleSamplePercentage`. If you want to change any other aspect of the evaluation job, you must delete the job and create a new one.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
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
    *   const res = await datalabeling.projects.evaluationJobs.patch({
    *     // Output only. After you create a job, Data Labeling Service assigns a name to the job with the following format: "projects/{project_id\}/evaluationJobs/ {evaluation_job_id\}"
    *     name: 'projects/my-project/evaluationJobs/my-evaluationJob',
    *     // Optional. Mask for which fields to update. You can only provide the following fields: * `evaluationJobConfig.humanAnnotationConfig.instruction` * `evaluationJobConfig.exampleCount` * `evaluationJobConfig.exampleSamplePercentage` You can provide more than one of these fields by separating them with commas.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "annotationSpecSet": "my_annotationSpecSet",
    *       //   "attempts": [],
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "evaluationJobConfig": {},
    *       //   "labelMissingGroundTruth": false,
    *       //   "modelVersion": "my_modelVersion",
    *       //   "name": "my_name",
    *       //   "schedule": "my_schedule",
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationSpecSet": "my_annotationSpecSet",
    *   //   "attempts": [],
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "evaluationJobConfig": {},
    *   //   "labelMissingGroundTruth": false,
    *   //   "modelVersion": "my_modelVersion",
    *   //   "name": "my_name",
    *   //   "schedule": "my_schedule",
    *   //   "state": "my_state"
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
  def patch(params: ParamsResourceProjectsEvaluationjobsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsEvaluationjobsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def pause(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def pause(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def pause(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def pause(params: ParamsResourceProjectsEvaluationjobsPause): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def pause(
    params: ParamsResourceProjectsEvaluationjobsPause,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def pause(
    params: ParamsResourceProjectsEvaluationjobsPause,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def pause(params: ParamsResourceProjectsEvaluationjobsPause, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def pause(
    params: ParamsResourceProjectsEvaluationjobsPause,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Pauses an evaluation job. Pausing an evaluation job that is already in a `PAUSED` state is a no-op.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
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
    *   const res = await datalabeling.projects.evaluationJobs.pause({
    *     // Required. Name of the evaluation job that is going to be paused. Format: "projects/{project_id\}/evaluationJobs/{evaluation_job_id\}"
    *     name: 'projects/my-project/evaluationJobs/my-evaluationJob',
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
  def pause(params: ParamsResourceProjectsEvaluationjobsPause, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def pause(
    params: ParamsResourceProjectsEvaluationjobsPause,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resume(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def resume(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def resume(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def resume(params: ParamsResourceProjectsEvaluationjobsResume): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def resume(
    params: ParamsResourceProjectsEvaluationjobsResume,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def resume(
    params: ParamsResourceProjectsEvaluationjobsResume,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def resume(params: ParamsResourceProjectsEvaluationjobsResume, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def resume(
    params: ParamsResourceProjectsEvaluationjobsResume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Resumes a paused evaluation job. A deleted evaluation job can't be resumed. Resuming a running or scheduled evaluation job is a no-op.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
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
    *   const res = await datalabeling.projects.evaluationJobs.resume({
    *     // Required. Name of the evaluation job that is going to be resumed. Format: "projects/{project_id\}/evaluationJobs/{evaluation_job_id\}"
    *     name: 'projects/my-project/evaluationJobs/my-evaluationJob',
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
  def resume(params: ParamsResourceProjectsEvaluationjobsResume, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resume(
    params: ParamsResourceProjectsEvaluationjobsResume,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
