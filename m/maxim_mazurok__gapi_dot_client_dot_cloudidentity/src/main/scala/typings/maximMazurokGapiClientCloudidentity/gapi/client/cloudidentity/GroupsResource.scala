package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudidentity.anon.AltCallback
import typings.maximMazurokGapiClientCloudidentity.anon.CallbackFields
import typings.maximMazurokGapiClientCloudidentity.anon.GroupKeyid
import typings.maximMazurokGapiClientCloudidentity.anon.InitialGroupConfig
import typings.maximMazurokGapiClientCloudidentity.anon.Key
import typings.maximMazurokGapiClientCloudidentity.anon.PageToken
import typings.maximMazurokGapiClientCloudidentity.anon.Query
import typings.maximMazurokGapiClientCloudidentity.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupsResource extends StObject {
  
  def create(request: AltCallback, body: Group): Request[Operation] = js.native
  /** Creates a Group. */
  def create(request: InitialGroupConfig): Request[Operation] = js.native
  
  /** Deletes a `Group`. */
  def delete(): Request[Operation] = js.native
  def delete(request: Key): Request[Operation] = js.native
  
  /** Retrieves a `Group`. */
  def get(): Request[Group] = js.native
  def get(request: Key): Request[Group] = js.native
  
  /** Lists the `Group`s under a customer or namespace. */
  def list(): Request[ListGroupsResponse] = js.native
  def list(request: PageToken): Request[ListGroupsResponse] = js.native
  
  /** Looks up the [resource name](https://cloud.google.com/apis/design/resource_names) of a `Group` by its `EntityKey`. */
  def lookup(): Request[LookupGroupNameResponse] = js.native
  def lookup(request: GroupKeyid): Request[LookupGroupNameResponse] = js.native
  
  var memberships: MembershipsResource = js.native
  
  def patch(request: CallbackFields, body: Group): Request[Operation] = js.native
  /** Updates a `Group`. */
  def patch(request: UpdateMask): Request[Operation] = js.native
  
  /** Searches for `Group`s matching a specified query. */
  def search(): Request[SearchGroupsResponse] = js.native
  def search(request: Query): Request[SearchGroupsResponse] = js.native
}
