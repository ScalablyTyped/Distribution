package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.OauthtokenPageSize
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.PublisherProfileId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherProfilesResource extends StObject {
  
  /** Gets the requested publisher profile by id. */
  def get(): Request[PublisherProfile] = js.native
  def get(request: PublisherProfileId): Request[PublisherProfile] = js.native
  
  /** List all publisher profiles visible to the buyer */
  def list(): Request[ListPublisherProfilesResponse] = js.native
  def list(request: OauthtokenPageSize): Request[ListPublisherProfilesResponse] = js.native
}
