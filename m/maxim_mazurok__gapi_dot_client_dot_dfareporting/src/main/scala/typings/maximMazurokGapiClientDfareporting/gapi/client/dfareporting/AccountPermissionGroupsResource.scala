package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPermissionGroupsResource extends js.Object {
  
  /** Gets one account permission group by ID. */
  def get(): Request[AccountPermissionGroup] = js.native
  def get(request: Alt): Request[AccountPermissionGroup] = js.native
  
  /** Retrieves the list of account permission groups. */
  def list(): Request[AccountPermissionGroupsListResponse] = js.native
  def list(request: Callback): Request[AccountPermissionGroupsListResponse] = js.native
}
