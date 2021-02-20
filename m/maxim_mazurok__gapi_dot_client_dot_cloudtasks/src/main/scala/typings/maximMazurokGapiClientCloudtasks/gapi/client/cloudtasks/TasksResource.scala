package typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudtasks.anon.Accesstoken
import typings.maximMazurokGapiClientCloudtasks.anon.Alt
import typings.maximMazurokGapiClientCloudtasks.anon.Callback
import typings.maximMazurokGapiClientCloudtasks.anon.Fields
import typings.maximMazurokGapiClientCloudtasks.anon.Key
import typings.maximMazurokGapiClientCloudtasks.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TasksResource extends StObject {
  
  /** Creates a task and adds it to a queue. Tasks cannot be updated after creation; there is no UpdateTask command. * The maximum task size is 100KB. */
  def create(request: Accesstoken): Request[Task] = js.native
  def create(request: Alt, body: CreateTaskRequest): Request[Task] = js.native
  
  /** Deletes a task. A task can be deleted if it is scheduled or dispatched. A task cannot be deleted if it has executed successfully or permanently failed. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets a task. */
  def get(): Request[Task] = js.native
  def get(request: Fields): Request[Task] = js.native
  
  /**
    * Lists the tasks in a queue. By default, only the BASIC view is retrieved due to performance considerations; response_view controls the subset of information which is returned. The
    * tasks may be returned in any order. The ordering may change at any time.
    */
  def list(): Request[ListTasksResponse] = js.native
  def list(request: Key): Request[ListTasksResponse] = js.native
  
  def run(request: Callback, body: RunTaskRequest): Request[Task] = js.native
  /**
    * Forces a task to run now. When this method is called, Cloud Tasks will dispatch the task, even if the task is already running, the queue has reached its RateLimits or is PAUSED.
    * This command is meant to be used for manual debugging. For example, RunTask can be used to retry a failed task after a fix has been made or to manually force a task to be dispatched
    * now. The dispatched task is returned. That is, the task that is returned contains the status after the task is dispatched but before the task is received by its target. If Cloud
    * Tasks receives a successful response from the task's target, then the task will be deleted; otherwise the task's schedule_time will be reset to the time that RunTask was called plus
    * the retry delay specified in the queue's RetryConfig. RunTask returns NOT_FOUND when it is called on a task that has already succeeded or permanently failed.
    */
  def run(request: Name): Request[Task] = js.native
}
