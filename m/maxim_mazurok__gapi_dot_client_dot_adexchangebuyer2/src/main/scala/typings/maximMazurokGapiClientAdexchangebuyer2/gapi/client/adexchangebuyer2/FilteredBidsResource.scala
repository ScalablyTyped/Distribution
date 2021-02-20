package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.FilterSetName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilteredBidsResource extends StObject {
  
  var creatives: CreativesResource = js.native
  
  var details: DetailsResource = js.native
  
  /** List all reasons for which bids were filtered, with the number of bids filtered for each reason. */
  def list(): Request[ListFilteredBidsResponse] = js.native
  def list(request: FilterSetName): Request[ListFilteredBidsResponse] = js.native
}
