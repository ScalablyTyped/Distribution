package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.TransactionIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettlementtransactionsResource extends js.Object {
  
  /** Retrieves a list of transactions for the settlement. */
  def list(): Request[SettlementtransactionsListResponse] = js.native
  def list(request: TransactionIds): Request[SettlementtransactionsListResponse] = js.native
}
