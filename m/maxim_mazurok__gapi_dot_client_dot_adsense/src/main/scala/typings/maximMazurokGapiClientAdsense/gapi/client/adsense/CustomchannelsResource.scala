package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.AdClientId
import typings.maximMazurokGapiClientAdsense.anon.AdUnitId
import typings.maximMazurokGapiClientAdsense.anon.CustomChannelId
import typings.maximMazurokGapiClientAdsense.anon.Key
import typings.maximMazurokGapiClientAdsense.anon.MaxResults
import typings.maximMazurokGapiClientAdsense.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomchannelsResource extends StObject {
  
  var adunits: AdunitsResource = js.native
  
  /** Get the specified custom channel from the specified ad client for the specified account. */
  def get(): Request[CustomChannel] = js.native
  def get(request: CustomChannelId): Request[CustomChannel] = js.native
  def get(request: Oauthtoken): Request[CustomChannel] = js.native
  
  /** List all custom channels which the specified ad unit belongs to. */
  def list(): Request[CustomChannels] = js.native
  def list(request: AdClientId): Request[CustomChannels] = js.native
  def list(request: AdUnitId): Request[CustomChannels] = js.native
  def list(request: Key): Request[CustomChannels] = js.native
  def list(request: MaxResults): Request[CustomChannels] = js.native
}
