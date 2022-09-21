package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.Accesstoken
import typings.maximMazurokGapiClientAdsense.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdclientsResource extends StObject {
  
  var adunits: AdunitsResource = js.native
  
  var customchannels: CustomchannelsResource = js.native
  
  /** Gets the ad client from the given resource name. */
  def get(): Request[AdClient] = js.native
  def get(request: Accesstoken): Request[AdClient] = js.native
  
  /**
    * Gets the AdSense code for a given ad client. This returns what was previously known as the 'auto ad code'. This is only supported for ad clients with a product_code of AFC. For more
    * information, see [About the AdSense code](https://support.google.com/adsense/answer/9274634).
    */
  def getAdcode(): Request[AdClientAdCode] = js.native
  def getAdcode(request: Accesstoken): Request[AdClientAdCode] = js.native
  
  /** Lists all the ad clients available in an account. */
  def list(): Request[ListAdClientsResponse] = js.native
  def list(request: Alt): Request[ListAdClientsResponse] = js.native
  
  var urlchannels: UrlchannelsResource = js.native
}
