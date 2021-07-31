package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer.anon.Alt
import typings.maximMazurokGapiClientAdexchangebuyer.anon.ConfirmUnsafeAccountChange
import typings.maximMazurokGapiClientAdexchangebuyer.anon.Fields
import typings.maximMazurokGapiClientAdexchangebuyer.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends StObject {
  
  /** Gets one account by ID. */
  def get(): Request[Account] = js.native
  def get(request: Alt): Request[Account] = js.native
  
  /** Retrieves the authenticated user's list of accounts. */
  def list(): Request[AccountsList] = js.native
  def list(request: Fields): Request[AccountsList] = js.native
  
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: ConfirmUnsafeAccountChange): Request[Account] = js.native
  def patch(request: Id, body: Account): Request[Account] = js.native
  
  /** Updates an existing account. */
  def update(request: ConfirmUnsafeAccountChange): Request[Account] = js.native
  def update(request: Id, body: Account): Request[Account] = js.native
}
