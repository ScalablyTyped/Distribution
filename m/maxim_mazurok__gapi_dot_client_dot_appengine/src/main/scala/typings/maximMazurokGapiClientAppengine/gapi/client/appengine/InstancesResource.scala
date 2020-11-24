package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAppengine.anon.InstancesId
import typings.maximMazurokGapiClientAppengine.anon.PageSize
import typings.maximMazurokGapiClientAppengine.anon.ServicesId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends js.Object {
  
  /**
    * Enables debugging on a VM instance. This allows you to use the SSH command to connect to the virtual machine where the instance lives. While in "debug mode", the instance continues
    * to serve live traffic. You should delete the instance when you are done debugging and then allow the system to take over and determine if another instance should be started.Only
    * applicable for instances in App Engine flexible environment.
    */
  def debug(request: InstancesId): Request[Operation] = js.native
  def debug(request: ServicesId, body: DebugInstanceRequest): Request[Operation] = js.native
  
  /**
    * Stops a running instance.The instance might be automatically recreated based on the scaling settings of the version. For more information, see "How Instances are Managed" (standard
    * environment (https://cloud.google.com/appengine/docs/standard/python/how-instances-are-managed) | flexible environment
    * (https://cloud.google.com/appengine/docs/flexible/python/how-instances-are-managed)).To ensure that instances are not re-created and avoid getting billed, you can stop all instances
    * within the target version by changing the serving status of the version to STOPPED with the apps.services.versions.patch
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions/patch) method.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: ServicesId): Request[Operation] = js.native
  
  /** Gets instance information. */
  def get(): Request[Instance] = js.native
  def get(request: ServicesId): Request[Instance] = js.native
  
  /**
    * Lists the instances of a version.Tip: To aggregate details about instances over time, see the Stackdriver Monitoring API
    * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list).
    */
  def list(): Request[ListInstancesResponse] = js.native
  def list(request: PageSize): Request[ListInstancesResponse] = js.native
}
