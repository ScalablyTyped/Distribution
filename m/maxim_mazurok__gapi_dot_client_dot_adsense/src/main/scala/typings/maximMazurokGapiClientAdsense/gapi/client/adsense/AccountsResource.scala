package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.Accesstoken
import typings.maximMazurokGapiClientAdsense.anon.Alt
import typings.maximMazurokGapiClientAdsense.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends StObject {
  
  var adclients: AdclientsResource = js.native
  
  var alerts: AlertsResource = js.native
  
  /** Gets information about the selected AdSense account. */
  def get(): Request[Account] = js.native
  def get(request: Accesstoken): Request[Account] = js.native
  
  /** Lists all accounts available to this user. */
  def list(): Request[ListAccountsResponse] = js.native
  def list(request: Key): Request[ListAccountsResponse] = js.native
  
  /** Lists all accounts directly managed by the given AdSense account. */
  def listChildAccounts(): Request[ListChildAccountsResponse] = js.native
  def listChildAccounts(request: Alt): Request[ListChildAccountsResponse] = js.native
  
  var payments: PaymentsResource = js.native
  
  var reports: ReportsResource = js.native
  
  var sites: SitesResource = js.native
}
