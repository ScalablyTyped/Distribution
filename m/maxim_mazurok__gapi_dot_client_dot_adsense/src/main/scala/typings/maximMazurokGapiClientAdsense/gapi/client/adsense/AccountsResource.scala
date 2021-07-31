package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.Fields
import typings.maximMazurokGapiClientAdsense.anon.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends StObject {
  
  var adclients: AdclientsResource = js.native
  
  var adunits: AdunitsResource = js.native
  
  var alerts: AlertsResource = js.native
  
  var customchannels: CustomchannelsResource = js.native
  
  /** Get information about the selected AdSense account. */
  def get(): Request[Account] = js.native
  def get(request: Tree): Request[Account] = js.native
  
  /** List all accounts available to this AdSense account. */
  def list(): Request[Accounts] = js.native
  def list(request: Fields): Request[Accounts] = js.native
  
  var payments: PaymentsResource = js.native
  
  var reports: ReportsResource = js.native
  
  var savedadstyles: SavedadstylesResource = js.native
  
  var urlchannels: UrlchannelsResource = js.native
}
