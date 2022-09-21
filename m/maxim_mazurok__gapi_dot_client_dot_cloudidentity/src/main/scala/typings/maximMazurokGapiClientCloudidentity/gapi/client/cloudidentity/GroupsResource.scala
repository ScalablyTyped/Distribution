package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudidentity.anon.Alt
import typings.maximMazurokGapiClientCloudidentity.anon.FieldsInitialGroupConfig
import typings.maximMazurokGapiClientCloudidentity.anon.GroupKeyid
import typings.maximMazurokGapiClientCloudidentity.anon.InitialGroupConfig
import typings.maximMazurokGapiClientCloudidentity.anon.KeyName
import typings.maximMazurokGapiClientCloudidentity.anon.NameOauthtoken
import typings.maximMazurokGapiClientCloudidentity.anon.OauthtokenPageSize
import typings.maximMazurokGapiClientCloudidentity.anon.ReadMask
import typings.maximMazurokGapiClientCloudidentity.anon.UpdateMask
import typings.maximMazurokGapiClientCloudidentity.anon.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupsResource extends StObject {
  
  def create(request: FieldsInitialGroupConfig, body: Group): Request[Operation] = js.native
  /** Creates a Group. */
  def create(request: InitialGroupConfig): Request[Operation] = js.native
  
  /** Deletes a `Group`. */
  def delete(): Request[Operation] = js.native
  def delete(request: Alt): Request[Operation] = js.native
  
  /** Retrieves a `Group`. */
  def get(): Request[Group] = js.native
  def get(request: Alt): Request[Group] = js.native
  
  /** Get Security Settings */
  def getSecuritySettings(): Request[SecuritySettings] = js.native
  def getSecuritySettings(request: ReadMask): Request[SecuritySettings] = js.native
  
  /** Lists the `Group` resources under a customer or namespace. */
  def list(): Request[ListGroupsResponse] = js.native
  def list(request: View): Request[ListGroupsResponse] = js.native
  
  /** Looks up the [resource name](https://cloud.google.com/apis/design/resource_names) of a `Group` by its `EntityKey`. */
  def lookup(): Request[LookupGroupNameResponse] = js.native
  def lookup(request: GroupKeyid): Request[LookupGroupNameResponse] = js.native
  
  var memberships: MembershipsResource = js.native
  
  def patch(request: KeyName, body: Group): Request[Operation] = js.native
  /** Updates a `Group`. */
  def patch(request: UpdateMask): Request[Operation] = js.native
  
  /** Searches for `Group` resources matching a specified query. */
  def search(): Request[SearchGroupsResponse] = js.native
  def search(request: OauthtokenPageSize): Request[SearchGroupsResponse] = js.native
  
  def updateSecuritySettings(request: KeyName, body: SecuritySettings): Request[Operation] = js.native
  /** Update Security Settings */
  def updateSecuritySettings(request: NameOauthtoken): Request[Operation] = js.native
}
