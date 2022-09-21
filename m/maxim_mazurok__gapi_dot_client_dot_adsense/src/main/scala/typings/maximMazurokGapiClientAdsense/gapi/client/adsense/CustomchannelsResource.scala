package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.Accesstoken
import typings.maximMazurokGapiClientAdsense.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomchannelsResource extends StObject {
  
  /** Gets information about the selected custom channel. */
  def get(): Request[CustomChannel] = js.native
  def get(request: Accesstoken): Request[CustomChannel] = js.native
  
  /** Lists all the custom channels available in an ad client. */
  def list(): Request[ListCustomChannelsResponse] = js.native
  def list(request: Alt): Request[ListCustomChannelsResponse] = js.native
  
  /** Lists all the ad units available for a custom channel. */
  def listLinkedAdUnits(): Request[ListLinkedAdUnitsResponse] = js.native
  def listLinkedAdUnits(request: Alt): Request[ListLinkedAdUnitsResponse] = js.native
}
