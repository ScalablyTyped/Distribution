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

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Jobs$Messages")
@js.native
open class ResourceProjectsJobsMessages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListJobMessagesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListJobMessagesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListJobMessagesResponse] = js.native
  def list(params: ParamsResourceProjectsJobsMessagesList): GaxiosPromise[SchemaListJobMessagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsJobsMessagesList,
    callback: BodyResponseCallback[SchemaListJobMessagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsJobsMessagesList,
    options: BodyResponseCallback[Readable | SchemaListJobMessagesResponse],
    callback: BodyResponseCallback[Readable | SchemaListJobMessagesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsJobsMessagesList, options: MethodOptions): GaxiosPromise[SchemaListJobMessagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsJobsMessagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListJobMessagesResponse]
  ): Unit = js.native
  /**
    * Request the job status. To request the status of a job, we recommend using `projects.locations.jobs.messages.list` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.messages.list` is not recommended, as you can only request the status of jobs that are running in `us-central1`.
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
    *   const res = await dataflow.projects.jobs.messages.list({
    *     // Return only messages with timestamps < end_time. The default is now (i.e. return up to the latest messages available).
    *     endTime: 'placeholder-value',
    *     // The job to get messages about.
    *     jobId: 'placeholder-value',
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    *     location: 'placeholder-value',
    *     // Filter to only get messages with importance \>= level
    *     minimumImportance: 'placeholder-value',
    *     // If specified, determines the maximum number of messages to return. If unspecified, the service may choose an appropriate default, or may return an arbitrarily large number of results.
    *     pageSize: 'placeholder-value',
    *     // If supplied, this should be the value of next_page_token returned by an earlier call. This will cause the next page of results to be returned.
    *     pageToken: 'placeholder-value',
    *     // A project id.
    *     projectId: 'placeholder-value',
    *     // If specified, return only messages with timestamps \>= start_time. The default is the job creation time (i.e. beginning of messages).
    *     startTime: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "autoscalingEvents": [],
    *   //   "jobMessages": [],
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
  def list(params: ParamsResourceProjectsJobsMessagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsJobsMessagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
