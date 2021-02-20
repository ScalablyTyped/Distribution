package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.AccountId
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.Key
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.Oauthtoken
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.PageSize
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientsResource extends StObject {
  
  /** Creates a new client buyer. */
  def create(request: Key): Request[Client] = js.native
  def create(request: Oauthtoken, body: Client): Request[Client] = js.native
  
  /** Gets a client buyer with a given client account ID. */
  def get(): Request[Client] = js.native
  def get(request: AccountId): Request[Client] = js.native
  
  var invitations: InvitationsResource = js.native
  
  /** Lists all the clients for the current sponsor buyer. */
  def list(): Request[ListClientsResponse] = js.native
  def list(request: PageSize): Request[ListClientsResponse] = js.native
  
  def update(request: AccountId, body: Client): Request[Client] = js.native
  /** Updates an existing client buyer. */
  def update(request: PrettyPrint): Request[Client] = js.native
  
  var users: UsersResource = js.native
}
