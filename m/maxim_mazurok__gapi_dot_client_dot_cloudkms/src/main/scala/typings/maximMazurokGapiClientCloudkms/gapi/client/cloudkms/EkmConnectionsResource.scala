package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudkms.anon.Accesstoken
import typings.maximMazurokGapiClientCloudkms.anon.Alt
import typings.maximMazurokGapiClientCloudkms.anon.Callback
import typings.maximMazurokGapiClientCloudkms.anon.Fields
import typings.maximMazurokGapiClientCloudkms.anon.Filter
import typings.maximMazurokGapiClientCloudkms.anon.Key
import typings.maximMazurokGapiClientCloudkms.anon.Name
import typings.maximMazurokGapiClientCloudkms.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EkmConnectionsResource extends StObject {
  
  /** Creates a new EkmConnection in a given Project and Location. */
  def create(request: Accesstoken): Request[EkmConnection] = js.native
  def create(request: Alt, body: EkmConnection): Request[EkmConnection] = js.native
  
  /** Returns metadata for a given EkmConnection. */
  def get(): Request[EkmConnection] = js.native
  def get(request: Callback): Request[EkmConnection] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /** Lists EkmConnections. */
  def list(): Request[ListEkmConnectionsResponse] = js.native
  def list(request: Filter): Request[ListEkmConnectionsResponse] = js.native
  
  /** Updates an EkmConnection's metadata. */
  def patch(request: Key): Request[EkmConnection] = js.native
  def patch(request: Name, body: EkmConnection): Request[EkmConnection] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
