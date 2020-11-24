package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatalabeling.anon.AccesstokenAlt
import typings.maximMazurokGapiClientDatalabeling.anon.Alt
import typings.maximMazurokGapiClientDatalabeling.anon.AltCallback
import typings.maximMazurokGapiClientDatalabeling.anon.Callback
import typings.maximMazurokGapiClientDatalabeling.anon.CallbackFields
import typings.maximMazurokGapiClientDatalabeling.anon.Fields
import typings.maximMazurokGapiClientDatalabeling.anon.UpdateMask
import typings.maximMazurokGapiClientDatalabeling.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluationJobsResource extends js.Object {
  
  def create(request: Alt, body: GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest): Request[GoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  /** Creates an evaluation job. */
  def create(request: Xgafv): Request[GoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  
  /** Stops and deletes an evaluation job. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets an evaluation job by resource name. */
  def get(): Request[GoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  def get(request: Callback): Request[GoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  
  /** Lists all evaluation jobs within a project with possible filters. Pagination is supported. */
  def list(): Request[GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse] = js.native
  def list(request: Fields): Request[GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse] = js.native
  
  def patch(request: AccesstokenAlt, body: GoogleCloudDatalabelingV1beta1EvaluationJob): Request[GoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  /**
    * Updates an evaluation job. You can only update certain fields of the job's EvaluationJobConfig: `humanAnnotationConfig.instruction`, `exampleCount`, and `exampleSamplePercentage`.
    * If you want to change any other aspect of the evaluation job, you must delete the job and create a new one.
    */
  def patch(request: UpdateMask): Request[GoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
  
  /** Pauses an evaluation job. Pausing an evaluation job that is already in a `PAUSED` state is a no-op. */
  def pause(request: AltCallback): Request[js.Object] = js.native
  def pause(request: Callback, body: GoogleCloudDatalabelingV1beta1PauseEvaluationJobRequest): Request[js.Object] = js.native
  
  /** Resumes a paused evaluation job. A deleted evaluation job can't be resumed. Resuming a running or scheduled evaluation job is a no-op. */
  def resume(request: CallbackFields): Request[js.Object] = js.native
  def resume(request: Callback, body: GoogleCloudDatalabelingV1beta1ResumeEvaluationJobRequest): Request[js.Object] = js.native
}
