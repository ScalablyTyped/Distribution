package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPermissionsResource extends js.Object {
  
  /** Gets one account permission by ID. */
  def get(): Request[AccountPermission] = js.native
  def get(request: Alt): Request[AccountPermission] = js.native
  
  /** Retrieves the list of account permissions. */
  def list(): Request[AccountPermissionsListResponse] = js.native
  def list(request: Callback): Request[AccountPermissionsListResponse] = js.native
}
