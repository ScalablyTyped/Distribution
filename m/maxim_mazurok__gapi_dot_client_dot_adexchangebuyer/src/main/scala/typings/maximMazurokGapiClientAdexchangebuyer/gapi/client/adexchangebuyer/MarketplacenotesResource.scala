package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer.anon.AltFields
import typings.maximMazurokGapiClientAdexchangebuyer.anon.PqlQuery
import typings.maximMazurokGapiClientAdexchangebuyer.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketplacenotesResource extends StObject {
  
  /** Add notes to the proposal */
  def insert(request: AltFields): Request[AddOrderNotesResponse] = js.native
  def insert(request: QuotaUser, body: AddOrderNotesRequest): Request[AddOrderNotesResponse] = js.native
  
  /** Get all the notes associated with a proposal */
  def list(): Request[GetOrderNotesResponse] = js.native
  def list(request: PqlQuery): Request[GetOrderNotesResponse] = js.native
}
