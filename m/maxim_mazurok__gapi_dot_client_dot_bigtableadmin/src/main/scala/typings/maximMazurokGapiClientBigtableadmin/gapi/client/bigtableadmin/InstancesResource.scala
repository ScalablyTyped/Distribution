package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigtableadmin.anon.Alt
import typings.maximMazurokGapiClientBigtableadmin.anon.KeyName
import typings.maximMazurokGapiClientBigtableadmin.anon.KeyOauthtoken
import typings.maximMazurokGapiClientBigtableadmin.anon.NameOauthtoken
import typings.maximMazurokGapiClientBigtableadmin.anon.PageToken
import typings.maximMazurokGapiClientBigtableadmin.anon.PrettyPrint
import typings.maximMazurokGapiClientBigtableadmin.anon.UpdateMask
import typings.maximMazurokGapiClientBigtableadmin.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends StObject {
  
  var appProfiles: AppProfilesResource = js.native
  
  var clusters: ClustersResource = js.native
  
  /** Create an instance within a project. */
  def create(request: KeyOauthtoken): Request[Operation] = js.native
  def create(request: Xgafv, body: CreateInstanceRequest): Request[Operation] = js.native
  
  /** Delete an instance from a project. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets information about an instance. */
  def get(): Request[Instance] = js.native
  def get(request: Alt): Request[Instance] = js.native
  
  /** Gets the access control policy for an instance resource. Returns an empty policy if an instance exists but does not have a policy set. */
  def getIamPolicy(request: PrettyPrint, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists information about instances in a project. */
  def list(): Request[ListInstancesResponse] = js.native
  def list(request: PageToken): Request[ListInstancesResponse] = js.native
  
  /** Partially updates an instance within a project. This method can modify all fields of an Instance and is the preferred way to update an Instance. */
  def partialUpdateInstance(request: KeyName): Request[Operation] = js.native
  def partialUpdateInstance(request: UpdateMask, body: Instance): Request[Operation] = js.native
  
  /** Sets the access control policy on an instance resource. Replaces any existing policy. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  var tables: TablesResource = js.native
  
  /** Returns permissions that the caller has on the specified instance resource. */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def update(request: Alt, body: Instance): Request[Instance] = js.native
  /**
    * Updates an instance within a project. This method updates only the display name and type for an Instance. To update other Instance properties, such as labels, use
    * PartialUpdateInstance.
    */
  def update(request: NameOauthtoken): Request[Instance] = js.native
}
