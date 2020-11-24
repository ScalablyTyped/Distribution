package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.FilterSetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonBillableWinningBidsResource extends js.Object {
  
  /** List all reasons for which winning bids were not billable, with the number of bids not billed for each reason. */
  def list(): Request[ListNonBillableWinningBidsResponse] = js.native
  def list(request: FilterSetName): Request[ListNonBillableWinningBidsResponse] = js.native
}
