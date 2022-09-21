package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudidentity.anon.Alt
import typings.maximMazurokGapiClientCloudidentity.anon.AltCallback
import typings.maximMazurokGapiClientCloudidentity.anon.CallbackFields
import typings.maximMazurokGapiClientCloudidentity.anon.FieldsKey
import typings.maximMazurokGapiClientCloudidentity.anon.KeyOauthtoken
import typings.maximMazurokGapiClientCloudidentity.anon.MemberKeyid
import typings.maximMazurokGapiClientCloudidentity.anon.PageToken
import typings.maximMazurokGapiClientCloudidentity.anon.Parent
import typings.maximMazurokGapiClientCloudidentity.anon.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipsResource extends StObject {
  
  /**
    * Check a potential member for membership in a group. **Note:** This feature is only available to Google Workspace Enterprise Standard, Enterprise Plus, and Enterprise for Education;
    * and Cloud Identity Premium accounts. If the account of the member is not one of these, a 403 (PERMISSION_DENIED) HTTP status code will be returned. A member has membership to a
    * group as long as there is a single viewable transitive membership between the group and the member. The actor must have view permissions to at least one transitive membership
    * between the member and group.
    */
  def checkTransitiveMembership(): Request[CheckTransitiveMembershipResponse] = js.native
  def checkTransitiveMembership(request: Parent): Request[CheckTransitiveMembershipResponse] = js.native
  
  /** Creates a `Membership`. */
  def create(request: AltCallback): Request[Operation] = js.native
  def create(request: CallbackFields, body: Membership): Request[Operation] = js.native
  
  /** Deletes a `Membership`. */
  def delete(): Request[Operation] = js.native
  def delete(request: Alt): Request[Operation] = js.native
  
  /** Retrieves a `Membership`. */
  def get(): Request[Membership] = js.native
  def get(request: Alt): Request[Membership] = js.native
  
  /**
    * Get a membership graph of just a member or both a member and a group. **Note:** This feature is only available to Google Workspace Enterprise Standard, Enterprise Plus, and
    * Enterprise for Education; and Cloud Identity Premium accounts. If the account of the member is not one of these, a 403 (PERMISSION_DENIED) HTTP status code will be returned. Given a
    * member, the response will contain all membership paths from the member. Given both a group and a member, the response will contain all membership paths between the group and the
    * member.
    */
  def getMembershipGraph(): Request[Operation] = js.native
  def getMembershipGraph(request: Parent): Request[Operation] = js.native
  
  /** Lists the `Membership`s within a `Group`. */
  def list(): Request[ListMembershipsResponse] = js.native
  def list(request: PageToken): Request[ListMembershipsResponse] = js.native
  
  /** Looks up the [resource name](https://cloud.google.com/apis/design/resource_names) of a `Membership` by its `EntityKey`. */
  def lookup(): Request[LookupMembershipNameResponse] = js.native
  def lookup(request: MemberKeyid): Request[LookupMembershipNameResponse] = js.native
  
  def modifyMembershipRoles(request: Alt, body: ModifyMembershipRolesRequest): Request[ModifyMembershipRolesResponse] = js.native
  /** Modifies the `MembershipRole`s of a `Membership`. */
  def modifyMembershipRoles(request: FieldsKey): Request[ModifyMembershipRolesResponse] = js.native
  
  /**
    * Search transitive groups of a member. **Note:** This feature is only available to Google Workspace Enterprise Standard, Enterprise Plus, and Enterprise for Education; and Cloud
    * Identity Premium accounts. If the account of the member is not one of these, a 403 (PERMISSION_DENIED) HTTP status code will be returned. A transitive group is any group that has a
    * direct or indirect membership to the member. Actor must have view permissions all transitive groups.
    */
  def searchTransitiveGroups(): Request[SearchTransitiveGroupsResponse] = js.native
  def searchTransitiveGroups(request: Query): Request[SearchTransitiveGroupsResponse] = js.native
  
  /**
    * Search transitive memberships of a group. **Note:** This feature is only available to Google Workspace Enterprise Standard, Enterprise Plus, and Enterprise for Education; and Cloud
    * Identity Premium accounts. If the account of the group is not one of these, a 403 (PERMISSION_DENIED) HTTP status code will be returned. A transitive membership is any direct or
    * indirect membership of a group. Actor must have view permissions to all transitive memberships.
    */
  def searchTransitiveMemberships(): Request[SearchTransitiveMembershipsResponse] = js.native
  def searchTransitiveMemberships(request: KeyOauthtoken): Request[SearchTransitiveMembershipsResponse] = js.native
}
