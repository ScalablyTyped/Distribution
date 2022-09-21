package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects$Evaluations")
@js.native
open class ResourceProjectsEvaluations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse] = js.native
  def search(params: ParamsResourceProjectsEvaluationsSearch): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse] = js.native
  def search(
    params: ParamsResourceProjectsEvaluationsSearch,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceProjectsEvaluationsSearch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProjectsEvaluationsSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse] = js.native
  def search(
    params: ParamsResourceProjectsEvaluationsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse]
  ): Unit = js.native
  /**
    * Searches evaluations within a project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await datalabeling.projects.evaluations.search({
    *     // Optional. To search evaluations, you can filter by the following: * evaluation_job.evaluation_job_id (the last part of EvaluationJob.name) * evaluation_job.model_id (the {model_name\} portion of EvaluationJob.modelVersion) * evaluation_job.evaluation_job_run_time_start (Minimum threshold for the evaluationJobRunTime that created the evaluation) * evaluation_job.evaluation_job_run_time_end (Maximum threshold for the evaluationJobRunTime that created the evaluation) * evaluation_job.job_state (EvaluationJob.state) * annotation_spec.display_name (the Evaluation contains a metric for the annotation spec with this displayName) To filter by multiple critiera, use the `AND` operator or the `OR` operator. The following examples shows a string that filters by several critiera: "evaluation_job.evaluation_job_id = {evaluation_job_id\} AND evaluation_job.model_id = {model_name\} AND evaluation_job.evaluation_job_run_time_start = {timestamp_1\} AND evaluation_job.evaluation_job_run_time_end = {timestamp_2\} AND annotation_spec.display_name = {display_name\}"
    *     filter: 'placeholder-value',
    *     // Optional. Requested page size. Server may return fewer results than requested. Default value is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token identifying a page of results for the server to return. Typically obtained by the nextPageToken of the response to a previous search request. If you don't specify this field, the API call requests the first page of the search.
    *     pageToken: 'placeholder-value',
    *     // Required. Evaluation search parent (project ID). Format: "projects/ {project_id\}"
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "evaluations": [],
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
  def search(params: ParamsResourceProjectsEvaluationsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceProjectsEvaluationsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
