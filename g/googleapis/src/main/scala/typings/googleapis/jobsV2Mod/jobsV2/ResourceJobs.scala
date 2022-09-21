package typings.googleapis.jobsV2Mod.jobsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs/v2", "jobs_v2.Resource$Jobs")
@js.native
open class ResourceJobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchDelete(): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(params: ParamsResourceJobsBatchdelete): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(params: ParamsResourceJobsBatchdelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchDelete(
    params: ParamsResourceJobsBatchdelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceJobsBatchdelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(
    params: ParamsResourceJobsBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a list of Job postings by filter.
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.jobs.batchDelete({
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
  def batchDelete(params: ParamsResourceJobsBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourceJobsBatchdelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaJob] = js.native
  def create(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceJobsCreate): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceJobsCreate, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(
    params: ParamsResourceJobsCreate,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def create(params: ParamsResourceJobsCreate, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(
    params: ParamsResourceJobsCreate,
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.jobs.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disableStreetAddressResolution": false,
    *       //   "job": {},
    *       //   "processingOptions": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "applicationEmailList": [],
    *   //   "applicationInstruction": "my_applicationInstruction",
    *   //   "applicationUrls": [],
    *   //   "benefits": [],
    *   //   "companyDisplayName": "my_companyDisplayName",
    *   //   "companyName": "my_companyName",
    *   //   "companyTitle": "my_companyTitle",
    *   //   "compensationInfo": {},
    *   //   "createTime": "my_createTime",
    *   //   "customAttributes": {},
    *   //   "department": "my_department",
    *   //   "description": "my_description",
    *   //   "distributorCompanyId": "my_distributorCompanyId",
    *   //   "educationLevels": [],
    *   //   "employmentTypes": [],
    *   //   "endDate": {},
    *   //   "expireTime": "my_expireTime",
    *   //   "expiryDate": {},
    *   //   "extendedCompensationInfo": {},
    *   //   "filterableCustomFields": {},
    *   //   "incentives": "my_incentives",
    *   //   "jobLocations": [],
    *   //   "jobTitle": "my_jobTitle",
    *   //   "languageCode": "my_languageCode",
    *   //   "level": "my_level",
    *   //   "locations": [],
    *   //   "name": "my_name",
    *   //   "promotionValue": 0,
    *   //   "publishDate": {},
    *   //   "qualifications": "my_qualifications",
    *   //   "referenceUrl": "my_referenceUrl",
    *   //   "region": "my_region",
    *   //   "requisitionId": "my_requisitionId",
    *   //   "responsibilities": "my_responsibilities",
    *   //   "startDate": {},
    *   //   "unindexedCustomFields": {},
    *   //   "updateTime": "my_updateTime",
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
  def create(params: ParamsResourceJobsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceJobsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceJobsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceJobsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceJobsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceJobsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceJobsDelete,
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.jobs.delete({
    *     // Deprecated. This field is not working anymore. Optional. If set to true, this call waits for all processing steps to complete before the job is cleaned up. Otherwise, the call returns while some steps are still taking place asynchronously, hence faster.
    *     disableFastProcess: 'placeholder-value',
    *     // Required. The resource name of the job to be deleted, such as "jobs/11111111".
    *     name: 'jobs/my-job',
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
  def delete(params: ParamsResourceJobsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceJobsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteByFilter(): GaxiosPromise[SchemaEmpty] = js.native
  def deleteByFilter(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def deleteByFilter(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteByFilter(params: ParamsResourceJobsDeletebyfilter): GaxiosPromise[SchemaEmpty] = js.native
  def deleteByFilter(params: ParamsResourceJobsDeletebyfilter, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def deleteByFilter(
    params: ParamsResourceJobsDeletebyfilter,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def deleteByFilter(params: ParamsResourceJobsDeletebyfilter, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteByFilter(
    params: ParamsResourceJobsDeletebyfilter,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deprecated. Use BatchDeleteJobs instead. Deletes the specified job by filter. You can specify whether to synchronously wait for validation, indexing, and general processing to be completed before the response is returned.
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.jobs.deleteByFilter({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disableFastProcess": false,
    *       //   "filter": {}
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
  def deleteByFilter(params: ParamsResourceJobsDeletebyfilter, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteByFilter(
    params: ParamsResourceJobsDeletebyfilter,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaJob] = js.native
  def get(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceJobsGet): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceJobsGet, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(
    params: ParamsResourceJobsGet,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def get(params: ParamsResourceJobsGet, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceJobsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.jobs.get({
    *     // Required. The resource name of the job to retrieve, such as "jobs/11111111".
    *     name: 'jobs/my-job',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "applicationEmailList": [],
    *   //   "applicationInstruction": "my_applicationInstruction",
    *   //   "applicationUrls": [],
    *   //   "benefits": [],
    *   //   "companyDisplayName": "my_companyDisplayName",
    *   //   "companyName": "my_companyName",
    *   //   "companyTitle": "my_companyTitle",
    *   //   "compensationInfo": {},
    *   //   "createTime": "my_createTime",
    *   //   "customAttributes": {},
    *   //   "department": "my_department",
    *   //   "description": "my_description",
    *   //   "distributorCompanyId": "my_distributorCompanyId",
    *   //   "educationLevels": [],
    *   //   "employmentTypes": [],
    *   //   "endDate": {},
    *   //   "expireTime": "my_expireTime",
    *   //   "expiryDate": {},
    *   //   "extendedCompensationInfo": {},
    *   //   "filterableCustomFields": {},
    *   //   "incentives": "my_incentives",
    *   //   "jobLocations": [],
    *   //   "jobTitle": "my_jobTitle",
    *   //   "languageCode": "my_languageCode",
    *   //   "level": "my_level",
    *   //   "locations": [],
    *   //   "name": "my_name",
    *   //   "promotionValue": 0,
    *   //   "publishDate": {},
    *   //   "qualifications": "my_qualifications",
    *   //   "referenceUrl": "my_referenceUrl",
    *   //   "region": "my_region",
    *   //   "requisitionId": "my_requisitionId",
    *   //   "responsibilities": "my_responsibilities",
    *   //   "startDate": {},
    *   //   "unindexedCustomFields": {},
    *   //   "updateTime": "my_updateTime",
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
  def get(params: ParamsResourceJobsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceJobsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def histogram(): GaxiosPromise[SchemaGetHistogramResponse] = js.native
  def histogram(callback: BodyResponseCallback[SchemaGetHistogramResponse]): Unit = js.native
  def histogram(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetHistogramResponse] = js.native
  def histogram(params: ParamsResourceJobsHistogram): GaxiosPromise[SchemaGetHistogramResponse] = js.native
  def histogram(params: ParamsResourceJobsHistogram, callback: BodyResponseCallback[SchemaGetHistogramResponse]): Unit = js.native
  def histogram(
    params: ParamsResourceJobsHistogram,
    options: BodyResponseCallback[Readable | SchemaGetHistogramResponse],
    callback: BodyResponseCallback[Readable | SchemaGetHistogramResponse]
  ): Unit = js.native
  def histogram(params: ParamsResourceJobsHistogram, options: MethodOptions): GaxiosPromise[SchemaGetHistogramResponse] = js.native
  def histogram(
    params: ParamsResourceJobsHistogram,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetHistogramResponse]
  ): Unit = js.native
  /**
    * Deprecated. Use SearchJobsRequest.histogram_facets instead to make a single call with both search and histogram. Retrieves a histogram for the given GetHistogramRequest. This call provides a structured count of jobs that match against the search query, grouped by specified facets. This call constrains the visibility of jobs present in the database, and only counts jobs the caller has permission to search against. For example, use this call to generate the number of jobs in the U.S. by state.
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.jobs.histogram({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "allowBroadening": false,
    *       //   "filters": {},
    *       //   "query": {},
    *       //   "requestMetadata": {},
    *       //   "searchTypes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "metadata": {},
    *   //   "results": []
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
  def histogram(params: ParamsResourceJobsHistogram, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def histogram(
    params: ParamsResourceJobsHistogram,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(params: ParamsResourceJobsList): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(params: ParamsResourceJobsList, callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def list(
    params: ParamsResourceJobsList,
    options: BodyResponseCallback[Readable | SchemaListJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaListJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceJobsList, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(
    params: ParamsResourceJobsList,
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.jobs.list({
    *     // Required. The filter string specifies the jobs to be enumerated. Supported operator: =, AND The fields eligible for filtering are: * `companyName` (Required) * `requisitionId` (Optional) Sample Query: * companyName = "companies/123" * companyName = "companies/123" AND requisitionId = "req-1"
    *     filter: 'placeholder-value',
    *     // Optional. If set to `true`, only Job.name, Job.requisition_id and Job.language_code will be returned. A typical use case is to synchronize job repositories. Defaults to false.
    *     idsOnly: 'placeholder-value',
    *     // Optional. The maximum number of jobs to be returned per page of results. If ids_only is set to true, the maximum allowed page size is 1000. Otherwise, the maximum allowed page size is 100. Default is 100 if empty or a number < 1 is specified.
    *     pageSize: 'placeholder-value',
    *     // Optional. The starting point of a query result.
    *     pageToken: 'placeholder-value',
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
  def list(params: ParamsResourceJobsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceJobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaJob] = js.native
  def patch(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def patch(params: ParamsResourceJobsPatch): GaxiosPromise[SchemaJob] = js.native
  def patch(params: ParamsResourceJobsPatch, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def patch(
    params: ParamsResourceJobsPatch,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def patch(params: ParamsResourceJobsPatch, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def patch(params: ParamsResourceJobsPatch, options: MethodOptions, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.jobs.patch({
    *     // Required during job update. Resource name assigned to a job by the API, for example, "/jobs/foo". Use of this field in job queries and API calls is preferred over the use of requisition_id since this value is unique.
    *     name: 'jobs/my-job',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disableStreetAddressResolution": false,
    *       //   "job": {},
    *       //   "processingOptions": {},
    *       //   "updateJobFields": "my_updateJobFields"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "applicationEmailList": [],
    *   //   "applicationInstruction": "my_applicationInstruction",
    *   //   "applicationUrls": [],
    *   //   "benefits": [],
    *   //   "companyDisplayName": "my_companyDisplayName",
    *   //   "companyName": "my_companyName",
    *   //   "companyTitle": "my_companyTitle",
    *   //   "compensationInfo": {},
    *   //   "createTime": "my_createTime",
    *   //   "customAttributes": {},
    *   //   "department": "my_department",
    *   //   "description": "my_description",
    *   //   "distributorCompanyId": "my_distributorCompanyId",
    *   //   "educationLevels": [],
    *   //   "employmentTypes": [],
    *   //   "endDate": {},
    *   //   "expireTime": "my_expireTime",
    *   //   "expiryDate": {},
    *   //   "extendedCompensationInfo": {},
    *   //   "filterableCustomFields": {},
    *   //   "incentives": "my_incentives",
    *   //   "jobLocations": [],
    *   //   "jobTitle": "my_jobTitle",
    *   //   "languageCode": "my_languageCode",
    *   //   "level": "my_level",
    *   //   "locations": [],
    *   //   "name": "my_name",
    *   //   "promotionValue": 0,
    *   //   "publishDate": {},
    *   //   "qualifications": "my_qualifications",
    *   //   "referenceUrl": "my_referenceUrl",
    *   //   "region": "my_region",
    *   //   "requisitionId": "my_requisitionId",
    *   //   "responsibilities": "my_responsibilities",
    *   //   "startDate": {},
    *   //   "unindexedCustomFields": {},
    *   //   "updateTime": "my_updateTime",
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
  def patch(params: ParamsResourceJobsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceJobsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchJobsResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(params: ParamsResourceJobsSearch): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(params: ParamsResourceJobsSearch, callback: BodyResponseCallback[SchemaSearchJobsResponse]): Unit = js.native
  def search(
    params: ParamsResourceJobsSearch,
    options: BodyResponseCallback[Readable | SchemaSearchJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchJobsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceJobsSearch, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(
    params: ParamsResourceJobsSearch,
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.jobs.search({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disableRelevanceThresholding": false,
    *       //   "enableBroadening": false,
    *       //   "enablePreciseResultSize": false,
    *       //   "filters": {},
    *       //   "histogramFacets": {},
    *       //   "jobView": "my_jobView",
    *       //   "mode": "my_mode",
    *       //   "offset": 0,
    *       //   "orderBy": "my_orderBy",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "query": {},
    *       //   "requestMetadata": {},
    *       //   "sortBy": "my_sortBy"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appliedCommuteFilter": {},
    *   //   "appliedJobLocationFilters": [],
    *   //   "estimatedTotalSize": "my_estimatedTotalSize",
    *   //   "histogramResults": {},
    *   //   "jobView": "my_jobView",
    *   //   "matchingJobs": [],
    *   //   "metadata": {},
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "numJobsFromBroadenedQuery": 0,
    *   //   "spellResult": {},
    *   //   "totalSize": "my_totalSize"
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
  def search(params: ParamsResourceJobsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceJobsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchForAlert(): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(callback: BodyResponseCallback[SchemaSearchJobsResponse]): Unit = js.native
  def searchForAlert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(params: ParamsResourceJobsSearchforalert): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(params: ParamsResourceJobsSearchforalert, callback: BodyResponseCallback[SchemaSearchJobsResponse]): Unit = js.native
  def searchForAlert(
    params: ParamsResourceJobsSearchforalert,
    options: BodyResponseCallback[Readable | SchemaSearchJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchJobsResponse]
  ): Unit = js.native
  def searchForAlert(params: ParamsResourceJobsSearchforalert, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(
    params: ParamsResourceJobsSearchforalert,
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.jobs.searchForAlert({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disableRelevanceThresholding": false,
    *       //   "enableBroadening": false,
    *       //   "enablePreciseResultSize": false,
    *       //   "filters": {},
    *       //   "histogramFacets": {},
    *       //   "jobView": "my_jobView",
    *       //   "mode": "my_mode",
    *       //   "offset": 0,
    *       //   "orderBy": "my_orderBy",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "query": {},
    *       //   "requestMetadata": {},
    *       //   "sortBy": "my_sortBy"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appliedCommuteFilter": {},
    *   //   "appliedJobLocationFilters": [],
    *   //   "estimatedTotalSize": "my_estimatedTotalSize",
    *   //   "histogramResults": {},
    *   //   "jobView": "my_jobView",
    *   //   "matchingJobs": [],
    *   //   "metadata": {},
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "numJobsFromBroadenedQuery": 0,
    *   //   "spellResult": {},
    *   //   "totalSize": "my_totalSize"
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
  def searchForAlert(params: ParamsResourceJobsSearchforalert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchForAlert(
    params: ParamsResourceJobsSearchforalert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
