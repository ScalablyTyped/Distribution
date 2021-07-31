package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.Accesstoken
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.AccountId
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.Alt
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvitationsResource extends StObject {
  
  /** Creates and sends out an email invitation to access an Ad Exchange client buyer account. */
  def create(request: Accesstoken): Request[ClientUserInvitation] = js.native
  def create(request: AccountId, body: ClientUserInvitation): Request[ClientUserInvitation] = js.native
  
  /** Retrieves an existing client user invitation. */
  def get(): Request[ClientUserInvitation] = js.native
  def get(request: Alt): Request[ClientUserInvitation] = js.native
  
  /** Lists all the client users invitations for a client with a given account ID. */
  def list(): Request[ListClientUserInvitationsResponse] = js.native
  def list(request: Callback): Request[ListClientUserInvitationsResponse] = js.native
}
