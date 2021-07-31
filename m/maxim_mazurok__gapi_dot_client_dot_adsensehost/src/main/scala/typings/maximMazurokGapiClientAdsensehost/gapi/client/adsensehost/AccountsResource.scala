package typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsensehost.anon.FilterAdClientId
import typings.maximMazurokGapiClientAdsensehost.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends StObject {
  
  var adclients: AdclientsResource = js.native
  
  var adunits: AdunitsResource = js.native
  
  /** Get information about the selected associated AdSense account. */
  def get(): Request[Account] = js.native
  def get(request: PrettyPrint): Request[Account] = js.native
  
  /** List hosted accounts associated with this AdSense account by ad client id. */
  def list(): Request[Accounts] = js.native
  def list(request: FilterAdClientId): Request[Accounts] = js.native
  
  var reports: ReportsResource = js.native
}
