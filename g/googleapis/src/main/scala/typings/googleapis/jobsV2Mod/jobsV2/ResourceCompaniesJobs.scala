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

@JSImport("googleapis/build/src/apis/jobs/v2", "jobs_v2.Resource$Companies$Jobs")
@js.native
open class ResourceCompaniesJobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListCompanyJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCompanyJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCompanyJobsResponse] = js.native
  def list(params: ParamsResourceCompaniesJobsList): GaxiosPromise[SchemaListCompanyJobsResponse] = js.native
  def list(
    params: ParamsResourceCompaniesJobsList,
    callback: BodyResponseCallback[SchemaListCompanyJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCompaniesJobsList,
    options: BodyResponseCallback[Readable | SchemaListCompanyJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCompanyJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCompaniesJobsList, options: MethodOptions): GaxiosPromise[SchemaListCompanyJobsResponse] = js.native
  def list(
    params: ParamsResourceCompaniesJobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCompanyJobsResponse]
  ): Unit = js.native
  /**
    * Deprecated. Use ListJobs instead. Lists all jobs associated with a company.
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
    *   const res = await jobs.companies.jobs.list({
    *     // Required. The resource name of the company that owns the jobs to be listed, such as, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    *     companyName: 'companies/my-companie',
    *     // Optional. If set to `true`, only job ID, job requisition ID and language code will be returned. A typical use is to synchronize job repositories. Defaults to false.
    *     idsOnly: 'placeholder-value',
    *     // Deprecated. Please DO NOT use this field except for small companies. Suggest counting jobs page by page instead. Optional. Set to true if the total number of open jobs is to be returned. Defaults to false.
    *     includeJobsCount: 'placeholder-value',
    *     // Optional. The requisition ID, also known as posting ID, assigned by the company to the job. The maximum number of allowable characters is 225.
    *     jobRequisitionId: 'placeholder-value',
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
    *   //   "nextPageToken": "my_nextPageToken",
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
  def list(params: ParamsResourceCompaniesJobsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCompaniesJobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
