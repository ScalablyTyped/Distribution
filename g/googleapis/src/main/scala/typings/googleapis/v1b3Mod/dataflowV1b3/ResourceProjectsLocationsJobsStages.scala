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

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Stages")
@js.native
open class ResourceProjectsLocationsJobsStages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getExecutionDetails(): GaxiosPromise[SchemaStageExecutionDetails] = js.native
  def getExecutionDetails(callback: BodyResponseCallback[SchemaStageExecutionDetails]): Unit = js.native
  def getExecutionDetails(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStageExecutionDetails] = js.native
  def getExecutionDetails(params: ParamsResourceProjectsLocationsJobsStagesGetexecutiondetails): GaxiosPromise[SchemaStageExecutionDetails] = js.native
  def getExecutionDetails(
    params: ParamsResourceProjectsLocationsJobsStagesGetexecutiondetails,
    callback: BodyResponseCallback[SchemaStageExecutionDetails]
  ): Unit = js.native
  def getExecutionDetails(
    params: ParamsResourceProjectsLocationsJobsStagesGetexecutiondetails,
    options: BodyResponseCallback[Readable | SchemaStageExecutionDetails],
    callback: BodyResponseCallback[Readable | SchemaStageExecutionDetails]
  ): Unit = js.native
  def getExecutionDetails(params: ParamsResourceProjectsLocationsJobsStagesGetexecutiondetails, options: MethodOptions): GaxiosPromise[SchemaStageExecutionDetails] = js.native
  def getExecutionDetails(
    params: ParamsResourceProjectsLocationsJobsStagesGetexecutiondetails,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStageExecutionDetails]
  ): Unit = js.native
  /**
    * Request detailed information about the execution status of a stage of the job. EXPERIMENTAL. This API is subject to change or removal without notice.
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
    *   const res = await dataflow.projects.locations.jobs.stages.getExecutionDetails(
    *     {
    *       // Upper time bound of work items to include, by start time.
    *       endTime: 'placeholder-value',
    *       // The job to get execution details for.
    *       jobId: 'placeholder-value',
    *       // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    *       location: 'placeholder-value',
    *       // If specified, determines the maximum number of work items to return. If unspecified, the service may choose an appropriate default, or may return an arbitrarily large number of results.
    *       pageSize: 'placeholder-value',
    *       // If supplied, this should be the value of next_page_token returned by an earlier call. This will cause the next page of results to be returned.
    *       pageToken: 'placeholder-value',
    *       // A project id.
    *       projectId: 'placeholder-value',
    *       // The stage for which to fetch information.
    *       stageId: 'placeholder-value',
    *       // Lower time bound of work items to include, by start time.
    *       startTime: 'placeholder-value',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "workers": []
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
  def getExecutionDetails(params: ParamsResourceProjectsLocationsJobsStagesGetexecutiondetails, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getExecutionDetails(
    params: ParamsResourceProjectsLocationsJobsStagesGetexecutiondetails,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
