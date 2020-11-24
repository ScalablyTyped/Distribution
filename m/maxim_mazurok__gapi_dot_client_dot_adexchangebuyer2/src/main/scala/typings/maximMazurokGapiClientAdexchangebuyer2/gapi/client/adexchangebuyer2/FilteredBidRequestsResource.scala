package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.FilterSetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilteredBidRequestsResource extends js.Object {
  
  /** List all reasons that caused a bid request not to be sent for an impression, with the number of bid requests not sent for each reason. */
  def list(): Request[ListFilteredBidRequestsResponse] = js.native
  def list(request: FilterSetName): Request[ListFilteredBidRequestsResponse] = js.native
}
