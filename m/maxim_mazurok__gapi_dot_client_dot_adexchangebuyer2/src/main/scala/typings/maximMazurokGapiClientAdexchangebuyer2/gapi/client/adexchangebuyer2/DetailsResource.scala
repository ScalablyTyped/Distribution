package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.CreativeStatusId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailsResource extends StObject {
  
  /** List all details associated with a specific reason for which bids were filtered, with the number of bids filtered for each detail. */
  def list(): Request[ListCreativeStatusBreakdownByDetailResponse] = js.native
  def list(request: CreativeStatusId): Request[ListCreativeStatusBreakdownByDetailResponse] = js.native
}
