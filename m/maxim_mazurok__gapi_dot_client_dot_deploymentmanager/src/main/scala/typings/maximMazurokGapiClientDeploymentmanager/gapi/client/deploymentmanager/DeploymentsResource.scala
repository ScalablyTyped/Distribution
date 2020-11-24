package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDeploymentmanager.anon.Accesstoken
import typings.maximMazurokGapiClientDeploymentmanager.anon.Alt
import typings.maximMazurokGapiClientDeploymentmanager.anon.Callback
import typings.maximMazurokGapiClientDeploymentmanager.anon.CreatePolicy
import typings.maximMazurokGapiClientDeploymentmanager.anon.DeletePolicy
import typings.maximMazurokGapiClientDeploymentmanager.anon.Fields
import typings.maximMazurokGapiClientDeploymentmanager.anon.Filter
import typings.maximMazurokGapiClientDeploymentmanager.anon.Oauthtoken
import typings.maximMazurokGapiClientDeploymentmanager.anon.PrettyPrint
import typings.maximMazurokGapiClientDeploymentmanager.anon.Project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentsResource extends js.Object {
  
  /** Cancels and removes the preview currently associated with the deployment. */
  def cancelPreview(request: Accesstoken): Request[Operation] = js.native
  def cancelPreview(request: Alt, body: DeploymentsCancelPreviewRequest): Request[Operation] = js.native
  
  /** Deletes a deployment and all of the resources in the deployment. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets information about a specific deployment. */
  def get(): Request[Deployment] = js.native
  def get(request: Alt): Request[Deployment] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /** Creates a deployment and all of the resources described by the deployment manifest. */
  def insert(request: CreatePolicy): Request[Operation] = js.native
  def insert(request: Oauthtoken, body: Deployment): Request[Operation] = js.native
  
  /** Lists all deployments for a given project. */
  def list(): Request[DeploymentsListResponse] = js.native
  def list(request: Filter): Request[DeploymentsListResponse] = js.native
  
  /** Patches a deployment and all of the resources described by the deployment manifest. */
  def patch(request: DeletePolicy): Request[Operation] = js.native
  def patch(request: typings.maximMazurokGapiClientDeploymentmanager.anon.Deployment, body: Deployment): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: PrettyPrint, body: GlobalSetPolicyRequest): Request[Policy] = js.native
  
  def stop(request: Alt, body: DeploymentsStopRequest): Request[Operation] = js.native
  /** Stops an ongoing operation. This does not roll back any work that has already been completed, but prevents any new work from being started. */
  def stop(request: Project): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: PrettyPrint, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
  
  /** Updates a deployment and all of the resources described by the deployment manifest. */
  def update(request: DeletePolicy): Request[Operation] = js.native
  def update(request: typings.maximMazurokGapiClientDeploymentmanager.anon.Deployment, body: Deployment): Request[Operation] = js.native
}
