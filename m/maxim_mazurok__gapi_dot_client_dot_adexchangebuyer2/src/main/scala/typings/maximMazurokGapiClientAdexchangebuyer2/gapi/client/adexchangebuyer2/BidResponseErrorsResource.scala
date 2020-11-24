package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.FilterSetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BidResponseErrorsResource extends js.Object {
  
  /** List all errors that occurred in bid responses, with the number of bid responses affected for each reason. */
  def list(): Request[ListBidResponseErrorsResponse] = js.native
  def list(request: FilterSetName): Request[ListBidResponseErrorsResponse] = js.native
}
