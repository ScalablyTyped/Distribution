package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDeploymentmanager.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends js.Object {
  
  /** Gets information about a specific operation. */
  def get(): Request[Operation] = js.native
  def get(request: typings.maximMazurokGapiClientDeploymentmanager.anon.Operation): Request[Operation] = js.native
  
  /** Lists all operations for a project. */
  def list(): Request[OperationsListResponse] = js.native
  def list(request: Filter): Request[OperationsListResponse] = js.native
}
