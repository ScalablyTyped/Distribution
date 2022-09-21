package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.CallbackFields
import typings.maximMazurokGapiClientDfareporting.anon.Currencycode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingProfilesResource extends StObject {
  
  /** Gets one billing profile by ID. */
  def get(): Request[BillingProfile] = js.native
  def get(request: Alt): Request[BillingProfile] = js.native
  
  /** Retrieves a list of billing profiles, possibly filtered. This method supports paging. */
  def list(): Request[BillingProfilesListResponse] = js.native
  def list(request: Currencycode): Request[BillingProfilesListResponse] = js.native
  
  /** Updates an existing billing profile. */
  def update(request: CallbackFields): Request[BillingProfile] = js.native
  def update(request: Callback, body: BillingProfile): Request[BillingProfile] = js.native
}
