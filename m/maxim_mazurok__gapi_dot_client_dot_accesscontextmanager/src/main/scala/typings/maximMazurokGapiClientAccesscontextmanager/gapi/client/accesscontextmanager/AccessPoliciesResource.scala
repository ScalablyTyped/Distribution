package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Callback
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Name
import typings.maximMazurokGapiClientAccesscontextmanager.anon.PageToken
import typings.maximMazurokGapiClientAccesscontextmanager.anon.PrettyPrint
import typings.maximMazurokGapiClientAccesscontextmanager.anon.UpdateMask
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Uploadprotocol
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessPoliciesResource extends StObject {
  
  var accessLevels: AccessLevelsResource = js.native
  
  /**
    * Creates an access policy. This method fails if the organization already has an access policy. The long-running operation has a successful status after the access policy propagates
    * to long-lasting storage. Syntactic and basic semantic errors are returned in `metadata` as a BadRequest proto.
    */
  def create(request: Uploadprotocol): Request[Operation] = js.native
  def create(request: Xgafv, body: AccessPolicy): Request[Operation] = js.native
  
  /** Deletes an access policy based on the resource name. The long-running operation has a successful status after the access policy is removed from long-lasting storage. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Returns an access policy based on the name. */
  def get(): Request[AccessPolicy] = js.native
  def get(request: Callback): Request[AccessPolicy] = js.native
  
  /** Gets the IAM policy for the specified Access Context Manager access policy. */
  def getIamPolicy(request: PrettyPrint, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists all access policies in an organization. */
  def list(): Request[ListAccessPoliciesResponse] = js.native
  def list(request: PageToken): Request[ListAccessPoliciesResponse] = js.native
  
  def patch(request: Name, body: AccessPolicy): Request[Operation] = js.native
  /** Updates an access policy. The long-running operation from this RPC has a successful status after the changes to the access policy propagate to long-lasting storage. */
  def patch(request: UpdateMask): Request[Operation] = js.native
  
  var servicePerimeters: ServicePerimetersResource = js.native
  
  /**
    * Sets the IAM policy for the specified Access Context Manager access policy. This method replaces the existing IAM policy on the access policy. The IAM policy controls the set of
    * users who can perform specific operations on the Access Context Manager access policy.
    */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns the IAM permissions that the caller has on the specified Access Context Manager resource. The resource can be an AccessPolicy, AccessLevel, or ServicePerimeter. This method
    * does not support other resources.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
