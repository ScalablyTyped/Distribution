package typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudtasks.anon.Alt
import typings.maximMazurokGapiClientCloudtasks.anon.Callback
import typings.maximMazurokGapiClientCloudtasks.anon.Filter
import typings.maximMazurokGapiClientCloudtasks.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudtasks.anon.PrettyPrint
import typings.maximMazurokGapiClientCloudtasks.anon.QuotaUser
import typings.maximMazurokGapiClientCloudtasks.anon.Resource
import typings.maximMazurokGapiClientCloudtasks.anon.UpdateMask
import typings.maximMazurokGapiClientCloudtasks.anon.UploadType
import typings.maximMazurokGapiClientCloudtasks.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueuesResource extends StObject {
  
  def create(request: Alt, body: Queue): Request[Queue] = js.native
  /**
    * Creates a queue. Queues created with this method allow tasks to live for a maximum of 31 days. After a task is 31 days old, the task will be deleted regardless of whether it was
    * dispatched or not. WARNING: Using this method may have unintended side effects if you are using an App Engine `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview
    * of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.
    */
  def create(request: Oauthtoken): Request[Queue] = js.native
  
  /**
    * Deletes a queue. This command will delete the queue even if it has tasks in it. Note: If you delete a queue, a queue with the same name can't be created for 7 days. WARNING: Using
    * this method may have unintended side effects if you are using an App Engine `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
    * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets a queue. */
  def get(): Request[Queue] = js.native
  def get(request: Callback): Request[Queue] = js.native
  
  /**
    * Gets the access control policy for a Queue. Returns an empty policy if the resource exists and does not have a policy set. Authorization requires the following [Google
    * IAM](https://cloud.google.com/iam) permission on the specified resource parent: * `cloudtasks.queues.getIamPolicy`
    */
  def getIamPolicy(request: PrettyPrint, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists queues. Queues are returned in lexicographical order. */
  def list(): Request[ListQueuesResponse] = js.native
  def list(request: Filter): Request[ListQueuesResponse] = js.native
  
  /**
    * Updates a queue. This method creates the queue if it does not exist and updates the queue if it does exist. Queues created with this method allow tasks to live for a maximum of 31
    * days. After a task is 31 days old, the task will be deleted regardless of whether it was dispatched or not. WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before
    * using this method.
    */
  def patch(request: QuotaUser): Request[Queue] = js.native
  def patch(request: UpdateMask, body: Queue): Request[Queue] = js.native
  
  def pause(request: Callback, body: PauseQueueRequest): Request[Queue] = js.native
  /**
    * Pauses the queue. If a queue is paused then the system will stop dispatching tasks until the queue is resumed via ResumeQueue. Tasks can still be added when the queue is paused. A
    * queue is paused if its state is PAUSED.
    */
  def pause(request: Resource): Request[Queue] = js.native
  
  def purge(request: Callback, body: PurgeQueueRequest): Request[Queue] = js.native
  /**
    * Purges a queue by deleting all of its tasks. All tasks created before this method is called are permanently deleted. Purge operations can take up to one minute to take effect. Tasks
    * might be dispatched before the purge takes effect. A purge is irreversible.
    */
  def purge(request: UploadType): Request[Queue] = js.native
  
  def resume(request: Callback, body: ResumeQueueRequest): Request[Queue] = js.native
  /**
    * Resume a queue. This method resumes a queue after it has been PAUSED or DISABLED. The state of a queue is stored in the queue's state; after calling this method it will be set to
    * RUNNING. WARNING: Resuming many high-QPS queues at the same time can lead to target overloading. If you are resuming high-QPS queues, follow the 500/50/5 pattern described in
    * [Managing Cloud Tasks Scaling Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).
    */
  def resume(request: Uploadprotocol): Request[Queue] = js.native
  
  /**
    * Sets the access control policy for a Queue. Replaces any existing policy. Note: The Cloud Console does not check queue-level IAM permissions yet. Project-level permissions are
    * required to use the Cloud Console. Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission on the specified resource parent: *
    * `cloudtasks.queues.setIamPolicy`
    */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  var tasks: TasksResource = js.native
  
  /**
    * Returns permissions that a caller has on a Queue. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error. Note: This operation is
    * designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
