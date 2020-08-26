package typings.googleapis.jobsV2Mod.jobsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/jobs/v2", "jobs_v2.Resource$Companies$Jobs")
@js.native
class ResourceCompaniesJobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * jobs.companies.jobs.list
    * @desc Deprecated. Use ListJobs instead.  Lists all jobs associated with a
    * company.
    * @alias jobs.companies.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.companyName Required.  The resource name of the company that owns the jobs to be listed, such as, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    * @param {boolean=} params.idsOnly Optional.  If set to `true`, only job ID, job requisition ID and language code will be returned.  A typical use is to synchronize job repositories.  Defaults to false.
    * @param {boolean=} params.includeJobsCount Deprecated. Please DO NOT use this field except for small companies. Suggest counting jobs page by page instead.  Optional.  Set to true if the total number of open jobs is to be returned.  Defaults to false.
    * @param {string=} params.jobRequisitionId Optional.  The requisition ID, also known as posting ID, assigned by the company to the job.  The maximum number of allowable characters is 225.
    * @param {integer=} params.pageSize Optional.  The maximum number of jobs to be returned per page of results.  If ids_only is set to true, the maximum allowed page size is 1000. Otherwise, the maximum allowed page size is 100.  Default is 100 if empty or a number < 1 is specified.
    * @param {string=} params.pageToken Optional.  The starting point of a query result.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListCompanyJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCompanyJobsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListCompanyJobsResponse] = js.native
  def list(params: ParamsResourceCompaniesJobsList): GaxiosPromise[SchemaListCompanyJobsResponse] = js.native
  def list(
    params: ParamsResourceCompaniesJobsList,
    callback: BodyResponseCallback[SchemaListCompanyJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCompaniesJobsList,
    options: BodyResponseCallback[SchemaListCompanyJobsResponse],
    callback: BodyResponseCallback[SchemaListCompanyJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCompaniesJobsList, options: MethodOptions): GaxiosPromise[SchemaListCompanyJobsResponse] = js.native
  def list(
    params: ParamsResourceCompaniesJobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCompanyJobsResponse]
  ): Unit = js.native
}

