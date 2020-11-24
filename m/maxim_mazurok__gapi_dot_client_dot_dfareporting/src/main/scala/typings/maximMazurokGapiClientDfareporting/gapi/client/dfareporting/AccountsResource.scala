package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.Fields
import typings.maximMazurokGapiClientDfareporting.anon.Id
import typings.maximMazurokGapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends js.Object {
  
  /** Gets one account by ID. */
  def get(): Request[Account] = js.native
  def get(request: Alt): Request[Account] = js.native
  
  /** Retrieves the list of accounts, possibly filtered. This method supports paging. */
  def list(): Request[AccountsListResponse] = js.native
  def list(request: Fields): Request[AccountsListResponse] = js.native
  
  def patch(request: Alt, body: Account): Request[Account] = js.native
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: Id): Request[Account] = js.native
  
  def update(request: Callback, body: Account): Request[Account] = js.native
  /** Updates an existing account. */
  def update(request: Key): Request[Account] = js.native
}
