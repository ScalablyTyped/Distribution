package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.Callback
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.ClientAccountId
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends StObject {
  
  /** Retrieves an existing client user. */
  def get(): Request[ClientUser] = js.native
  def get(request: ClientAccountId): Request[ClientUser] = js.native
  
  /** Lists all the known client users for a specified sponsor buyer account ID. */
  def list(): Request[ListClientUsersResponse] = js.native
  def list(request: Callback): Request[ListClientUsersResponse] = js.native
  
  def update(request: ClientAccountId, body: ClientUser): Request[ClientUser] = js.native
  /** Updates an existing client user. Only the user status can be changed on update. */
  def update(request: Fields): Request[ClientUser] = js.native
}
