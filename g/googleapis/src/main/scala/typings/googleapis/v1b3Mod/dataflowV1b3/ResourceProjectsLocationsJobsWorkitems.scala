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

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Workitems")
@js.native
open class ResourceProjectsLocationsJobsWorkitems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def lease(): GaxiosPromise[SchemaLeaseWorkItemResponse] = js.native
  def lease(callback: BodyResponseCallback[SchemaLeaseWorkItemResponse]): Unit = js.native
  def lease(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaseWorkItemResponse] = js.native
  def lease(params: ParamsResourceProjectsLocationsJobsWorkitemsLease): GaxiosPromise[SchemaLeaseWorkItemResponse] = js.native
  def lease(
    params: ParamsResourceProjectsLocationsJobsWorkitemsLease,
    callback: BodyResponseCallback[SchemaLeaseWorkItemResponse]
  ): Unit = js.native
  def lease(
    params: ParamsResourceProjectsLocationsJobsWorkitemsLease,
    options: BodyResponseCallback[Readable | SchemaLeaseWorkItemResponse],
    callback: BodyResponseCallback[Readable | SchemaLeaseWorkItemResponse]
  ): Unit = js.native
  def lease(params: ParamsResourceProjectsLocationsJobsWorkitemsLease, options: MethodOptions): GaxiosPromise[SchemaLeaseWorkItemResponse] = js.native
  def lease(
    params: ParamsResourceProjectsLocationsJobsWorkitemsLease,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaseWorkItemResponse]
  ): Unit = js.native
  /**
    * Leases a dataflow WorkItem to run.
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
    *   const res = await dataflow.projects.locations.jobs.workItems.lease({
    *     // Identifies the workflow job this worker belongs to.
    *     jobId: 'placeholder-value',
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the WorkItem's job.
    *     location: 'placeholder-value',
    *     // Identifies the project this worker belongs to.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "currentWorkerTime": "my_currentWorkerTime",
    *       //   "location": "my_location",
    *       //   "requestedLeaseDuration": "my_requestedLeaseDuration",
    *       //   "unifiedWorkerRequest": {},
    *       //   "workItemTypes": [],
    *       //   "workerCapabilities": [],
    *       //   "workerId": "my_workerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "unifiedWorkerResponse": {},
    *   //   "workItems": []
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
  def lease(params: ParamsResourceProjectsLocationsJobsWorkitemsLease, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def lease(
    params: ParamsResourceProjectsLocationsJobsWorkitemsLease,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reportStatus(): GaxiosPromise[SchemaReportWorkItemStatusResponse] = js.native
  def reportStatus(callback: BodyResponseCallback[SchemaReportWorkItemStatusResponse]): Unit = js.native
  def reportStatus(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReportWorkItemStatusResponse] = js.native
  def reportStatus(params: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus): GaxiosPromise[SchemaReportWorkItemStatusResponse] = js.native
  def reportStatus(
    params: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus,
    callback: BodyResponseCallback[SchemaReportWorkItemStatusResponse]
  ): Unit = js.native
  def reportStatus(
    params: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus,
    options: BodyResponseCallback[Readable | SchemaReportWorkItemStatusResponse],
    callback: BodyResponseCallback[Readable | SchemaReportWorkItemStatusResponse]
  ): Unit = js.native
  def reportStatus(params: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus, options: MethodOptions): GaxiosPromise[SchemaReportWorkItemStatusResponse] = js.native
  def reportStatus(
    params: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReportWorkItemStatusResponse]
  ): Unit = js.native
  /**
    * Reports the status of dataflow WorkItems leased by a worker.
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
    *   const res = await dataflow.projects.locations.jobs.workItems.reportStatus({
    *     // The job which the WorkItem is part of.
    *     jobId: 'placeholder-value',
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the WorkItem's job.
    *     location: 'placeholder-value',
    *     // The project which owns the WorkItem's job.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "currentWorkerTime": "my_currentWorkerTime",
    *       //   "location": "my_location",
    *       //   "unifiedWorkerRequest": {},
    *       //   "workItemStatuses": [],
    *       //   "workerId": "my_workerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "unifiedWorkerResponse": {},
    *   //   "workItemServiceStates": []
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
  def reportStatus(params: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reportStatus(
    params: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
