package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.AccesstokenAlt
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.IsTransient
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.Name
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.OwnerName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterSetsResource extends StObject {
  
  var bidMetrics: BidMetricsResource = js.native
  
  var bidResponseErrors: BidResponseErrorsResource = js.native
  
  var bidResponsesWithoutBids: BidResponsesWithoutBidsResource = js.native
  
  /** Creates the specified filter set for the account with the given account ID. */
  def create(request: IsTransient): Request[FilterSet] = js.native
  def create(request: OwnerName, body: FilterSet): Request[FilterSet] = js.native
  
  /** Deletes the requested filter set from the account with the given account ID. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  var filteredBidRequests: FilteredBidRequestsResource = js.native
  
  var filteredBids: FilteredBidsResource = js.native
  
  /** Retrieves the requested filter set for the account with the given account ID. */
  def get(): Request[FilterSet] = js.native
  def get(request: Name): Request[FilterSet] = js.native
  
  var impressionMetrics: ImpressionMetricsResource = js.native
  
  /** Lists all filter sets for the account with the given account ID. */
  def list(): Request[ListFilterSetsResponse] = js.native
  def list(request: AccesstokenAlt): Request[ListFilterSetsResponse] = js.native
  
  var losingBids: LosingBidsResource = js.native
  
  var nonBillableWinningBids: NonBillableWinningBidsResource = js.native
}
