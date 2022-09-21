package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.Accesstoken
import typings.maximMazurokGapiClientAdsense.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdunitsResource extends StObject {
  
  /** Gets an ad unit from a specified account and ad client. */
  def get(): Request[AdUnit] = js.native
  def get(request: Accesstoken): Request[AdUnit] = js.native
  
  /**
    * Gets the ad unit code for a given ad unit. For more information, see [About the AdSense code](https://support.google.com/adsense/answer/9274634) and [Where to place the ad code in
    * your HTML](https://support.google.com/adsense/answer/9190028).
    */
  def getAdcode(): Request[AdUnitAdCode] = js.native
  def getAdcode(request: Accesstoken): Request[AdUnitAdCode] = js.native
  
  /** Lists all ad units under a specified account and ad client. */
  def list(): Request[ListAdUnitsResponse] = js.native
  def list(request: Alt): Request[ListAdUnitsResponse] = js.native
  
  /** Lists all the custom channels available for an ad unit. */
  def listLinkedCustomChannels(): Request[ListLinkedCustomChannelsResponse] = js.native
  def listLinkedCustomChannels(request: Alt): Request[ListLinkedCustomChannelsResponse] = js.native
}
