package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Workitems")
@js.native
class ResourceProjectsLocationsJobsWorkitems protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataflow.projects.locations.jobs.workItems.lease
    * @desc Leases a dataflow WorkItem to run.
    * @alias dataflow.projects.locations.jobs.workItems.lease
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId Identifies the workflow job this worker belongs to.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the WorkItem's job.
    * @param {string} params.projectId Identifies the project this worker belongs to.
    * @param {().LeaseWorkItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def lease(): GaxiosPromise[SchemaLeaseWorkItemResponse] = js.native
  def lease(callback: BodyResponseCallback[SchemaLeaseWorkItemResponse]): Unit = js.native
  def lease(params: ParamsResourceProjectsLocationsJobsWorkitemsLease): GaxiosPromise[SchemaLeaseWorkItemResponse] = js.native
  def lease(
    params: ParamsResourceProjectsLocationsJobsWorkitemsLease,
    callback: BodyResponseCallback[SchemaLeaseWorkItemResponse]
  ): Unit = js.native
  def lease(
    params: ParamsResourceProjectsLocationsJobsWorkitemsLease,
    options: BodyResponseCallback[SchemaLeaseWorkItemResponse],
    callback: BodyResponseCallback[SchemaLeaseWorkItemResponse]
  ): Unit = js.native
  def lease(params: ParamsResourceProjectsLocationsJobsWorkitemsLease, options: MethodOptions): GaxiosPromise[SchemaLeaseWorkItemResponse] = js.native
  def lease(
    params: ParamsResourceProjectsLocationsJobsWorkitemsLease,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaseWorkItemResponse]
  ): Unit = js.native
  /**
    * dataflow.projects.locations.jobs.workItems.reportStatus
    * @desc Reports the status of dataflow WorkItems leased by a worker.
    * @alias dataflow.projects.locations.jobs.workItems.reportStatus
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job which the WorkItem is part of.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the WorkItem's job.
    * @param {string} params.projectId The project which owns the WorkItem's job.
    * @param {().ReportWorkItemStatusRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reportStatus(): GaxiosPromise[SchemaReportWorkItemStatusResponse] = js.native
  def reportStatus(callback: BodyResponseCallback[SchemaReportWorkItemStatusResponse]): Unit = js.native
  def reportStatus(params: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus): GaxiosPromise[SchemaReportWorkItemStatusResponse] = js.native
  def reportStatus(
    params: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus,
    callback: BodyResponseCallback[SchemaReportWorkItemStatusResponse]
  ): Unit = js.native
  def reportStatus(
    params: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus,
    options: BodyResponseCallback[SchemaReportWorkItemStatusResponse],
    callback: BodyResponseCallback[SchemaReportWorkItemStatusResponse]
  ): Unit = js.native
  def reportStatus(params: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus, options: MethodOptions): GaxiosPromise[SchemaReportWorkItemStatusResponse] = js.native
  def reportStatus(
    params: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReportWorkItemStatusResponse]
  ): Unit = js.native
}

