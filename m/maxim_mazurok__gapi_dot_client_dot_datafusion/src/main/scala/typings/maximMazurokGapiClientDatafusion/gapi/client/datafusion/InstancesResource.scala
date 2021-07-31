package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatafusion.anon.Accesstoken
import typings.maximMazurokGapiClientDatafusion.anon.Alt
import typings.maximMazurokGapiClientDatafusion.anon.Callback
import typings.maximMazurokGapiClientDatafusion.anon.Fields
import typings.maximMazurokGapiClientDatafusion.anon.Filter
import typings.maximMazurokGapiClientDatafusion.anon.Key
import typings.maximMazurokGapiClientDatafusion.anon.Name
import typings.maximMazurokGapiClientDatafusion.anon.Oauthtoken
import typings.maximMazurokGapiClientDatafusion.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends StObject {
  
  /** Creates a new Data Fusion instance in the specified project and location. */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: Instance): Request[Operation] = js.native
  
  /** Deletes a single Date Fusion instance. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets details of a single Data Fusion instance. */
  def get(): Request[Instance] = js.native
  def get(request: Callback): Request[Instance] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /** Lists Data Fusion instances in the specified project and location. */
  def list(): Request[ListInstancesResponse] = js.native
  def list(request: Filter): Request[ListInstancesResponse] = js.native
  
  /** Updates a single Data Fusion instance. */
  def patch(request: Key): Request[Operation] = js.native
  def patch(request: Name, body: Instance): Request[Operation] = js.native
  
  def restart(request: Callback, body: RestartInstanceRequest): Request[Operation] = js.native
  /** Restart a single Data Fusion instance. At the end of an operation instance is fully restarted. */
  def restart(request: Oauthtoken): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
