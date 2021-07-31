package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer.anon.BillingId
import typings.maximMazurokGapiClientAdexchangebuyer.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BudgetResource extends StObject {
  
  /** Returns the budget information for the adgroup specified by the accountId and billingId. */
  def get(): Request[Budget] = js.native
  def get(request: BillingId): Request[Budget] = js.native
  
  def patch(request: BillingId, body: Budget): Request[Budget] = js.native
  /** Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. This method supports patch semantics. */
  def patch(request: Key): Request[Budget] = js.native
  
  def update(request: BillingId, body: Budget): Request[Budget] = js.native
  /** Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. */
  def update(request: Key): Request[Budget] = js.native
}
