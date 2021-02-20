package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Messages")
@js.native
class ResourceProjectsLocationsJobsMessages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dataflow.projects.locations.jobs.messages.list
    * @desc Request the job status.  To request the status of a job, we
    * recommend using `projects.locations.jobs.messages.list` with a [regional
    * endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints).
    * Using `projects.jobs.messages.list` is not recommended, as you can only
    * request the status of jobs that are running in `us-central1`.
    * @alias dataflow.projects.locations.jobs.messages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.endTime Return only messages with timestamps < end_time. The default is now (i.e. return up to the latest messages available).
    * @param {string} params.jobId The job to get messages about.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    * @param {string=} params.minimumImportance Filter to only get messages with importance >= level
    * @param {integer=} params.pageSize If specified, determines the maximum number of messages to return.  If unspecified, the service may choose an appropriate default, or may return an arbitrarily large number of results.
    * @param {string=} params.pageToken If supplied, this should be the value of next_page_token returned by an earlier call. This will cause the next page of results to be returned.
    * @param {string} params.projectId A project id.
    * @param {string=} params.startTime If specified, return only messages with timestamps >= start_time. The default is the job creation time (i.e. beginning of messages).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListJobMessagesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListJobMessagesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListJobMessagesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsJobsMessagesList): GaxiosPromise[SchemaListJobMessagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsMessagesList,
    callback: BodyResponseCallback[SchemaListJobMessagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsMessagesList,
    options: BodyResponseCallback[SchemaListJobMessagesResponse],
    callback: BodyResponseCallback[SchemaListJobMessagesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsJobsMessagesList, options: MethodOptions): GaxiosPromise[SchemaListJobMessagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsMessagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListJobMessagesResponse]
  ): Unit = js.native
}
