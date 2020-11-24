package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigqueryconnection.anon.Accesstoken
import typings.maximMazurokGapiClientBigqueryconnection.anon.Alt
import typings.maximMazurokGapiClientBigqueryconnection.anon.Callback
import typings.maximMazurokGapiClientBigqueryconnection.anon.Fields
import typings.maximMazurokGapiClientBigqueryconnection.anon.Key
import typings.maximMazurokGapiClientBigqueryconnection.anon.Name
import typings.maximMazurokGapiClientBigqueryconnection.anon.Oauthtoken
import typings.maximMazurokGapiClientBigqueryconnection.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionsResource extends js.Object {
  
  /** Creates a new connection. */
  def create(request: Accesstoken): Request[Connection] = js.native
  def create(request: Alt, body: Connection): Request[Connection] = js.native
  
  /** Deletes connection and associated credential. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Returns specified connection. */
  def get(): Request[Connection] = js.native
  def get(request: Callback): Request[Connection] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(request: Fields, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns a list of connections in the given project. */
  def list(): Request[ListConnectionsResponse] = js.native
  def list(request: Key): Request[ListConnectionsResponse] = js.native
  
  /** Updates the specified connection. For security reasons, also resets credential if connection properties are in the update field mask. */
  def patch(request: Name): Request[Connection] = js.native
  def patch(request: Oauthtoken, body: Connection): Request[Connection] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Fields, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Fields, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def updateCredential(request: Callback, body: ConnectionCredential): Request[js.Object] = js.native
  /** Sets the credential for the specified connection. */
  def updateCredential(request: PrettyPrint): Request[js.Object] = js.native
}
