package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Jobs")
@js.native
class ResourceProjectsJobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var debug: ResourceProjectsJobsDebug = js.native
  var messages: ResourceProjectsJobsMessages = js.native
  var workItems: ResourceProjectsJobsWorkitems = js.native
  /**
    * dataflow.projects.jobs.aggregated
    * @desc List the jobs of a project across all regions.
    * @alias dataflow.projects.jobs.aggregated
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The kind of filter to use.
    * @param {string=} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    * @param {integer=} params.pageSize If there are many jobs, limit response to at most this many. The actual number of jobs returned will be the lesser of max_responses and an unspecified server-defined limit.
    * @param {string=} params.pageToken Set this to the 'next_page_token' field of a previous response to request additional results in a long list.
    * @param {string} params.projectId The project which owns the jobs.
    * @param {string=} params.view Level of information requested in response. Default is `JOB_VIEW_SUMMARY`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregated(): GaxiosPromise[SchemaListJobsResponse] = js.native
  def aggregated(callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def aggregated(params: ParamsResourceProjectsJobsAggregated): GaxiosPromise[SchemaListJobsResponse] = js.native
  def aggregated(
    params: ParamsResourceProjectsJobsAggregated,
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  def aggregated(
    params: ParamsResourceProjectsJobsAggregated,
    options: BodyResponseCallback[SchemaListJobsResponse],
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  def aggregated(params: ParamsResourceProjectsJobsAggregated, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def aggregated(
    params: ParamsResourceProjectsJobsAggregated,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  /**
    * dataflow.projects.jobs.create
    * @desc Creates a Cloud Dataflow job.  To create a job, we recommend using
    * `projects.locations.jobs.create` with a [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints).
    * Using `projects.jobs.create` is not recommended, as your job will always
    * start in `us-central1`.
    * @alias dataflow.projects.jobs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    * @param {string} params.projectId The ID of the Cloud Platform project that the job belongs to.
    * @param {string=} params.replaceJobId Deprecated. This field is now in the Job message.
    * @param {string=} params.view The level of information requested in response.
    * @param {().Job} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaJob] = js.native
  def create(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
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
    * dataflow.projects.jobs.get
    * @desc Gets the state of the specified Cloud Dataflow job.  To get the
    * state of a job, we recommend using `projects.locations.jobs.get` with a
    * [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints).
    * Using `projects.jobs.get` is not recommended, as you can only get the
    * state of jobs that are running in `us-central1`.
    * @alias dataflow.projects.jobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job ID.
    * @param {string=} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    * @param {string} params.projectId The ID of the Cloud Platform project that the job belongs to.
    * @param {string=} params.view The level of information requested in response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaJob] = js.native
  def get(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
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
    * dataflow.projects.jobs.getMetrics
    * @desc Request the job status.  To request the status of a job, we
    * recommend using `projects.locations.jobs.getMetrics` with a [regional
    * endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints).
    * Using `projects.jobs.getMetrics` is not recommended, as you can only
    * request the status of jobs that are running in `us-central1`.
    * @alias dataflow.projects.jobs.getMetrics
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job to get messages for.
    * @param {string=} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    * @param {string} params.projectId A project id.
    * @param {string=} params.startTime Return only metric data that has changed since this time. Default is to return all information about all metrics for the job.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getMetrics(): GaxiosPromise[SchemaJobMetrics] = js.native
  def getMetrics(callback: BodyResponseCallback[SchemaJobMetrics]): Unit = js.native
  def getMetrics(params: ParamsResourceProjectsJobsGetmetrics): GaxiosPromise[SchemaJobMetrics] = js.native
  def getMetrics(params: ParamsResourceProjectsJobsGetmetrics, callback: BodyResponseCallback[SchemaJobMetrics]): Unit = js.native
  def getMetrics(
    params: ParamsResourceProjectsJobsGetmetrics,
    options: BodyResponseCallback[SchemaJobMetrics],
    callback: BodyResponseCallback[SchemaJobMetrics]
  ): Unit = js.native
  def getMetrics(params: ParamsResourceProjectsJobsGetmetrics, options: MethodOptions): GaxiosPromise[SchemaJobMetrics] = js.native
  def getMetrics(
    params: ParamsResourceProjectsJobsGetmetrics,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJobMetrics]
  ): Unit = js.native
  /**
    * dataflow.projects.jobs.list
    * @desc List the jobs of a project.  To list the jobs of a project in a
    * region, we recommend using `projects.locations.jobs.get` with a [regional
    * endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). To
    * list the all jobs across all regions, use `projects.jobs.aggregated`.
    * Using `projects.jobs.list` is not recommended, as you can only get the
    * list of jobs that are running in `us-central1`.
    * @alias dataflow.projects.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The kind of filter to use.
    * @param {string=} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    * @param {integer=} params.pageSize If there are many jobs, limit response to at most this many. The actual number of jobs returned will be the lesser of max_responses and an unspecified server-defined limit.
    * @param {string=} params.pageToken Set this to the 'next_page_token' field of a previous response to request additional results in a long list.
    * @param {string} params.projectId The project which owns the jobs.
    * @param {string=} params.view Level of information requested in response. Default is `JOB_VIEW_SUMMARY`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
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
    * dataflow.projects.jobs.snapshot
    * @desc Snapshot the state of a streaming job.
    * @alias dataflow.projects.jobs.snapshot
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job to be snapshotted.
    * @param {string} params.projectId The project which owns the job to be snapshotted.
    * @param {().SnapshotJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def snapshot(): GaxiosPromise[SchemaSnapshot] = js.native
  def snapshot(callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def snapshot(params: ParamsResourceProjectsJobsSnapshot): GaxiosPromise[SchemaSnapshot] = js.native
  def snapshot(params: ParamsResourceProjectsJobsSnapshot, callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def snapshot(
    params: ParamsResourceProjectsJobsSnapshot,
    options: BodyResponseCallback[SchemaSnapshot],
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  def snapshot(params: ParamsResourceProjectsJobsSnapshot, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def snapshot(
    params: ParamsResourceProjectsJobsSnapshot,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  /**
    * dataflow.projects.jobs.update
    * @desc Updates the state of an existing Cloud Dataflow job.  To update the
    * state of an existing job, we recommend using
    * `projects.locations.jobs.update` with a [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints).
    * Using `projects.jobs.update` is not recommended, as you can only update
    * the state of jobs that are running in `us-central1`.
    * @alias dataflow.projects.jobs.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job ID.
    * @param {string=} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    * @param {string} params.projectId The ID of the Cloud Platform project that the job belongs to.
    * @param {().Job} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaJob] = js.native
  def update(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def update(params: ParamsResourceProjectsJobsUpdate): GaxiosPromise[SchemaJob] = js.native
  def update(params: ParamsResourceProjectsJobsUpdate, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def update(
    params: ParamsResourceProjectsJobsUpdate,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsJobsUpdate, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def update(
    params: ParamsResourceProjectsJobsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
}

