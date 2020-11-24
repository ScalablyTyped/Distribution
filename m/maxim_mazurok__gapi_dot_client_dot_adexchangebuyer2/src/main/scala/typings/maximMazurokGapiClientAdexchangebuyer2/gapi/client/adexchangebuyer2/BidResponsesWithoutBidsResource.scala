package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.FilterSetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BidResponsesWithoutBidsResource extends js.Object {
  
  /** List all reasons for which bid responses were considered to have no applicable bids, with the number of bid responses affected for each reason. */
  def list(): Request[ListBidResponsesWithoutBidsResponse] = js.native
  def list(request: FilterSetName): Request[ListBidResponsesWithoutBidsResponse] = js.native
}
