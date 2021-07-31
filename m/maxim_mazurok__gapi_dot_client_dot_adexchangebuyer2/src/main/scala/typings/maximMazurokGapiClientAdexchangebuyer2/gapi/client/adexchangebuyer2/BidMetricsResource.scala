package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.FilterSetName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BidMetricsResource extends StObject {
  
  /** Lists all metrics that are measured in terms of number of bids. */
  def list(): Request[ListBidMetricsResponse] = js.native
  def list(request: FilterSetName): Request[ListBidMetricsResponse] = js.native
}
