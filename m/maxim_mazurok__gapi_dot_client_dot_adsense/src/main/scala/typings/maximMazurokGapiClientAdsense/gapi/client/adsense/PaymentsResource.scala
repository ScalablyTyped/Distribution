package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentsResource extends StObject {
  
  /** Lists all the payments available for an account. */
  def list(): Request[ListPaymentsResponse] = js.native
  def list(request: Fields): Request[ListPaymentsResponse] = js.native
}
