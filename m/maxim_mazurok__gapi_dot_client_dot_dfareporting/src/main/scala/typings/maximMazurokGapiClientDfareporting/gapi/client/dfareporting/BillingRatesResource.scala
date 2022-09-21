package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.AltBillingProfileId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingRatesResource extends StObject {
  
  /** Retrieves a list of billing rates. This method supports paging. */
  def list(): Request[BillingRatesListResponse] = js.native
  def list(request: AltBillingProfileId): Request[BillingRatesListResponse] = js.native
}
