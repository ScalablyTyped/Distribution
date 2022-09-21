package typings.googleapis.jobsV3Mod.jobsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs/v3", "jobs_v3.Resource$Projects$Jobs")
@js.native
open class ResourceProjectsJobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchDelete(): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(params: ParamsResourceProjectsJobsBatchdelete): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(params: ParamsResourceProjectsJobsBatchdelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchDelete(
    params: ParamsResourceProjectsJobsBatchdelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceProjectsJobsBatchdelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(
    params: ParamsResourceProjectsJobsBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a list of Jobs by filter.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.jobs.batchDelete({
    *     // Required. The resource name of the project under which the job is created. The format is "projects/{project_id\}", for example, "projects/api-test-project".
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "filter": "my_filter"
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
  def batchDelete(params: ParamsResourceProjectsJobsBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourceProjectsJobsBatchdelete,
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
    * Creates a new job. Typically, the job becomes searchable within 10 seconds, but it may take up to 5 minutes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.jobs.create({
    *     // Required. The resource name of the project under which the job is created. The format is "projects/{project_id\}", for example, "projects/api-test-project".
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
    *   //   "addresses": [],
    *   //   "applicationInfo": {},
    *   //   "companyDisplayName": "my_companyDisplayName",
    *   //   "companyName": "my_companyName",
    *   //   "compensationInfo": {},
    *   //   "customAttributes": {},
    *   //   "degreeTypes": [],
    *   //   "department": "my_department",
    *   //   "derivedInfo": {},
    *   //   "description": "my_description",
    *   //   "employmentTypes": [],
    *   //   "incentives": "my_incentives",
    *   //   "jobBenefits": [],
    *   //   "jobEndTime": "my_jobEndTime",
    *   //   "jobLevel": "my_jobLevel",
    *   //   "jobStartTime": "my_jobStartTime",
    *   //   "languageCode": "my_languageCode",
    *   //   "name": "my_name",
    *   //   "postingCreateTime": "my_postingCreateTime",
    *   //   "postingExpireTime": "my_postingExpireTime",
    *   //   "postingPublishTime": "my_postingPublishTime",
    *   //   "postingRegion": "my_postingRegion",
    *   //   "postingUpdateTime": "my_postingUpdateTime",
    *   //   "processingOptions": {},
    *   //   "promotionValue": 0,
    *   //   "qualifications": "my_qualifications",
    *   //   "requisitionId": "my_requisitionId",
    *   //   "responsibilities": "my_responsibilities",
    *   //   "title": "my_title",
    *   //   "visibility": "my_visibility"
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
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsJobsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsJobsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsJobsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsJobsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsJobsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified job. Typically, the job becomes unsearchable within 10 seconds, but it may take up to 5 minutes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.jobs.delete({
    *     // Required. The resource name of the job to be deleted. The format is "projects/{project_id\}/jobs/{job_id\}", for example, "projects/api-test-project/jobs/1234".
    *     name: 'projects/my-project/jobs/my-job',
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
  def delete(params: ParamsResourceProjectsJobsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsJobsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
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
    * Retrieves the specified job, whose status is OPEN or recently EXPIRED within the last 90 days.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.jobs.get({
    *     // Required. The resource name of the job to retrieve. The format is "projects/{project_id\}/jobs/{job_id\}", for example, "projects/api-test-project/jobs/1234".
    *     name: 'projects/my-project/jobs/my-job',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": [],
    *   //   "applicationInfo": {},
    *   //   "companyDisplayName": "my_companyDisplayName",
    *   //   "companyName": "my_companyName",
    *   //   "compensationInfo": {},
    *   //   "customAttributes": {},
    *   //   "degreeTypes": [],
    *   //   "department": "my_department",
    *   //   "derivedInfo": {},
    *   //   "description": "my_description",
    *   //   "employmentTypes": [],
    *   //   "incentives": "my_incentives",
    *   //   "jobBenefits": [],
    *   //   "jobEndTime": "my_jobEndTime",
    *   //   "jobLevel": "my_jobLevel",
    *   //   "jobStartTime": "my_jobStartTime",
    *   //   "languageCode": "my_languageCode",
    *   //   "name": "my_name",
    *   //   "postingCreateTime": "my_postingCreateTime",
    *   //   "postingExpireTime": "my_postingExpireTime",
    *   //   "postingPublishTime": "my_postingPublishTime",
    *   //   "postingRegion": "my_postingRegion",
    *   //   "postingUpdateTime": "my_postingUpdateTime",
    *   //   "processingOptions": {},
    *   //   "promotionValue": 0,
    *   //   "qualifications": "my_qualifications",
    *   //   "requisitionId": "my_requisitionId",
    *   //   "responsibilities": "my_responsibilities",
    *   //   "title": "my_title",
    *   //   "visibility": "my_visibility"
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
    * Lists jobs by filter.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.jobs.list({
    *     // Required. The filter string specifies the jobs to be enumerated. Supported operator: =, AND The fields eligible for filtering are: * `companyName` * `requisitionId` * `status` Available values: OPEN, EXPIRED, ALL. Defaults to OPEN if no value is specified. At least one of `companyName` and `requisitionId` must present or an INVALID_ARGUMENT error is thrown. Sample Query: * companyName = "projects/api-test-project/companies/123" * companyName = "projects/api-test-project/companies/123" AND requisitionId = "req-1" * companyName = "projects/api-test-project/companies/123" AND status = "EXPIRED" * requisitionId = "req-1" * requisitionId = "req-1" AND status = "EXPIRED"
    *     filter: 'placeholder-value',
    *     // Optional. The desired job attributes returned for jobs in the search response. Defaults to JobView.JOB_VIEW_FULL if no value is specified.
    *     jobView: 'placeholder-value',
    *     // Optional. The maximum number of jobs to be returned per page of results. If job_view is set to JobView.JOB_VIEW_ID_ONLY, the maximum allowed page size is 1000. Otherwise, the maximum allowed page size is 100. Default is 100 if empty or a number < 1 is specified.
    *     pageSize: 'placeholder-value',
    *     // Optional. The starting point of a query result.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the project under which the job is created. The format is "projects/{project_id\}", for example, "projects/api-test-project".
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "jobs": [],
    *   //   "metadata": {},
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
  
  def patch(): GaxiosPromise[SchemaJob] = js.native
  def patch(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def patch(params: ParamsResourceProjectsJobsPatch): GaxiosPromise[SchemaJob] = js.native
  def patch(params: ParamsResourceProjectsJobsPatch, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsJobsPatch,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsJobsPatch, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def patch(
    params: ParamsResourceProjectsJobsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * Updates specified job. Typically, updated contents become visible in search results within 10 seconds, but it may take up to 5 minutes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.jobs.patch({
    *     // Required during job update. The resource name for the job. This is generated by the service when a job is created. The format is "projects/{project_id\}/jobs/{job_id\}", for example, "projects/api-test-project/jobs/1234". Use of this field in job queries and API calls is preferred over the use of requisition_id since this value is unique.
    *     name: 'projects/my-project/jobs/my-job',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "job": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": [],
    *   //   "applicationInfo": {},
    *   //   "companyDisplayName": "my_companyDisplayName",
    *   //   "companyName": "my_companyName",
    *   //   "compensationInfo": {},
    *   //   "customAttributes": {},
    *   //   "degreeTypes": [],
    *   //   "department": "my_department",
    *   //   "derivedInfo": {},
    *   //   "description": "my_description",
    *   //   "employmentTypes": [],
    *   //   "incentives": "my_incentives",
    *   //   "jobBenefits": [],
    *   //   "jobEndTime": "my_jobEndTime",
    *   //   "jobLevel": "my_jobLevel",
    *   //   "jobStartTime": "my_jobStartTime",
    *   //   "languageCode": "my_languageCode",
    *   //   "name": "my_name",
    *   //   "postingCreateTime": "my_postingCreateTime",
    *   //   "postingExpireTime": "my_postingExpireTime",
    *   //   "postingPublishTime": "my_postingPublishTime",
    *   //   "postingRegion": "my_postingRegion",
    *   //   "postingUpdateTime": "my_postingUpdateTime",
    *   //   "processingOptions": {},
    *   //   "promotionValue": 0,
    *   //   "qualifications": "my_qualifications",
    *   //   "requisitionId": "my_requisitionId",
    *   //   "responsibilities": "my_responsibilities",
    *   //   "title": "my_title",
    *   //   "visibility": "my_visibility"
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
  def patch(params: ParamsResourceProjectsJobsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsJobsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchJobsResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(params: ParamsResourceProjectsJobsSearch): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(params: ParamsResourceProjectsJobsSearch, callback: BodyResponseCallback[SchemaSearchJobsResponse]): Unit = js.native
  def search(
    params: ParamsResourceProjectsJobsSearch,
    options: BodyResponseCallback[Readable | SchemaSearchJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchJobsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProjectsJobsSearch, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(
    params: ParamsResourceProjectsJobsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchJobsResponse]
  ): Unit = js.native
  /**
    * Searches for jobs using the provided SearchJobsRequest. This call constrains the visibility of jobs present in the database, and only returns jobs that the caller has permission to search against.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.jobs.search({
    *     // Required. The resource name of the project to search within. The format is "projects/{project_id\}", for example, "projects/api-test-project".
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disableKeywordMatch": false,
    *       //   "diversificationLevel": "my_diversificationLevel",
    *       //   "enableBroadening": false,
    *       //   "histogramFacets": {},
    *       //   "jobQuery": {},
    *       //   "jobView": "my_jobView",
    *       //   "offset": 0,
    *       //   "orderBy": "my_orderBy",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "requestMetadata": {},
    *       //   "requirePreciseResultSize": false,
    *       //   "searchMode": "my_searchMode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "broadenedQueryJobsCount": 0,
    *   //   "estimatedTotalSize": 0,
    *   //   "histogramResults": {},
    *   //   "locationFilters": [],
    *   //   "matchingJobs": [],
    *   //   "metadata": {},
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "spellCorrection": {},
    *   //   "totalSize": 0
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
  def search(params: ParamsResourceProjectsJobsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceProjectsJobsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchForAlert(): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(callback: BodyResponseCallback[SchemaSearchJobsResponse]): Unit = js.native
  def searchForAlert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(params: ParamsResourceProjectsJobsSearchforalert): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(
    params: ParamsResourceProjectsJobsSearchforalert,
    callback: BodyResponseCallback[SchemaSearchJobsResponse]
  ): Unit = js.native
  def searchForAlert(
    params: ParamsResourceProjectsJobsSearchforalert,
    options: BodyResponseCallback[Readable | SchemaSearchJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchJobsResponse]
  ): Unit = js.native
  def searchForAlert(params: ParamsResourceProjectsJobsSearchforalert, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(
    params: ParamsResourceProjectsJobsSearchforalert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchJobsResponse]
  ): Unit = js.native
  /**
    * Searches for jobs using the provided SearchJobsRequest. This API call is intended for the use case of targeting passive job seekers (for example, job seekers who have signed up to receive email alerts about potential job opportunities), and has different algorithmic adjustments that are targeted to passive job seekers. This call constrains the visibility of jobs present in the database, and only returns jobs the caller has permission to search against.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.jobs.searchForAlert({
    *     // Required. The resource name of the project to search within. The format is "projects/{project_id\}", for example, "projects/api-test-project".
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disableKeywordMatch": false,
    *       //   "diversificationLevel": "my_diversificationLevel",
    *       //   "enableBroadening": false,
    *       //   "histogramFacets": {},
    *       //   "jobQuery": {},
    *       //   "jobView": "my_jobView",
    *       //   "offset": 0,
    *       //   "orderBy": "my_orderBy",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "requestMetadata": {},
    *       //   "requirePreciseResultSize": false,
    *       //   "searchMode": "my_searchMode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "broadenedQueryJobsCount": 0,
    *   //   "estimatedTotalSize": 0,
    *   //   "histogramResults": {},
    *   //   "locationFilters": [],
    *   //   "matchingJobs": [],
    *   //   "metadata": {},
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "spellCorrection": {},
    *   //   "totalSize": 0
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
  def searchForAlert(params: ParamsResourceProjectsJobsSearchforalert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchForAlert(
    params: ParamsResourceProjectsJobsSearchforalert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
