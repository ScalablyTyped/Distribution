package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Fields
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Key
import typings.maximMazurokGapiClientCloudresourcemanager.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationsResource extends StObject {
  
  /** Fetches an organization resource identified by the specified resource name. */
  def get(): Request[Organization] = js.native
  def get(request: Fields): Request[Organization] = js.native
  
  /**
    * Gets the access control policy for an organization resource. The policy may be empty if no such policy or resource exists. The `resource` field should be the organization's resource
    * name, for example: "organizations/123". Authorization requires the IAM permission `resourcemanager.organizations.getIamPolicy` on the specified organization.
    */
  def getIamPolicy(request: Key, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Searches organization resources that are visible to the user and satisfy the specified filter. This method returns organizations in an unspecified order. New organizations do not
    * necessarily appear at the end of the results, and may take a small amount of time to appear. Search will only return organizations on which the user has the permission
    * `resourcemanager.organizations.get`
    */
  def search(): Request[SearchOrganizationsResponse] = js.native
  def search(request: PageSize): Request[SearchOrganizationsResponse] = js.native
  
  /**
    * Sets the access control policy on an organization resource. Replaces any existing policy. The `resource` field should be the organization's resource name, for example:
    * "organizations/123". Authorization requires the IAM permission `resourcemanager.organizations.setIamPolicy` on the specified organization.
    */
  def setIamPolicy(request: Key, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns the permissions that a caller has on the specified organization. The `resource` field should be the organization's resource name, for example: "organizations/123". There are
    * no permissions required for making this API call.
    */
  def testIamPermissions(request: Key, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
