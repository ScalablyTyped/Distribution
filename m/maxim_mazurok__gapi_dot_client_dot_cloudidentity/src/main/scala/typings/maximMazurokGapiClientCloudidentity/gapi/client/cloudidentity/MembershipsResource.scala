package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudidentity.anon.AccesstokenAlt
import typings.maximMazurokGapiClientCloudidentity.anon.Key
import typings.maximMazurokGapiClientCloudidentity.anon.MemberKeyid
import typings.maximMazurokGapiClientCloudidentity.anon.PageSize
import typings.maximMazurokGapiClientCloudidentity.anon.Parent
import typings.maximMazurokGapiClientCloudidentity.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipsResource extends StObject {
  
  /** Creates a `Membership`. */
  def create(request: Parent): Request[Operation] = js.native
  def create(request: Xgafv, body: Membership): Request[Operation] = js.native
  
  /** Deletes a `Membership`. */
  def delete(): Request[Operation] = js.native
  def delete(request: Key): Request[Operation] = js.native
  
  /** Retrieves a `Membership`. */
  def get(): Request[Membership] = js.native
  def get(request: Key): Request[Membership] = js.native
  
  /** Lists the `Membership`s within a `Group`. */
  def list(): Request[ListMembershipsResponse] = js.native
  def list(request: PageSize): Request[ListMembershipsResponse] = js.native
  
  /** Looks up the [resource name](https://cloud.google.com/apis/design/resource_names) of a `Membership` by its `EntityKey`. */
  def lookup(): Request[LookupMembershipNameResponse] = js.native
  def lookup(request: MemberKeyid): Request[LookupMembershipNameResponse] = js.native
  
  /** Modifies the `MembershipRole`s of a `Membership`. */
  def modifyMembershipRoles(request: AccesstokenAlt): Request[ModifyMembershipRolesResponse] = js.native
  def modifyMembershipRoles(request: Key, body: ModifyMembershipRolesRequest): Request[ModifyMembershipRolesResponse] = js.native
}
