package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatamigration.anon.Accesstoken
import typings.maximMazurokGapiClientDatamigration.anon.Alt
import typings.maximMazurokGapiClientDatamigration.anon.Callback
import typings.maximMazurokGapiClientDatamigration.anon.Fields
import typings.maximMazurokGapiClientDatamigration.anon.Filter
import typings.maximMazurokGapiClientDatamigration.anon.Key
import typings.maximMazurokGapiClientDatamigration.anon.Name
import typings.maximMazurokGapiClientDatamigration.anon.Oauthtoken
import typings.maximMazurokGapiClientDatamigration.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionProfilesResource extends StObject {
  
  /** Creates a new connection profile in a given project and location. */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: ConnectionProfile): Request[Operation] = js.native
  
  /** Deletes a single Database Migration Service connection profile. A connection profile can only be deleted if it is not in use by any active migration jobs. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets details of a single connection profile. */
  def get(): Request[ConnectionProfile] = js.native
  def get(request: Fields): Request[ConnectionProfile] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Key): Request[Policy] = js.native
  
  /** Retrieve a list of all connection profiles in a given project and location. */
  def list(): Request[ListConnectionProfilesResponse] = js.native
  def list(request: Filter): Request[ListConnectionProfilesResponse] = js.native
  
  /** Update the configuration of a single connection profile. */
  def patch(request: Name): Request[Operation] = js.native
  def patch(request: Oauthtoken, body: ConnectionProfile): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
