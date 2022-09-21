package typings.googleapis.jobsV4Mod.jobsV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs/v4", "jobs_v4.Resource$Projects$Tenants$Jobs")
@js.native
open class ResourceProjectsTenantsJobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchCreate(): GaxiosPromise[SchemaOperation] = js.native
  def batchCreate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def batchCreate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchCreate(params: ParamsResourceProjectsTenantsJobsBatchcreate): GaxiosPromise[SchemaOperation] = js.native
  def batchCreate(
    params: ParamsResourceProjectsTenantsJobsBatchcreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def batchCreate(
    params: ParamsResourceProjectsTenantsJobsBatchcreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def batchCreate(params: ParamsResourceProjectsTenantsJobsBatchcreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchCreate(
    params: ParamsResourceProjectsTenantsJobsBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Begins executing a batch create jobs operation.
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
    * const jobs = google.jobs('v4');
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
    *   const res = await jobs.projects.tenants.jobs.batchCreate({
    *     // Required. The resource name of the tenant under which the job is created. The format is "projects/{project_id\}/tenants/{tenant_id\}". For example, "projects/foo/tenants/bar".
    *     parent: 'projects/my-project/tenants/my-tenant',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "jobs": []
    *       // }
    *     },
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
  def batchCreate(params: ParamsResourceProjectsTenantsJobsBatchcreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchCreate(
    params: ParamsResourceProjectsTenantsJobsBatchcreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchDelete(): GaxiosPromise[SchemaOperation] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchDelete(params: ParamsResourceProjectsTenantsJobsBatchdelete): GaxiosPromise[SchemaOperation] = js.native
  def batchDelete(
    params: ParamsResourceProjectsTenantsJobsBatchdelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def batchDelete(
    params: ParamsResourceProjectsTenantsJobsBatchdelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceProjectsTenantsJobsBatchdelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchDelete(
    params: ParamsResourceProjectsTenantsJobsBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Begins executing a batch delete jobs operation.
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
    * const jobs = google.jobs('v4');
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
    *   const res = await jobs.projects.tenants.jobs.batchDelete({
    *     // Required. The resource name of the tenant under which the job is created. The format is "projects/{project_id\}/tenants/{tenant_id\}". For example, "projects/foo/tenants/bar". The parent of all of the jobs specified in `names` must match this field.
    *     parent: 'projects/my-project/tenants/my-tenant',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "names": []
    *       // }
    *     },
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
  def batchDelete(params: ParamsResourceProjectsTenantsJobsBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourceProjectsTenantsJobsBatchdelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchUpdate(): GaxiosPromise[SchemaOperation] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchUpdate(params: ParamsResourceProjectsTenantsJobsBatchupdate): GaxiosPromise[SchemaOperation] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsTenantsJobsBatchupdate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceProjectsTenantsJobsBatchupdate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceProjectsTenantsJobsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsTenantsJobsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Begins executing a batch update jobs operation.
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
    * const jobs = google.jobs('v4');
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
    *   const res = await jobs.projects.tenants.jobs.batchUpdate({
    *     // Required. The resource name of the tenant under which the job is created. The format is "projects/{project_id\}/tenants/{tenant_id\}". For example, "projects/foo/tenants/bar".
    *     parent: 'projects/my-project/tenants/my-tenant',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "jobs": [],
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
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
  def batchUpdate(params: ParamsResourceProjectsTenantsJobsBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsTenantsJobsBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaJob] = js.native
  def create(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceProjectsTenantsJobsCreate): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceProjectsTenantsJobsCreate, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(
    params: ParamsResourceProjectsTenantsJobsCreate,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsTenantsJobsCreate, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(
    params: ParamsResourceProjectsTenantsJobsCreate,
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
    * const jobs = google.jobs('v4');
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
    *   const res = await jobs.projects.tenants.jobs.create({
    *     // Required. The resource name of the tenant under which the job is created. The format is "projects/{project_id\}/tenants/{tenant_id\}". For example, "projects/foo/tenants/bar".
    *     parent: 'projects/my-project/tenants/my-tenant',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "addresses": [],
    *       //   "applicationInfo": {},
    *       //   "company": "my_company",
    *       //   "companyDisplayName": "my_companyDisplayName",
    *       //   "compensationInfo": {},
    *       //   "customAttributes": {},
    *       //   "degreeTypes": [],
    *       //   "department": "my_department",
    *       //   "derivedInfo": {},
    *       //   "description": "my_description",
    *       //   "employmentTypes": [],
    *       //   "incentives": "my_incentives",
    *       //   "jobBenefits": [],
    *       //   "jobEndTime": "my_jobEndTime",
    *       //   "jobLevel": "my_jobLevel",
    *       //   "jobStartTime": "my_jobStartTime",
    *       //   "languageCode": "my_languageCode",
    *       //   "name": "my_name",
    *       //   "postingCreateTime": "my_postingCreateTime",
    *       //   "postingExpireTime": "my_postingExpireTime",
    *       //   "postingPublishTime": "my_postingPublishTime",
    *       //   "postingRegion": "my_postingRegion",
    *       //   "postingUpdateTime": "my_postingUpdateTime",
    *       //   "processingOptions": {},
    *       //   "promotionValue": 0,
    *       //   "qualifications": "my_qualifications",
    *       //   "requisitionId": "my_requisitionId",
    *       //   "responsibilities": "my_responsibilities",
    *       //   "title": "my_title",
    *       //   "visibility": "my_visibility"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": [],
    *   //   "applicationInfo": {},
    *   //   "company": "my_company",
    *   //   "companyDisplayName": "my_companyDisplayName",
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
  def create(params: ParamsResourceProjectsTenantsJobsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsTenantsJobsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTenantsJobsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTenantsJobsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsTenantsJobsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsTenantsJobsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsTenantsJobsDelete,
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
    * const jobs = google.jobs('v4');
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
    *   const res = await jobs.projects.tenants.jobs.delete({
    *     // Required. The resource name of the job to be deleted. The format is "projects/{project_id\}/tenants/{tenant_id\}/jobs/{job_id\}". For example, "projects/foo/tenants/bar/jobs/baz".
    *     name: 'projects/my-project/tenants/my-tenant/jobs/my-job',
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
  def delete(params: ParamsResourceProjectsTenantsJobsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsTenantsJobsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaJob] = js.native
  def get(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceProjectsTenantsJobsGet): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceProjectsTenantsJobsGet, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(
    params: ParamsResourceProjectsTenantsJobsGet,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsTenantsJobsGet, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(
    params: ParamsResourceProjectsTenantsJobsGet,
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
    * const jobs = google.jobs('v4');
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
    *   const res = await jobs.projects.tenants.jobs.get({
    *     // Required. The resource name of the job to retrieve. The format is "projects/{project_id\}/tenants/{tenant_id\}/jobs/{job_id\}". For example, "projects/foo/tenants/bar/jobs/baz".
    *     name: 'projects/my-project/tenants/my-tenant/jobs/my-job',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": [],
    *   //   "applicationInfo": {},
    *   //   "company": "my_company",
    *   //   "companyDisplayName": "my_companyDisplayName",
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
  def get(params: ParamsResourceProjectsTenantsJobsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsTenantsJobsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(params: ParamsResourceProjectsTenantsJobsList): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTenantsJobsList,
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTenantsJobsList,
    options: BodyResponseCallback[Readable | SchemaListJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaListJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTenantsJobsList, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTenantsJobsList,
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
    * const jobs = google.jobs('v4');
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
    *   const res = await jobs.projects.tenants.jobs.list({
    *     // Required. The filter string specifies the jobs to be enumerated. Supported operator: =, AND The fields eligible for filtering are: * `companyName` * `requisitionId` * `status` Available values: OPEN, EXPIRED, ALL. Defaults to OPEN if no value is specified. At least one of `companyName` and `requisitionId` must present or an INVALID_ARGUMENT error is thrown. Sample Query: * companyName = "projects/foo/tenants/bar/companies/baz" * companyName = "projects/foo/tenants/bar/companies/baz" AND requisitionId = "req-1" * companyName = "projects/foo/tenants/bar/companies/baz" AND status = "EXPIRED" * requisitionId = "req-1" * requisitionId = "req-1" AND status = "EXPIRED"
    *     filter: 'placeholder-value',
    *     // The desired job attributes returned for jobs in the search response. Defaults to JobView.JOB_VIEW_FULL if no value is specified.
    *     jobView: 'placeholder-value',
    *     // The maximum number of jobs to be returned per page of results. If job_view is set to JobView.JOB_VIEW_ID_ONLY, the maximum allowed page size is 1000. Otherwise, the maximum allowed page size is 100. Default is 100 if empty or a number < 1 is specified.
    *     pageSize: 'placeholder-value',
    *     // The starting point of a query result.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the tenant under which the job is created. The format is "projects/{project_id\}/tenants/{tenant_id\}". For example, "projects/foo/tenants/bar".
    *     parent: 'projects/my-project/tenants/my-tenant',
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
  def list(params: ParamsResourceProjectsTenantsJobsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsTenantsJobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaJob] = js.native
  def patch(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def patch(params: ParamsResourceProjectsTenantsJobsPatch): GaxiosPromise[SchemaJob] = js.native
  def patch(params: ParamsResourceProjectsTenantsJobsPatch, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsTenantsJobsPatch,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsTenantsJobsPatch, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def patch(
    params: ParamsResourceProjectsTenantsJobsPatch,
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
    * const jobs = google.jobs('v4');
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
    *   const res = await jobs.projects.tenants.jobs.patch({
    *     // Required during job update. The resource name for the job. This is generated by the service when a job is created. The format is "projects/{project_id\}/tenants/{tenant_id\}/jobs/{job_id\}". For example, "projects/foo/tenants/bar/jobs/baz". Use of this field in job queries and API calls is preferred over the use of requisition_id since this value is unique.
    *     name: 'projects/my-project/tenants/my-tenant/jobs/my-job',
    *     // Strongly recommended for the best service experience. If update_mask is provided, only the specified fields in job are updated. Otherwise all the fields are updated. A field mask to restrict the fields that are updated. Only top level fields of Job are supported.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "addresses": [],
    *       //   "applicationInfo": {},
    *       //   "company": "my_company",
    *       //   "companyDisplayName": "my_companyDisplayName",
    *       //   "compensationInfo": {},
    *       //   "customAttributes": {},
    *       //   "degreeTypes": [],
    *       //   "department": "my_department",
    *       //   "derivedInfo": {},
    *       //   "description": "my_description",
    *       //   "employmentTypes": [],
    *       //   "incentives": "my_incentives",
    *       //   "jobBenefits": [],
    *       //   "jobEndTime": "my_jobEndTime",
    *       //   "jobLevel": "my_jobLevel",
    *       //   "jobStartTime": "my_jobStartTime",
    *       //   "languageCode": "my_languageCode",
    *       //   "name": "my_name",
    *       //   "postingCreateTime": "my_postingCreateTime",
    *       //   "postingExpireTime": "my_postingExpireTime",
    *       //   "postingPublishTime": "my_postingPublishTime",
    *       //   "postingRegion": "my_postingRegion",
    *       //   "postingUpdateTime": "my_postingUpdateTime",
    *       //   "processingOptions": {},
    *       //   "promotionValue": 0,
    *       //   "qualifications": "my_qualifications",
    *       //   "requisitionId": "my_requisitionId",
    *       //   "responsibilities": "my_responsibilities",
    *       //   "title": "my_title",
    *       //   "visibility": "my_visibility"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": [],
    *   //   "applicationInfo": {},
    *   //   "company": "my_company",
    *   //   "companyDisplayName": "my_companyDisplayName",
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
  def patch(params: ParamsResourceProjectsTenantsJobsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsTenantsJobsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchJobsResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(params: ParamsResourceProjectsTenantsJobsSearch): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(
    params: ParamsResourceProjectsTenantsJobsSearch,
    callback: BodyResponseCallback[SchemaSearchJobsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceProjectsTenantsJobsSearch,
    options: BodyResponseCallback[Readable | SchemaSearchJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchJobsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProjectsTenantsJobsSearch, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(
    params: ParamsResourceProjectsTenantsJobsSearch,
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
    * const jobs = google.jobs('v4');
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
    *   const res = await jobs.projects.tenants.jobs.search({
    *     // Required. The resource name of the tenant to search within. The format is "projects/{project_id\}/tenants/{tenant_id\}". For example, "projects/foo/tenants/bar".
    *     parent: 'projects/my-project/tenants/my-tenant',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customRankingInfo": {},
    *       //   "disableKeywordMatch": false,
    *       //   "diversificationLevel": "my_diversificationLevel",
    *       //   "enableBroadening": false,
    *       //   "histogramQueries": [],
    *       //   "jobQuery": {},
    *       //   "jobView": "my_jobView",
    *       //   "keywordMatchMode": "my_keywordMatchMode",
    *       //   "maxPageSize": 0,
    *       //   "offset": 0,
    *       //   "orderBy": "my_orderBy",
    *       //   "pageToken": "my_pageToken",
    *       //   "requestMetadata": {},
    *       //   "searchMode": "my_searchMode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "broadenedQueryJobsCount": 0,
    *   //   "histogramQueryResults": [],
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
  def search(params: ParamsResourceProjectsTenantsJobsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceProjectsTenantsJobsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchForAlert(): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(callback: BodyResponseCallback[SchemaSearchJobsResponse]): Unit = js.native
  def searchForAlert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(params: ParamsResourceProjectsTenantsJobsSearchforalert): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(
    params: ParamsResourceProjectsTenantsJobsSearchforalert,
    callback: BodyResponseCallback[SchemaSearchJobsResponse]
  ): Unit = js.native
  def searchForAlert(
    params: ParamsResourceProjectsTenantsJobsSearchforalert,
    options: BodyResponseCallback[Readable | SchemaSearchJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchJobsResponse]
  ): Unit = js.native
  def searchForAlert(params: ParamsResourceProjectsTenantsJobsSearchforalert, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(
    params: ParamsResourceProjectsTenantsJobsSearchforalert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchJobsResponse]
  ): Unit = js.native
  /**
    * Searches for jobs using the provided SearchJobsRequest. This API call is intended for the use case of targeting passive job seekers (for example, job seekers who have signed up to receive email alerts about potential job opportunities), it has different algorithmic adjustments that are designed to specifically target passive job seekers. This call constrains the visibility of jobs present in the database, and only returns jobs the caller has permission to search against.
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
    * const jobs = google.jobs('v4');
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
    *   const res = await jobs.projects.tenants.jobs.searchForAlert({
    *     // Required. The resource name of the tenant to search within. The format is "projects/{project_id\}/tenants/{tenant_id\}". For example, "projects/foo/tenants/bar".
    *     parent: 'projects/my-project/tenants/my-tenant',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customRankingInfo": {},
    *       //   "disableKeywordMatch": false,
    *       //   "diversificationLevel": "my_diversificationLevel",
    *       //   "enableBroadening": false,
    *       //   "histogramQueries": [],
    *       //   "jobQuery": {},
    *       //   "jobView": "my_jobView",
    *       //   "keywordMatchMode": "my_keywordMatchMode",
    *       //   "maxPageSize": 0,
    *       //   "offset": 0,
    *       //   "orderBy": "my_orderBy",
    *       //   "pageToken": "my_pageToken",
    *       //   "requestMetadata": {},
    *       //   "searchMode": "my_searchMode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "broadenedQueryJobsCount": 0,
    *   //   "histogramQueryResults": [],
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
  def searchForAlert(params: ParamsResourceProjectsTenantsJobsSearchforalert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchForAlert(
    params: ParamsResourceProjectsTenantsJobsSearchforalert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
