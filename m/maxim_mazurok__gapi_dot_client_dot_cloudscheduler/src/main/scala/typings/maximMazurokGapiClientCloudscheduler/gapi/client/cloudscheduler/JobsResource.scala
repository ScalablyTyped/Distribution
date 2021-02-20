package typings.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudscheduler.anon.Accesstoken
import typings.maximMazurokGapiClientCloudscheduler.anon.Alt
import typings.maximMazurokGapiClientCloudscheduler.anon.Callback
import typings.maximMazurokGapiClientCloudscheduler.anon.Fields
import typings.maximMazurokGapiClientCloudscheduler.anon.Key
import typings.maximMazurokGapiClientCloudscheduler.anon.Name
import typings.maximMazurokGapiClientCloudscheduler.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudscheduler.anon.PrettyPrint
import typings.maximMazurokGapiClientCloudscheduler.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobsResource extends StObject {
  
  /** Creates a job. */
  def create(request: Accesstoken): Request[Job] = js.native
  def create(request: Alt, body: Job): Request[Job] = js.native
  
  /** Deletes a job. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets a job. */
  def get(): Request[Job] = js.native
  def get(request: Callback): Request[Job] = js.native
  
  /** Lists jobs. */
  def list(): Request[ListJobsResponse] = js.native
  def list(request: Fields): Request[ListJobsResponse] = js.native
  
  /**
    * Updates a job. If successful, the updated Job is returned. If the job does not exist, `NOT_FOUND` is returned. If UpdateJob does not successfully return, it is possible for the job
    * to be in an Job.State.UPDATE_FAILED state. A job in this state may not be executed. If this happens, retry the UpdateJob request until a successful response is received.
    */
  def patch(request: Key): Request[Job] = js.native
  def patch(request: Name, body: Job): Request[Job] = js.native
  
  def pause(request: Callback, body: PauseJobRequest): Request[Job] = js.native
  /**
    * Pauses a job. If a job is paused then the system will stop executing the job until it is re-enabled via ResumeJob. The state of the job is stored in state; if paused it will be set
    * to Job.State.PAUSED. A job must be in Job.State.ENABLED to be paused.
    */
  def pause(request: Oauthtoken): Request[Job] = js.native
  
  def resume(request: Callback, body: ResumeJobRequest): Request[Job] = js.native
  /**
    * Resume a job. This method reenables a job after it has been Job.State.PAUSED. The state of a job is stored in Job.state; after calling this method it will be set to
    * Job.State.ENABLED. A job must be in Job.State.PAUSED to be resumed.
    */
  def resume(request: PrettyPrint): Request[Job] = js.native
  
  def run(request: Callback, body: RunJobRequest): Request[Job] = js.native
  /** Forces a job to run now. When this method is called, Cloud Scheduler will dispatch the job, even if the job is already running. */
  def run(request: QuotaUser): Request[Job] = js.native
}
