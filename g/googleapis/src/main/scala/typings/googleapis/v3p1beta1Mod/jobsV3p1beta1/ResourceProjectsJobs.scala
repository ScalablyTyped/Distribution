package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs/v3p1beta1", "jobs_v3p1beta1.Resource$Projects$Jobs")
@js.native
class ResourceProjectsJobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * jobs.projects.jobs.batchDelete
    * @desc Deletes a list of Jobs by filter.
    * @alias jobs.projects.jobs.batchDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The resource name of the project under which the job is created.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {().BatchDeleteJobsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchDelete(): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(params: ParamsResourceProjectsJobsBatchdelete): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(params: ParamsResourceProjectsJobsBatchdelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchDelete(
    params: ParamsResourceProjectsJobsBatchdelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceProjectsJobsBatchdelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(
    params: ParamsResourceProjectsJobsBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * jobs.projects.jobs.create
    * @desc Creates a new job.  Typically, the job becomes searchable within 10
    * seconds, but it may take up to 5 minutes.
    * @alias jobs.projects.jobs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The resource name of the project under which the job is created.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {().CreateJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaJob] = js.native
  def create(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceProjectsJobsCreate): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceProjectsJobsCreate, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(
    params: ParamsResourceProjectsJobsCreate,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsJobsCreate, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(
    params: ParamsResourceProjectsJobsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  
  /**
    * jobs.projects.jobs.delete
    * @desc Deletes the specified job.  Typically, the job becomes unsearchable
    * within 10 seconds, but it may take up to 5 minutes.
    * @alias jobs.projects.jobs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The resource name of the job to be deleted.  The format is "projects/{project_id}/jobs/{job_id}", for example, "projects/api-test-project/jobs/1234".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsJobsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsJobsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsJobsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsJobsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsJobsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * jobs.projects.jobs.get
    * @desc Retrieves the specified job, whose status is OPEN or recently
    * EXPIRED within the last 90 days.
    * @alias jobs.projects.jobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The resource name of the job to retrieve.  The format is "projects/{project_id}/jobs/{job_id}", for example, "projects/api-test-project/jobs/1234".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaJob] = js.native
  def get(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceProjectsJobsGet): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceProjectsJobsGet, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(
    params: ParamsResourceProjectsJobsGet,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsJobsGet, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(
    params: ParamsResourceProjectsJobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  
  /**
    * jobs.projects.jobs.list
    * @desc Lists jobs by filter.
    * @alias jobs.projects.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Required.  The filter string specifies the jobs to be enumerated.  Supported operator: =, AND  The fields eligible for filtering are:  * `companyName` (Required) * `requisitionId` (Optional)  Sample Query:  * companyName = "projects/api-test-project/companies/123" * companyName = "projects/api-test-project/companies/123" AND requisitionId = "req-1"
    * @param {string=} params.jobView Optional.  The desired job attributes returned for jobs in the search response. Defaults to JobView.JOB_VIEW_FULL if no value is specified.
    * @param {integer=} params.pageSize Optional.  The maximum number of jobs to be returned per page of results.  If job_view is set to JobView.JOB_VIEW_ID_ONLY, the maximum allowed page size is 1000. Otherwise, the maximum allowed page size is 100.  Default is 100 if empty or a number < 1 is specified.
    * @param {string=} params.pageToken Optional.  The starting point of a query result.
    * @param {string} params.parent Required.  The resource name of the project under which the job is created.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(params: ParamsResourceProjectsJobsList): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(params: ParamsResourceProjectsJobsList, callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsJobsList,
    options: BodyResponseCallback[SchemaListJobsResponse],
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsJobsList, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsJobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  
  /**
    * jobs.projects.jobs.patch
    * @desc Updates specified job.  Typically, updated contents become visible
    * in search results within 10 seconds, but it may take up to 5 minutes.
    * @alias jobs.projects.jobs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required during job update.  The resource name for the job. This is generated by the service when a job is created.  The format is "projects/{project_id}/jobs/{job_id}", for example, "projects/api-test-project/jobs/1234".  Use of this field in job queries and API calls is preferred over the use of requisition_id since this value is unique.
    * @param {().UpdateJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaJob] = js.native
  def patch(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def patch(params: ParamsResourceProjectsJobsPatch): GaxiosPromise[SchemaJob] = js.native
  def patch(params: ParamsResourceProjectsJobsPatch, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsJobsPatch,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsJobsPatch, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def patch(
    params: ParamsResourceProjectsJobsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  
  /**
    * jobs.projects.jobs.search
    * @desc Searches for jobs using the provided SearchJobsRequest.  This call
    * constrains the visibility of jobs present in the database, and only
    * returns jobs that the caller has permission to search against.
    * @alias jobs.projects.jobs.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The resource name of the project to search within.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {().SearchJobsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchJobsResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(params: ParamsResourceProjectsJobsSearch): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(params: ParamsResourceProjectsJobsSearch, callback: BodyResponseCallback[SchemaSearchJobsResponse]): Unit = js.native
  def search(
    params: ParamsResourceProjectsJobsSearch,
    options: BodyResponseCallback[SchemaSearchJobsResponse],
    callback: BodyResponseCallback[SchemaSearchJobsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProjectsJobsSearch, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def search(
    params: ParamsResourceProjectsJobsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchJobsResponse]
  ): Unit = js.native
  
  /**
    * jobs.projects.jobs.searchForAlert
    * @desc Searches for jobs using the provided SearchJobsRequest.  This API
    * call is intended for the use case of targeting passive job seekers (for
    * example, job seekers who have signed up to receive email alerts about
    * potential job opportunities), and has different algorithmic adjustments
    * that are targeted to passive job seekers.  This call constrains the
    * visibility of jobs present in the database, and only returns jobs the
    * caller has permission to search against.
    * @alias jobs.projects.jobs.searchForAlert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The resource name of the project to search within.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {().SearchJobsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaSearchJobsResponse],
    callback: BodyResponseCallback[SchemaSearchJobsResponse]
  ): Unit = js.native
  def searchForAlert(params: ParamsResourceProjectsJobsSearchforalert, options: MethodOptions): GaxiosPromise[SchemaSearchJobsResponse] = js.native
  def searchForAlert(
    params: ParamsResourceProjectsJobsSearchforalert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchJobsResponse]
  ): Unit = js.native
}
