package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataproc.anon.Accesstoken
import typings.maximMazurokGapiClientDataproc.anon.Alt
import typings.maximMazurokGapiClientDataproc.anon.Callback
import typings.maximMazurokGapiClientDataproc.anon.Fields
import typings.maximMazurokGapiClientDataproc.anon.Key
import typings.maximMazurokGapiClientDataproc.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscalingPoliciesResource extends StObject {
  
  /** Creates new autoscaling policy. */
  def create(request: Accesstoken): Request[AutoscalingPolicy] = js.native
  def create(request: Alt, body: AutoscalingPolicy): Request[AutoscalingPolicy] = js.native
  
  /** Deletes an autoscaling policy. It is an error to delete an autoscaling policy that is in use by one or more clusters. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Retrieves autoscaling policy. */
  def get(): Request[AutoscalingPolicy] = js.native
  def get(request: Callback): Request[AutoscalingPolicy] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(request: Fields, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists autoscaling policies in the project. */
  def list(): Request[ListAutoscalingPoliciesResponse] = js.native
  def list(request: Key): Request[ListAutoscalingPoliciesResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors. */
  def setIamPolicy(request: Fields, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Fields, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def update(request: Callback, body: AutoscalingPolicy): Request[AutoscalingPolicy] = js.native
  /** Updates (replaces) autoscaling policy.Disabled check for update_mask, because all updates will be full replacements. */
  def update(request: Name): Request[AutoscalingPolicy] = js.native
}
